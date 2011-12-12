public class Tree<T extends Comparable<T>> {
	private Node<T> root;
	//---------------------------
	// Constructors
	public Tree(){
		
	}
	
	
	//--------------------------
	//Data structure operations	
	/**
	 * Voeg een element toe aan de tree
	 */
	public boolean insert(T o){
		if(root != null){
			return root.add(new Node<T>(o));
		} else {
			root = new Node<T>(o);
			return true;
		}
	}
	
	/**
	 * Verwijder een object uit de boom
	 */
	public boolean remove(T o){
		if(root == null){
			return false;
		}
		if(root.data.equals(o)){
			Node<T> tmp = new Node<T>(null);
			tmp.left = root;
			boolean ret = root.remove(o,tmp);
			root = tmp.left;
			return ret;
		} else {
			return root.remove(o, null);
		}
	}
	
	
	/**
	 * Zoek een studentnummer in de boom en return 
	 * het oject
	 */
	public T find(T t){
		return root.find(t);
	}
	
	public boolean isBalanced(){
		return false;//dummy
	}
	
	public void balance(){
		
	}
	
	
	//------------------------------------------------------
	// Utility methods
	/**
	 * Print de tree In-Order
	 */
	public String toString(){
		return "Call print()";
	}
	
	public void print(){
		int depth = 0;
		boolean notDone = true;
		while(notDone){
			notDone = root.print(depth++);
			System.out.println("");
		}
	}
}
