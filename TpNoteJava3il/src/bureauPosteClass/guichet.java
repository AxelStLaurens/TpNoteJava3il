package bureauPosteClass;

public class guichet {
	
	int[] identifiantGuiche;
	int[] horraireOuvertureGuichet;
	int[] horraireFermetureGuichet;
	int idDernierClientRecu = 0;
	int idClientSuivant;

	int[][] plageHorraireGuichet = {
			identifiantGuiche,  horraireOuvertureGuichet,  horraireFermetureGuichet};
	
	
	void setClientSuivant(int idDernierClientRecu) {
		
		idClientSuivant = idDernierClientRecu+1;
	}
	int getClientSuivant()
	{
		return idClientSuivant;
	}

}
