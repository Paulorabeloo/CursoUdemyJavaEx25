public class RegisterAccount {
    private int numAccount;
    private String nameAccount;
    private double balance;
    private String initialDeposit;

    //iniciando os atributos do objeto
    public RegisterAccount(int numAccount, String nameAccount, String initialDeposit, double balance){
        this.numAccount = numAccount;
        this.nameAccount = nameAccount;
        this.initialDeposit = initialDeposit;
        this.balance = balance;
    }

    //getters e setters
    //número da conta não pode ser alterado -> regra de negócio
    public int getNumAccount(){
        return numAccount;
    }

    //nome pode ser alterado
    public String getNameAccount(){
        return nameAccount;
    }

    public void setNameAccount(String nameAccount){
        this.nameAccount = nameAccount;
    }

    //saldo não pode ser alterado
    public double getBalance(){
        return balance;
    }

    //métodos
    // depositar dinheiro
    public double Deposit(double valueDeposit){
        return balance+=valueDeposit;
    }

    //sacar dinheiro -> não precisa retornar pois já tem metodo getBlance para ver saldo (objetivo é atualizar o balance).
    public void Withdraw(double withdrawalAmount){
        double fee = 5.0;          // taxa fixa
        balance -= (withdrawalAmount + fee);
    }

}
