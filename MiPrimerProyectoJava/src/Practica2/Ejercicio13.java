package PracticasArrays;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de conductores: ");
        int numConductores = scanner.nextInt();
        scanner.nextLine(); 
        String[] nombres = new String[numConductores];
        int[][] kms = new int[numConductores][7]; 
        int[] total_kms = new int[numConductores];
        for (int i = 0; i < numConductores; i++) {
            System.out.print("Introduce el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.println("Introduce los kilómetros realizados por " + nombres[i] + " cada día de la semana:");
            for (int j = 0; j < 7; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
                total_kms[i] += kms[i][j]; 
            }
            scanner.nextLine();
        }
        System.out.println("\nKilómetros realizados por cada conductor:");
        for (int i = 0; i < numConductores; i++) {
            System.out.println(nombres[i] + " ha realizado un total de " + total_kms[i] + " kilómetros.");
        }
        scanner.close();
    }
}