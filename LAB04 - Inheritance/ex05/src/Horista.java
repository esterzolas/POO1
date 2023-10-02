public class Horista extends Funcionario {
    private double valorHora;
    private double totalHorasTrabalhadas;

    public Horista(){
        super();
        this.valorHora = -1;
        this.totalHorasTrabalhadas = -1;
    }
    
    public Horista(String nome, String data, double salario, double valorHora, double totalHorasTrabalhadas){
        super(nome, data, (valorHora * totalHorasTrabalhadas));
        this.valorHora = valorHora;
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }

    public double getTotalHorasTrabalhadas() {
        return totalHorasTrabalhadas;
    } 

    public void setTotalHorasTrabalhadas(double totalHorasTrabalhadas) {
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setSalario(){
        super.setSalario((valorHora * totalHorasTrabalhadas));
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Valor por Hora: " + valorHora);
        System.out.println("Total de Horas Trabalhadas: " + totalHorasTrabalhadas);
    }

}
