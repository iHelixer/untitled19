public class ClientThread implements Runnable {
    private final ATM atm;
    private final String clientName;
    private final int amount;


    public ClientThread(ATM atm, String clientName, int amount){
        this.atm = atm;
        this.clientName = clientName;
        this.amount = amount;
    }

    @Override
    public void run(){
        atm.withdraw(clientName, amount);
    }



}
