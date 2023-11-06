public class Cliente implements Classificavel {

    private String nome;

    public Cliente (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int eMenorQue(Classificavel c) {
        Cliente compara = (Cliente) c;
        if (this.nome.compareTo(compara.nome) < 0) { // compareTo retorna um inteiro, se for menor que 0, o objeto é menor que o comparado
            return -1;
        } else {
            return 1;
        }
    }

    public void imprimeCliente() {
        System.out.println("\nNome: " + this.nome);
    }
    
}
