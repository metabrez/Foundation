
public class StudentStatic {
	
	int age;
	String name;
	 static String college="MUM";
	
	static void change(){
		
		college="Oxford";
		
	}
	
	
	StudentStatic(int age,String name){
		this.age=age;
		this.name=name;
		
		
	}
	
	void display(){
		
		System.out.println(name+ " " +age+ " " +college);
	}

	public static void main(String[]args){
		
		StudentStatic.change();
		
		StudentStatic st1=new StudentStatic(20,"Tabrez");
		StudentStatic st2=new StudentStatic(24,"Siekn");
		StudentStatic st3=new StudentStatic(30,"Nagendra");
		
		st1.display();
		st2.display();
		st3.display();
	}
}
