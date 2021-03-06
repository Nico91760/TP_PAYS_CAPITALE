
public class Capitale extends Ville{
	
	//Attributs priv�s
	
	private String nom;
	private int nbHabitants;
	private int superficie;

	//Constructeur
	
	public Capitale(String unNom, int unNbHabitants, int uneSuperficie){
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.superficie = uneSuperficie;
	}
	
	//Accesseurs
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	//M�thode toString
	
	public String toString(){
		String chaine = "Nom : "  + this.nom +
						"\nNombre d'habitants : " + this.nbHabitants +
						"\nSuperficie : " + this.superficie;
		return chaine;
	}
}
