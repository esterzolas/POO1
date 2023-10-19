public class Cubo extends FormaTridimensional {

    private double aresta;

    public Cubo() {
        super();
        this.aresta = 0.0;
    }

    public Cubo(String nome, String descricao, double aresta) {
        super(nome, descricao);
        this.aresta = aresta;
        obterArea();
        obterVolume();
    }

    public double getAresta() {
        return this.aresta;
    }

    public void setAresta (double aresta) {
        this.aresta = aresta;
    }

    public void obterArea() {
        double area = 6 * Math.pow(aresta, 2);
        setArea(area);
    }

    public void obterVolume() {
        double volume = Math.pow(aresta, 3);
        setVolume(volume);
    }
    
}
