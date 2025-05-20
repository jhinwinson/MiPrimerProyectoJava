import java.util.Scanner; // Importa la clase Scanner para leer datos que el usuario escriba por teclado.


// Esta clase define un "Personaje" que será usado en el juego.
// Una clase es como un molde o plantilla para crear objetos que tengan ciertas características y acciones.
class Personaje {
    // Estos son los atributos del personaje, es decir, sus características o propiedades.
    String nombre;           // El nombre del personaje (por ejemplo: "Jhinwinson").
    int vidaMaxima = 100;    // La cantidad máxima de vida que puede tener un personaje (siempre 100).
    int vidaActual;          // La vida que tiene en el momento de la batalla.

    // Datos sobre sus ataques, tanto el normal como el especial.
    String nombreAtaqueNormal;  // Nombre del ataque normal (por ejemplo: "Rasengan").
    int danoAtaqueNormal;        // Cuánto daño hace ese ataque normal.
    String nombreAtaqueEspecial; // Nombre del ataque especial (más fuerte).
    int danoAtaqueEspecial;       // Cuánto daño hace el ataque especial.

    /*
    Este es el constructor de la clase.
    Un constructor es un método especial que se llama automáticamente cuando se crea un objeto nuevo.
    Sirve para darle valores iniciales a los atributos.
    Lo que está dentro de los paréntesis son los parámetros o datos que debemos darle para crear el objeto.
    El modificador 'public' indica que este constructor puede usarse desde cualquier lugar del programa.
    */
    public Personaje(String nombre, String nombreAtaqueNormal, int danoAtaqueNormal, String nombreAtaqueEspecial, int danoAtaqueEspecial) {
        // 'this' se usa para referirse a los atributos de ESTE objeto específico.
        // Esto es necesario porque los parámetros tienen el mismo nombre que los atributos.
        this.nombre = nombre;                        // Asigna el nombre que llega como parámetro al atributo 'nombre'.
        this.vidaActual = vidaMaxima;                // Inicializa la vida actual con el valor máximo (100).
        this.nombreAtaqueNormal = nombreAtaqueNormal; // Asigna el nombre del ataque normal.
        this.danoAtaqueNormal = danoAtaqueNormal;     // Asigna el daño del ataque normal.
        this.nombreAtaqueEspecial = nombreAtaqueEspecial; // Asigna el nombre del ataque especial.
        this.danoAtaqueEspecial = danoAtaqueEspecial;       // Asigna el daño del ataque especial.
    }

    /*
    Método para hacer un ataque normal a otro personaje (enemigo).
    'public' significa que este método puede ser llamado desde fuera de la clase.
    'void' significa que este método NO devuelve ningún valor (solo realiza una acción).
    */
    public void realizarAtaqueNormal(Personaje enemigo) {
        // Resta la cantidad de daño del ataque normal a la vida del enemigo.
        enemigo.vidaActual -= danoAtaqueNormal;

        // Muestra en pantalla lo que pasó durante el ataque.
        System.out.println(nombre + " uso " + nombreAtaqueNormal + " contra " + enemigo.nombre + " causando " + danoAtaqueNormal + " de dano.");
    }

    /*
    Método para hacer un ataque especial, similar al ataque normal pero con más daño.
    */
    public void realizarAtaqueEspecial(Personaje enemigo) {
        enemigo.vidaActual -= danoAtaqueEspecial;
        System.out.println(nombre + " uso " + nombreAtaqueEspecial + " contra " + enemigo.nombre + " causando " + danoAtaqueEspecial + " de dano.");
    }

    /*
    Método para curarse, recuperando un 20% de la vida máxima.
    */
    public void curarse() {
        int puntosCuracion = vidaMaxima * 20 / 100; // Calcula 20% de la vida máxima.
        vidaActual += puntosCuracion;                // Suma esos puntos a la vida actual.

        // Si la vida supera el máximo permitido, la ajusta a ese máximo.
        if (vidaActual > vidaMaxima) {
            vidaActual = vidaMaxima;
        }

        System.out.println(nombre + " se curo " + puntosCuracion + " puntos de vida.");
    }

    /*
    Método para mostrar la vida actual del personaje en pantalla.
    */
    public void mostrarVida() {
        System.out.println(nombre + " tiene " + vidaActual + " puntos de vida.");
    }

    /*
    Método que devuelve verdadero o falso dependiendo si el personaje sigue vivo.
    */
    public boolean estaVivo() {
        return vidaActual > 0; // Retorna true si la vida es mayor que 0, sino false.
    }
}


// Clase principal donde empieza el programa.
// Aquí se controla el flujo del juego y la interacción con el usuario.
public class JuegoBatallacomentado {
    /*
    El método main es el punto de entrada del programa.
    Siempre debe tener esta firma exacta: 
    'public static void main(String[] args)'
    - public: significa que es accesible desde cualquier lugar.
    - static: significa que no necesita crear un objeto para ejecutarlo.
    - void: no devuelve ningún valor.
    - String[] args: recibe un arreglo de cadenas (argumentos desde la consola), que en este caso no usaremos.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Creamos el objeto que leerá datos del usuario.

        // Creamos un arreglo (lista) con los personajes que el usuario podrá elegir.
        Personaje[] listaPersonajes = {
            new Personaje("Jhinwinson", "Rasengan", 33, "Rasengan Shuriken", 78),
            new Personaje("Maylon", "Magekyou Sharingan", 55, "Amaterasu", 75),
            new Personaje("Dario", "Ashura", 21, "Shinra Tensei", 73),
            new Personaje("Juan", "Onda Vital", 32, "Onda Vital x10", 61)
        };

        // Pedimos al usuario que elija el primer personaje.
        System.out.println("Selecciona el numero del primer personaje:");
        // Mostramos los personajes disponibles con un número.
        for (int i = 0; i < listaPersonajes.length; i++) {
            System.out.println((i + 1) + ". " + listaPersonajes[i].nombre);
        }
        // Leemos el número elegido y restamos 1 porque los arreglos empiezan en 0.
        int indiceJugadorUno = entrada.nextInt() - 1;

        // Pedimos que elija el segundo personaje.
        System.out.println("Selecciona el numero del segundo personaje:");
        int indiceJugadorDos;
        do {
            indiceJugadorDos = entrada.nextInt() - 1;
        } while (indiceJugadorDos == indiceJugadorUno); // Se asegura que el segundo personaje sea diferente del primero.

        // Guardamos los personajes elegidos en variables para usarlos en la batalla.
        Personaje jugadorUno = listaPersonajes[indiceJugadorUno];
        Personaje jugadorDos = listaPersonajes[indiceJugadorDos];

        boolean turnoJugadorUno = true; // Variable que indica de quién es el turno. Empieza el jugador uno.

        // Bucle que se ejecuta mientras ambos jugadores estén vivos.
        while (jugadorUno.estaVivo() && jugadorDos.estaVivo()) {
            // Según de quién sea el turno, seleccionamos al jugador actual y al enemigo.
            Personaje personajeActual = turnoJugadorUno ? jugadorUno : jugadorDos;
            Personaje enemigo = turnoJugadorUno ? jugadorDos : jugadorUno;

            // Mostramos las opciones de ataque o curación.
            System.out.println("\nTurno de " + personajeActual.nombre);
            System.out.println("1. Ataque normal: " + personajeActual.nombreAtaqueNormal + " (" + personajeActual.danoAtaqueNormal + " dano)");
            System.out.println("2. Ataque especial: " + personajeActual.nombreAtaqueEspecial + " (" + personajeActual.danoAtaqueEspecial + " dano)");
            System.out.println("3. Curarse (+20%)");

            int opcion = entrada.nextInt(); // Leemos la opción elegida.

            // Según la opción elegida, ejecutamos el método correspondiente.
            switch (opcion) {
                case 1 -> personajeActual.realizarAtaqueNormal(enemigo);
                case 2 -> personajeActual.realizarAtaqueEspecial(enemigo);
                case 3 -> personajeActual.curarse();
                default -> System.out.println("Opcion invalida."); // Si el usuario pone algo diferente.
            }

            // Mostramos la vida actual de ambos personajes después de la acción.
            personajeActual.mostrarVida();
            enemigo.mostrarVida();

            // Cambiamos el turno para que el otro jugador actúe.
            turnoJugadorUno = !turnoJugadorUno;
        }

        // Cuando uno de los jugadores muere (vida <= 0), mostramos quién ganó.
        if (jugadorUno.estaVivo()) {
            System.out.println("\n" + jugadorUno.nombre + " ha ganado la batalla.");
        } else {
            System.out.println("\n" + jugadorDos.nombre + " ha ganado la batalla.");
        }

        entrada.close(); // Cerramos el scanner para liberar recursos.
    }
}
