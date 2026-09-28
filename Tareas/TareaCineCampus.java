import java.util.Scanner;

public class cineCampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Leer: Formato, Edad, Dia, Condicion de estudiante y Cantidad ----
        System.out.print("Formato (1=2D, 2=3D, 3=IMAX): ");
        int formato = sc.nextInt();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Dia (1=Lunes ... 7=Domingo): ");
        int dia = sc.nextInt();

        System.out.print("Es estudiante (1=Si, 2=No): ");
        int estudiante = sc.nextInt();

        System.out.print("Cantidad de entradas: ");
        int cantidad = sc.nextInt();

        // ---- ¿Edad < 0 o Edad > 120? ----
        if (edad < 0 || edad > 120) {
            System.out.println("Error de rango de edad");
            sc.close();
            return;
        }

        // ---- Seleccionar formato ----
        double precio = 0;
        switch (formato) {
            case 1:
                precio = 5.00;
                break;
            case 2:
                precio = 7.50;
                break;
            case 3:
                precio = 10.00;
                break;
        }

        // ---- Calcular subtotal ----
        double subtotal = precio * cantidad;

        // ---- Descuentos por prioridad ----
        double porcentaje;
        if (edad >= 65) {
            porcentaje = 0.30;
        } else if (edad <= 11) {
            porcentaje = 0.20;
        } else if (estudiante == 1 && dia <= 5) {
            porcentaje = 0.15;
        } else if (dia == 3) {
            porcentaje = 0.10;
        } else {
            porcentaje = 0.0;
        }

        double descuento = subtotal * porcentaje;

        // ---- Recargo ----
        double recargo;
        if ((dia == 6 || dia == 7) && formato == 3) {
            recargo = subtotal * 0.10;
        } else {
            recargo = 0;
        }

        // ---- Cortesia ----
        String cortesia;
        if (cantidad >= 4 && (estudiante == 1 || edad <= 11)) {
            cortesia = "Combo Pequeno";
        } else {
            cortesia = "Ninguna";
        }

        // ---- Calcular total ----
        double total = subtotal - descuento + recargo;

        // ---- Mostrar resumen ----
        System.out.println("\n----- RESUMEN -----");
        System.out.println("Formato: " + formato);
        System.out.println("Dia: " + dia);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Recargo: " + recargo);
        System.out.println("Total: " + total);
        System.out.println("Cortesia: " + cortesia);

        sc.close();
    }
}
