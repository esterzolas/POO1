public class Principal {
    public static void main(String[] args) {
        Figurinha[] figurinhas = new Figurinha[3];
        
        figurinhas[0] = new Figurinha("Ester", "23/02/2003", 1.72, 62.3, "Atacante", "Portugal");
        figurinhas[1] = new Figurinha("Alex", "29/04/2003", 1.85, 87.2, "Goleiro", "Brasil");
        figurinhas[2] = new Figurinha("Fabinho", "15/01/2003", 1.75, 60.0, "Central", "Brasil");

        for (int i = 0; i < figurinhas.length; i++) {
            System.out.println("Informações do Jogador " + (i + 1) + ":");
            figurinhas[i].mostrarInformacoes();
            System.out.println("---------------------------------------");
        }

    }
}
