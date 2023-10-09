public class Chefe extends Funcionario {

    Chefe(){
        super();
    }
    
    Chefe(String nome, String data, double salario){
        super(nome, data, salario);
    }

    public void setSalario() {
        System.out.println("Não é possível alteração");
    }
}
