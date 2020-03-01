import java.util.Random; 
public class SnakeAndLadderProgram
{
	static boolean play()
	{
		//VARIABLE OF PLAYER ONE
		int position = 0;

		
		while(true) 
		{
			//GENERATING RANDOM NUMBERS
			Random randomValue = new Random();
			int valueForOption = randomValue.nextInt(3);
			int turnResult = randomValue.nextInt(6)+1;
			
			
			//ELSE-IF FOR RUNNING OPTIONS OF GAME
			if(valueForOption == 0)
			{
				System.out.println("Player No Play");
			}
			else if(valueForOption == 1)
			{
				position += turnResult;		
				System.out.println("Player Postion : "+position);
				if(position > 100)
				{
					//ADDING LAST POSITION IF VALUE IS GREATER THAN 100
					position -= turnResult; 
					System.out.println("Player Postion : "+position);
				}
				else if(position == 100) 
				{
					return true;
				}				
			}
			else if(valueForOption == 2)
			{
				position -= turnResult;				
				System.out.println("Postion : "+position);
				if(position == 100) 
				{
					return true;
				}
				else if(position <= 0)
				{
					//GAME STARTING AGAIN
					System.out.println("Player Game Started Again");
					position = 0;
					System.out.println("Player Postion : "+position);
				}//INNER ELSE-IF ENDED					
			}//OUTER ELSE-IF ENDED			
		}//WHILE LOOP ENDED
	}


	//JAVA MAIN FUNCTION
	public static void main(String[] args) 
	{
		//FUNCTION CALLED FOR FIRST PLAYER
		long startTimePlayer1 = System.nanoTime();
		play();
		long endTimePlayer1 = System.nanoTime();
		long durationPlayer1 = (endTimePlayer1 - startTimePlayer1);
		
		
		//FUNCTION CALLED FOR SECOND PLAYER
		long startTimePlayer2 = System.nanoTime();
		play();
		long endTimePlayer2 = System.nanoTime();
		long durationPlayer2 = (endTimePlayer2 - startTimePlayer2);
		
		
		if(durationPlayer2 > durationPlayer1)
		{
			System.out.println("Player One Won The Game");
		}
		else
		{
			System.out.println("Player Two Won The Game");
		}
	}	
}