package cadastro;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carla","12345678900",3000.0,(1.0/100),50000);
        Vendedor vendedor = new Vendedor("Maria","98765432100",2000.0,(0.5/100),10000);
        Funcionario funcionario = new Funcionario("Juan","85274196300",1000.0,(0.25/100),20000);
        
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
        System.out.println("Salário do Funcionário: " + funcionario.calcularSalario());
    }
    
}
