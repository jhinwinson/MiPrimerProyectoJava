public class estudiar {
    public static void main(String[] args) {
         int mayor = numeroMayor(10, 20, 5);
         System.out.println("El número mayor es: " + mayor);
     }
    public static int numeroMayor (int a, int b, int c){
        return Math.max(a, Math.max(b, c));
 }
}
