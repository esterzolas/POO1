public class ContaEspecial extends ContaCorrente {
    private double limite;

    public ContaEspecial(double val, int num, int pwd, double limite) {
        super(val, num, pwd);
        this.limite = limite;
    }

    public boolean debitaValor(double val, int pwd) {
        if (isSenha(pwd)) {
            if (val <= 0) {
                return false; // valor deve ser positivo
            }

            // Verifica se a conta é ContaEspecial com limite igual a zero
            if (this instanceof ContaEspecial && ((ContaEspecial) this).getLimite() == 0) {
                // Modifica para uma ContaComum
                ContaComum contaComum = toContaComum();
                saldo = contaComum.saldo;
                numConta = contaComum.numConta;
                senha = contaComum.senha;
                estado = contaComum.estado;
            }

            if (saldo + ((this instanceof ContaEspecial) ? ((ContaEspecial) this).getLimite() : 0) < val) {
                return false; // saldo insuficiente, considerando o limite, se aplicável
            }

            saldo -= val;

            if (saldo == 0 && estado == 1
                    && !((this instanceof ContaEspecial) && ((ContaEspecial) this).getLimite() > 0)) {
                estado = 2; // torna conta inativa, exceto se for uma ContaEspecial com limite maior que 0
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

    public void setLimite(int pwd, double limite) {
        if (isSenha(pwd)) {
            this.limite = limite;
            if (this.limite == 0) {
                ContaComum conta = toContaComum();
                saldo = conta.saldo;
                numConta = conta.numConta;
                senha = conta.senha;
                estado = conta.estado;
            }
        }
    }

    public double getLimite() {
        return limite;
    }

    public ContaComum toContaComum() {
        return new ContaComum(saldo, numConta, senha);
    }

    public void mostrarConta(int pwd) {
        System.out.println("Conta Especial");
        System.out.println("Saldo: " + saldo);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Senha: " + senha);
        System.out.println("Estado: " + estado);
        System.out.println("Limite: " + limite);
        System.out.println();
    }

}