package cours.p12enums;

public enum JourSemaine {
	LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SAMEDI, DIMANCHE;
	
	public void afficheJour() {
		System.out.println("Le jour est : "+this);
	}
	
	public boolean estSuiviDe(JourSemaine autreJour) {
		if(this != DIMANCHE) {
			return this.ordinal()+1 == autreJour.ordinal();
		} else {
			return autreJour == LUNDI;
		}
	}
}
