public class operadorModulo {
    public static void main(String[] args) {
        int numero1=10;
        
        int numero2=3;
        int resultado=numero1%numero2;
        System.out.println("El resultado del operador modulo es: "+resultado);
        if(resultado%2==0){
            System.out.println("El resultado es par");
        }
    }
}
