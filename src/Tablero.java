public class Tablero {
    private Casilla[][] tablero;
    private int filas = 10;
    private int columnas = 10;

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
}
