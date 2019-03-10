package optional;

public class Pantalla {

    private int ancho;

    private int largo;

    public Pantalla() {
    }

    public Pantalla(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}
