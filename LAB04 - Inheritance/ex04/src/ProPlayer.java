public class ProPlayer extends Jogador {

    public String org;
    private String contrato;
    protected double vitorias;

    public ProPlayer(){
        nome = null;
        cpf = null;
        setIdade(0);
        jogo = null;
        setPlataforma(null);
        qtdHoras = -1;
        this.org = null;
        this.contrato = null;
        this.vitorias = -1;
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public ProPlayer(Jogador j, String org, int vitorias, String contrato) {
        super(j.nome, j.getIdade(), j.cpf, j.jogo, j.getPlataforma(), j.qtdHoras);
        this.org = org;
        this.vitorias = vitorias;
        this.contrato = contrato;
        System.out.println("Classe C3: chamada do construtor padrao, com parametros");
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public double getVitorias() {
        return vitorias;
    }

    public void setVitorias(double vitorias) {
        this.vitorias = vitorias;
    }

    public void mostrarAtributos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + cpf);
        System.out.println("Jogo: " + jogo);
        System.out.println("Plataforma: " + getPlataforma());
        System.out.println("Quantidade de horas jogadas: " + qtdHoras);
        System.out.println("Organização: " + org);
        System.out.println("Contrato: " + getContrato());
        System.out.println("Vitorias: " + vitorias);
    }

    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
        System.out.println("Organização: " + org);
        System.out.println("Contrato: " + getContrato());
        System.out.println("Vitorias: " + vitorias);
    }

}
