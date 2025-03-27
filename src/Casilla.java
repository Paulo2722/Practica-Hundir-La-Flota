public class Casilla {
    private boolean tieneBarco;
    private boolean estaAbierta;
    private Barco barco;

    public Casilla(){
        this.tieneBarco = false;
        this.estaAbierta = false;
    }

    public boolean tieneBarco(){
        return tieneBarco;
    }

    public Barco getBarco(){
        return this.barco;
    }

    public boolean estaAbierta(){
        return estaAbierta;
    }

    public void abrir(){
        this.estaAbierta = true;
    }

    public char Simbolo(){
        if (estaAbierta){
            return '~';
        }
        if (tieneBarco){
            return ' ';
        }
        if (barco.estaGolpeado()){
            return 'X';
        }
        return '#';
    }
}
