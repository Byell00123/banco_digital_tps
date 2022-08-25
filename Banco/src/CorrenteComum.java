public class CorrenteComum extends ContaBancaria{

    @Override
    public Double sacar(Double valor){
        if (valor>saldo){
            System.out.printf("\nO valor do saque supera o seu saldo, digite um valor menor.\n");
            return null;
        }
        else{
            Double resultado = getSaldo()-((valor*0.05)+valor);
            setSaldo(resultado);
            System.out.printf("\nR$ "+valor+" Sacados e uma taxa de 5% sobre o valor do saque ocorreu.\nSaldo atual de: "+getSaldo()+"\n");
            return resultado;
        }
    }
    @Override
    public void depositar(Double valor){
        Double resultado = (getSaldo() + valor);
        setSaldo(resultado);
        System.out.printf("\nDeposito de R$ "+ valor+" feito.\nSaldo atual de: "+getSaldo()+"\n");

    }
    
}
