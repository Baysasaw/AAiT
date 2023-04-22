import java.util.*;
public class  LetterGrade{
	public static void main(String[] args){
		int total = 0; //total grade
		int gradeCounter = 0; // number of grade entered
		int aCount = 0; //Count of A Grade
		int bCount = 0; //Count of B Grade
		int cCount = 0; //Count of C Grade
		int dCount = 0; //Count of D Grade
		int fCount = 0; //count of F Grade
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n   %s%n   %s%n","Enter the integer grade in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"on UNIX/linux/macOS type <Ctrl>d then press Enter",
				"on Window type <Crtl> z then press Enter");
		// loop until user enter the end-of-file indicator
		while(input.hasNext()) {
			int grade = input.nextInt(); //read grade
			total += grade; //add grade to total
			++gradeCounter;

			//increment appropriate letter-grade counter
			switch(grade / 10){
				case 9:
				case 10:
					++aCount;
					break;
				case 8:
					++bCount;
					break;
				case 7:
					++cCount;
					break;
				case 6:
					++dCount;
					break;

				default:
					++fCount;
			}
		}
		//display grade report
		System.out.printf("%nGrade Report:%n");
		// if user entered at lesst one grade...
		if (gradeCounter != 0){
			//calulate average og all grades entered
			double average = (double) total / gradeCounter;

			// output summery of results
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
					"Number of students who received each grade:",
					"A: ", aCount, // display number of A grades
					"B: ", bCount, // display number of B grades
					"C: ", cCount, // display number of C grades
					"D: ", dCount, // display number of D grades
					"F: ", fCount); // display number of F grades
		}
		else{
			System.out.println("No grades were entered");
		}
	}

}
