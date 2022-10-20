
import java.util.ArrayList;
import java.io.*;
public class Wetterstation
{
    private  ArrayList messpunkte = new ArrayList<Messpunkt>();
    
    
    
    public void setMesspunkte(ArrayList<Messpunkt>messpunkte){
        this.messpunkte=messpunkte;
    }
     public ArrayList<Messpunkt> getMesspunkte(){
        return messpunkte;
    }
    
    public void addMesspunkt(Messpunkt messpunkt){
        messpunkte.add(messpunkt);
    }

    
}
