public class Principal {
public static void main(String[] args) {

        AlteraFigs figurinha1 = new AlteraFigs("Ester", "23/02/2003", 1.72, 62.3, "Atacante", "Portugal");
        AlteraFigs figurinha2 = new AlteraFigs("Alex", "29/04/2003", 1.85, 87.2, "Goleiro", "Brasil");
        AlteraFigs figurinha3 = new AlteraFigs("Fabinho", "15/01/2003", 1.75, 60.0, "Central", "Brasil");

        System.out.println("Informações da Figurinha 1:");
        figurinha1.mostrarInformacoes();

        System.out.println("\nInformações da Figurinha 2:");
        figurinha2.mostrarInformacoes();

        System.out.println("\nInformações da Figurinha 3:");
        figurinha3.mostrarInformacoes();
    }
}