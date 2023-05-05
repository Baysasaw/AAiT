import java.util.*;
public class PrintGrades{

        static void PrintGrades (double[] grades){ // a function that print the grade of student

                for(int i = 0; i < grades.length; i++){
                        System.out.println(grades[i]);
                }
           }
	// function that calculet the average grade of a student
	static double averageGrade(double[] grades)
	{
		double total = 0;
		for(double grade : grades){
                        total += grade;
                }
		return total / grades.length;
	}


	// a main method
        public static void main(String[] args){
		double grades[] = new double[args.length];

		for(int i = 0; i < args.length; i++){
			grades[i] = Double.parseDouble(args[i]);
		}
	
		PrintGrades(grades);
        double average = averageGrade(grades);
        System.out.printf("your average grade is %.2f\n", average);
        }
}
