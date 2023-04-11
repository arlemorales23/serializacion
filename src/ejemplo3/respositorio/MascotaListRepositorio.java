package ejemplo3.respositorio;

import ejemplo1.ObjectSerializer;
import ejemplo3.modelo.Mascota;
import ejemplo4.modelo.Producto;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MascotaListRepositorio implements  CrudRepositorio2{

    private List<Mascota> dataSource;

    public MascotaListRepositorio() throws IOException, ClassNotFoundException {
        dataSource = new ArrayList<>();
        }

    @Override
    public List<Mascota> listar() throws IOException, ClassNotFoundException {
        dataSource = (List<Mascota>) ObjectSerializer.readObjectFromFile("masco.ax");
        return dataSource;
    }

    @Override
    public Mascota porId(Integer id) {
        Mascota resultado = null;
        for(Mascota mas: dataSource){
            if(mas.getId() != null && mas.getId().equals(id)){
                resultado = mas;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Mascota mascota) throws IOException {
        this.dataSource.add(mascota);
        ObjectSerializer.writeObjectToFile(this.dataSource, "masco.ax");
    }

    @Override
    public void editar(Mascota mascota) throws IOException {
        Mascota m = this.porId(mascota.getId());
        m.setNombreMascota(mascota.getNombreMascota());
        m.setRaza(mascota.getRaza());
        ObjectSerializer.writeObjectToFile(this.dataSource, "masco.ax");
    }

    @Override
    public void eliminar(Integer id) throws IOException {
        this.dataSource.remove(this.porId(id));
        ObjectSerializer.writeObjectToFile(this.dataSource, "masco.ax");
    }
    @Override
    public int total() {
        return this.dataSource.size();
    }
}
