public class Tablero {
    private Casilla[][] tablero;
    private Barco[] barco;
    private final int numeroBarcos = 10;
    private final int filas = 10;
    private final int columnas = 10;

    public Tablero(){
        tablero = new Casilla[filas][columnas];

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                tablero[i][j] = new Casilla();
            }
        }
    }

    public void imprimirTablero(){
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.println("[" + tablero[i][j].Simbolo() + "]");
            }
            System.out.println();
        }
    }

    public void iniciarBarcos(){
        int cantidad = 0;

        for (int i = 0; i < 4; i++){
            Velero velero = new Velero();
            barco[cantidad++] = velero;
        }

        for (int i = 0; i < 3; i++){
            Submarino submarino = new Submarino();
            barco[cantidad++] = submarino;
        }

        for (int i = 0; i < 2; i++){
            Buque buque = new Buque();
            barco[cantidad++] = buque;
        }

        for (int i = 0; i < 1; i++){
            Navio navio = new Navio();
            barco[cantidad] = navio;
        }
    }
}
