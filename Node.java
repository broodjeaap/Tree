public class Node<T extends Comparable<T>>{
	T data;
	
	Node<T> parent, left, right;
	
	public Node(T d){
		data = d;
	}
	
	public Node(T d,Node<T> p){
		data = d;
		parent = p;
	}
	
	public boolean add(Node<T> d){
		if(d.data.compareTo(data) < 0){
			if(left != null){
				return left.add(d);
			} else {
				left = d;
				return true;
			}
		} else {
			if(right != null){
				return right.add(d);
			} else {
				right = d;
				return true;
			}
		}
	}
	
	public boolean remove(T d, Node<T> parent){
		int compare = d.compareTo(data);
		if(compare < 0){
			if(left != null){
				return left.remove(d,this);
			}
			return false;
		} else if (compare > 0) {
			if(right != null){
				return right.remove(d,this);
			}
			return false;
		} else {
			if(left != null && right != null){
				data = right.min().data;
				right.remove(data,this);
			} else if(parent.left == this){
				parent.left = ((left != null) ? left : right);
			} else if(parent.right == this){
				parent.right = ((left != null) ? left : right);
			}
		}
		return true;
	}
	
	
	public T find(T t){
		if(data.equals(t)){
			return data;
		}
		if(t.compareTo(data) < 0){
			if(left != null){
				return left.find(t);
			}
		} else {
			if(right != null){
				return right.find(t);
			}
		}
		return null;
	}
	
	public Node<T> min(){
		if(left != null){
			return left.min();
		}
		return this;
	}
	
	public Node<T> max(){
		if(right != null){
			return right.max();
		}
		return this;
	}
	
	public boolean print(int i){
		if(i == 0){
			System.out.print(data+", ");
			if(left == null && right == null){
				return false;
			}
			return true;
		}
		boolean leftNull = false;
		if(left != null){
			leftNull = left.print(i - 1);
		}
		boolean rightNull = false;
		if(right != null){
			rightNull = right.print(i - 1);
		}
		return (leftNull || rightNull);
	}
	
	public String toString(){
		return data.toString();
	}
}