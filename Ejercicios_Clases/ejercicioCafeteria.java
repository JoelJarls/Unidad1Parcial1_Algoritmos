import java.util.Scanner;
public class ejercicioCafeteria {
    public static void main(String[] args) {
        double descuento = 0.10;
        String nombre;
        String cedula;
        int edad;
        double subtotal,subtotalDescuento,total,pago,cambio;
        Scanner sc = new Scanner(System.in);
        System.out.println("El valor del produto que desea comprar es de 5 dolares");
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su cedula");
        cedula = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Ingrese la cantidad de productos que desea comprar");
        int cantidadProductos = sc.nextInt();
        System.out.println("Ingrese la cantidad del pago");
        pago = sc.nextDouble();
        subtotal = cantidadProductos * 5;
        subtotalDescuento = subtotal * descuento;
        total = subtotal - subtotalDescuento;
        cambio = pago - total;
        if(pago < total){
            System.out.println("El pago es insuficiente, por favor ingrese un pago mayor o igual al total");
        }else{
            System.out.println("Hola " + nombre + ", su cedula es: " + cedula + " y su edad es: " + edad+ " A continuacion su factura");
            System.out.println("El subtotal es: " + subtotal);
            System.out.println("El descuento es: " + subtotalDescuento);
            System.out.println("El total es: " + total);
            System.out.println("El cambio es: " + cambio);
            sc.close();
        }
    }
}
