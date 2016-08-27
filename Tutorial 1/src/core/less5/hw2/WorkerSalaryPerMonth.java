package core.less5.hw2;

public class WorkerSalaryPerMonth extends Worker {
	public WorkerSalaryPerMonth(String name, int age) {
		setName(name);
		setAge(age);
		System.out.println(salary());
	}

	public int salary() {
		return getAge() * 15 * 8 * 21;
	}
}
