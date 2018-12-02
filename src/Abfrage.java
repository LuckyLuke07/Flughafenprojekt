import java.util.Scanner; 

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

}