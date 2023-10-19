public class Tetraedro extends FormaTridimensional {

    private double aresta;

    public Tetraedro() {
        super();
        this.aresta = 0.0;
    }

    public Tetraedro(String nome, String descricao, double aresta) {
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
        double area = Math.pow(aresta, 2) * Math.sqrt(3);
        setArea(area);
    }

    public void obterVolume() {
        double volume = (Math.pow(aresta, 3)) / (6 * Math.sqrt(2));
        setVolume(volume);
    }
    
}
