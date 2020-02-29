import java.util.Random; 
public class SnakeAndLadderProgram
{
	public static void main(String[] args) 
	{
		//VARIABLE
		int diceRolledCount = 0;
		int position = 0;


		while(true) 
		{
			//GENERATING RANDOM NUMBERS
			Random randomValue = new Random();
			int valueForPlay = randomValue.nextInt(3);
			int turnResult = randomValue.nextInt(6)+1;
			diceRolledCount += 1;
			
			
			//ELSE-IF FOR RUNNING OPTIONS OF GAME
			if(valueForPlay == 0)
			{
				System.out.println("No Play");
				
				
				//COUNTING NUMBER OF DICE ROLLED
				System.out.println("Number OF Times Dice Rolled : "+diceRolledCount+" And Current Position After Dice Rolled"+position);
			}


			else if(valueForPlay == 1)
			{
				position += turnResult;
				
				
				//COUNTING NUMBER OF DICE ROLLED
				System.out.println("Number OF Times Dice Rolled : "+diceRolledCount+" And Current Position After Dice Rolled"+position);
						
				
				if(position > 100)
				{
					//GIVING POSITION LAST POSITION IF VALUE IS GREATER THAN 100
					position -= turnResult; 
				}


				else if(position == 100) 
				{
					//PRINTING WINING MESSAGE
					System.out.println("Player Won The Game");
					break;
				}


				else if(position <= 0)
				{
					//GAME STARTING AGAIN
					System.out.println("Game Started Again");
					position = 0;
				}
			}


			else if(valueForPlay == 2)
			{
				position -= turnResult;
				
				
				//COUNTING NUMBER OF DICE ROLLED
				System.out.println("Number OF Times Dice Rolled : "+diceRolledCount+" And Current Position After Dice Rolled"+position);
				
				
				if(position > 100)
				{
					//GIVING POSITION LAST POSITION IF VALUE IS GREATER THAN 100
					position -= turnResult; 
				}


				else if(position == 100) 
				{	
					//PRINTING WINING MESSAGE
					System.out.println("Player Won The Game");
					break;
				}


				else if(position <= 0)
				{
					//GAME STARTING AGAIN
					System.out.println("Game Started Again");
					position = 0;
				}//INNER ELSE-IF ENDED
				
				
			}//OUTER ELSE-IF ENDED			
		}//WHILE LOOP ENDED
	}	
}