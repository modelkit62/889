package optional;

import java.util.Optional;

public class App {

    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla(2,2);
        Resolucion resolucion = new Resolucion("XL", Optional.of(pantalla));
        Movil movil = new Movil(1, "Android", Optional.of(resolucion));
        Taller taller = new Taller();
        int i = taller.dameLaAnchuraDePantalla(Optional.of(movil));
        System.out.println(i);

    }
}
