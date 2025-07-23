package academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZFthreads.teste;
import academy.devdojo.maratonajava.introducao.src.academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTeste01 implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTeste01 threadAccountTeste01 = new ThreadAccountTeste01();
        Thread t1 = new Thread(threadAccountTeste01,"Hestia");
        Thread t2 = new Thread(threadAccountTeste01,"Bell Cranel");
        t1.start();
        t2.start();

    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            withdrawl(10);
            if(account.getBalance() < 0) {
                System.out.println("Deu ruim");
            }
        }
    }

    private void withdrawl(int amount){
        if(account.getBalance() >= amount){
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdrawl(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta "+ account.getBalance());
        }else{
            System.out.println("Sem dinheiro para "+ getThreadName() +" para  efetuar o saque "+account.getBalance());
        }
    }

    private  String getThreadName() {
        return Thread.currentThread().getName();
    }
}
