import java.util.Random; 
public class SnakeAndLadderProgram
{
	public static void main(String[] args) 
	{
		//VARIABLE
		int position = 0;
		
		
		//PRINTED VARIABLE NAME AND VALUE
		System.out.println("Position : "+position);
		Random randomValue = new Random();
		int turnResult = randomValue.nextInt(6)+1;
		System.out.println("Turn Result : "+turnResult);
	}
}
