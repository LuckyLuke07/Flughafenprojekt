package flughafen.flugzeug;
/**
 * @author lukas
 * @version 1.0
 * @created 01-Dec-2018 19:41:11
 */
public class Flugzeug {

	private static int anzahlFlugzeuge;
	private String fluggesellschaft;
	private String flugnummer= "MI 101";
	private String flugzeugtyp;
	private String istzeitLandung;
	private String istzeitStart;
	private int landebahn;
	private String parkstelle;
	private String sollzeitLandung;
	private String sollzeitStart;
	private int startbahn;
	private String status = "wartend";

	public Flugzeug(){
	}

	/**
	 * 
	 * @param flugzeugtyp
	 * @param fluggesellschaft
	 * @param sollzeitLandung
	 */
	public Flugzeug(String flugzeugtyp, String fluggesellschaft, String sollzeitLandung){
       this.flugzeugtyp = flugzeugtyp; 
       this.fluggesellschaft = fluggesellschaft;
       this.sollzeitLandung = sollzeitLandung; 
       
       anzahlFlugzeuge++; 
	}
	
//	public void finalize() throws Throwable {
//	}

	public void meldeGelandet(String istzeitLandung){
        this.istzeitLandung = istzeitLandung; 
		status = "Geparkt"; 
	}

	public void meldeGestartet(String istzeitStart){
        this.istzeitStart = istzeitStart; 
		status = "Gestartet";
	}

	public void print(){
		System.out.println("\nFlugzeug " + flugnummer + " befindet sich im Status " + status +
				".\nEs ist vom Typ " + flugzeugtyp + " und gehört der Fluggesellschaft " + fluggesellschaft + ".\n");
	}

	public void vergebeLandebahn(int landebahn){
		this.landebahn = landebahn; 
		status = "Landeanflug";
	}

	public void vergebeParkstelle(String parkstelle){
        this.parkstelle = parkstelle;
		status = "Gelandet"; 
	}

	public void vergebeStartbahn(int startbahn, String sollzeitStart){
		this.startbahn = startbahn; 
		this.sollzeitStart = sollzeitStart; 
		status = "Startvorbereitung"; 
	}
	
	public static int getAnzahlFlugzeuge() {
		return anzahlFlugzeuge;
	}

	public static void setAnzahlFlugzeuge(int anzahlFlugzeuge) {
		Flugzeug.anzahlFlugzeuge = anzahlFlugzeuge;
	}

	public String getFluggesellschaft() {
		return fluggesellschaft;
	}

	public void setFluggesellschaft(String fluggesellschaft) {
		this.fluggesellschaft = fluggesellschaft;
	}

	public String getFlugnummer() {
		return flugnummer;
	}

	public void setFlugnummer(String flugnummer) {
		this.flugnummer = flugnummer;
	}

	public String getFlugzeugtyp() {
		return flugzeugtyp;
	}

	public void setFlugzeugtyp(String flugzeugtyp) {
		this.flugzeugtyp = flugzeugtyp;
	}

	public String getIstzeitLandung() {
		return istzeitLandung;
	}

	public void setIstzeitLandung(String istzeitLandung) {
		this.istzeitLandung = istzeitLandung;
	}

	public String getIstzeitStart() {
		return istzeitStart;
	}

	public void setIstzeitStart(String istzeitStart) {
		this.istzeitStart = istzeitStart;
	}

	public int getLandebahn() {
		return landebahn;
	}

	public void setLandebahn(int landebahn) {
		this.landebahn = landebahn;
	}

	public String getParkstelle() {
		return parkstelle;
	}

	public void setParkstelle(String parkstelle) {
		this.parkstelle = parkstelle;
	}

	public String getSollzeitLandung() {
		return sollzeitLandung;
	}

	public void setSollzeitLandung(String sollzeitLandung) {
		this.sollzeitLandung = sollzeitLandung;
	}

	public String getSollzeitStart() {
		return sollzeitStart;
	}

	public void setSollzeitStart(String sollzeitStart) {
		this.sollzeitStart = sollzeitStart;
	}
 
	public int getStartbahn() {
		return startbahn;
	}

	public void setStartbahn(int startbahn) {
		this.startbahn = startbahn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

} 