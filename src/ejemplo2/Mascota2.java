package ejemplo2;

import java.io.Serializable;

public class Mascota2 implements Serializable {
private String nombre;
private String raza;
private Integer vacunas;

    public Mascota2(String nombre, String raza, Integer vacunas) {
        this.nombre = nombre;
        this.raza = raza;
        this.vacunas = vacunas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getVacunas() {
        return vacunas;
    }

    public void setVacunas(Integer vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public String toString() {
        return "Mascota=>" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", vacunas=" + vacunas;
    }
}
