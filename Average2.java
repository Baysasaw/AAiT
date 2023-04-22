import java.util.Scanner;
public class Average2{
	public static void main(String[] args)
	{
		int total = 0; //initialize total to zero
		int count = 0; //initialize counter to zero---
		Scanner input = new Scanner(System.in);

		//prompt the user to enter the first grade
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();//input the first grade(possibly the sentinel		
		//while the user has not enerd the sentinel
		while(grade != -1){
			total = total + grade;//add this into the running total
			count++;//add one to the grade counter
			//prompt the user to enter the next grade
			System.out.print("Entere grade or -1 to quit: ");
			grade = input.nextInt();//input the next grade (possibly the sentinel)
		}

		if (count != 0)//if the counter is not equal to zero
		{
			//set the average to the total divided by the counter
			double average = (double)total / count;
			//print the average
			System.out.printf("Total of %d grade entered is %d%n", count, total);
			System.out.printf("Class average is %.2f%n", average);
		}
		else
			System.out.println("No grades were entered");
	}

}
