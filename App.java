
public class App {
//	In deze opdracht programmeer je een Binaire boom.
//	Dit moet je doen door zelf de link-structuur te 
//	implementeren. In de boom worden studenten opgeslagen.
//	De knopen in de boom hebben als key het studentnummer 
//	van de studenten.
	
	
	/**
	 * De main wordt gebruikt om de tree te testen.
	 * @param args
	 */
	public static void main(String[] args) {
		Tree<Integer> test = new Tree<Integer>();
		
		test.insert(4);
		test.insert(2);
		test.insert(6);
		test.insert(1);
		test.insert(3);
		test.insert(5);
		test.insert(7);
		test.insert(8);
		
		test.remove(8);
		test.remove(2);
		
		System.out.println("Find: "+test.find(6)+"\n\n");
		
		test.print();
		
		
//		Programmeer een paar cases waarbij 
//		je laat zien dat de boom werkt
		
//		voeg studenten met studentnummers Ó0802063Ó tot en met Ó0824836Ó toe
		
//		Verwijder de root
		//Node<String> ding = new Node<String>();
//		print de studenten op volgorde van studentnummer
	}

}
