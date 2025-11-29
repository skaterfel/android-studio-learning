import classes.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro dog = new Cachorro();
        dog.latir();
        Passaro piu = new Passaro();
        piu.voar();

        dog.setCor("Azul");
        dog.setPeso(2.2);
        dog.setTamanho(40);
        
        piu.setCor("Amarelo");
        piu.setPeso(1.2);
        piu.setTamanho(20);

        System.out.println(piu);
        System.out.println(dog);

        dog.correr();
        piu.correr();


        Conta conta = new Conta();
        conta.getNumeroConta();
    }
}
