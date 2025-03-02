import java.util.Scanner;
public class EvaluacionPractica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primero numero");
        int primero = leer.nextInt();
        System.out.println("ingrese segundo numero");
        int segundo = leer.nextInt();
        System.out.println("tercer segundo numero");
        int tercero = leer.nextInt();
        System.out.println("ingrese segundo numero");
        double media = (primero+segundo+tercero)/3;
        System.out.println(media);
    }
}