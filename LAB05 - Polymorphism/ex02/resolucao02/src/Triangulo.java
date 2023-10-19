public class Triangulo extends FormaBidimensional{

    private double base;
    private double altura;

    public Triangulo() {
        super();
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Triangulo(String nome, String descricao, double base, double altura) {
        super(nome, descricao);
        this.base = base;
        this.altura = altura;
        obterArea();
    }

    public double getBase() {
        return this.base;
    }

    public void setBase (double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura (double altura) {
        this.altura = altura;
    }

    public void obterArea() {
        double area = (base * altura) / 2;
        setArea(area);
    }
    
}
