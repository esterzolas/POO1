public class ContaCorrente {
    private float saldo;
    private int numConta;
    private int senha;
    private int estado;

    public ContaCorrente (float val, int num, int pwd) {
        saldo = val;
        numConta = num;
        senha = pwd;
        estado = 1; // 1 = conta ativa
    }

    public boolean debitaValor (float val, int pwd) {
        if (pwd != senha) {
            return false; // senha incorreta
        }
        if (estado != 1) {
            return false; // conta deve estar ativa
        }
        if (val <= 0) {
            return false; // valor deve ser positivo
        }
        if (val > saldo) {
            return false; // saldo insuficiente
        }

        saldo -= val;
        if (saldo == 0) {
            estado = 2; // torna conta inativa
        }
        return true;
    }

    public void debitaValor (float val){
        saldo -= val;
    }

    public void creditaValor (int pwd, float val){
        if (senha == pwd){
            saldo += val;
        }
    }

    public float getSaldo (int pwd){
        if (senha == pwd){
            return saldo;
        }
        return 0;
    }

    protected int getEstado (int pwd){
        if (senha == pwd){
            return estado;
        }
        return -1;
    }

    protected void setEstado (int pwd, int estado){
        if (senha == pwd){
            this.estado = estado;
        }
    }

    protected boolean isSenha (int pwd){
        if (senha == pwd){
            return true;
        } else {
            return false;
        }
    }

}