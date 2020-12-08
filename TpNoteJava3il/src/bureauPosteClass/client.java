package bureauPosteClass;

public class client {
	
	int dateArrive ;
	int dureeAttente;
	int dureeTraitement ;
	int dureeAttenteTot;
	int ordreArrive;
	
	client()
	{
		dateArrive = 812020;		//Mettre la date du jour à chaque fois
		ordreArrive = ordreArrive+1;
		dureeAttente = tempsAttente();
		dureeTraitement = tempsTraitement();
		dureeAttenteTot = dureeAttente+dureeTraitement;
		
	}
	
	private int tempsAttente()
	{
		//faire un while qui se termine lorsqu'un guichet est libre ET le client acutel est le suivant
		// dans le while durée d'attente sera implémenté que le while se termine
		return dureeAttente;
	}
	
	private int tempsTraitement()
	{
		//faire un while qui se termine lorsque le traitement est terminé
		// dans le while durée traitement sera implémenté jusqu'à la fin du traitement 
		return dureeTraitement;
	}
	
	public int getTempsClient()
	{
		return dureeAttenteTot;
	}
	
}
