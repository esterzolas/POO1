public class Circulo extends FormaBidimensional{

    private double raio;

    public Circulo() {
        super();
        this.raio = 0.0;
    }

    public Circulo(String nome, String descricao, double raio) {
        super(nome, descricao);
        this.raio = raio;
        obterArea();
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio (double raio) {
        this.raio = raio;
    }

    public void obterArea() {
        double area = Math.PI * Math.pow(raio, 2);
        setArea(area);
    }

}
