package poo.BankAccount;

public class BankAccount {
    private int numAccount;
    private String type;
    private String owner;
    private float balance;
    private boolean status;

    public BankAccount(){
        this.setStatus(false);
        this.setBalance(0);
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = this.getBalance()+balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void openAccount(String type){
        type.toLowerCase();
        setType(type);
        this.setStatus(true);
        if (this.type.equals("cc")){
            this.setBalance(this.getBalance()+50.00f);
        }else if (this.type.equals("cp")){
            this.setBalance(this.getBalance()+150f);
        }
    }
    public void closeAccount(){
        if (this.getBalance()>0){
            System.out.println("Não foi possível fechar essa conta.\nMOTIVO: Ainda há saldo.");
        }else if (this.getBalance()<0){
            System.out.println("Não foi possível fechar essa conta.\nMOTIVO: Ainda há débito.");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    public void withdraw(float withdraw){
        if (this.isStatus()==true){
            if (this.getBalance()>=withdraw){
                this.setBalance(-withdraw);
            }else{
                System.out.printf("Não foi possível efetuar o saque.\n");
            }
        }
    }
    public void deposit(float deposit){
        if (this.isStatus()==true){
            this.setBalance(+deposit);
        }else{
            System.out.printf("Não foi possível fazer o deposito.\n");
        }
    }
    public void payMonthlyFee(){
        int v;
        if (getType().equals("cc")){
            v=12;
        }else{
            v=20;
        }
        if (this.getType().equals("cc")){
            if (this.isStatus()==true){
                if (getBalance()>=12.00){
                    this.setBalance(-v);
                }
            }
        }else if (this.getType().equals("cp")){
            if (this.isStatus()==true){
                if (getBalance()>=20f){
                    this.setBalance(-v);
                }
            }
        }else{
            System.out.printf("Não há saldo suficiente para efetuar a cobrança.");
        }
    }
    public void information(){
        System.out.printf("--------------------------------\n");
        System.out.printf("O(A) dono(a) dessa conta se é o(a) %s.\n",this.getOwner());
        if(getType().equals("cc")){
            System.out.printf("Essa é um conta corrente.\n");
        }else if (getType().equals("cp")){
            System.out.printf("Essa é uma conta poupança.\n");
        }
        System.out.printf("O número de indentificação dessa conta é %d.\n",this.getNumAccount());
        System.out.printf("O saldo atual é de R$%.2f.\n",this.getBalance());
    }
}
