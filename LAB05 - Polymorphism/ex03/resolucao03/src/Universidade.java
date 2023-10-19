public class Universidade {

    private String nome;
    private String dataFundacao;
    private Estudante[] estudantes = new Estudante[100];

    public Universidade() {
        this.nome = " ";
        this.dataFundacao = " ";
    }

    public Universidade(String nome, String dataFundacao) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        for (int i = 0; i < estudantes.length; i++) {
            estudantes[i] = null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void adicionarEstudante(Estudante estudante) {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] == null) {
                estudantes[i] = estudante;
                break;
            }
        }
    }

    public void contarEstudantes() {

        estudantes[0] = new EstudanteGraduacao("João","Rua 1","Polimorfismo");
        estudantes[1] = new EstudantePosGrad("Maria","Rua 2","Pós-Graduação","Linha 1");
        estudantes[2] = new EstudanteDoutorado("José","Rua 3","Doutorado","Linha 2","Título 1");
        estudantes[3] = new EstudanteMestrado("Ana","Rua 4","Mestrado","Linha 3","Profissional", "Tipo 1");

        int contador = 0;
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                if (estudantes[i] instanceof EstudanteGraduacao || estudantes[i] instanceof EstudantePosGrad) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de estudantes de graduação e pós-graduação: " + contador);
    }

    public void mostrarEstudantes() {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                if (estudantes[i] instanceof EstudanteDoutorado) {
                    estudantes[i].print();
                } else {
                    estudantes[i].print();
                }
            }
        }
    }

    public void mostrarEstudantesPosGrad() {
        Estudante[] estudantesPosGrad = new EstudantePosGrad[100];
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                if (estudantes[i] instanceof EstudantePosGrad) {
                    estudantesPosGrad[i] = estudantes[i];
                }
            }
        }

        for (int i = 0; i < estudantesPosGrad.length; i++) {
            if (estudantesPosGrad[i] != null) {
                estudantesPosGrad[i].print();
            }
        }
    }

}
