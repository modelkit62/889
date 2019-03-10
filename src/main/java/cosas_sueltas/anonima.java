package cosas_sueltas;

public class anonima {


    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(2000);
        System.out.println("PUTA");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hello");
            }
        }).start();


    }


}
