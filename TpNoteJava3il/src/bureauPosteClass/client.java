package bureauPosteClass;

public class client {
	
	int dateArrive ;
	int dureeAttente;
	int dureeTraitement ;
	int dureeAttenteTot;
	int ordreArrive;
	
	client()
	{
		dateArrive = 812020;		//Mettre la date du jour � chaque fois
		ordreArrive = ordreArrive+1;
		dureeAttente = tempsAttente();
		dureeTraitement = tempsTraitement();
		dureeAttenteTot = dureeAttente+dureeTraitement;
		
	}
	
	private int tempsAttente()
	{
		//faire un while qui se termine lorsqu'un guichet est libre ET le client acutel est le suivant
		// dans le while dur�e d'attente sera impl�ment� que le while se termine
		return dureeAttente;
	}
	
	private int tempsTraitement()
	{
		//faire un while qui se termine lorsque le traitement est termin�
		// dans le while dur�e traitement sera impl�ment� jusqu'� la fin du traitement 
		return dureeTraitement;
	}
	
	public int getTempsClient()
	{
		return dureeAttenteTot;
	}
	
}
