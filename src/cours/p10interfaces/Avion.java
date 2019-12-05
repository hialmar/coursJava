package cours.p10interfaces;

public class Avion implements ObjetVolant {

	@Override
	public void voler() {
		System.out.println("L'avion vole.");
	}
}
