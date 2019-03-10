package optional_2;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        Rueda rueda = new Rueda(Rueda.Neumatico.NEGRO);


        Chasis chasis =
                new Chasis(new Chasis.Builder().setMarca("MARCA").setRueda(Optional.of(rueda)));

        // String s = chasis.getRueda().map(r -> r.getNeumatico().toString()).get();
        System.out.println(chasis.getRueda().map(r -> r.getNeumatico().toString()).get());

    }


}
