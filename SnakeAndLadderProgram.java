import java.util.Random; 
public class SnakeAndLadderProgram
{
	public static void main(String[] args) 
	{
		//VARIABLE
		int position = 0;


		while(true) 
		{
			//GENERATING RANDOM NUMBERS
			Random randomValue = new Random();
			int valueForPlay = randomValue.nextInt(3);
			//Random randomValue2 = new Random();
			int turnResult = randomValue.nextInt(6)+1;


			//SWITCH CASE FOR RUNNING OPTIONS OF GAME
			if(valueForPlay == 0)
			{
				System.out.println("No Play");
			}
			else if(valueForPlay == 1)
			{
				position += turnResult;
				System.out.println("Current Position After Ladder :"+position);
				if(position == 100) 
				{
					System.out.println("Player Won The Game");
					break;
				}
				if(position <= 0)
				{
					System.out.println("Game Started Again");
					position=0;
				}
			}
			else if(valueForPlay == 2)
			{
				position -= turnResult;
				System.out.println("Current Position After Snake : "+position);
				if(position == 100) 
				{
					System.out.println("Player Won The Game");
					break;
				}
				if(position <= 0)
				{
					System.out.println("Game Started Again");
					position=0;
				}
			}
		}
	}	
}