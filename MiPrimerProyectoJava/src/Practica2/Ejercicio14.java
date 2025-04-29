package PracticasArrays;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precios = new double[5];
        System.out.println("Introduce los precios de los 5 artículos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }
        int[][] cantidades = new int[5][4]; 
        System.out.println("\nIntroduce las cantidades vendidas por cada sucursal:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Artículo " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("  Sucursal " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nCantidades totales de cada artículo:");
        for (int i = 0; i < 5; i++) {
            int totalArticulo = 0;
            for (int j = 0; j < 4; j++) {
                totalArticulo += cantidades[i][j];
            }
            System.out.println("Artículo " + (i + 1) + ": " + totalArticulo);
        }
        System.out.println("\nCantidad de artículos en la sucursal 2:");
        int totalSucursal2 = 0;
        for (int i = 0; i < 5; i++) {
            totalSucursal2 += cantidades[i][1]; 
        }
        System.out.println("Total en sucursal 2: " + totalSucursal2);
        System.out.println("\nCantidad del artículo 3 en la sucursal 1:");
        System.out.println("Artículo 3 en sucursal 1: " + cantidades[2][0]); 
        System.out.println("\nRecaudación total de cada sucursal:");
        double[] recaudacionSucursal = new double[4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                recaudacionSucursal[j] += cantidades[i][j] * precios[i];
            }
            System.out.println("Sucursal " + (j + 1) + ": $" + recaudacionSucursal[j]);
        }
        double recaudacionTotal = 0;
        for (double recaudacion : recaudacionSucursal) {
            recaudacionTotal += recaudacion;
        }
        System.out.println("\nRecaudación total de la empresa: $" + recaudacionTotal);
        double mayorRecaudacion = recaudacionSucursal[0];
        int sucursalMayor = 1;
        for (int j = 1; j < 4; j++) {
            if (recaudacionSucursal[j] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursal[j];
                sucursalMayor = j + 1;
            }
        }
        System.out.println("\nSucursal de mayor recaudación: Sucursal " + sucursalMayor + " con $" + mayorRecaudacion);
        scanner.close();
    }
}