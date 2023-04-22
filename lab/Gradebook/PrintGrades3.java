import java.util.*;
public class PrintGrades3{
	 static void PrintGrades (double[] grades){ // a function that print the grade of student

                for(int i = 0; i < grades.length; i++){
                        System.out.println(grades[i]);
                }
           }
	 static double averageGrade(double[] grades)
	{
		double total = 0;
		for(double grade : grades){
                        total += grade;
                }
		return total / grades.length;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

                System.out.print("How many grade do you want to insert: ");
                int n = input.nextInt();
                double[] grades = new double[n];
                for(int i = 0; i < n; i++){
                        System.out.print("Enter grade: ");
                        grades[i] = input.nextDouble();
                }

		

		System.out.printf("%15s\n","Menu");
		System.out.println("1. print out the grade");
		System.out.println("2. find the average grade");

		switch(input.nextInt()){
			case 1:
				PrintGrades(grades);
				break;
			case 2:
				double average = averageGrade(grades);
				System.out.printf("your average grade is %.2f\n", average);
				break;
		}
	}
}
