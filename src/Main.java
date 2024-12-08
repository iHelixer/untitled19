//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM(1000);

        Thread client1 = new Thread(new ClientThread(atm, "Client 1", 300));
        Thread client2 = new Thread(new ClientThread(atm, "Client 2", 500));
        Thread client3 = new Thread(new ClientThread(atm, "Client 3", 700));


        client1.start();
        client2.start();
        client3.start();


    }
}