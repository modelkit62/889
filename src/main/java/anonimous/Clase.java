package anonimous;

public class Clase {


    public static void main(String[] args) {
        iApp i_1 = new iApp() {
            @Override
            public double metodo(double a, double b) {
                return a + b;
            }
        };

        iApp i_2 = (double a, double b) -> a + b;

        System.out.println(i_1.metodo(3, 3));
        System.out.println(i_2.metodo(3, 3));
    }


}
