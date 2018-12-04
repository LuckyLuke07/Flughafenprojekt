package flughafen.parkstelle;

import flughafen.flugzeug.Flugzeug;

public abstract class Parkstelle {
	
	public abstract void belegen(Flugzeug flugzeug);
	public abstract void freigeben (Flugzeug flugzeug);

}
