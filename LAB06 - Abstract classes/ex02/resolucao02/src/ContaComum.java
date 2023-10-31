public class ContaComum extends ContaCorrente {
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
    }

    public boolean debitaValor(float val, int pwd) {
        if (isSenha(pwd)) {
            if (val <= 0) {
                return false; // valor deve ser positivo
            }
            if (saldo < val) {
                return false; // saldo insuficiente
            }

            saldo -= val;
            if (saldo == 0) {
                setEstado(pwd, 2); // torna conta inativa
            }
            return true;
        }
        return false; // senha incorreta
    }

    public void creditaValor(int pwd, float val) {
        if (isSenha(pwd)) {
            saldo += val;
        }
    }

    public float getSaldo(int pwd) {
        if (isSenha(pwd)) {
            return saldo;
        }
        return 0;
    }

    protected int getEstado(int pwd) {
        if (isSenha(pwd)) {
            return estado;
        }
        return -1;
    }

    protected void setEstado(int pwd, int estado) {
        if (isSenha(pwd)) {
            this.estado = estado;
        }
    }

    protected boolean isSenha(int pwd) {
        return senha == pwd;
    }
}