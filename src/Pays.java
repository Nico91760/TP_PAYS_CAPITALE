
public class Pays {
	
	//Attributs privés
	
	private String nom;
	private String langue;
	private String monnaie;
	private String capitale;
	private static int compteurPays;
	private Capitale saCapitale;
	private Ville tabVille[];
	private int nbVille;
	
	//Constructeur
	
	public Pays(String unNom, String uneLangue, String uneMonnaie, String uneCapitale){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.capitale = uneCapitale;
		compteurPays=compteurPays+1;
		this.tabVille = new Ville[3];
		this.nbVille = 0;
		
		
	}
	
	//Accesseurs
	
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String unNom){
		this.nom=unNom;
	}
	
	public static int getCompteurPays(){
		return compteurPays;
	}
	
	
	//Méthode toString
	
	public String toString(){
		String chaine = "Nom : " + nomMajuscule() +
						"\nLangue : " + this.langue +
						"\nMonnaie : " + this.monnaie +
						"\nCapitale : " + this.capitale;
		return chaine;
	}
	
	//Méthode Majuscule
	
	public String nomMajuscule(){
		char maj = this.nom.toUpperCase().charAt(0);
		String reste = this.nom.substring(1);
		return (maj + reste);
	}
	
	//Méthode ajouter une ville
	
	public void ajoutVille(Ville uneVille){
		this.tabVille[this.nbVille] = uneVille;
		this.nbVille += 1;
	}
	
	//Méthode rechercher une ville
	
	public boolean rechercheVille(String nom){
		int i = 0;
		boolean trouver = false;
		while(i<nbVille && !nom.equals(this.tabVille[nbVille].getNom())){
			nbVille+=1;
		}
		if (nbVille<20) {
			trouver = true;
		}
		return trouver;
		
	}
}
