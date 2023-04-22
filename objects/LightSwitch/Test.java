public class Test{
	public static void main(String[] args){
		LightSwitch ls = new  LightSwitch();
		System.out.println(ls.isOn()); //accesing by field
		ls.Switch(); //assesing by method
		System.out.println(ls.isOn()); // assesing by method`:wq
	}
}
