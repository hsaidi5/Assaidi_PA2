import java.util.Scanner;

public class Survey {
	public static void main(String [] agrs)
	{
		String[] topics = {"Video Games", "Sports", "Renewable Energy", "Presidential election", "Food"};
		int[][] responses = new int[5][10];
		int i;
		int j;
		int rating;
		double numOfRate;
		int[] sum = new int[5];
		int numUsers;
		int maxPoints;
		int minPoints;
		String maxTopic;
		String minTopic;
		double[] averages = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of responses: ");
		numUsers = sc.nextInt();
		
		for(i = 0; i<numUsers; i++)
		{
			System.out.println("Enter rating from 1 to 10 for each topic.");
			System.out.println("");
			for(j = 0; j<topics.length; j++)
			{
				System.out.print(topics[j] + ": ");
				rating = sc.nextInt();
				responses[j][rating-1]++;
				System.out.println("");
			}
			
		}	
		sc.close();
		
		for(i = 0; i<topics.length; i++)
		{
			numOfRate = 0;
			for(j = 0; j<10; j++)
			{
				if(responses[i][j] != 0)
					numOfRate += responses[i][j];
				sum[i] += (responses[i][j] * (j+1));
			}
			averages[i] = sum[i] / numOfRate;
		}
		
		minPoints = sum[0];
		maxPoints = sum[0];
		minTopic = topics[0];
		maxTopic = topics[0];
		for(i = 1; i<5; i++)
		{
			if(sum[i] < minPoints)
			{
				minPoints = sum[i];
				minTopic = topics[i];
			}
			else if(sum[i] > maxPoints)
			{
				maxPoints = sum[i];
				maxTopic = topics[i];
			}
		}
		
		
		System.out.println("\t\t\t\t\tRatings");
		System.out.format("%16s\t-----------------------------------------\n", " ");
		System.out.format("%16s\t| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|\n", " ");
		for(i = 0; i<topics.length; i++)
		{
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.format("%16s\t|", topics[i]);
			for(j = 0; j<10; j++)
			{
				System.out.printf(" %d |", responses[i][j]);
			}
			System.out.printf(" Average rating: %.1f\n", averages[i]);
		}
		
		System.out.println("\nHighest point total was for " + maxTopic + " with a total of " + maxPoints + " points.\n");
		System.out.println("Lowest point total was for " + minTopic + " with a total of " + minPoints + " points.");
	}
}
