public class Casilla {
    private boolean tieneBarco;
    private boolean estaAbierta;
    private Barco barco;

    public Casilla(){
        this.tieneBarco = false;
        this.estaAbierta = false;
    }

    public void colocarBarco(Barco barco){
        this.barco = barco;
        this.tieneBarco = true;
    }

    public boolean tieneBarco(){
        return this.barco != null;
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
            if (tieneBarco && barco != null){
                if (barco.estaGolpeado()){
                    return 'X';
                }else{
                    return 'Q';
                }
            }
            return '~';
        }
        if (tieneBarco){
            return 'Q';
        }
        return '#';
    }
}
