public class Animal {
    private String cor;
    private int tamanho;
    private double peso;

    void correr(){
        System.out.println("Correndo como um ");
    }

    void dormir(){
        System.out.println("Z Z Z z z z");
    }

    @Override
    public String toString() {
        return "|cor: "+ cor + "| tamanho:(cm) " + tamanho + "| peso: " + peso + " kg|";
    }

    public String getCor() {
        return cor;
    }

    public double getPeso() {
        return peso;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    

}
