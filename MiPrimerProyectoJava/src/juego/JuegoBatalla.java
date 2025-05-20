import java.util.Scanner;

class Personaje {
    String nombre;
    int vidaMaxima = 100;
    int vidaActual;

    String nombreAtaqueNormal;
    int danoAtaqueNormal;
    String nombreAtaqueEspecial;
    int danoAtaqueEspecial;

    public Personaje(String nombre, String nombreAtaqueNormal, int danoAtaqueNormal, String nombreAtaqueEspecial, int danoAtaqueEspecial) {
        this.nombre = nombre;
        this.vidaActual = vidaMaxima;
        this.nombreAtaqueNormal = nombreAtaqueNormal;
        this.danoAtaqueNormal = danoAtaqueNormal;
        this.nombreAtaqueEspecial = nombreAtaqueEspecial;
        this.danoAtaqueEspecial = danoAtaqueEspecial;
    }

    public void realizarAtaqueNormal(Personaje enemigo) {
        enemigo.vidaActual -= danoAtaqueNormal;
        System.out.println(nombre + " uso " + nombreAtaqueNormal + " contra " + enemigo.nombre + " causando " + danoAtaqueNormal + " de dano.");
    }

    public void realizarAtaqueEspecial(Personaje enemigo) {
        enemigo.vidaActual -= danoAtaqueEspecial;
        System.out.println(nombre + " uso " + nombreAtaqueEspecial + " contra " + enemigo.nombre + " causando " + danoAtaqueEspecial + " de dano.");
    }

    public void curarse() {
        int puntosCuracion = vidaMaxima * 20 / 100;
        vidaActual += puntosCuracion;
        if (vidaActual > vidaMaxima) {
            vidaActual = vidaMaxima;
        }
        System.out.println(nombre + " se curo " + puntosCuracion + " puntos de vida.");
    }

    public void mostrarVida() {
        System.out.println(nombre + " tiene " + vidaActual + " puntos de vida.");
    }

    public boolean estaVivo() {
        return vidaActual > 0;
    }
}

public class JuegoBatalla {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Personaje[] listaPersonajes = {
            new Personaje("Jhinwinson", "Rasengan", 33, "Rasengan Shuriken", 78),
            new Personaje("Maylon", "Magekyou Sharingan", 55, "Amaterasu", 75),
            new Personaje("Dario", "Ashura", 21, "Shinra Tensei", 73),
            new Personaje("Juan", "Onda Vital", 32, "Onda Vital x10", 61)
        };

        System.out.println("Selecciona el numero del primer personaje:");
        for (int i = 0; i < listaPersonajes.length; i++) {
            System.out.println((i + 1) + ". " + listaPersonajes[i].nombre);
        }
        int indiceJugadorUno = entrada.nextInt() - 1;

        System.out.println("Selecciona el numero del segundo personaje:");
        int indiceJugadorDos;
        do {
            indiceJugadorDos = entrada.nextInt() - 1;
        } while (indiceJugadorDos == indiceJugadorUno);

        Personaje jugadorUno = listaPersonajes[indiceJugadorUno];
        Personaje jugadorDos = listaPersonajes[indiceJugadorDos];

        boolean turnoJugadorUno = true;

        while (jugadorUno.estaVivo() && jugadorDos.estaVivo()) {
            Personaje personajeActual = turnoJugadorUno ? jugadorUno : jugadorDos;
            Personaje enemigo = turnoJugadorUno ? jugadorDos : jugadorUno;

            System.out.println("\nTurno de " + personajeActual.nombre);
            System.out.println("1. Ataque normal: " + personajeActual.nombreAtaqueNormal + " (" + personajeActual.danoAtaqueNormal + " de daño)");
            System.out.println("2. Ataque especial: " + personajeActual.nombreAtaqueEspecial + " (" + personajeActual.danoAtaqueEspecial + " de daño)");
            System.out.println("3. Curarse (+20%)");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> personajeActual.realizarAtaqueNormal(enemigo);
                case 2 -> personajeActual.realizarAtaqueEspecial(enemigo);
                case 3 -> personajeActual.curarse();
                default -> System.out.println("Opcion invalida.");
            }

            personajeActual.mostrarVida();
            enemigo.mostrarVida();

            turnoJugadorUno = !turnoJugadorUno;
        }

        if (jugadorUno.estaVivo()) {
            System.out.println("\n" + jugadorUno.nombre + " ha ganado la batalla.");
        } else {
            System.out.println("\n" + jugadorDos.nombre + " ha ganado la batalla.");
        }

        entrada.close();
    }
}
