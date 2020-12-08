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
		dateArrive = 812020;		//Mettre la date du jour � chaque fois
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
		Les guichet doivent etre tous occup�
		Pour savoir si il est libre on appele la m�thode isGuichetLibre() dans la class java.
		Grace � �a on peut l'attribuer ou non au client suivant
		 **/
		// dans le while dur�e d'attente sera impl�ment� que le while se termine
		
		dureeAttente = 5000; // en attendant je le fixe a 5000 pour simuler
		return dureeAttente;
	}
	
	private int tempsTraitement()
	{
		//faire un while qui se termine lorsque c'est le tour du client 
		dureeTraitement = service.getService(Service);
		if (dureeTraitement == 0 )
		{
			System.out.println("Erreur de service demand�");
		}
		return dureeTraitement;
	}
	
	public int getTempsClient()
	{
		return dureeAttenteTot;
	}
	
	
	
}
