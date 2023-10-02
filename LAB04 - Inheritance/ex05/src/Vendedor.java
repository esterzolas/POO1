public class Vendedor extends Funcionario{

    private double comissao;
    private double valorFixo;
    private int vendas;

    public Vendedor(){
        super();
        this.comissao = -1;
        this.valorFixo = -1;
        this.vendas = -1;
    }
    
    public Vendedor(String nome, String data, double salario, double comissao, double valorFixo, int vendas){
        super(nome, data, (valorFixo + (comissao * vendas)));
        this.comissao = comissao;
        this.valorFixo = valorFixo;
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void setSalario(){
        super.setSalario((valorFixo + (comissao * vendas)));
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Valor Fixo: " + valorFixo);
        System.out.println("Comissao: " + comissao);
        System.out.println("Vendas: " + vendas);
    }
}
