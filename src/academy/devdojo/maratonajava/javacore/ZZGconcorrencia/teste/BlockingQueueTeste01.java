package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTeste01 {
    public static void main(String[] args) throws InterruptedException{
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Bruno");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");
        new Thread(new RemoverFromQueue(bq)).start();
        bq.put("Elis");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }

    static class  RemoverFromQueue implements Runnable {
        private final BlockingQueue<String> bq;

        public RemoverFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 5s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("%s removing value from queue %s%n",Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

