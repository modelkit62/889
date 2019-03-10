package optional_2;

import java.util.Optional;

public class Chasis {
    private Optional<Rueda> rueda;
    private String marca;

    public Chasis(Builder builder) {
        this.rueda = builder.rueda;
        this.marca = builder.marca;
    }

    public Optional<Rueda> getRueda() {
        return rueda;
    }

    public String getMarca() {
        return marca;
    }

    static class Builder {
        Optional<Rueda> rueda;
        String marca;

        public Builder setRueda(Optional<Rueda> rueda) {
            this.rueda = rueda;
            return this;
        }

        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Chasis build(){
            return new Chasis(this);

        }


    }


}
