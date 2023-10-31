public abstract class ContaCorrente {
    private float saldo;
    private int numConta;
    private int senha;
    private int estado;

    public ContaCorrente(float val, int num, int pwd) {
        saldo = val;
        numConta = num;
        senha = pwd;
        estado = 1; // 1 = conta ativa
    }

    public abstract boolean debitaValor(float val, int pwd);
    public abstract void creditaValor(int pwd, float val);
    public abstract float getSaldo(int pwd);
    protected abstract int getEstado(int pwd);
    protected abstract void setEstado(int pwd, int estado);
    protected abstract boolean isSenha(int pwd);
}