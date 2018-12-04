import flughafen.flugzeug.Flugzeug;
import hilfsklassen.Abfrage;

public class Client {
	
  public static void main(String[] args) {
    Flugzeug flugi = new Flugzeug(" ", " ", " "); 
	
	flugi.setFlugzeugtyp(Abfrage.abfrageString("Geben Sie den Flugzeug Typ ein: "));;
	flugi.setFluggesellschaft(Abfrage.abfrageString("Geben Sie die Fluggesellschaft ein: "  ) );
	flugi.setSollzeitLandung(Abfrage.abfrageString("Geben Sie die Sollzeit der Landung ein: "));
		
	flugi.print();
	
	flugi.vergebeLandebahn( Abfrage.abfrageInt("Geben Sie die Landebahnnummer ein: " , 0 , 10) );
	
	flugi.print();
	
	Abfrage.abfrageString("Soll das Flugzeug in die Werft verlegt werden? (j/n) "); 
	Abfrage.abfrageString("Soll das Flugzeug auf ein separates Parkfeld verlegt werden? (j/n) \n"); 
	
	flugi.setParkstelle(  Abfrage.abfrageString("Geben Sie die Parkposition ein: ") );
	
	flugi.print();
	
	flugi.setIstzeitLandung( Abfrage.abfrageString("Geben Sie die Istzeit der Landung ein: ") ); 
	
	flugi.print();
	
	flugi.setStartbahn(Abfrage.abfrageInt("Geben Sie die Startbahn ein: ", 0 , 10));
	flugi.setSollzeitStart(Abfrage.abfrageString("Geben Sie die Sollzeit für den Start ein: ")); 
	
	flugi.print();
	
	flugi.setIstzeitStart(Abfrage.abfrageString("Geben Sie die Istzeit des Starts ein: ")) ; 
	
	flugi.print();
	
	
	}
}
