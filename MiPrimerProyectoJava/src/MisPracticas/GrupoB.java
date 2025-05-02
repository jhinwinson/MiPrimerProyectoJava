import java.util.Scanner; // Importamos Scanner para poder leer datos que le ingresemos por teclado 
public class GrupoB { 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // le dimos el nombre de leer a la variable scaneer 
        final int aprobacion = 3; // Definimos la nota mínima para aprobar

        int cantidad = 0; // Variable que guarda cuántos estudiantes hay
        while (cantidad <= 0) { // Mientras la cantidad sea cero o negativa, pedimos un número válido
            System.out.print("Ingrese la cantidad de estudiantes: ");
            cantidad = leer.nextInt(); // Leemos la cantidad ingresada
            leer.nextLine(); // Limpiamos el buffer para evitar errores con nextLine()
            if (cantidad <= 0) { // Si aún es inválida, mostramos un mensaje de advertencia
                System.out.println("------------------------------------------");
                System.out.println("    La cantidad debe ser mayor que (0)    ");
                System.out.println("           Intente nuevamente:            ");
                System.out.println("------------------------------------------");
            }
        }

        String nombres[]= new String[cantidad]; // Creamos un arreglo para guardar los nombres
        int codigos[] = new int [cantidad]; // Creamos un arreglo para guardar los códigos
        double notas[][] = new double[cantidad][3]; // Creamos una matriz para guardar 3 notas por estudiante
        double[]promedios = new double[cantidad]; // Arreglo para guardar los promedios


        
        for(byte i=0;i<cantidad;i++){ // Recorremos cada estudiante

            /*con este bloque de codigo se estara verificandoq ue el nombre que se ingrese tenga como minimo 3 letras
             * ayudandonso del.length para verificar la cantidad de letras que tiene el nombre*/

            System.out.print("Ingrese el nombre del estudiante: ");
            nombres[i] = leer.nextLine(); // Leemos el nombre
            while (nombres[i].length() < 3) { // Validamos que tenga al menos 3 letras
                System.out.println("-----------------------------------------------");
                System.out.println("    El nombre debe tener al menos 3 letras.    ");
                System.out.println("               Intente nuevamente              ");
                System.out.println("-----------------------------------------------");
                System.out.print  ("Ingrese el nombre del estudiante : ");
                nombres[i] = leer.nextLine(); // Volvemos a pedir el nombre
            }
            /*con este bloque de codigo se estara validando que el codigo del estudiante estrictamente sea de 6 caracteres  */

            System.out.print("Ingrese el codigo del estudiante, 6 digitos : ");
            codigos[i] = leer.nextInt(); // Leemos el código
            while (codigos[i]<100000 || codigos[i]>999999) { // Validamos que tenga exactamente 6 dígitos
                System.out.println("-----------------------------------------------");
                System.out.println("        El codigo debe tener 6 digitos         ");
                System.out.println("               Intente nuevamente              ");
                System.out.println("-----------------------------------------------");
                System.out.print  ("Ingrese el codigo del estudiante: ");
                codigos[i] = leer.nextInt(); // Volvemos a pedir el código
            }
            // Validamos que el código no esté repetido
            boolean codigoRepetido;
            do { 
                codigoRepetido = false;
                for (int j = 0; j < i; j++) {
                    if (codigos[j] == codigos[i]) { // Si ya existe el mismo código
                        codigoRepetido = true;
                        System.out.println("------------------------------------------------");
                        System.out.println("   El código ya ha sido ingresado anteriormente  ");
                        System.out.println("              Intente con otro código            ");
                        System.out.println("------------------------------------------------");
                        System.out.print("Ingrese el código del estudiante, 6 dígitos: ");
                        codigos[i] = leer.nextInt(); // Pedimos uno nuevo

                        // Volvemos a validar que tenga 6 dígitos
                        while (codigos[i] < 100000 || codigos[i] > 999999) {
                            System.out.println("------------------------------------------------");
                            System.out.println("        El código debe tener 6 dígitos           ");
                            System.out.println("              Intente nuevamente                ");
                            System.out.println("------------------------------------------------");
                            System.out.print("Ingrese el código del estudiante: ");
                            codigos[i] = leer.nextInt();
                        }

                        break; // Salimos del for para volver a revisar unicidad
                    }
                }
            } while (codigoRepetido); // Seguimos mientras esté repetido

            // Pedimos y validamos la nota de Matemáticas enste en el rango de 0.0 a 5.0
            System.out.print("Ingrese la nota de Matemáticas: ");
            notas[i][0] = leer.nextDouble();
            while (notas[i][0] < 0.0 || notas[i][0] > 5.0) {
               System.out.println("------------------------------------------------");
               System.out.println("   La nota debe estar entre 0.0 y 5.0           ");
               System.out.println("              Intente nuevamente                ");
               System.out.println("------------------------------------------------");
               System.out.print("Ingrese la nota de Matemáticas: ");
               notas[i][0] = leer.nextDouble();
           }

           // Pedimos y validamos la nota de Química
           System.out.print("Ingrese la nota de Química: ");
           notas[i][1] = leer.nextDouble();
           while (notas[i][1] < 0.0 || notas[i][1] > 5.0) {
               System.out.println("------------------------------------------------");
               System.out.println("   La nota debe estar entre 0.0 y 5.0           ");
               System.out.println("              Intente nuevamente                ");
               System.out.println("------------------------------------------------");
               System.out.print("Ingrese la nota de Química: ");
               notas[i][1] = leer.nextDouble();
           }

           // Pedimos y validamos la nota de Física
           System.out.print("Ingrese la nota de Física: ");
           notas[i][2] = leer.nextDouble();
           while (notas[i][2] < 0.0 || notas[i][2] > 5.0) {
               System.out.println("------------------------------------------------");
               System.out.println("   La nota debe estar entre 0.0 y 5.0           ");
               System.out.println("              Intente nuevamente                ");
               System.out.println("------------------------------------------------");
               System.out.print("Ingrese la nota de Física: ");
               notas[i][2] = leer.nextDouble();
           }

            // Calculamos el promedio de las 3 materias
            promedios[i] = (notas[i][0] + notas[i][1] + notas[i][2])/3;

            leer.nextLine(); // Limpiamos el buffer otra vez
        }

        System.out.println("--------- REPORTE FINAL DEL CURSO ---------");

        for (int i = 0; i < cantidad; i++) { // Recorremos para mostrar los datos
            System.out.println("El estudiante: " + nombres[i] + " con el codigo: " + codigos[i] );
            System.out.println("Tiene un promedio de " + promedios[i]);
            if (promedios[i] >= aprobacion ){ // Verificamos si pasó o no
                System.out.println("Se encuentra (Aprobado)");
            } else {
                System.out.println("Se encuentra (Reprobado)");
            }
            System.out.println("--------------------------------------------");
        }

        leer.close(); // Cerramos el lector para liberar recursos
    }
}
