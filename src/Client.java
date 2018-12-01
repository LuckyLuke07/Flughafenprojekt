
public class Client {
	


  public static void main(String[] args) {
    Flugzeug flugi = new Flugzeug(" ", " ", " "); 
	
	flugi.setFlugzeugtyp(Abfrage.abfrageString("Geben Sie den Flugzeug Typ ein: "));;
	flugi.setFluggesellschaft(Abfrage.abfrageString("Geben Sie die Fluggesellschaft ein: "  ) );
	flugi.setSollzeitLandung(Abfrage.abfrageString("Geben Sie die Sollzeit der Landung ein: "));
				
	}
}
