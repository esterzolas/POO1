public abstract class Contato {

    protected String nome;
    protected String apelido;
    protected String email;
    protected String aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getEmail() {
        return email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void imprimirBasico() {
        System.out.println("Nome: " + nome + "\nApelido: " + apelido + "\nEmail: " + email + "\nAniversário: " + aniversario);
    }

    public abstract void imprimirContato();
}
