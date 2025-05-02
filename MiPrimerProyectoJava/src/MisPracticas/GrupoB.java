import java.util.Scanner; // Importamos Scanner para poder leer datos que le ingresemos por teclado.
public class GrupoB { 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // le dimos el nombre de leer a la variable scaneer porque nos recuerda a pseint.
        final int aprobacion = 3; // Definimos la nota minima para aprobar como una constante.

        int cantidad = 0; // Creamos la variable que guardara cuantos estudiantes hay, y nos ayudara a entrar al while.
        while (cantidad <= 0) { // Mientras la cantidad sea cero o negativa, pedimos un numero valido.
            System.out.print("Ingrese la cantidad de estudiantes: ");
            cantidad = leer.nextInt(); // Leemos la cantidad ingresada.
            leer.nextLine(); // Limpiamos el buffer para evitar errores con nextLine() mas adelante.
            if (cantidad <= 0) { // Si aun es invalida, mostramos un mensaje de advertencia.
                System.out.println("------------------------------------------");
                System.out.println("    La cantidad debe ser mayor que (0)    ");
                System.out.println("           Intente nuevamente:            ");
                System.out.println("------------------------------------------");
            }
        }

        String nombres[]= new String[cantidad]; // Creamos un Array(arreglo) para guardar los nombres.
        int codigos[] = new int [cantidad]; // Creamos un arreglo para guardar los codigos.
        double notas[][] = new double[cantidad][3]; // Creamos una matriz para guardar las notas de las 3 matrias.
        double[]promedios = new double[cantidad]; // Arreglo para guardar los promedios.

        for(byte i=0;i<cantidad;i++){ // Recorremos  la ubicacion de cada dato para guardarlo.

            // con el siguiente bloque de codigo se estara validando que se obtengan al menos 3 digitos en el nombre.
            System.out.print("Ingrese el nombre del estudiante: ");
            nombres[i] = leer.nextLine(); // Leemos el nombre.
         
            while (nombres[i].length() < 3 || !nombres[i].matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) { 
                /* verifico que contenga mayusculas, minusculas y espacios.
                 usamos el ! ya que en el momento donde se ingrese un numero va a dar falso 
                 y debemos pasarlo a verdadero para entrar al while*/
                System.out.println("-------------------------------------------------");
                System.out.println(" El nombre debe tener al menos 3 letras y solo   ");
                System.out.println("  puede contener letras (sin números ni simbolos)");
                System.out.println("               Intente nuevamente                ");
                System.out.println("-------------------------------------------------");
                System.out.print("Ingrese el nombre del estudiante: ");// Volvemos a pedir el nombre
                nombres[i] = leer.nextLine(); //Guardamos i validados nuevamente el nombre.
            }


            // con el siguiente bloque de codigo se estara validando que el codigo del estudiante estrictamente sea de 6 caracteres
            System.out.print("Ingrese el codigo del estudiante, 6 digitos : ");
            codigos[i] = leer.nextInt(); // Leemos el codigo.
            while (codigos[i]<100000 || codigos[i]>999999) { // Validamos que tenga exactamente 6 digitos.
                System.out.println("-----------------------------------------------");
                System.out.println("        El codigo debe tener 6 digitos         ");
                System.out.println("               Intente nuevamente              ");
                System.out.println("-----------------------------------------------");
                System.out.print  ("Ingrese el codigo del estudiante: ");
                codigos[i] = leer.nextInt(); // Volvemos a pedir el codigo.
            }
            // Ahora validaremos que el codigo no este repetido.
            boolean codigoRepetido; // Con este boolean nos ayudara a finalizar proximamente el do while.
            do { 
                codigoRepetido = false; // Le damos el valor de falso ya que si la condicion no se cumple podemos salir de while.
                for (int j = 0; j < i; j++) { // En la primera iteracion lo que se encuentra dentro del while no se ejecuta ya que j<i no se cumple (aun).
                    if (codigos[j] == codigos[i]) { // Si ya existe el mismo codigo.
                        codigoRepetido = true; // Ya que si se cumple le damos el valor de true para que se repita nuevamente.
                        System.out.println("-------------------------------------------------");
                        System.out.println("   El codigo ya ha sido ingresado anteriormente  ");
                        System.out.println("              Intente con otro codigo            ");
                        System.out.println("-------------------------------------------------");
                        System.out.print("Ingrese el codigo del estudiante, 6 digitos: ");
                        codigos[i] = leer.nextInt(); // Pedimos un nuevo codigo.

                        // Volvemos a validar que tenga 6 digitos.
                        while (codigos[i] < 100000 || codigos[i] > 999999) {
                            System.out.println("------------------------------------------------");
                            System.out.println("        El codigo debe tener 6 digitos          ");
                            System.out.println("              Intente nuevamente                ");
                            System.out.println("------------------------------------------------");
                            System.out.print("Ingrese el codigo del estudiante: ");
                            codigos[i] = leer.nextInt();// volvemos a guardar el codigo.
                        }

                        break; // con este braak se avisamos que se encontro el codigo igual y se cambio por otro y salimos del for para volver a revisar nuevamente.
                    }
                }
            } while (codigoRepetido); //continuamos dentro del bucle mientras sea tru.

            // Pedimos y validamos la nota de Matematicas en que este en el rango de 0.0 a 5.0.
            System.out.print("Ingrese la nota de Matematicas: "); // le pedimos al usuario ingresar la nota.
            notas[i][0] = leer.nextDouble(); // Guardamos dentro de la matriz la nota de matematicas en la columna 0.
            while (notas[i][0] < 0.0 || notas[i][0] > 5.0) { // Validamos que la nota este en el rango de 0.0 a 5.0.
               System.out.println("------------------------------------------------");
               System.out.println("   La nota debe estar entre 0.0 y 5.0           ");
               System.out.println("              Intente nuevamente                ");
               System.out.println("------------------------------------------------");
               System.out.print("Ingrese la nota de Matematicas: "); // volvemos a pedir la nota.
               notas[i][0] = leer.nextDouble(); // guardamos y validamos nuevamente la nota.
           }

           // Pedimos y validamos la nota de Quimica
           System.out.print("Ingrese la nota de Quimica: ");
           notas[i][1] = leer.nextDouble();
           while (notas[i][1] < 0.0 || notas[i][1] > 5.0) {
               System.out.println("------------------------------------------------");
               System.out.println("   La nota debe estar entre 0.0 y 5.0           ");
               System.out.println("              Intente nuevamente                ");
               System.out.println("------------------------------------------------");
               System.out.print("Ingrese la nota de Quimica: ");
               notas[i][1] = leer.nextDouble();
           }

           // Pedimos y validamos la nota de Fisica
           System.out.print("Ingrese la nota de Fisica: ");
           notas[i][2] = leer.nextDouble();
           while (notas[i][2] < 0.0 || notas[i][2] > 5.0) {
               System.out.println("------------------------------------------------");
               System.out.println("   La nota debe estar entre 0.0 y 5.0           ");
               System.out.println("              Intente nuevamente                ");
               System.out.println("------------------------------------------------");
               System.out.print("Ingrese la nota de Fisica: ");
               notas[i][2] = leer.nextDouble();
           }

            // Calculamos el promedio de las 3 materias usando un array para guardar los promedios.
            promedios[i] = (notas[i][0] + notas[i][1] + notas[i][2])/3; //nos ubicamos en las 3 columnas para dividir las tres notas entre 3 y obtener el promedio.

            leer.nextLine(); // Limpiamos el buffer otra vez para consumir el enter y evitar errores en la siguiente iteracion.
        }

        System.out.println("--------- REPORTE FINAL DEL CURSO ---------"); // mostramos el reporte final.

        for (int i = 0; i < cantidad; i++) { // Lo usamos para obtener la ubicacion de cada datodentro de los arrays.
            System.out.println("El estudiante: " + nombres[i] + " con el codigo: " + codigos[i] ); // mostramos los datos del estudiante.
            System.out.println("Tiene un promedio de " + promedios[i]);// Mostramos el promedio.
            if (promedios[i] >= aprobacion ){ // Verificamos si paso o no validando si es mayor o igual a 3.0(la constante de aprobacion).
                System.out.println("Se encuentra (Aprobado)");
            } else {
                System.out.println("Se encuentra (Reprobado)");
            }
            System.out.println("--------------------------------------------");
        }

        leer.close(); // Cerramos el leer para no consumir mas recursos.
    }
}
