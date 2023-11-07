public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private double tetoSalarial;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.tetoSalarial = 40000;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public double getTetoSalarial() {
        return this.tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    void aumentarSalario(double porcentagem) throws AumentoSalarioException {
        if (porcentagem < 0) 
            throw new AumentoSalarioException("Aumento não pode ser negativo.");

        else if (this.salario * (1 + porcentagem / 100) > this.tetoSalarial) 
            throw new AumentoSalarioException("Aumento não pode exceder o teto salarial.");

        this.salario *= (1 + porcentagem / 100);
    }
    
}
