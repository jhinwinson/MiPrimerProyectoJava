import java.util.Scanner;
public class EjercicioPractico {
 public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese su altura en metros: ");
        double altura = leer.nextDouble();
        System.out.println("Hola mi nombre es " + nombre + ", tengo  " + edad + " años y mido " + altura );
 }   
}