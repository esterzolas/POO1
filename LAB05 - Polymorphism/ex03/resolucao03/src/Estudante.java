public class Estudante {
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void print() {
        System.out.println("Estudante {" + "nome: " + nome + '\'' + ", endereco: " + endereco + '\'' + '}');
    }

    public void print(boolean opcao) {
        if (opcao == true) {
            System.out.println("Estudante {" + "nome: " + nome + '\'' + ", endereco: " + endereco + '\'' + '}');
        } else {
            System.out.println("Estudante {" + "\nNome:'" + nome + '\'' + ", \nEndereco:'" + endereco + '\'' + "\n}");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}

/*
 * Resposta letra e)
 * 
 * Tendo como base um vetor da classe Estudante não é possível usar o método print(boolean)
 * pois este método não existe na classe Estudante, apenas nas subclasses de Doutorado e
 * Mestrado. Só existe o método print() na classe Estudante. Para que seja possível usá-lo
 * devemos criar o método print com argumentos na classe Estudante e na Pós Graduação que
 * também está herdando o mesmo erro de não ter o método print(boolean).
 * 
 */
