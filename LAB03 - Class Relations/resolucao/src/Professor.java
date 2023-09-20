public class Professor {
    private String nome;
    private String graduacao;
    private String area;
    private Data dataAdmissao;
    private Estudante[] estudante;

    public Professor(String nome, String graduacao, String area) {
        this.nome = nome;
        this.graduacao = graduacao;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public String getArea() {
        return area;
    }

    public String setArea(String area) {
        this.area = area;
        return area;
    }

    public Data getDataAdmissao() {
        return dataAdmissao;
    }

    public Estudante[] getEstudante() {
        return estudante;
    }

    public void adicionarEstudante(Estudante estudante) {
        if (this.estudante == null) {
            this.estudante = new Estudante[1];
            this.estudante[0] = estudante;
        } else {
            Estudante[] novoArray = new Estudante[this.estudante.length + 1];
            for (int i = 0; i < this.estudante.length; i++) {
                novoArray[i] = this.estudante[i];
            }
            novoArray[this.estudante.length] = estudante;
            this.estudante = novoArray;
        }
    }

    public void mostrarProfessor() {
        System.out.println("Professor\narea: " + area + "\ngraduacao: " + graduacao + "\nnome: " + nome + "\n"); 
    }
}
