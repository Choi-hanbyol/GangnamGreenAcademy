package ch10;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		
		m.setName("���Ѻ�"); //m.name = "���Ѻ�"
		m.setTel("010-1234-1234"); //m.tel = "010-1234-1234"
		m.setAddress("�����"); //m.address = "�����"
		
		String name = m.getName(); //m.name
		String tel = m.getTel(); // m.tel
		String address = m.getAddress(); //m.address
		
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
}