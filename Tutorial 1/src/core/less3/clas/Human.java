package core.less3.clas;

public class Human {

	int age;
	
	String name;
	
	
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	void run() {
		System.out.println(name + ": go-go-go");
	}
	
	public String toString() {
		return "Human [age="+age+", name="+name+"]";
	}
}
