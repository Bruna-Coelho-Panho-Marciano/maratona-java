package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
     void increment() {
        count++;
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;

    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}
public class AtomicIntegerTeste01 {
    public static void main(String[] args)throws InterruptedException{
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++){
                counter.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
