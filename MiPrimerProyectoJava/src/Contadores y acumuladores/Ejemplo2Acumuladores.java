public class Ejemplo2Acumuladores {

    public static void main(String[] args) {
    int[] calificaciones = {70, 85, 55, 90, 40, 75};
    int contadorAprobados = 0;   // Contador de estudiantes aprobados
    int sumaCalificaciones = 0;  // Acumulador de calificaciones

    for (int calificacion : calificaciones) {
        sumaCalificaciones += calificacion;  // Acumulamos todas las calificaciones
        if (calificacion >= 60) {
            contadorAprobados++;  // Contamos los estudiantes aprobados
        }
    }

    double promedio = (double) sumaCalificaciones / calificaciones.length;

    System.out.println("Cantidad de estudiantes aprobados: " + contadorAprobados);
    System.out.println("Promedio de calificaciones: " + promedio);
    
    }
}