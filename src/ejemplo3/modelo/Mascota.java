package ejemplo3.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Mascota implements Serializable {
    private Integer id;
    private String NombreMascota;
    private String Raza;
    private static int ultimoId;

    public Mascota(Integer id, String nombreMascota, String raza) {
        this.id = id;
        NombreMascota = nombreMascota;
        Raza = raza;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        NombreMascota = nombreMascota;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", NombreMascota='" + NombreMascota + '\'' +
                ", Raza='" + Raza + '\'' +
                '}';
    }
}
