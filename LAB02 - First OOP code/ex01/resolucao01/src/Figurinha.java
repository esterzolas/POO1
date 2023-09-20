public class Figurinha {

    public String nomeJogador;
    public String dataNasc;
    public double altura;
    public double peso;
    public String posicao;
    public String pais;

    public Figurinha(String nomeJogador, String dataNasc, double altura, double peso, String posicao, String pais) {
        this.nomeJogador = nomeJogador;
        this.dataNasc = dataNasc;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }

}
