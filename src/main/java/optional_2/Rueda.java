package optional_2;

public class Rueda {


    Neumatico neumatico;

    public enum Neumatico{

        NEGRO("POLLA"), AZUL("Michelin");

        private String marca;

        Neumatico(String marca) {
            this.marca = marca;
        }

        public String getMarca(){
            return this.marca;
        }

        @Override
        public String toString() {
            if(this == Neumatico.AZUL){
                return Neumatico.AZUL.getMarca();
            }
            return Neumatico.NEGRO.getMarca();
        }
    }


    public Rueda(Neumatico neumatico) {
        this.neumatico = neumatico;
    }

    public Neumatico getNeumatico() {
        return neumatico;
    }
}
