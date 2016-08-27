package core.less7;

public class Superhero {
	private String nickcname;
	private int age;

	public Superhero(String nickcname, int age) {
		this.nickcname = nickcname;
		this.age = age;
	}

	public String getNickcname() {
		return nickcname;
	}

	public void setNickcname(String nickname) {
		this.nickcname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Superheroes [nickcname=" + nickcname + ", age=" + age + "]";
	}

}
