import java.util.Random; 
public class SnakeAndLadderProgram
{
	public static void main(String[] args) 
	{
		//VARIABLE
		int position = 0;


		//GENERATING RANDOM NUMBER
		Random randomValue = new Random();
		int valueForPlay = randomValue.nextInt(3);
		Random randomValue2 = new Random();
		int turnResult = randomValue.nextInt(6)+1;

		
		//SWITCH CASE FOR RUNNING OPTIONS OF GAME
		switch(valueForPlay)
		{
			case 0:
				System.out.println("No Play");
				break;
			case 1:
				position += turnResult;
				System.out.println("Current Position After Ladder :"+position);
				break;
			case 2:
				position -= turnResult;
				System.out.println("Current Position After Snake : "+position);
				break;
		}
	}
}
