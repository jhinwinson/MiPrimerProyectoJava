import java.util.Scanner;
public class EjercicioPractico {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int residuo = numero1 % numero2;
        System.out.println("La suma es de : " + suma);
        System.out.println("La resta es de : " + resta);
        System.out.println("La multiplicación es de : " + multiplicacion);
        System.out.println("La división es de : " + division);
        System.out.println("el residuo de la divicion es de : " + residuo);
        leer.close();
    }
}