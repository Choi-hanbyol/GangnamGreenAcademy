package ch10;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		
		m.setName("최한별"); //m.name = "최한별"
		m.setTel("010-1234-1234"); //m.tel = "010-1234-1234"
		m.setAddress("서울시"); //m.address = "서울시"
		
		String name = m.getName(); //m.name
		String tel = m.getTel(); // m.tel
		String address = m.getAddress(); //m.address
		
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
}