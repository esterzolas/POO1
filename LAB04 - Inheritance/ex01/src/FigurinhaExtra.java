public class FigurinhaExtra {

    private String nomeJogador;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;
    private String categoria;
    private String cor;

    public FigurinhaExtra(String nomeJogador, String dataNascimento, double altura, double peso, String posicao, String pais, String categoria, String cor) {
        this.nomeJogador = nomeJogador;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
        this.categoria = categoria;
        this.cor = cor;
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
        return dataNascimento;
    }

    public void setDataNasc(String dataNasc) {
        if (dataNasc.length() > 0) {
            this.dataNascimento = dataNasc;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria.length() > 0) {
            this.categoria = categoria;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor.length() > 0) {
            this.cor = cor;
        }
    }

    public void mostrarFigurinhaExtra() {
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }

}
