package cours.p13io;

import java.io.Serializable;
import java.util.Date;

// il faut implémenter sérializable pour pouvoir lire et écrire les objets sur les flux
class MaClasse implements Serializable {
	private int entier;
	private String chaine;
	private Date date;
	
	public MaClasse(int entier, String chaine) {
		super();
		this.entier = entier;
		this.chaine = chaine;
		this.date = new Date();
	}

	@Override
	public String toString() {
		return "MaClasse [entier=" + entier + ", chaine=" + chaine + ", date=" + date + "]";
	}
	
	
	
}

public class ESObjets {
	public static void main(String[] args) {
		MaClasse var = new MaClasse(1000, "Hello World!");
		System.out.println(var);
	}
}
