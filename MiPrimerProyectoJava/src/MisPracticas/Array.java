
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[]Array1 = new int[3]; //crear cantidad de espacios del array
        int[]Array2 = {3,6}; 
        System.out.println(" hola "+Array2[1]);// mostrar array
    
        for (int i = 0; i<=2; i++ ){ //guardar datos dentro del array automaticamente
            System.out.println("ingresa un dato");
            int dato =leer.nextInt();
            Array1[i] = dato;
        }
        leer.close();
    }
}