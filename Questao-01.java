import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        
        // Lê o valor da temperatura digitado pelo usuário
        double celsius = scanner.nextDouble();

        // Calcula a temperatura em Fahrenheit usando a fórmula
        double fahrenheit = (celsius * 9/5) + 32;

        // Exibe o valor convertido para o usuário
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}