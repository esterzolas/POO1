public class Quadrado extends FormaBidimensional {

    private double lado;

    public Quadrado() {
        super();
        this.lado = 0.0;
    }

    public Quadrado(String nome, String descricao, double lado) {
        super(nome, descricao);
        this.lado = lado;
        obterArea();
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado (double lado) {
        this.lado = lado;
    }

    public void obterArea() {
        double area = lado * lado;
        setArea(area);
    }

}
