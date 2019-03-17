package anonimous;

public class Clase {


    public static void main(String[] args) {
        final double[] doble = {3};

        iApp i_1 = new iApp() {
            @Override
            public double metodo(double a, double b) {
               return doble[0] =  a + b;
            }
        };

        iApp i_2 = (a, b) -> a + b + doble[0];
        iApp i_3 = (a, b) -> {return (a + b + doble[0]);};

        System.out.println(i_1.metodo(3, 3));
        System.out.println(i_2.metodo(3, 3));
        System.out.println(i_3.metodo(3, 3));

        iApp.motodoDesdeStatic();



    }


}
