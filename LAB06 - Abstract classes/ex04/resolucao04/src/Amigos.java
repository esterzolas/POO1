public class Amigos extends Contato {

    private int grauAmizade; // 1 = melhor amigo; 2 = amigo; 3 = conhecido

    public Amigos(String nome, String apelido, String email, String aniversario, int grauAmizade) {
        super(nome, apelido, email, aniversario);
        this.grauAmizade = grauAmizade;
    }

    public int getGrauAmizade() {
        return grauAmizade;
    }

    public void imprimirContato() {
        imprimirBasico();
        System.out.println("Grau de amizade: " + grauAmizade);
    }

}
