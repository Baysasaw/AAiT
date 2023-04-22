public class Person{
	//filds
	private String name;
	private int age;
	//construcrors
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	// behavior
	public String get() {
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public boolean SmellBad()
	{
		return false;
	}
	// method main
	public static void main(String[] args){
		
		Person george = new Person("Gerrge" , 22);
		System.out.println(george.getName());
		System.out.println(george.getAge());

	}
}
