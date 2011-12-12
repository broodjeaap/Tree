public class Student implements Comparable<Student>{
	String nummer;
	
	public Student(String s){
		nummer = s;
	}
	
	public int compareTo(Student o){
		if(this == o){
			return 0;
		}
		Student tmp = (Student)o;
		return nummer.compareTo(tmp.nummer);
	}
	
	public String toString(){
		return nummer;
	}
	
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		Student tmp = (Student)obj;
		return ((tmp.nummer.equals(nummer)) ? true : false);
	}
}