public class ATM {
    private int balance;


    public ATM(int initialBalance){
        this.balance = initialBalance;
    }


    public synchronized void withdraw(String clientName, int amount){
        System.out.println(clientName + " намагається зняти " + amount + " грн ");
        if(amount <= balance){
            balance -= amount;
            System.out.println(clientName + " успішно зняв " + amount + " грн. Залишок: " + balance + " грн.");
        }else{
            System.out.println(clientName + " не вдалося зняти " + amount + " грн. Недостатньо коштів!");
        }
    }


}
