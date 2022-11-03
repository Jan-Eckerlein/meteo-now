


import java.util.*;
import java.text.SimpleDateFormat;
public class Parser
{
    
    public static GregorianCalendar parseStringToCalendarMinute (String zeitStempelt) throws java.text.ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date zeitstempel = simpleDateFormat.parse(zeitStempelt);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(zeitstempel);
        return cal;
       
    }
    
}


