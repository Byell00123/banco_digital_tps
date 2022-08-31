import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

            Scanner banana = new Scanner(System.in);
            Poupanca p = new Poupanca();
            CorrenteComum cc = new CorrenteComum();
            ClienteEspecial ce = new ClienteEspecial();

            System.out.printf("Saldo atual R$ 0,0");

        while (true){
            int tipo_conta;
            System.out.printf("\nQual o tipo da sua conta:\n1-Poupança\n2-Corrente Comum\n3-Cliente especial.\n4-Sair\n:");
            tipo_conta=banana.nextInt();
            int ac;
            switch (tipo_conta) {
                case 1:
                    System.out.printf("\nQue ação deseja tomar: \n1-Depositar.\n2-Sacar.\n3-Extrato.\nTocar de Conta-Qualquer outro numero.\n:");
                    ac = banana.nextInt();
                    switch (ac) {
                        case 1:
                            System.out.printf("\nQuanto você deseja depositar: ");
                            p.depositar(banana.nextDouble());
                            break;
                        case 2:
                            System.out.printf("\nQuanto você deseja sacar: ");
                            p.sacar(banana.nextDouble());
                            break;
                        case 3:
                            p.extrato();
                            break;
                        default:
                            break;
                    }
                    break;
/*-------------------------------------------------------------------------------------------------------------------*/
                case 2:
                    System.out.printf("\nQue ação deseja tomar: \n1-Depositar.\n2-Sacar.\n3-Extrato.\nTocar de Conta-Qualquer outro numero.\n:");
                    ac = banana.nextInt();
                    switch (ac) {
                        case 1:
                            System.out.printf("\nQuanto você deseja depositar: ");
                            cc.depositar(banana.nextDouble());
                            break;
                        case 2:
                            System.out.printf("\nQuanto você deseja sacar: ");
                            cc.sacar(banana.nextDouble());
                            break;
                        case 3:
                            cc.extrato();
                            break;
                        default:
                            break;
                    }
                    break;
/*-------------------------------------------------------------------------------------------------------------------*/
                case 3:
                    System.out.printf("\nQue ação deseja tomar: \n1-Depositar.\n2-Sacar.\n3-Extrato.\nTocar de Conta-Qualquer outro numero.\n:");
                    ac = banana.nextInt();
                    switch (ac) {
                        case 1:
                            System.out.printf("\nQuanto você deseja depositar: ");
                            ce.depositar(banana.nextDouble());
                            break;
                        case 2:
                            System.out.printf("\nQuanto você deseja sacar: ");
                            ce.sacar(banana.nextDouble());
                            break;
                        case 3:
                            ce.extrato();
                            break;
                        default:
                            break;
                }
                    break;
/*-------------------------------------------------------------------------------------------------------------------*/
                case 4:
                    System.exit(0);
                    break;
/*-------------------------------------------------------------------------------------------------------------------*/
                default:
                    break;
                        

                }

        }
                
    }
}
