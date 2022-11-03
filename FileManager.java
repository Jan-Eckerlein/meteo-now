


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
        double luftfeuchtigKeit;
        GregorianCalendar datum;
        Date zeit=null;
        Messpunkt messpunkt;
        while ( scanner.hasNextLine() ){
            line =  scanner.nextLine();
            messdaten = line.split("\\;");
            temperatur= new Integer (messdaten[0]);
            luftfeuchtigKeit = new Double (messdaten[1]);
            String strDatum = new String (messdaten[2]);
            datum = Parser.parseStringToCalendarMinute(strDatum);
            messpunkt = new Messpunkt(temperatur,luftfeuchtigKeit,datum);
            messpunkte.add(messpunkt);
            
        }
        return messpunkte;
        
    }

}

