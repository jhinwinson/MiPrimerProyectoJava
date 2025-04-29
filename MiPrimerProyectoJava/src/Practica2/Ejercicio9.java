package PracticasArrays;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        double[] tempMin = new double[5];
        double[] tempMax = new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("Introduce la temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("Introduce la temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < 5; i++) {
            double tempMedia = (tempMin[i] + tempMax[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + tempMedia + "°C");
        }
        double menorTemp = tempMin[0];
        for (double temp : tempMin) {
            if (temp < menorTemp) {
                menorTemp = temp;
            }
        }
        System.out.println("\nDías con la menor temperatura mínima (" + menorTemp + "°C):");
        for (int i = 0; i < 5; i++) {
            if (tempMin[i] == menorTemp) {
                System.out.println("Día " + (i + 1));
            }
        }
        System.out.print("\nIntroduce una temperatura máxima para buscar: ");
        double tempBusqueda = scanner.nextDouble();
        boolean encontrado = false;
        System.out.println("Días con temperatura máxima de " + tempBusqueda + "°C:");
        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == tempBusqueda) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay ningún día con esa temperatura máxima.");
        }
        scanner.close();
    }
}