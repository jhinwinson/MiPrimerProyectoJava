public class EjemploPracticoLogicos {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        int numero3 = 20;
        System.out.println("a > b && b < c: " + (numero1 > numero2 && numero2 < numero3)); 
        System.out.println("a < b || b > c: " + (numero1 < numero2 || numero2 > numero3)); 
        System.out.println("!(a > b): " + !(numero1 > numero2)); 
}
