package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZFthreads.teste;

class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String c) {this.c = c;}

    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTeste02 {
        public static void main(String[] args) throws InterruptedException {
            Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
            Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
            t1.setPriority(Thread.MAX_PRIORITY);
            t1.start();
            t2.start();
            t1.join();
        }
    }

