package bureauPosteClass;

public class service {
	
	static final int tempsCourrierPost= 2000;
	static final int tempsColisPost= 5000;
	static final int tempsCourrierGet= 1000;
	static final int tempsColisGet= 2500;
	
	static int getService(String Service) {
		
		if (Service == "CourrierPoster")
		{
			return tempsCourrierPost;
		}
		else if (Service == "CourrierRecevoir") {
			return tempsCourrierGet;
		}
		else if (Service == "ColisPoster") {
			return tempsColisPost;
		}
		else if (Service == "ColisRecevoir") {
			return tempsColisGet;
		}
		
		return 0;
			
	}
	
	
	
}
