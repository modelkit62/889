package optional;

import java.util.Optional;

public class Resolucion {

    private String tamano;
    private Optional<Pantalla> pantalla;

    public Resolucion() {
    }

    public Resolucion(String tamano, Optional<Pantalla> pantalla) {
        this.tamano = tamano;
        this.pantalla = pantalla;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Optional<Pantalla> getPantalla() {
        return pantalla;
    }

    public void setPantalla(Optional<Pantalla> pantalla) {
        this.pantalla = pantalla;
    }
}
