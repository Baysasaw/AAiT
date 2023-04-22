import java.util.*;
public class GradebookOO{ //class 
	private double[] grades;

	public GradebookOO(){
		grades = new double[0];
	}
	public GradebookOO(double[] grades){
		this.grades = grades;
	}
	void printGrade(){
		//for(double grade :grades){
		//	System.out.println(grade);
		//}
		System.out.println(Arrays.toString(grades));
	}
	double averageGrade(){
		double total = 0;
		for(double grade : grades){
			total += grade;
		}
		return total / grades.length;
	}

	void addGrade(double grade){
	
		double[] temp = new double[grades.length + 1];
		int i;
		for(i = 0; i < grades.length; i++){
			temp[i] = grades[i];
		}
		temp[i] = grade;
		grades = temp;

	}
	void deletGrade(double grade){
		int count  = 0;
		for(int i = 0; i < grades.length; i++){
			if(grades[i] == grade)
				count++;
		}
		if (count == 0);
		else{
			double[] temp = new double[grades.length - count];
			for(int i = 0, j = 0; i < grades.length; i++){
				if(grade != grades[i]){
					temp[j] = grades[i];
					j++;
				}
			}
			grades = temp;
		}

	}
	
 }
