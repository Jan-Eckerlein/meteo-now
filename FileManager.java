


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.util.*;

public class FileManager{

    
    
    public static ArrayList<Messpunkt> leseCSVDateiScanner(String adresseVonFile )throws FileNotFoundException, java.text.ParseException{
        Scanner scanner = new Scanner( new File(adresseVonFile) );
        ArrayList<Messpunkt> messpunkte = new ArrayList<Messpunkt>();
        String line;
        String [] messdaten;
        int temperatur;
        Date zeit=null;
        Messpunkt messpunkt;
        while ( scanner.hasNextLine() ){
            line =  scanner.nextLine();
            messdaten = line.split("\\,");
            temperatur= new Integer (messdaten[0]);
            
            messpunkt = new Messpunkt(temperatur);
            messpunkte.add(messpunkt);
            
        }
        return messpunkte;
        
    }

}

