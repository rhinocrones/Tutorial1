package core.less5.hw2;

public class WorkerSalaryPerHour extends Worker {

	public WorkerSalaryPerHour(String name, int age) {
		setName(name);
		setAge(age);
		System.out.println(salary());
	}

	public int salary() {

		return getAge() * 15;
	}
}
