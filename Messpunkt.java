import java.util.*;
public class Messpunkt
{
    private int idMesspunkt;
    private int temperatur;
    private double luftfeutchtigkeit;
    private GregorianCalendar datum;
    
    
    public Messpunkt( int temperatur, double luftfeuchtigkeit,GregorianCalendar datum ){
        setTemperatur(temperatur);
        setLuftfeuchtigkeit(luftfeuchtigkeit);
        setDatum(datum);
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
    
    public void setLuftfeuchtigkeit (double luftfeutchtigkeit){
        this.luftfeutchtigkeit= luftfeutchtigkeit;
    }
    
    public double getLuftfeuchtigkeit (){
        return luftfeutchtigkeit;
    }
    
    public void setDatum(GregorianCalendar datum){
        this.datum = datum;
    }
    
    public GregorianCalendar getDatum (){
        return datum;
    }
    
}
