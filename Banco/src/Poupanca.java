public class Poupanca extends ContaBancaria{

    @Override
    public Double sacar(Double valor){
        if (getSaldo()<valor){
            System.out.printf("\nO valor do saque supera o seu saldo, digite um valor menor.\n");
            return null;
        }
        else{
            Double resultado = (getSaldo() - valor);
            setSaldo(resultado);
            System.out.printf("\nSaque de R$ "+ valor+" feito.\nSaldo atual de: "+getSaldo()+"\n");
            return resultado;
        }  
    }
    @Override
    public void depositar(Double valor){
        setSaldo(getSaldo()+valor);
        System.out.printf("\nDeposito de R$ "+ valor+" feito.\nSaldo atual de: "+getSaldo()+"\n");

    }
    public void extrato(){
        System.out.println("Saudo Atual: "+getSaldo());
    }
}
