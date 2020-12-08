package bureauPosteClass;

public class client {
	
	int dateArrive ;
	int dureeAttente;
	int dureeTraitement ;
	int dureeAttenteTot;
	int ordreArrive;
	boolean isPro; // 0 client normal, 1 client particulier
	String Service;
	
	client(boolean isPro, String Service)
	{
		dateArrive = 812020;		//Mettre la date du jour à chaque fois
		ordreArrive = ordreArrive+1;
		isPro = this.isPro;
		Service = this.Service;
		dureeAttente = tempsAttente();
		dureeTraitement = tempsTraitement();
		dureeAttenteTot = dureeAttente+dureeTraitement;
		
	}
	
	private int tempsAttente()
	{
		//faire un while qui se termine lorsqu'un guichet est libre ET le client acutel est le suivant
		// dans le while :
		/**
		Les guichet doivent etre tous occupé
		Pour savoir si il est libre on appele la méthode isGuichetLibre() dans la class java.
		Grace à ça on peut l'attribuer ou non au client suivant
		 **/
		// dans le while durée d'attente sera implémenté que le while se termine
		
		dureeAttente = 5000; // en attendant je le fixe a 5000 pour simuler
		return dureeAttente;
	}
	
	private int tempsTraitement()
	{
		//faire un while qui se termine lorsque c'est le tour du client 
		dureeTraitement = service.getService(Service);
		if (dureeTraitement == 0 )
		{
			System.out.println("Erreur de service demandé");
		}
		return dureeTraitement;
	}
	
	public int getTempsClient()
	{
		return dureeAttenteTot;
	}
	
	
	
}
