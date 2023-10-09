public class Operario extends Funcionario {

    private double valorPorProducao;
    private int qtdProduzida;

    public Operario(){
        super();
        this.valorPorProducao = -1;
        this.qtdProduzida = -1;
    }
    
    public Operario(String nome, String data, double salario, double valorPorProd, int qtdProd){
        super(nome, data, (valorPorProd * qtdProd));
        this.valorPorProducao = valorPorProd;
        this.qtdProduzida = qtdProd;
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    public double getValorPorProducao() {
        return valorPorProducao;
    }
    
    public void setValorPorProducao(double valorPorProducao) {
        this.valorPorProducao = valorPorProducao;
    }

    public void setSalario(){
        super.setSalario((valorPorProducao * qtdProduzida));
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Valor por Produção: " + valorPorProducao);
        System.out.println("Quantidade de Produtos Produzida: " + qtdProduzida);
    }

}
