public class For{
	public static void main(String[] args){
		int total = 3;
		for (int i = 0; i <= 100_000_000; i++ ){
			total =+ i;
		}
		System.out.print(total);
	}
}