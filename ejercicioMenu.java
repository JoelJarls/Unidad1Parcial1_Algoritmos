import java.util.Scanner;

public class ejercicioMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0.0;

        System.out.println("--- BANCO SIMPLE ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.print("Seleccione una opción (1-3): ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Su saldo actual es: $" + saldo);
        } else if (opcion == 2) {
            System.out.print("Ingrese la cantidad a depositar: $");
            double deposito = sc.nextDouble();
            saldo = saldo + deposito;
            System.out.println("Depósito realizado. Su nuevo saldo es: $" + saldo);
        } else if (opcion == 3) {
            System.out.print("Ingrese la cantidad a retirar: $");
            double retiro = sc.nextDouble();
            if (retiro <= saldo) {
                saldo = saldo - retiro;
                System.out.println("Retiro realizado. Su nuevo saldo es: $" + saldo);
            } else {
                System.out.println("No tiene suficiente dinero.");
            }
        } else {
            System.out.println("Opción incorrecta.");
        }

        sc.close();
    }
}
