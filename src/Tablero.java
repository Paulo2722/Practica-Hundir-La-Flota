import java.util.Random;

public class Tablero {
    private Casilla[][] tablero;
    private Barco[] barco;
    private final int filas = 10;
    private final int columnas = 10;
    private int barcosHundidos = 0;
    Random random = new Random();

    public Tablero() {
        tablero = new Casilla[filas][columnas];
        barco = new Barco[10];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = new Casilla();
            }
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("[" + tablero[i][j].Simbolo() + "]");
            }
            System.out.println();
        }
    }

    public void iniciarBarcos() {
        int cantidad = 0;

        for (int i = 0; i < 4; i++) {
            Velero velero = new Velero();
            barco[cantidad++] = velero;
        }

        for (int i = 0; i < 3; i++) {
            Submarino submarino = new Submarino();
            barco[cantidad++] = submarino;
        }

        for (int i = 0; i < 2; i++) {
            Buque buque = new Buque();
            barco[cantidad++] = buque;
        }

        for (int i = 0; i < 1; i++) {
            Navio navio = new Navio();
            barco[cantidad++] = navio;
        }
    }

    public boolean esHorizontal() {

        int orientacion = random.nextInt(2);

        return orientacion == 0;
    }

    public void colocarBarcos() {

        int filaAleatoria;
        int columnaAleatoria;

        for (int i = 0; i < barco.length; i++){

            boolean horizontal = esHorizontal();

            filaAleatoria = random.nextInt();

            if (horizontal){
                columnaAleatoria = random.nextInt(columnas - barco[i].golpesMaximos());
            }else{
                columnaAleatoria = random.nextInt();
            }
            hayEspacioParaBarco(filaAleatoria, columnaAleatoria, barco[i], horizontal);
        }
    }

    public void hayEspacioParaBarco(int filaAleatoria, int columnaAleatoria, Barco barco, boolean horizontal) {
        for (int n = 0; n < barco.golpesMaximos(); n++) {
            int fila2;
            int columna2;

            if (horizontal) {
                fila2 = filaAleatoria;
                columna2 = columnaAleatoria + n;
            } else {
                fila2 = filaAleatoria + n;
                columna2 = columnaAleatoria;
            }

            if (tablero[fila2][columna2].tieneBarco())
                return;
        }
    }

    public boolean tocarBarco(int fila, int columna){

        if (fila < 0 || columna < 0 || fila >= filas | columna >= columnas){
            System.out.println("Posición no válida, introduce nuevos valores");
            return false;
        }

        Casilla casilla = tablero[fila][columna];
        if (casilla.estaAbierta()){
            System.out.println("Posición no válida, introduce nuevos valores");
            return false;
        }else{
            casilla.abrir();
        }
        if (casilla.tieneBarco()){
            Barco barco = casilla.getBarco();
            barco.barcoImpactado();

            if (barco.estaHundido()){
                System.out.println("Has hundido un barco");
                barcosHundidos++;
            }else{
                System.out.println("Golpe");
            }
            return true;

        }else{
            System.out.println("Agua");
            return false;
        }
    }

    public int getBarcosHundidos() {
        return barcosHundidos;
    }

    public void setBarcosHundidos(int barcosHundidos) {
        this.barcosHundidos = barcosHundidos;
    }
}

