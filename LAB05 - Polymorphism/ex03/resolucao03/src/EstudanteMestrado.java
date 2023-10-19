public class EstudanteMestrado extends EstudantePosGrad {
    private String tipo; // tipo pode ser acadêmico ou profisional
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao, String linhadDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    public void print() {
        super.print();
        System.out.println("EstudanteMestrado {" + "tipo: " + tipo + '\'' + ", titulo Dissertacao: "
                + tituloDissertacao + '\'' + '}');
    }

    public void print(boolean opcao) {
        super.print();
        if (opcao == true) {
            System.out.println("EstudanteMestrado {" + "tipo: " + tipo + '\'' + ", titulo Dissertacao: "
                    + tituloDissertacao + '\'' + '}');
        } else {
            System.out.println("EstudanteMestrado {" + "\nTipo:'" + tipo + '\'' + ", \nTitulo Dissertacao:'"
                    + tituloDissertacao + '\'' + "\n}");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }
}
