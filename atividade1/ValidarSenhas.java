package atividade1;
import java.util.Scanner;
public class ValidarSenhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            int qnt_numero = 0;
            int qnt_maiuscula = 0;

            System.out.print("Digite uma senha forte: ");
            String senha = sc.nextLine();

            if(senha.length()<8){
                System.out.println("A senha deve ter no mínimo 8 caracteres.");
            }


            for(int i = 0; i < senha.length(); i ++){
                char letra_percorrida = senha.charAt(i);

                if (Character.isDigit(letra_percorrida)){
                    qnt_numero++;
                }
               if (Character.isUpperCase(letra_percorrida)){
                    qnt_maiuscula++;
               }
            }

            if(qnt_numero==0){
                System.out.println("A senha deve conter pelo menos 1 número.");
            }
            if (qnt_maiuscula==0){
                System.out.println("A senha deve conter pelo menos 1 letra maiúscula.");
            }

            if(senha.length()>= 8 && qnt_numero != 0 && qnt_maiuscula !=0){
                System.out.println("Senha cadastrada com sucesso!");
                break;
            }
        }
    }
}
