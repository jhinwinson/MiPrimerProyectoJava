package MisPracticas;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int[2][2]; //crear matriz dos por dos
        //rellenar matriz manualmente
        matriz [0][0] = 5;
        matriz [0][1] = 7;
        matriz [1][0] = 9;
        matriz [1][1] = 3;
        //rellenar matriz automaticamente
        int matriz2 [][] = new int[2][2];
        for (int f = 0;f<2;f++){
            for(int c = 0; c<2; c++){
                System.out.println("ingresa datos");
                int datos = leer.nextInt();
                
            }
        }
        
    }
}
