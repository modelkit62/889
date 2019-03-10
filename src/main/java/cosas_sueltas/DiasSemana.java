package cosas_sueltas;

public enum DiasSemana{

    LUNES("CAOS"), MARTES("MIERDA");

    private String significado;

    DiasSemana(String significado) {
        this.significado = significado;
    }

    public String getSignificado() {
        return significado;
    }

    @Override
    public String toString() {
        if(this == DiasSemana.LUNES){
            return "POLLA EN VINAGRE";
        }
        return "HIJO DE PUTA";
    }
}
