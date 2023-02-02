package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int winLimit = 10;
		int count = 0;
		
		for (int totalSimulations = 1; totalSimulations <= 500; totalSimulations ++)
		{
			int startAmount = 1;
			while (winLimit > startAmount && startAmount > 0)
			{
				boolean winChance = Math.random() <= 0.7;
				if (winChance)
				{	
					count ++;
					startAmount++;
		
				}
				else
				{
					count ++;
					startAmount--;
				}
			}
			if (startAmount == 10)
			{
				System.out.println("Simulation " + totalSimulations + ": " + count + " WIN");
				
			}
			else 
				System.out.println("Simulation " + totalSimulations + ": " + count + " LOSE");
				
		}
			
	}

}
