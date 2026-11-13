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

    for(Componente c : dao.listarTodos()){
        System.out.println("Id: " + c.getId() + " " +
                "Marca: " + c.getMarca() + " " +
                "Modelo: " + c.getModelo() + " " +
                "Precio: " + c.getPrecio());

    }

    Componente encontrado = dao.buscarPorId(2);

    if (encontrado != null){
        System.out.println("Se ha encontrado " + encontrado.getMarca() + " " + encontrado.getModelo());
    }

    else {
        System.out.println("El componente no se ha encontrado.");
    }

}
