public class Figurinha {

    private String nomeJogador;
    private String dataNasc;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha(String pais){
        this.nomeJogador = null;
        this.dataNasc = null;
        this.altura = 0.0;
        this.peso = 0.0;
        this.posicao = null;
        this.pais = pais;

    }

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

    public void setNomeJogador(String nomeJogador) {
        if (nomeJogador.length() > 0) {
            this.nomeJogador = nomeJogador;
        }
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        if (dataNasc.length() > 0) {
            this.dataNasc = dataNasc;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        if (posicao.length() > 0) {
            this.posicao = posicao;
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        if (pais.length() > 0) {
            this.pais = pais;
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }

}

