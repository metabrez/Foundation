
public class Sample {
	
	Sample(){
		
		System.out.println("Zero Arguments Constructor");
	}
	
	Sample(int a){
		System.out.println("Arguments Constructor="+a);
	}}
	
	class Sub extends Sample{
		
		Sub(){
			
			System.out.println("sub zero args constructor");
		}
		
		Sub(int a){
			System.out.println("sub  args constructor");
			
		}}
	
	class Demo{
		public static void main(String[]args){
			
			Sub s1=new Sub();
			
			System.out.println(".................");
			Sub s2=new Sub(2);
		
	}
		
		
			
			
		}
	


