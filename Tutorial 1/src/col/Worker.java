package col;

public class Worker extends Student{
	private String workPlace;

	public Worker(String name, String workPlace) {
		super(name);
		this.workPlace = workPlace;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	
	
}
