public class Barco {
    private boolean estaHundido;
    private final int golpesMaximos;
    private int golpesRecibidos;

    public Barco(int golpesMaximos){
        this.estaHundido = false;
        this.golpesMaximos = golpesMaximos;
        this.golpesRecibidos = 0;
    }

    public boolean estaGolpeado(){
        return true;
    }

    public boolean estaHundido(){
        return estaHundido;
    }

    public int golpesMaximos(){
        return golpesMaximos;
    }

    public void barcoImpactado(){
        golpesRecibidos++;

        if (golpesRecibidos >= golpesMaximos){
            estaHundido = true;
        }
    }
}

class Velero extends Barco{

    public Velero(){
        super(1);
    }
}

class Submarino extends Barco{

    public Submarino(){
        super(2);
    }
}

class Buque extends Barco{

    public Buque(){
        super(3);
    }
}

class Navio extends Barco{

    public Navio(){
        super(4);
    }
}