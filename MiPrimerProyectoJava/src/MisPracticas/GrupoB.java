import java.util.Scanner;
public class GrupoB {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes :");
        int c = leer.nextInt(); //columnas
        leer.nextLine();
        String nombres[]= new String[c];
        int almacen[][] = new int [4][c];
        int con = 1;
        for(byte i=0;i<c;i++){
            System.out.println("Ingrese el nombre del estudiante :");
            String n = leer.nextLine();
            nombres[i]=n;
            System.out.println("Ingrese el codigo del estudiante");
            int cod = leer.nextInt();
            almacen [0][i] = cod;
            System.out.println("Ingrese las notas de Matematicas");
            while (con == 3) {
                almacen[1][i] 
                con++;
            }

        }

    }
}
