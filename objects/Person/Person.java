class Person{
	String name;// = "Jamal";
	int age;// = 26;
	Person(String n, int a){
		name = n;
		age = a;
	}
	String getName(){
		return name;
	}
	void setName(String n){
		name = n;
	}
	int getAge(){
		return age;
	}
	void setAge(int a){
		age = a;
	}
	boolean smellsBad(){
		return false;
	}
}
