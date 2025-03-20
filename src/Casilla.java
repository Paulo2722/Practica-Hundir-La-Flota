public class Casilla {
    private boolean tieneBarco;
    private boolean estaAbierta;

    public Casilla(){
        this.tieneBarco = false;
        this.estaAbierta = false;
    }

    public boolean tieneBarco(){
        return tieneBarco;
    }

    public boolean estaAbierta(){
        return estaAbierta;
    }

    public void abrir(){
        this.estaAbierta = true;
    }

    public char Simbolo(){
        if (estaAbierta){
            return ' ';
        }
        if (tieneBarco){
            return 'X';
        }
        return '#';
    }
}
