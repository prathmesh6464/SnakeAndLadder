import java.util.Random; 
public class SnakeAndLadderProgram
{
	static void play()
	{
		//VARIABLE OF PLAYER ONE
		int position = 0;
		//VARIABLE OF PLAYER TWO 
		int position2 = 0;


		while(true) 
		{
			//GENERATING RANDOM NUMBERS
			Random randomValue = new Random();
			int valueForOption = randomValue.nextInt(3);
			int turnResult = randomValue.nextInt(6)+1;
			
			
			//ELSE-IF FOR RUNNING OPTIONS OF GAME
			if(valueForOption == 0)
			{
				System.out.println("Player-1 No Play");
			}
			else if(valueForOption == 1)
			{
				position += turnResult;		
				System.out.println("Player-1 Postion : "+position);
				if(position > 100)
				{
					//GIVING POSITION LAST POSITION IF VALUE IS GREATER THAN 100
					position -= turnResult; 
					System.out.println("Player-1 Postion : "+position);
				}
				else if(position == 100) 
				{
					//PRINTING WINING MESSAGE
					System.out.println("Player-1 Won The Game");
					break;
				}				
			}
			else if(valueForOption == 2)
			{
				position -= turnResult;				
				System.out.println("Player-1 Postion : "+position);
				if(position == 100) 
				{	
					//PRINTING WINING MESSAGE
					System.out.println("Player-1 Won The Game");
					break;
				}
				else if(position <= 0)
				{
					//GAME STARTING AGAIN
					System.out.println("Player-1 Game Started Again");
					position = 0;
					System.out.println("Player-1 Postion : "+position);
				}//INNER ELSE-IF ENDED					
			}//OUTER ELSE-IF ENDED		
						
			
			//PLAYER TWO RANDOM NUMBER
			int valueForOption2 = randomValue.nextInt(3);
			int turnResult2 = randomValue.nextInt(6)+1;
			
						
			//ELSE-IF FOR RUNNING OPTIONS OF GAME
			if(valueForOption2 == 0)
			{
				System.out.println("Player-2 No Play");
			}
			else if(valueForOption2 == 1)
			{
				position2 += turnResult2;					
				System.out.println("Player-2 Postion : "+position2);
				if(position2 > 100)
				{
					//GIVING POSITION LAST POSITION IF VALUE IS GREATER THAN 100
					position2 -= turnResult2; 
					System.out.println("Player-2 Postion : "+position2);
				}
				else if(position2 == 100) 
				{
					//PRINTING WINING MESSAGE
					System.out.println("Player-2 Won The Game");
					break;
				}
			}
			else if(valueForOption2 == 2)
			{
				position2 -= turnResult2;				
				System.out.println("Player-2 Postion : "+position2);
				if(position2 == 100) 
				{	
					//PRINTING WINING MESSAGE
					System.out.println("Player-2 Won The Game");
					break;
				}
				else if(position2 <= 0)
				{
					//GAME STARTING AGAIN
					System.out.println("player-2 Game Started Again");
					position2 = 0;
					System.out.println("Player-2 Postion : "+position2);
				}//INNER ELSE-IF ENDED				
			}//OUTER ELSE-IF ENDED				
		}//WHILE LOOP ENDED
	}
	
	
	public static void main(String[] args) 
	{
		//FUNCTION CALLED
		play();
	}	
}