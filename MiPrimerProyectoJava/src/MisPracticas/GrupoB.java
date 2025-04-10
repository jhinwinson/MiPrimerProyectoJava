import java.util.Scanner;
public class GrupoB {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final int aprobacion = 3;

        System.out.print("Ingrese la cantidad de estudiantes :");
        int cantidad = leer.nextInt(); //columnas
        leer.nextLine(); 

        String nombres[]= new String[cantidad];
        int codigos[] = new int [cantidad];
        double notas[][] = new double[cantidad][3];     //3 es el numero de asignaturas          
        double[]promedios = new double[cantidad];

        for(byte i=0;i<cantidad;i++){
            System.out.print("Ingrese el nombre del estudiante :");
            nombres[i]= leer.nextLine();

            System.out.print("Ingrese el codigo del estudiante");
            codigos[i] = leer.nextInt();
            
            System.out.print("Ingrese la nota de Matemáticas: ");
            notas[i][0] = leer.nextDouble();

            System.out.print("Ingrese la nota de Química: ");
            notas[i][1] = leer.nextDouble();

            System.out.print("Ingrese la nota de Física: ");
            notas[i][2] = leer.nextDouble();

            promedios[i] = (notas[i][0] + notas[i][1] + notas[i][2])/3; //guarda el promedio en el primer recorrido
            }

            System.out.println("--- REPORTE FINAL DEL CURSO ---");

            for (int i = 0; i < cantidad; i++) {

                System.out.println("Estudiante: " + nombres[i] + " (con el codigo: " + codigos[i] + ")");

                System.out.printf("Tiene un promedio de ", promedios[i]);
                if (promedios[i] >= aprobacion ){
                    System.out.println("APROBADO");
                } else {
                    System.out.println("REPROBADO");
                }
      
            }
        }

    }

