public class FormaTridimensional extends Forma {

    protected double volume;

    public FormaTridimensional() {
        super();
        this.volume = 0.0;
    }

    public FormaTridimensional(String nome, String descricao) {
        super(nome, descricao);
        this.volume = 0.0;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume (double volume) {
        this.volume = volume;
    }

    public void mostrarForma() {
        System.out.println("Nome: " + this.nome + "\nDescricao: " + this.descricao + "\nÁrea: " + this.area + "\nVolume: " + this.volume);
    }
    
}
