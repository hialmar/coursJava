package cours.p8exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception3 {
	
	public static void main(String[] args) {
		
		// la plupart des exceptions doivent être gérées par le développeur d'une classe
		// si on essaye de déclarer l'ouverture d'un fichier comme ceci :
		// FileReader lectureFichier = new FileReader("truc");
		// le compilateur nous indiquera l'erreur suivante
		// error: unreported exception FileNotFoundException; must be caught or declared to be thrown
		
		// première solution : attraper l'exception :
		try {
			FileReader lectureFichier = new FileReader("truc");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
