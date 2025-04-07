import java.util.Scanner;
public class GrupoB {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes :");
        int cantidad = leer.nextInt(); //columnas
        leer.nextLine();
        String nombres[]= new String[cantidad];
        int codigo[] = new int [cantidad];
        int notas[][] = new int[3][4];               // quiero que con cada nuevo estudiante la matriz de notas cresca en 4 filas

        for(byte i=0;i<cantidad;i++){
            System.out.println("Ingrese el nombre del estudiante :");
            String n = leer.nextLine();
            nombres[i]=n;
            System.out.println("Ingrese el codigo del estudiante");
            int cod = leer.nextInt();
            codigo[i] = cod;

            for(byte f = 0; f < 3; f++){ // se esta rellenando cada columna primero
                for(byte c = 0; c < 4; c++){
                    switch (c) {
                        case 1:
                        while (condition) {
                            System.out.println("Ingrese las notas de Matematicas");
                            int nota = leer.nextInt();
                            notas[f][c] = nota;
                        }
                            break;
                        case 2:
                        System.out.println("Ingrese las notas de quimica");
                        nota = leer.nextInt();
                        notas[f][c] = nota;
                    }
                

            }


        }

    }
}
