package ch11;

public class GrandParent {
	protected String name;
	protected int age;
	
	public GrandParent() {
		System.out.println("GrandParent의 생성자");
	}
	
	public void printGrandParentInfo() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
}