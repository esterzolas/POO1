
public class Principal {
    public static void main(String[] args) {
        Figurinha f = new Figurinha("Neymar", "05/02/1992", 1.75, 68.5, "Atacante", "Brasil");
        FigurinhaExtra fe = new FigurinhaExtra("Neymar", "05/02/1992", 1.75, 68.5, "Atacante", "Brasil", "Craque", "Dourada");

        f.mostrarFigurinha();
        fe.mostrarFigurinha();
    }
}