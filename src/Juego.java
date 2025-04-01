import java.util.Scanner;

public class Juego {

    public void iniciarJuego(){

        Scanner sc = new Scanner(System.in);

        Tablero tablero = new Tablero();
        System.out.print("Introduce tu nombre: ");
        Jugador jugador = new Jugador(sc.next());
        sc.nextLine();

        tablero.iniciarBarcos();
        tablero.colocarBarcos();

        boolean partida = true;

        do{
            tablero.imprimirTablero();

            System.out.println(jugador.getNombre() + ", establece las coordenadas:");

            System.out.print("Fila (0-9): ");
            int fila = sc.nextInt();
            sc.nextLine();

            System.out.print("Columna (0-9): ");
            int columna = sc.nextInt();
            sc.nextLine();

            tablero.tocarBarco(fila, columna);

            if(tablero.victoria()){
                partida = false;
            }

        }while (partida);
    }
}
