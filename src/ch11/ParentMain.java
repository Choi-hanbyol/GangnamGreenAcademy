package ch11;

public class ParentMain {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "�θ�";
		p.age = 50;
		p.setMoney(100000);
		p.printParentInfo();
		System.out.println("money : "+p.getMoney());
		System.out.println("---------------------");
		
		Child c = new Child();
		c.name = "�ڽ�";
		c.age = 200;
		c.setHobby("��Ÿ");
		c.printParentInfo();
		c.printInfo();
	}
}