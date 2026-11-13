package dao;

import model.Componente;

import java.util.ArrayList;
import java.util.List;

public class ComponenteDAOMemoria implements ComponenteDAO{

    private List <Componente> inventario = new ArrayList <Componente>();
    private int generadorId = 1;

    @Override
    public void guardar(Componente componente) {
        componente.setId(generadorId);
        generadorId++;
        inventario.add(componente);
    }

    @Override
    public List<Componente> listarTodos() {
        return inventario;
    }

    @Override
    public Componente buscarPorId(int id) {
        for(Componente c : inventario){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    @Override
    public void actualizar(Componente componente) {

    }

    @Override
    public boolean eliminar(int id) {
        for(int i = 0; i < inventario.size(); i++ ){
            if(inventario.get(i).getId() == id){
                inventario.remove(i);
                return true;
            }
        }
        return false;
    }
}
