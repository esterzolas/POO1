import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) throws Exception {
        Contato[] contatos = new Contato[6];
        contatos[0] = new Amigos("Alex", "Alek", "", "29/04/2003", 0);
        contatos[1] = new Amigos("Fabio", "Fabinho", "", "15/01/2003", 1);
        contatos[2] = new Familia("Synara", "Syna", "", "10/03/2003", "irma");
        contatos[3] = new Familia("Gabriel", "Fey", "", "01/01/2000", "primo");
        contatos[4] = new Trabalho("Akira", "Chato", "", "01/01/2000", "chefe");
        contatos[5] = new Trabalho("Felipe", "Split", "", "01/01/2000", "colega");

        for (Contato contato : contatos) {
            contato.imprimirContato();
            System.out.println();
        }

        System.out.println("FAMILIA");
        for (Contato contato : contatos) {
            if (contato instanceof Familia) {
                contato.imprimirContato();
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("AMIGOS");
        for (Contato contato : contatos) {
            if (contato instanceof Amigos) {
                contato.imprimirContato();
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("TRABALHO");
        for (Contato contato : contatos) {
            if (contato instanceof Trabalho) {
                contato.imprimirContato();
                System.out.println();

            }
        }
        System.out.println();

        System.out.println("MELHORES AMIGOS");
        for (Contato contato : contatos) {
            if (contato instanceof Amigos) {
                Amigos amigo = (Amigos) contato;
                if (amigo.getGrauAmizade() == 1) {
                    amigo.imprimirContato();
                    System.out.println();
                }
            }
        }
        System.out.println();

        System.out.println("IRMAOS");
        for (Contato contato : contatos) {
            if (contato instanceof Familia) {
                Familia familia = (Familia) contato;
                if (familia.getParentesco().equals("irma") || familia.getParentesco().equals("irmao")) {
                    familia.imprimirContato();
                    System.out.println();
                }
            }
        }
        System.out.println();

        System.out.println("COLEGAS");
        for (Contato contato : contatos) {
            if (contato instanceof Trabalho) {
                Trabalho trabalho = (Trabalho) contato;
                if (trabalho.getTipo().equals("colega")) {
                    trabalho.imprimirContato();
                    System.out.println();
                }
            }
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Contato Escolhido Por Índice:");
        System.out.println("Entre com o índice do contato: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < contatos.length) {
            Contato contato = contatos[indice];
            String tipoContato = "";

            if (contato instanceof Amigos) {
                tipoContato = "Amigos";
            } else if (contato instanceof Familia) {
                tipoContato = "Família";
            } else if (contato instanceof Trabalho) {
                tipoContato = "Trabalho";
            }

            System.out.println("Tipo de contato: " + tipoContato);
            contato.imprimirContato();
        } else {
            System.out.println("Índice inválido. Por favor, escolha um índice dentro do intervalo de contatos.");
        }

        scanner.close();
    }
}
