public class Esfera extends FormaTridimensional {

    private double raio;

    public Esfera() {
        super();
        this.raio = 0.0;
    }

    public Esfera(String nome, String descricao, double raio) {
        super(nome, descricao);
        this.raio = raio;
        obterArea();
        obterVolume();
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio (double raio) {
        this.raio = raio;
    }

    public void obterArea() {
        double area = 4 * Math.PI * Math.pow(raio, 2);
        setArea(area);
    }

    public void obterVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        setVolume(volume);
    }
    
}
