public class Pessoa {

    public String nome;
    private int idade;
    protected String cpf;

    public Pessoa() {
        this.nome = null;
        this.cpf = null;
        this.idade = -1;
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        System.out.println("Classe C1: chamada do construtor padrao, com parametros");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarAtributos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }

    public void mostrarAtributosSuper() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }
}
