package col;

import java.util.ArrayList;
import java.util.List;

public class Academy {

	private List<Worker> academies = new ArrayList<>();

	public List<Worker> getAcademies() {
		return academies;
	}

	public void setAcademies(List<Worker> academies) {
		this.academies = academies;
	}
	
	public void showAll(List<Worker> workers){
		for (Worker worker : workers) {
			System.out.println(worker.getName());
			System.out.println(worker.getEducation());
			System.out.println(worker.getWorkPlace());
		}
	}
	
	public void addPerson(List<Worker> workers){
		
	}
}
