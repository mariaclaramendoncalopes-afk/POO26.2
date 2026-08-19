package atividade1;
import java.util.Scanner;
public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o seu peso: ");
        float peso = sc.nextFloat();
        System.out.print("Informe sua altura: ");
        float altura = sc.nextFloat();
        sc.close();
        float IMC = peso / (altura*altura);

        if(IMC<18.5){
            System.out.print("Você está abaixo do peso.");
        }else if(18.5<=IMC && IMC < 25){
            System.out.print("Você está com o peso normal.");
        }else if(25<=IMC && IMC<30){
            System.out.println("Você está com sobrepeso.");
        }else{
            System.out.println("Você está com obesidade.");
        }
    }
}
