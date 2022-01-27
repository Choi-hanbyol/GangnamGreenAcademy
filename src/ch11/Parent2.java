package ch11;

public class Parent2 extends GrandParent{
	protected String job;
	
	public Parent2() {
		System.out.println("Parent2의 생성자");
	}
	
	public void printParent2Info() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("job : "+job);
	}
}
