import java.util.Scanner; 
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar; 
import java.text.SimpleDateFormat; 
import java.text.ParseException; 
/**
 * @author lukas
 * @version 1.0
 * @created 01-Dec-2018 19:41:07
 */
public class Abfrage {

	public Abfrage(){
	}

	/**
	 * 
	 * @param frage
	 */
	public static int abfrageInt(String frage){
      try {
        int zahl = Integer.parseInt(abfrageString(frage)); 
        if (zahl < 0) {
        	throw new NumberFormatException(""); 
        }
        return zahl; 
      }
      catch ( NumberFormatException e) {
    	 System.out.println("Bitte eine gültige Zahl eingeben");
    	 return abfrageInt(frage);
      }
	}

	/**
	 * 
	 * @param frage
	 */
	public static String abfrageString(String frage){
		try{
			System.out.print(frage+ " ");
			Scanner eingabe = new Scanner(System.in);
			return eingabe.nextLine(); 
		} 
		catch ( Exception e) {
			return ""; 	
		}
	}
	
	/**
	 *
	 *
	 */
	public static Calendar abfrageUhrzeit(String frage) {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm"); 
		try {
			Date date = formatter.parse(abfrageString(frage + " (HH:mm):"));
			Calendar calendar = new GregorianCalendar(); 
			calendar.setTime(date);
			return calendar; 
		}
		catch(ParseException e) {
			System.out.println("Bitte eine gültige Uhrzeit eingeben!");
			return abfrageUhrzeit(frage);
		}
	}
	

}