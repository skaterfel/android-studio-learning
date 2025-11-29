package classes;
public class AppConta {
    public static void main(String[] args) {
        
        
        
        Conta conta = new Conta();
        conta.numeroConta = 1;
        
        
        
        conta.depositar(100);
        conta.sacar(120);

        System.out.println(conta.getSaldo());

    }

}
