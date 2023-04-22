//this program will print the maximun number of a given number
public class Max{
	public static void main(String[] args){
		int max;
		max = Integer.parseInt(args[0]);
		for(int i = 1; i < args.length; i++){
			max = (max > Integer.parseInt(args[i]) ? max : Integer.parseInt(args[i]));
		}
		System.out.println(max);
	}
}
