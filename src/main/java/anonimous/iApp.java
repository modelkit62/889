package anonimous;

public interface iApp {
    double metodo(double a, double b);

    default public void metodoDesdeDefaul(){
        System.out.println("Soy un metodo default implementado!");
    }

    static void motodoDesdeStatic() {
        System.out.println("Soy un metodo estatic!");
    }

}
