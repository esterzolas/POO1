// Usando o conceito de Agregação entre classes
/*
    Neste exemplo temos a classe Faculdade que é a classe agregadora e a classe Professor é a classe
    agregada. A faculdade tem vários professores, mas os professores não são destruídos 
    quando a faculdade é destruída, eles podem ser usados por outras entidades ou até mesmo 
    sair da faculdade sem afetar a sua existência. Essa é uma agregação de um para muitos.
    
 */

public class Faculdade {
    private String nome;
    private Professor[] professor;

    public Faculdade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
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

}
