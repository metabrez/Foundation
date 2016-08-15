
public class DigitArray {
	
	
	public static void main(String[]args){
		
		
		System.out.println(digitArray(12345));
		
	}
		
		static int[]  digitArray(int n){
			
			String temp = Integer.toString(n);

			int[] num = new int[temp.length()];

			for (int i = 0; i < temp.length(); i++){
			    num[i] = temp.charAt(i) - '0';
			}

			for (int i = 0; i < temp.length(); i++) {
			    System.out.println(num[i]);
			}
			
			return num;
		}
		
	}


