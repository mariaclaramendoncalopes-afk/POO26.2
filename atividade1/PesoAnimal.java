package atividade1;
import java.util.Scanner;

public class PesoAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade_registrada = 0;
        float menor_peso = 0;
        float maior_peso = 0;

        while(true){  System.out.print("""
        1- Cadastrar Peso
        2- Finalizar        
                """);
        System.out.print("Digite a opção que deseja: ");
        int opcao = sc.nextInt();

        if (opcao==1){
            System.out.print("Informe o peso do animal: ");
            float peso = sc.nextFloat();
            quantidade_registrada +=1;
            if (peso>maior_peso){
                maior_peso = peso;
                if(quantidade_registrada==1){
                    menor_peso = peso;
                }
            }
            if (peso<menor_peso){
                menor_peso = peso;
            }    
        } else if (opcao==2){
            System.out.println("Quantidade de animais registrados: " + quantidade_registrada);
            System.out.println("Maior peso registrado: " + maior_peso);
            System.out.println("Menor peso registrado: " + menor_peso);
            break;
        } else{
            System.out.println("Opção inválida");
        }
        }
    }
}
