package atividade1;
import java.util.Scanner;
public class VerificacaoLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome de usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();
        sc.close();

        if(usuario.equals("admin") && senha.equals("1234")){
            System.out.println("Login bem-sucedido.");
            System.out.println("Bem-vindo(a) "+usuario+"!");
        }else{
            System.out.println("Usuário ou senha incorretos.");
        }
    }
}
