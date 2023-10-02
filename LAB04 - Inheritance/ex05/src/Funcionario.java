public class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario(){
        this.nome = null;
        this.dataNascimento = null;
        this.salario = -1;
    }

    public Funcionario(String nome, String data, double salario){
        this.nome = nome;
        this.dataNascimento = data;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //talvez criar métodos de aumentar salário

    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Salário: " + salario);
    }
}
