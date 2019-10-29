package cours.p8exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// un exemple un peu plus complet
public class Exception4 {
	private FileReader lectureFichier;
	
	public Exception4() {
		
	}
	
	// dans cette fonction on ne va pas faire de try/catch car on ne sait pas comment traiter le problème
	public void ouvrirFichier(String nomFichier) throws FileNotFoundException {
		lectureFichier = new FileReader(nomFichier);
	}
	
	// deuxième solution indiquer que la méthode peut générer une exception
	public static void main(String[] args) {
		String nomFichier;
		Scanner lecteurClavier = new Scanner(System.in);
		boolean fichierExiste = false;
		Exception4 exc = new Exception4();
		
		while(!fichierExiste) {
			System.out.println("Tapez un nom de fichier :");
			nomFichier = lecteurClavier.nextLine();
			try {
				// on essaie (d'ou le try anglais) d'ouvrir le fichier
				exc.ouvrirFichier(nomFichier);
				
				// s'il n'y a pas eu d'exception c'est que le fichier existe
				System.out.println("Le fichier "+nomFichier+" existe");
				fichierExiste = true;
			} catch(FileNotFoundException e) {
				// il y a eu une exception donc le fichier n'existe pas
				System.out.println("Le fichier "+nomFichier+" n'existe pas !");
			}
		}
		
	}
}
