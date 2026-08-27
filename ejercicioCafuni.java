import java.util.Scanner;
public class ejercicioCafuni {
    public static void main(String[] args) {
        //definir variables 
        int opcion, cantidad;
        double precio = 0, total, subtotal, descuento, pago;
        String producto = "";
        System.out.println("Bienvenido a la Cafeteria Universitaria");
        System.out.println("Por favor escaja el producto que desea comprar y su cantidad");
        System.out.println("1. Cafe 2.00");
        System.out.println("2. Te 1.50");
        System.out.println("3. Agua 1.00");
        System.out.println("4. Refresco 2.50");
        System.out.println("5. Sandwich 4.00");
        Scanner sc = new Scanner(System.in);
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                producto = "Cafe";
                precio = 2.00;
                break;
            case 2:
                producto = "Te";
                precio = 1.50;
                break;
            case 3:
                producto = "Agua";
                precio = 1.00;
                break;
            case 4:
                producto = "Refresco";
                precio = 2.50;
                break;
            case 5:
                producto = "Sandwich";
                precio = 4.00;
                   break;
            default:
                System.out.println("Opción no válida");
                sc.close();
                break;
        }

        if (precio > 0) {
            System.out.println("Ha seleccionado " + producto);
            System.out.print("Ingrese la cantidad: ");
            cantidad = sc.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero");
            } else {
                subtotal = precio * cantidad;
                System.out.print("Ingrese el pago: $");
                pago = sc.nextDouble();

                if (pago > 10) {
                    descuento = subtotal * 0.10;
                } else {
                    descuento = 0;
                }

                total = subtotal - descuento;

                System.out.println("\n--- Factura ---");
                System.out.println("Producto: "+ producto);
                System.out.println("Precio unitario: "+ precio);
                System.out.println("Cantidad: "+ cantidad);
                System.out.println("Pago: "+ pago);
                System.out.println("Subtotal: "+ subtotal);
                System.out.println("Descuento: "+ descuento);
                System.out.println("Total: "+ total);
            }
        }
        sc.close();
    }
}