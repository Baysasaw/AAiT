import java.util.*;
public class GBProgram{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("how many grade do you want to enter: ");
		double[] grades = new double[in.nextInt()];
		for (int i = 0; i < grades.length; i++){
			System.out.print("Enter grade: ");
			grades[i] = in.nextDouble();
		}
		GradebookOO GB = new GradebookOO(grades);
		GB.printGrade();
		GB.deletGrade(in.nextDouble());
		GB.printGrade();
		double average = GB.averageGrade();
		System.out.println(average);



	}
}
