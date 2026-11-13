package dao;

import model.Componente;
import java.util.List;

public interface ComponenteDAO {

    void guardar(Componente componente);
    List <Componente> listarTodos();
    Componente buscarPorId(int id);
    void actualizar(Componente componente);
    boolean eliminar(int id);
}
