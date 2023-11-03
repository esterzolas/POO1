public abstract class ContaCorrente {
    protected double saldo;
    protected int numConta;
    protected int senha;
    protected int estado;

    public ContaCorrente(double val, int num, int pwd) {
        this.saldo = val;
        this.numConta = num;
        this.senha = pwd;
        this.estado = 1; // 1 = conta ativa
    }

    public abstract boolean debitaValor(double val, int pwd);
    public abstract void creditaValor(int pwd, double val);
    public abstract double getSaldo(int pwd);
    protected abstract int getEstado(int pwd);
    protected abstract void setEstado(int pwd, int estado);
    protected abstract boolean isSenha(int pwd);
    public abstract void mostrarConta(int pwd);
}