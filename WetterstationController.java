
import java.util.*;
import java.io.*;
public class WetterstationController
{
   private Wetterstation wetterStation;
   
   public Wetterstation getWetterStation(){
       return wetterStation;
   }
   
    
    public WetterstationController()throws FileNotFoundException,  java.text.ParseException
    {
          System.out.println("Keine Datenbankverbindung verfügbar!");
        
          System.out.println("Das Programm wird mit Test-Werten befüllt!");
          wetterStation = new Wetterstation();
          importCSVFile("WetterdatenWetterStation.txt");   
          
    }
    //"Wetterdatenbeispiel.csv"
    public void importCSVFile(String adresseVonFile) throws FileNotFoundException,  java.text.ParseException{
        
          wetterStation.getMesspunkte().addAll(FileManager.leseCSVDateiScanner(adresseVonFile));
        
    }
    
    
    
}
