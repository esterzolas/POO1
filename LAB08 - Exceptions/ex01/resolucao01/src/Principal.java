public class Principal {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ester", "123.456.789-00", 10000);

        try {
            f.aumentarSalario(410);
            System.out.println("Novo salário: " + f.getSalario());
        
        } catch (AumentoSalarioException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Salário atual: " + f.getSalario());
    }
}
