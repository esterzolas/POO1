public class FigurinhaExtra extends Figurinha {

    private String categoria;
    private String cor;

    public FigurinhaExtra(String nomeJogador, String dataNascimento, double altura, double peso, String posicao, String pais, String categoria, String cor) {
        super(nomeJogador, dataNascimento, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
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

    public void mostrarFigurinha() {
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
