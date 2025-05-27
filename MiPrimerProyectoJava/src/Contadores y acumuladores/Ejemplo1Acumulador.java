public class Ejemplo1Acumulador {

    public static void main(String[] args) {
    int[] numeros = {-3, 5, -1, 9, -7, 4};
    int contadorPositivos = 0;  // Contador de números positivos
    int sumaNegativos = 0;      // Acumulador de números negativos

    for (int numero : numeros) {
        if (numero > 0) {
            contadorPositivos++;  // Contamos los números positivos
        } else {
            sumaNegativos += numero;  // Acumulamos los números negativos
        }
    }

    System.out.println("Cantidad de números positivos: " + contadorPositivos);
    System.out.println("Suma de números negativos: " + sumaNegativos);
    }
}
