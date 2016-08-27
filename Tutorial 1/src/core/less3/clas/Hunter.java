package core.less3.clas;


public class Hunter extends Human{
	
	
	int count;
	
	public Hunter(int age, String name) {
		super(age, name);
		System.out.println("I am hunter agrrrrrrr");
		
	}

	
	
	public Hunter(int age, String name, int count) {
		this(age, name);
		this.count = count;
	}



	void eatMeat(String meat) {
		System.out.println(name + ": nyam-nyam " + meat);
	}
	//owerload
	void eatMeat() {
		run();
		count++;
		System.out.println(name + ": I kill " + count + " mammont");
		eatMeat("mammont meat");
	}
	
	void run(){
		System.out.println(name + ": faster go-go-go");//перевизначений метод overriding
	}
	
	public String toString() {
		return super.toString()+"->Hunter[count="+count+"]";//перевизначило метод то стрінг хумана
	}
}
