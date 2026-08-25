#include <iostream>
#include <string>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;

int main() {
	double descuento = 0.10;
    string nombre;
    string cedula;
    int edad;
    double subtotal, subtotalConDescuento, total, pago, cambio;
    cout << "El valor del produto que desea comprar es de 5 dolares" << endl;
    cout << "Ingrese su nombre" << endl;
    getline(cin, nombre);
    cout << "Ingrese su cedula" << endl;
    getline(cin, cedula);
    cout << "Ingrese su edad" << endl;
    cin >> edad;
    cout << "Ingrese la cantidad de productos que desea comprar" << endl;
    int cantidadProductos;
    cin >> cantidadProductos;
    cout << "Ingrese la cantidad del pago" << endl;
    cin >> pago;
    subtotal = cantidadProductos * 5;
    subtotalConDescuento = subtotal * descuento;
    total = subtotal - subtotalConDescuento;
    cambio = pago - total;
    if (pago < total) {
        cout << "El pago es insuficiente, por favor ingrese un pago mayor o igual al total" << endl;
    } else {
        cout << "Hola " << nombre << ", su cedula es: " << cedula << " y su edad es: " << edad << " A continuacion su factura" << endl;
        cout << "El subtotal es: " << subtotal << endl;
        cout << "El descuento es: " << subtotalConDescuento << endl;
        cout << "El total es: " << total << endl;
        cout << "El cambio es: " << cambio << endl;
    }
    return 0;
}