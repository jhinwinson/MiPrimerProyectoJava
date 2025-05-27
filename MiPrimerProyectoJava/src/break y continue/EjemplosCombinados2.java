public class EjemplosCombinados2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
    if (i % 3 == 0) {
        continue; // Salta la impresión de números divisibles por 3
    }
    System.out.println(i);
    }
    }
}