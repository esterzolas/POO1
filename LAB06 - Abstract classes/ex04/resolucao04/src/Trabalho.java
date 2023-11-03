public class Trabalho extends Contato{
    
    private String tipo; // ex.: chefe, colega, etc.

    public Trabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void imprimirContato() {
        imprimirBasico();
        System.out.println("Tipo: " + tipo);
    }
}
