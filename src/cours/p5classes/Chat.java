package cours.p5classes;

// déclaration d'une classe
class Chat {
	// ceci est un attribut
	String cri;
	
	// ceci est un constructeur
	// c'est une sorte de fonction qui est utilisée pour initialiser les attributs
	// lors de la création de l'objet
	Chat() {
		// on peut utiliser directement les attributs de la classe
		cri = "Miaou";
	}

	// voilà une méthode, c'est une fonction associée aux objets de la classe
	void crier() {
		// ici aussi on peut utiliser directement les attributs de la classe
		System.out.println(cri);
	}
}
