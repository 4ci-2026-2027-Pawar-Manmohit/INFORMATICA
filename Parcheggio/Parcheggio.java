public class Parcheggio{
    private int postiDisponibili;
    private double costoOrario;
    
    public class Parcheggio(){
        this.postiDisponibili = 0;
        this.costoOrario = 0.0;
    }
    public class Parcheggio(double unCostoOrario, int unNumeroDiPosti){
        this.costoOrario = this.unCostoOrario;
        this.postiDisponibili = this.unNumeroDiPosti;
    }
    //costoruttore di copia
    public Parcheggio(Parcheggio p){
        this.postiDisponibili = p.postiDisponibili;
        this.costoOrario = p.costoOrario;
    }
    public int getPostiDisponibili(){
        return this.postiDisponibili;
    }
    public double getCostoOrario(){
        return this.costoOrario;
    }
    public void setCosto(double unCostoOrario){
        this.costoOrario = this.costoOrario;
    }
    public boolean entra(Car unaAutomobile){
        if(this.postiDisponibili > 0){
            this.postiDisponibili--;
            return true; //l'auto entra
        }else{
            return false, //non entra, perchè non ci sono posti
        }
    }
    public boolean esce(Car unaAutomobile, double ore){
        double costo;
        costo = this.costoOrario*ore;
        this.postiDisponibili++;
        return costo;
    }
}
