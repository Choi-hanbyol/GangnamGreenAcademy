package ch7;

public class ProductMain2 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.num=1;
		p1.name="노트북";
		
		System.out.println("객체 p1의 정보 출력");
		p1.print();
		
		Product p2 = new Product();
		p2.num=2;
		p2.name="TV";
		
		System.out.println("객체 p2의 정보 출력");
		p2.print();
		
		Product p3 = new Product();
		p3.num=3;
		p3.name="냉장고";
		
		System.out.println("객체 p3의 정보 출력");
		p3.print();
	}

}