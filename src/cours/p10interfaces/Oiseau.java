package cours.p10interfaces;

import java.io.Serializable;

public class Oiseau extends Animal implements ObjetVolant, Serializable {

	public Oiseau() {
		cri = "Cuicui";
	}
	
	public void voler() {
		System.out.println("L'oiseau vole");
	}

	@Override
	public void crier() {
		System.out.println(cri);
	}
}
