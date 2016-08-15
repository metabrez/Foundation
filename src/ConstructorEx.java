
public class ConstructorEx {
	
	int age;
	String name;
	String add;
	
	ConstructorEx(int age1,String name1,String add2){
		
		
		age=age1;
		name=name1;
		add=add2;
		
		
	}
	ConstructorEx(ConstructorEx ex3){
		
		age=ex3.age;
		name=ex3.name;
		add=ex3.add;
	}
	
	void display(){
		
		System.out.println(" name :  " + name + "  Age : " + age + "  Address : " +add);
	}
	
	public static void main(String[]args){
		
		ConstructorEx ex=new ConstructorEx(30,"Tabrez","kathmandu");
		
		//ConstructorEx ex1=new ConstructorEx(34,"Prawez","Ramaul");
		
		ConstructorEx ex1=new ConstructorEx(ex);
		ex.display();
		ex1.display();
	}

}
