public class Figurinha {

    private String nomeJogador;
    private String dataNasc;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha(String nomeJogador, String dataNasc, double altura, double peso, String posicao, String pais) {
        this.nomeJogador = nomeJogador;
        this.dataNasc = dataNasc;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
