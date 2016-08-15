import java.util.Random;

public class GenerateRandom {
	public static void main(String[]args){
		
		System.out.println(getRandomNum(4,10));
	}

	
	public static int getRandomNum(int min,int max){
		
		Random random=new Random();
		
		int randomNum=random.nextInt(max-min)+min;
		if(randomNum==min){
			
			return min+1;//coz number will be from min and max
			
		}
		
		else{
			
			return randomNum;
		}
	}
}
 