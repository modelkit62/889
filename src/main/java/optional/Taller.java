package optional;

import java.util.Optional;

public class Taller {

    public int dameLaAnchuraDePantalla(Optional<Movil> movil){
        /*if(movil != null){
            Resolucion resolucion = movil.getResolucion();
            if (resolucion != null){
                Pantalla pantalla = resolucion.getPantalla();
                if(pantalla != null){
                  return pantalla.getAncho();
                }
            }
        }
        return 0;*/
        return movil.flatMap(Movil::getResolucion)
        .flatMap(Resolucion::getPantalla)
        .map(Pantalla::getAncho)
        .orElse(0);
    }
}
