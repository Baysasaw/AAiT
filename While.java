public class While{
	public static void main(String[] args){
		int count = 1;
		while(count < 10){
			System.out.print(" " + count);
			if(count == 5)
				continue;
			count++;
		}
	}
}
