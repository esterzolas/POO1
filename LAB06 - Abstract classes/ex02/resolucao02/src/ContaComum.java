public class ContaComum extends ContaCorrente {
    
    public ContaComum(double val, int num, int pwd) {
        super(val, num, pwd);
    }

    public boolean debitaValor(double val, int pwd) {
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

    public void creditaValor(int pwd, double val) {
        if (isSenha(pwd)) {
            saldo += val;
        }
    }

    public double getSaldo(int pwd) {
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

    public void mostrarConta(int pwd) {
        System.out.println("Conta Comum");
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Estado: " + estado);
        System.out.println();
    }
}