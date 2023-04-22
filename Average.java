import java.util.*;
public class Average{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//set total to zero
		int total = 0;
		//set grade count to one
		int gradeCount = 0;
		//while grade counter is less then or equal to ten
		while (true){
			//prompt the user to enter the nex grade
			System.out.print(gradeCount ==  0 ? "Enter the Grade: " : "Enter the next Grade: ");
			//input the next grade
			try{
				int _input = input.nextInt();
				if (_input == -1){
					break;
				}
				if(0 <= _input && _input <= 100)
					total = total + _input;
				else{
					System.out.printf("wrong Grade%n");
					return;
				}
			}catch(Exception e){
				System.out.println("wrong input");
				return;
			}

			//Add the grade into the total
			//Add one to the grade counter
			gradeCount++;
		}
			System.out.printf("Total of all count %d grade is %d%n",gradeCount,total);
			//Set the class average to the total divided by ten
			double average = (double)total / gradeCount;
			//print the class average
			System.out.printf("Class Average is  %.2f%n", average);
	}
}
