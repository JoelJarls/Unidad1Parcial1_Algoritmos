import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definición de variables
        double nota1, nota2, nota3, promedio;

        // Entrada de datos
        System.out.print("Ingrese nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.print("Ingrese nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.print("Ingrese nota 3: ");
        nota3 = scanner.nextDouble();

        // Cálculo del promedio
        promedio = (nota1 + nota2 + nota3) / 3;

        // Condicional de aprobación
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }

        scanner.close();
    }
}
