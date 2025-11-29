public class Cachorro extends Animal{


    public void latir(){
        System.out.println("Latindo ... au au");
    }

    void correr(){
        super.correr();
        System.out.println("Cachorro...");

    }
}
