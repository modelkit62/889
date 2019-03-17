package anonimous;


@FunctionalInterface
public interface iApp {
    double metodo(double a, double b); // es metodo de interfaz funcional!!!
    // double metodo2(double a, double b); NO ES YA VALIDO PORQUE NO VALDRIAN LAS LAMBDA!!!
    default public void metodoDesdeDefaul(){
        System.out.println("Soy un metodo default implementado!");
    }

    static void motodoDesdeStatic() {
        System.out.println("Soy un metodo estatic!");
    }

}
