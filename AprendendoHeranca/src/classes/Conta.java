package classes;

public class Conta {

    


    protected int numeroConta;
    private double saldo = 100.0;

    public double getSaldo() {
        return saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void sacar(double valorSaque){
        if (valorSaque > this.saldo) {
            System.out.println("Operação não permitida, sem saldo.");
            System.out.println("Saldo atual: R$ " + getSaldo());
        } else {
            this.saldo = this.saldo - valorSaque;

        }        
    }

    
}
