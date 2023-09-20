// Usando o conceito de Associação entre classes
/* 
    Um estudante pode ter vários professores mas se destruirmos a classe professor o 
    estudante continua existindo. Assim como um professor pode ter vários estudantes
    mas se destruirmos a classe estudante o professor continua existindo.
    Essa é uma associação de muitos para muitos.

*/

// Usando o conceito de Composição entre classes
/*
    Podemos notar que a classe estudante tem uma composição com a classe data, pois
    a data de nascimento não faz sentido existir sem o estudante, se destruirmos a classe estudante
    a data de nascimento também será destruída. Essa é uma composição de um para um.

*/

public class Estudante {

    private String nome;
    private String matricula;
    private String curso;
    private Professor[] professor;
    private Data dataNascimento;

    public Estudante(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void adicionarProfessor(Professor professor) {
        if (this.professor == null) {
            this.professor = new Professor[1];
            this.professor[0] = professor;
        } else {
            Professor[] novoArray = new Professor[this.professor.length + 1];
            for (int i = 0; i < this.professor.length; i++) {
                novoArray[i] = this.professor[i];
            }
            novoArray[this.professor.length] = professor;
            this.professor = novoArray;
        }
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void mostrarEstudante() {
        System.out.println("Estudante\ncurso: " + curso + "\nmatricula: " + matricula + "\nnome: " + nome + "\n"); 
    }

    
}
