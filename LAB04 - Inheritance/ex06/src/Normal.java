public class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }

    public void escreveValor() {
        System.out.println("Valor do ingresso normal: " + this.getValor());
    }
    
}
