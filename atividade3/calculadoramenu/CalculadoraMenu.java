package atividade3.calculadoramenu;

public class CalculadoraMenu {

    public String somar(int num1, int num2){
        return "Soma entre: " + num1 + " + " + num2 + " = " + (num1 + num2); 
    }

    public String subtrair(int num1, int num2){
        return "Subtração entre: " + num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplicar(int num1, int num2){
        return "Multiplicação entre: " + num1 + " X " + num2 + " = " + (num1 * num2);
    }

    public String dividir(int num1, int num2){
        if(num2 == 0) {
            throw new DivisaoPorZeroException("Não é possível realizar divisões por 0.");
        }
        return "Divisão entre: " + num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
