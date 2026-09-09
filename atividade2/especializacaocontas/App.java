package especializacaocontas;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome completo: ");
        cliente.setNome(sc.nextLine());
        System.out.print("Digite o seu CPF: ");
        cliente.setCpf(sc.nextLine());
        System.out.print("Digite o seu E-mail: ");
        cliente.setEmail(sc.nextLine());
        System.out.print("Digite o seu número de telefone: ");
        cliente.setTelefone(sc.nextLine());

        System.out.print("Digite o seu saldo inicial: ");
        double saldo = sc.nextDouble(); /*pega o valor do saldo para dps jogar na variável */
        sc.nextLine();
        System.out.print("""
            Escolha o tipo da conta:
                1 - Conta Corrente
                2 - Conta Poupanca
                :
                """);
        int opc = sc.nextInt();
        sc.nextLine();

        if(opc==1){/*Não precisa usar a ContaBancaria pois os tipos de conta herdam seus atributos */
            ContaCorrente cc = new ContaCorrente();
            cc.setConta("Corrente");
            cc.setSaldo(saldo);

            cc.setChequeEspecial(1000.0);

            System.out.print("Digite o número da agência: ");
            cc.setAgencia(sc.nextLine());
            System.out.println("");

            while (true){
                System.out.println("""
                ===== OPERAÇÕES =====
                1 - Sacar
                2 - Depositar
                3 - Ver dados da conta
                4 - Sair

                Escolha uma opção:
                """);

                int opcao = sc.nextInt();
                if (opcao==1){
                    System.out.println("Quanto deseja sacar? ");
                    Double saque = sc.nextDouble();
                    cc.sacar(saque);
                }
                else if(opcao==2){
                    System.out.println("Quanto deseja depositar? ");
                    Double deposito = sc.nextDouble();
                    cc.depositar(deposito);
                }
                else if(opcao==3){
                    System.out.println(cc);
                }
                else{
                    break;
                }
            }

        }else if(opc==2){
            ContaPoupanca cp = new ContaPoupanca();
            cp.setConta("Poupança");
            cp.setSaldo(saldo);

            System.out.print("Digite o número da agência");
            cp.setAgencia(sc.nextLine());       

            System.out.print("Informe a taxa de rendimento: ");
            cp.setTaxaRendimento(sc.nextDouble());
            System.out.println("");

            while (true){
            System.out.println("""
            ===== OPERAÇÕES =====
            1 - Sacar
            2 - Depositar
            3 - Ver dados da conta
            4 - Sair

            Escolha uma opção:
            """);
            int opcao = sc.nextInt();

            if (opcao==1){
                System.out.println("Quanto deseja sacar? ");
                Double saque = sc.nextDouble();
                cp.sacar(saque);
            }
            else if(opcao==2){
                System.out.println("Quanto deseja depositar? ");
                Double deposito = sc.nextDouble();
                cp.depositar(deposito);
            }
            else if(opcao==3){
                System.out.println(cp);
            }
            else{
                break;
            }
            }

        }else{
            System.out.println("Tipo de conta incorreta.");
        }
    }
}
