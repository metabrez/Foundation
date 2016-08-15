
public class Student{
	
	int age;
	String name;
	
	void insert(int age,String name){
		
		this.age=age;
		this.name=name;
		
	}
	
	void display(){
		
		System.out.println(" Name : " +name+ " Age : " +age );
	}
	
	public static void main(String[]args){
		
		Student st=new Student();
		Student st1=new Student();
		st.insert(24, "Rizwan");
		st1.insert(25, "jawed");
		
		st.display();
		st1.display();
		
		
	}

}
