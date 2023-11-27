import java.util.Scanner;

public class Calculadoras{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1, num2;
            char operator;

            System.out.println("Calculadora de enteros en Java");
            System.out.print("Ingresa el primer numero: ");
            num1 = scanner.nextInt();

            System.out.print("Ingresa un operador (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Ingresa el segundo numero: ");
            num2 = scanner.nextInt();

            int resultado;

            switch (operator) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: División por cero no permitida");
                        continue; // Volver al principio del bucle
                    }
                    break;
                default:
                    System.out.println("Operador no válido");
                    continue; // Volver al principio del bucle
            }

            System.out.println("Resultado:" + resultado);
        }
    }
}
