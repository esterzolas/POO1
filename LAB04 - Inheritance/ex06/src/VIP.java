public class VIP extends Ingresso {

    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public double getValor() {
        return super.getValor() + this.valorAdicional;
    }

    public void escreveValor() {
        System.out.println("Valor do ingresso VIP: " + this.getValor());
    }
    
}
