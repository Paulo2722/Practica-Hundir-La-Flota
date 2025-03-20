public class Barco {
    private boolean estaGolpeado;
    private boolean estaHundido;
    private int golpesMaximos;

    public Barco(boolean estaGolpeado, boolean estaHunido, int golpesMaximos){
        this.estaGolpeado = false;
        this.estaHundido = false;
    }
}

class Velero extends Barco{
    private final int numeroVeleros = 4;

    public Velero(boolean estaGolpeado, boolean estaHunido, int golpesMaximos){
        super(false, false, 1);
    }
}

class Submarino extends Barco{
    private final int numeroSubmarinos = 3;

    public Submarino(boolean estaGolpeado, boolean estaHunido, int golpesMaximos){
        super(false, false, 2);
    }

}

class Buque extends Barco{
    private final int numeroBuques = 2;

    public Buque(boolean estaGolpeado, boolean estaHunido, int golpesMaximos){
        super(false, false, 3);
    }

}

class Navio extends Barco{
    public final int numeroNavios = 1;

    public Navio(boolean estaGolpeado, boolean estaHunido, int golpesMaximos){
        super(false, false, 4);
    }

}
/*10 barcos
-4 barco de 1 casilla
-3 barco de 2 casillas
-2 barco de 3 casillas
-1 barco de 4 caillas
 */

