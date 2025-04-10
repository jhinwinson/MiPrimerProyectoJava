import java.util.Scanner;
public class GrupoB {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final int aprobacion = 3;
        
        //comprobacion de que si se ingresen estudiantes
        int cantidad = 0;
        while (cantidad <= 0) {
            System.out.print("Ingrese la cantidad de estudiantes: ");
            cantidad = leer.nextInt();
            leer.nextLine(); // Limpiar el buffer
            if (cantidad <= 0) {
                System.out.println("------------------------------------------");
                System.out.println("    La cantidad debe ser mayor que (0)    ");
                System.out.println("           Intente nuevamente:            ");
                System.out.println("------------------------------------------");
            }
        }
        String nombres[]= new String[cantidad];
        int codigos[] = new int [cantidad];
        double notas[][] = new double[cantidad][3];     //3 es el numero de asignaturas          
        double[]promedios = new double[cantidad];

        for(byte i=0;i<cantidad;i++){

            System.out.print("Ingrese el nombre del estudiante: ");
            nombres[i] = leer.nextLine();
            while (nombres[i].length() < 3) { //.length imprime cuantos caracteres tiene una cadena
                System.out.println("-----------------------------------------------");
                System.out.println("    El nombre debe tener al menos 3 letras.    ");
                System.out.println("               Intente nuevamente              ");
                System.out.println("-----------------------------------------------");
                System.out.print  ("Ingrese el nombre del estudiante : ");
                nombres[i] = leer.nextLine();
            }

            System.out.print("Ingrese el codigo del estudiante : ");
            codigos[i] = leer.nextInt();
           while (codigos[i]<100000 || codigos[i]>999999) {
                System.out.println("-----------------------------------------------");
                System.out.println("        El codigo debe tener 6 digitos         ");
                System.out.println("               Intente nuevamente              ");
                System.out.println("-----------------------------------------------");
                System.out.print  ("Ingrese el codigo del estudiante: ");
                codigos[i] = leer.nextInt();
           }

            System.out.print("Ingrese la nota de Matemáticas: ");
            notas[i][0] = leer.nextDouble();

            System.out.print("Ingrese la nota de Química: ");
            notas[i][1] = leer.nextDouble();

            System.out.print("Ingrese la nota de Física: ");
            notas[i][2] = leer.nextDouble();

            promedios[i] = (notas[i][0] + notas[i][1] + notas[i][2])/3; //guarda el promedio en el primer recorrido

            leer.nextLine(); 
            }

            System.out.println("----- REPORTE FINAL DEL CURSO -----");

            for (int i = 0; i < cantidad; i++) {
                
                System.out.println("Estudiante: " + nombres[i] + " (con el codigo: " + codigos[i] + ")");

                System.out.println("Tiene un promedio de " + promedios[i]);

                if (promedios[i] >= aprobacion ){
                    System.out.println("APROBADO");
                } else {
                    System.out.println("REPROBADO");
                }
      
            }
        }

    }

