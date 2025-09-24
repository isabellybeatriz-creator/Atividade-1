import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o salário-base do funcionário
        System.out.print("Digite o salário-base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        // Solicita o percentual de aumento
        System.out.print("Digite o percentual de aumento a ser aplicado: ");
        double percentualAumento = scanner.nextDouble();

        // Calcula o valor do aumento
        double valorAumento = salarioBase * (percentualAumento / 100);

        // Calcula o salário final somando o salário-base com o aumento
        double salarioFinal = salarioBase + valorAumento;

        // Exibe o salário final com o reajuste
        System.out.println("O salário final com o reajuste é: " + salarioFinal);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
