public class Principal {
    public static void main(String[] args) {

        Figurinha figurinha1 = new Figurinha("Ester", "23/02/2003", 1.72, 62.3, "Atacante", "Portugal");
        Figurinha figurinha2 = new Figurinha("Alex", "29/04/2003", 1.85, 87.2, "Goleiro", "Brasil");
        Figurinha figurinha3 = new Figurinha("Fabinho", "15/01/2003", 1.75, 60.0, "Central", "Brasil");

        System.out.println("Informações da Figurinha 1:");
        figurinha1.mostrarInformacoes();

        System.out.println("\nInformações da Figurinha 2:");
        figurinha2.mostrarInformacoes();

        System.out.println("\nInformações da Figurinha 3:");
        figurinha3.mostrarInformacoes();
    }
}
