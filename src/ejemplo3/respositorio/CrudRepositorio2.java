package ejemplo3.respositorio;

import ejemplo3.modelo.Mascota;

import java.io.IOException;
import java.util.List;

public interface CrudRepositorio2 {
    List<Mascota> listar() throws IOException, ClassNotFoundException;
    Mascota porId(Integer id);
    void crear(Mascota mascota) throws IOException;
    void editar(Mascota mascota) throws IOException;
    void eliminar(Integer id) throws IOException;
    public int total();
}
