package ch11;

public class Child extends Parent{
	private String hobby;
	
	public Child() {
		System.out.println("Child 생성자");
	}
	
	public void printInfo() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		// System.out.println("money : "+money); 에러발생
		System.out.println("hobby : "+hobby);
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby=hobby;
	}
}