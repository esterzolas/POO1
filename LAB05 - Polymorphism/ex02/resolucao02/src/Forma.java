public class Forma {
    protected String nome;
    protected String descricao;
    protected double area;

    public Forma() {
        this.nome = "";
        this.descricao = "";
        this.area = 0.0;
    }

    public Forma(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.area = 0.0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public void mostrarDescricao() {
        System.out.println("Nome: " + this.nome + "\nDescricao: " + this.descricao);
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void mostrarForma() {
        System.out.println("Nome: " + this.nome + "\nDescricao: " + this.descricao + "\nÁrea: " + this.area);
    }

}
