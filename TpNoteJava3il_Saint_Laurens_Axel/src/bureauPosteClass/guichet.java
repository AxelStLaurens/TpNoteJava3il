package bureauPosteClass;

public class guichet {
	
	int[] identifiantGuiche;
	int[] horraireOuvertureGuichet;
	int[] horraireFermetureGuichet;
	int idDernierClientRecu = 0;
	int idClientSuivant;
	int nbGuichetOuvert;
	int nbGuichetUtilise;

	int[][] plageHorraireGuichet = {
			identifiantGuiche,  horraireOuvertureGuichet,  horraireFermetureGuichet};
	
	
	void setClientSuivant(int idDernierClientRecu) {
		
		idClientSuivant = idDernierClientRecu+1;
	}
	int getClientSuivant()
	{
		return idClientSuivant;
	}
	
	int isGuichetLibre()
	{
		if (nbGuichetOuvert == nbGuichetUtilise )
		{return 0;} // Pas de guichet libre
		else
		{return 1;} // guichet libre 
	}
	
	
}
