public abstract class ContaBancaria {
    public String cliente;
    public int  num_conta;
    public Double saldo = 0.0;

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public abstract Double sacar(Double valor);

    public abstract void depositar(Double valor);

    
}