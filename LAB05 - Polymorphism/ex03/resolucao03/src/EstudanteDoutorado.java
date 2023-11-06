public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao, String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado {" + "tituloTese: " + tituloTese + '\'' + '}');
    }

    public void print(boolean opcao) {
        super.print();
        if (opcao == true) {
            System.out.println("EstudanteDoutorado {" + "tituloTese: " + tituloTese + '\'' + '}');
        } else {
            System.out.println("EstudanteDoutorado {" + "\nTitulo Tese:'" + tituloTese + '\'' + "\n}");
        }
    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
}
