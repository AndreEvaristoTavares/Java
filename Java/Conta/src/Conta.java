public class Conta {
    private int number;
    private String holder;
    private int fazerDeposito;
    private double saldo;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public void setSaldo(double deposit) {
            this.saldo += deposit;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setFazerDeposito(char resp){this.fazerDeposito = resp;}
    public int getFazerDeposito(){return this.fazerDeposito;}
    public void setSaque(double saque){
        this.saldo -= saque;
    }

}
