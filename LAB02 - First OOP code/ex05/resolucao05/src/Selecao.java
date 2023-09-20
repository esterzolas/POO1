public class Selecao {
    
    private String nome;
    private Figurinha[] jogadoresTitulares;
    private String nomeTecnico;
    private String informacoesExtras;

    public Selecao(String nome) {
        this.nome = nome;
        this.jogadoresTitulares = new Figurinha[11];

        for (int i = 0; i < 11; i++) {
            this.jogadoresTitulares[i] = new Figurinha(nome);
        }
    }

    public Selecao(String nome, Figurinha[] jogadoresTitulares, String nomeTecnico, String informacoesExtras) {
        this.nome = nome;
        this.jogadoresTitulares = jogadoresTitulares;
        this.nomeTecnico = nomeTecnico;
        this.informacoesExtras = informacoesExtras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Figurinha[] getJogadoresTitulares() {
        return jogadoresTitulares;
    }

    public void setJogadoresTitulares(Figurinha[] jogadoresTitulares) {
        this.jogadoresTitulares = jogadoresTitulares;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getInformacoesExtras() {
        return informacoesExtras;
    }

    public void setInformacoesExtras(String informacoesExtras) {
        this.informacoesExtras = informacoesExtras;
    }

    public void mostrarJogadores() {
        System.out.println("Seleção: " + nome);
        System.out.println("Técnico: " + nomeTecnico);
        System.out.println("Informações Extras: " + informacoesExtras);
        System.out.println("Jogadores Titulares:\n");

        for (int i = 0; i < jogadoresTitulares.length; i++) {
            Figurinha figurinha = jogadoresTitulares[i];
            System.out.println("Jogador " + (i + 1));
            System.out.println("Nome: " + figurinha.getNomeJogador());
            System.out.println("Data de Nascimento: " + figurinha.getDataNasc());
            System.out.println("Altura: " + figurinha.getAltura());
            System.out.println("Peso: " + figurinha.getPeso());
            System.out.println("Posição: " + figurinha.getPosicao());
            System.out.println("País: " + figurinha.getPais());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Selecao selecaoBrasil = new Selecao("Brasil");
        selecaoBrasil.mostrarJogadores();
    }
}
