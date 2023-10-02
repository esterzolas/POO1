public class Ingresso {
    
    private double valor;
    
    public Ingresso(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void escreveValor() {
        System.out.println("Valor do ingresso: " + this.valor);
    }
    
}
