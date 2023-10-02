public class Jogador extends Pessoa{
    public String jogo;
    private String plataforma; //pc, console, mobile
    protected double qtdHoras;

    public Jogador(){
        nome = null;
        cpf = null;
        setIdade(0);
        this.jogo = null;
        this.plataforma = null;
        this.qtdHoras = -1;
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public Jogador(String nome, int idade, String cpf, String jogo, String plataforma, double qtdHoras) {
        this.nome = nome;
        setIdade(idade);
        this.cpf = cpf;
        this.jogo = jogo;
        this.plataforma = plataforma;
        this.qtdHoras = qtdHoras;
        System.out.println("Classe C2: chamada do construtor padrao, com parametros");
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public void mostrarAtributos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + cpf);
        System.out.println("Jogo: " + jogo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Quantidade de horas jogadas: " + qtdHoras);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
        System.out.println("Jogo: " + jogo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Quantidade de horas jogadas: " + qtdHoras);
    }

}
