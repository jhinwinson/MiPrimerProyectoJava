public class ContadosParaEventoEspecifico {

    public static void main(String[] args) {
    int[] numeros = {1, 2, 3, 4, 5, 6};
    int contadorPares = 0;  // Inicializamos el contador de números pares

    for (int numero : numeros) {
        if (numero % 2 == 0) {
            contadorPares++;  // Incrementamos el contador cuando encontramos un número par
        }
    }

    System.out.println("Cantidad de números pares: " + contadorPares);
    }
}