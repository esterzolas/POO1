public class FigurinhaExtra extends Figurinha {

    private String categoria;
    private String cor;

    public FigurinhaExtra(Figurinha fig, String categoria, String cor) {
        super(fig.getNomeJogador(), fig.getDataNasc(), fig.getAltura(), fig.getPeso(), fig.getPosicao(), fig.getPais());
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

        super.mostrarFigurinha();
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }

}
