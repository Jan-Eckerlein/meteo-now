
public class Messpunkt
{
    private int idMesspunkt;
    private int temperatur;
    
    
    public Messpunkt( int temperatur){
        setTemperatur(temperatur);
    }
    public void setIdMesspunkt(int idMesspunkt ){
        this.idMesspunkt=idMesspunkt;
    }
    
    public int getIdMesspunkt(){
        return idMesspunkt;
    }
    
    public int getTemperatur(){
        return temperatur;
    }
    
    
    
    public void setTemperatur(int temperatur){
        this.temperatur= temperatur;
    }
    
    
    
    
}
