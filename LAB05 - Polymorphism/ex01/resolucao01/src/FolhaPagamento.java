public class FolhaPagamento extends Funcionario{

    private Funcionario[] funcionarios;

    public FolhaPagamento(Funcionario[] vetor) {
        this.funcionarios = vetor;
    }

    Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void mostrarFolhaPagamento(Funcionario[] funcionarios) {
        for (Funcionario f : funcionarios) {
            f.mostrar();
            System.out.println();
        }
    }
}
