public class Casilla {
    private boolean tieneBarco;
    private boolean estaAbierta;

    public Casilla(){
        this.tieneBarco = false;
        this.estaAbierta = false;
    }

    public boolean tieneBarco(){
        return false;
    }
    public boolean estaMarcada(){
        return false;
    }

    public void abrir(){
        this.estaAbierta = true;
    }

    public char símbolo(){
        if (estaAbierta){
            return ' ';
        }else if (tieneBarco){
            return 'X';
        }
        return '#';
    }
}
