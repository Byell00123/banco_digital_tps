import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner banana = new Scanner(System.in);
        Poupanca p = new Poupanca();
        CorrenteComum cc = new CorrenteComum();
        
        
        
        
        /* p.depositar(100.0);
        p.getSaldo();
        p.sacar(100.);
        p.getSaldo();
        cc.depositar(100.);
        cc.getSaldo();
        cc.sacar(50.);
        System.out.println("x");
        cc.getSaldo(); */
        
        System.out.printf("Quanto você tem em conta: ");


        while (true){
            int ac=0;
            System.out.printf("\nQual o tipo da sua conta:\n1-Poupança\n2-Corrente Comum\n3-Conta Especial\n:");

            System.out.printf("\nQue ação deseja tomar: \n1-Depositar.\n2-Sacar.\nSair-Qualquer outro numero.\n:");
            ac = banana.nextInt();
                
            
            
            
            
            
            
            
            switch(ac) {
                case 1:
                    System.out.printf("\nQuanto você deseja depositar: ");
                    p.setSaldo(banana.nextDouble());
                    break;
                case 2:
                    int tipo_conta=0;
                    System.out.printf("\nQual o tipo da sua conta:\n1-Poupança\n2-Corrente Comum\n3-Conta Especial\n:");
                    tipo_conta=banana.nextInt();
                    switch (tipo_conta) {
                        case 1:
                            System.out.printf("\nQuanto você deseja sacar: ");
                            p.sacar(banana.nextDouble());
                            break;
                        case 2:
                            System.out.printf("\nQuanto você deseja sacar: ");
                            cc.sacar(banana.nextDouble());
                                ///////
                        
                        default:
                            break;
                    }
                    break;
                default:
                    System.exit(0);
            }
            
        }
    
        
    }
}