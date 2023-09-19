public class Selecao {
    
    private String nome;
    private String[] jogadoresTitulares;
    private String nomeTecnico;
    private String informacoesExtras;

    public Selecao(String nome, String[] jogadoresTitulares, String nomeTecnico, String informacoesExtras) {
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

    public String[] getJogadoresTitulares() {
        return jogadoresTitulares;
    }

    public void setJogadoresTitulares(String[] jogadoresTitulares) {
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

    public void mostrarInformacoes() {
        System.out.println("Nome da seleção: " + nome);
        System.out.println("Jogadores titulares:");
        for (String jogador : jogadoresTitulares) {
            System.out.println("  - " + jogador);
        }
        System.out.println("Nome do técnico: " + nomeTecnico);
        System.out.println("Informações extras: " + informacoesExtras);
    }

    public static void main(String[] args) {
        String[] jogadoresBrasil = {"Neymar", "Alisson", "Casemiro"};
        Selecao selecaoBrasil = new Selecao("Brasil", jogadoresBrasil, "Tite", "A melhor seleção do mundo");

        String[] jogadoresPortugal = {"Cristiano Ronaldo", "Pepe", "João Félix"};
        Selecao selecaoPortugal = new Selecao("Portugal", jogadoresPortugal, "Lionel Scaloni", "Campeão da Copa do Mundo 2 vezes");

        selecaoBrasil.mostrarInformacoes();
        selecaoPortugal.mostrarInformacoes();
    }
}
