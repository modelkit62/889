package optional;

import java.util.Optional;

public class Movil {

    private long id;
    private String marca;
    private Optional<Resolucion> resolucion;

    public Movil(long id, String marca, Optional<Resolucion> resolucion) {
        this.id = id;
        this.marca = marca;
        this.resolucion = resolucion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Optional<Resolucion> getResolucion() {
        return resolucion;
    }

    public void setResolucion(Optional<Resolucion> resolucion) {
        this.resolucion = resolucion;
    }
}
