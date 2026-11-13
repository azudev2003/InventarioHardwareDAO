import dao.ComponenteDAO;
import dao.ComponenteDAOMemoria;
import model.Componente;
import model.Procesador;
import model.TarjetaVideo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ComponenteDAO dao = new ComponenteDAOMemoria();

    Componente c1 = new Procesador("Intel", "i7", 120000, 23, 8, 3.50);
    Componente c2 = new TarjetaVideo("NVIDIA", "GeForce RTX 5060", 300000, 18, 8 );

    System.out.println("Guardando....");
    dao.guardar(c1);
    dao.guardar(c2);
    System.out.println("");

    for(Componente c : dao.listarTodos()){
        c.mostrarDetalles();
    }

    System.out.println("");

    Componente encontrado = dao.buscarPorId(2);

    if (encontrado != null){
        System.out.println("Se ha encontrado " + encontrado.getMarca() + " " + encontrado.getModelo());
    }

    else {
        System.out.println("El componente no se ha encontrado.");
    }

    System.out.println("");

    boolean borrado = dao.eliminar(2);

    if(borrado == true){
        System.out.println("Se ha borrado correctamente!");
    }
    else{
        System.out.println("No se encontro el componente...");
    }

    System.out.println("");

    for(Componente c : dao.listarTodos()){
        c.mostrarDetalles();
    }

    System.out.println("");
}
