public class Test{
	public static void main (String[] args){
		Person george = new Person("yonas" , 23);
		System.out.println(george.getName());
		System.out.println(george.getAge());

		george.setName("George");
		george.setAge(22);
		System.out.println(george.getName());
		System.out.println(george.getAge());

	}
}
