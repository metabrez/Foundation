//import DifferentClass.InterfaceTest;
//import DifferentClass.Showable;

public interface Showable {
	
	void display();
		
		
		interface Message{
			
			
			void msg();
		}
		
}

				
		 class InterfaceTest implements Showable.Message{

			@Override
			public void msg() {
				// TODO Auto-generated method stub
				System.out.println("I am nested interface");
				
			}
			
			public static void main(String[]args){
				
				Showable.Message message=new InterfaceTest();
				message.msg();
				
				
			}
		
			
		}
	


