import java.util.Scanner;
public class ejercicioNumero {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        if (numero >100) {
              if (numero <100) {
            System.out.println("El número es positivo y menor que 100.");
              
            }
        }
        sc.close(); 
    }
}
