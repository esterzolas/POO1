public class Servico implements Classificavel {

    private String nome;
    private double preco;

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int eMenorQue(Classificavel c) {
        Servico compara = (Servico) c;
        if (this.preco < compara.preco) {
            return -1;
        } else {
            return 1;
        }
    }

    public void imprimeServico() {
        System.out.println("\nNome: " + this.nome + "\nPreço: " + this.preco);
    }
    
}
