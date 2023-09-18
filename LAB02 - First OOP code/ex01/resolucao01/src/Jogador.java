public class Jogador {
    private String nome;
    private int idade;
    private String time;

    public Jogador(String nome, int idade, String time) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String gettime() {
        return time;
    }

    // Método para exibir informações do jogador na tela
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Time: " + time);
    }

    public class Principal {
        public static void main(String[] args) {

            Jogador jogador1 = new Jogador("João", 25, "Flamengo");
            Jogador jogador2 = new Jogador("Maria", 28, "Palmeiras");
            Jogador jogador3 = new Jogador("Pedro", 22, "São Paulo");

            System.out.println("Informações do Jogador 1:");
            jogador1.mostrarInformacoes();

            System.out.println("\nInformações do Jogador 2:");
            jogador2.mostrarInformacoes();

            System.out.println("\nInformações do Jogador 3:");
            jogador3.mostrarInformacoes();
        }
    }
}

