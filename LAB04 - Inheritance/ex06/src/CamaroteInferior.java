public class CamaroteInferior extends VIP{

    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void escreveLocalizacao() {
        System.out.println("Localização do camarote inferior: " + this.localizacao);
    }
    
}
