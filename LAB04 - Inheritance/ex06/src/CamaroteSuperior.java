public class CamaroteSuperior extends VIP {

    private String localizacao;
    private double valorAdicional;

    public CamaroteSuperior(double valor, double valorAdicionalVIP, String localizacao, double valorAdicional) {
        super(valor, valorAdicionalVIP);
        this.localizacao = localizacao;
        this.valorAdicional = valorAdicional;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void imprimirLocalizacao() {
        System.out.println("Localização do camarote superior: " + this.localizacao);
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
}
