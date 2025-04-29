package PracticasArrays;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] equipos = new String[15][2]; 
        int[][] resultados = new int[15][2];   
        System.out.println("Introduce los nombres de los equipos para los 15 partidos:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + ":");
            System.out.print("  Equipo 1: ");
            equipos[i][0] = scanner.nextLine();
            System.out.print("  Equipo 2: ");
            equipos[i][1] = scanner.nextLine();
        }
        System.out.println("\nIntroduce los resultados de los partidos:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + " (" + equipos[i][0] + " vs " + equipos[i][1] + "):");
            System.out.print("  Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("  Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = scanner.nextInt();
        }
        System.out.println("\nResultados de la quiniela:");
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + ": " + equipos[i][0] + " " + resultados[i][0] + " - " + resultados[i][1] + " " + equipos[i][1]);
        }
        scanner.close();
    }
}