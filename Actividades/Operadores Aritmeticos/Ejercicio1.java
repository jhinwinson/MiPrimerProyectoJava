import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String []args) {
        Scanner leer = new Scanner (System.in); /*in es para datos de entrada , out para datos de salida  */
        /*delclara variables */
         float camisa = 25; /*short no maneja decimales */
         float pantalon = 30; 
         float descuento = 0.15f;
         System.out.println(" ingrese la cantidad de camisas y pantalones: "); /*Print salta de linea  */
         int cantidadCamisas = leer.nextInt(); /*lo que esta depues del punto de leer es para elegir el tipo de dato que se va a leer  */
         int cantidadPantalones= leer.nextInt();
         camisa-=(camisa*=descuento);
         pantalon -=(pantalon *= descuento);
         if (cantidadCamisas==2){ /*un solo igual asigna dos iguales compran */
            camisa*=2;
            camisa-=(camisa*=0.05);
             System.out.println("se aplico un descuento del 5 % a los dos pantalones, precio total de : "+ camisa );
            } 
            else{
            camisa*=cantidadCamisas;
            System.out.println("el precio de las "+cantidadCamisas+" camisas es de "+camisa);
            }
         leer.close(); /*se usa para dejar de leer (fuga de recursos) */
         pantalon*=cantidadPantalones;
         System.out.println("El precio por los "+ cantidadPantalones+" pantalones es de "+pantalon);

        }   
}


