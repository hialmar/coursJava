package cours.p10interfaces;

public class Chat extends Animal {
	
	public Chat() {
		cri = "Miaou";
	}
	
	public void changerCri(String cri) {
		this.cri = cri;
	}
	
	public void miauler() throws ExceptionChatMuet {
		if(cri == null)
			throw new ExceptionChatMuet();
		System.out.println(cri);
	}
	
	public void ronronner() {
		System.out.println("Rrrrrrrrr");
	}

	public void crier() {
		try {
			miauler();
		} catch (ExceptionChatMuet e) {
			System.out.println("Ce chat est muet :-(");
		}
	}

}
