package cours.p10interfaces;

public class Oiseau extends Animal implements ObjetVolant {

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
