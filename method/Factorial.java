public class Factorial {
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		System.out.println(fact(num));

	}
	static int fact(int f){
		if (f <= 0){
			return 1;
		}
		return f * (fact(f - 1));
	}
}
