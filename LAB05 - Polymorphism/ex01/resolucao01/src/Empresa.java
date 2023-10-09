public class Empresa {
    public static void main(String[] args) {
        Funcionario c = new Chefe("Ester", "23/01/2003", 20000);
        Funcionario h = new Horista("Alex", "29/04/2003", 0, 94, 87);
        Funcionario o = new Operario("Fabio", "15/01/2003", 0, 67, 300);
        Funcionario v = new Vendedor("Syna", "10/03/2003", 0, 1000, 2000, 6);

        Funcionario[] funcionarios = {c, h, o, v};
    
        FolhaPagamento folha = new FolhaPagamento(funcionarios);
        folha.mostrarFolhaPagamento(funcionarios);

    }
}

