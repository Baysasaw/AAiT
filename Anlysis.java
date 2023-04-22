import java.util.*;
public class Anlysis{
	public static void main (String[] args){
		int passes=0;
		int faliure=0;
		int counter=0;
		Scanner scan= new Scanner(System.in);
		while(counter<10){
			System.out.print("enter the next exam: ");
			int grade= scan.nextInt();
			if (grade>50){
				passes++;

			}else {
				faliure++;
			}
			counter++;
		}
		System.out.println(passes);
		System.out.println(faliure);
		

	
	}



}

// Initialize passes to zero
// Initialize failures to zero
// Initialize student counter to zero
//
// While student counter is less than or equal to 10
	//prompt the user to enter the next exam result
	//input the next exam result
	

	//if the student pass
		// one to passes
	//else
		//Add one to failures
	//add one student counter

//print the number of passs
//print the number of failures

//more than eight student passed 
	//print "Bonus to instructor!"
