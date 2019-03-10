package cosas_sueltas;

public class Anomina_2 {


    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 3;
                int b = 3;
                System.out.println(a+b);
            }
        }).start();



    }


}
