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
		return 0;
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