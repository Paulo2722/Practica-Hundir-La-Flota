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

    public void ponerBarco(Barco barco){
        if(tieneBarco) {
            this.barco = barco;
        }
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
