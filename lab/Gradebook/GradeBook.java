public class GradeBook{
	public static void main(String[] args){
		double grades[] = { 100, 100, 100, 100};
		double total = 0; //initializing total to zero
		// print grade of the student
		for(double grade : grades){
			System.out.println(grade);

		}
		//a function that add all grades
		for(double grade : grades){
			total += grade;
		}
		// a function that calculete average

		double average = total / grades.length;
		
		System.out.printf("your average grade is %.2f\n", average);

		//print a letter grade
		switch((int)average / 10)
		{
			case 10:
			case 9:
				System.out.printf("your grade is A\n");
				break;
			case 8:
				System.out.printf("your grade is B\n");
                	        break;
			case 7:
                	        System.out.printf("your grade is C\n");
                        	break;
			case 6:
                        	System.out.printf("your grade is D\n");
                        	break;
			default:
				System.out.printf("your grade is F\n");
                     	   break;
		}
	}
}
