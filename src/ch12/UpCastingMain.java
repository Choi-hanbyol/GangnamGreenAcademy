package ch12;

public class UpCastingMain {

	public static void main(String[] args) {
		System.out.println("UpCastingParent의 객체");
		UpCastingParent up = new UpCastingParent();
		System.out.println("up.add() = "+up.add()+"\n");
		
		System.out.println("UpCastingChild 객체");
		UpCastingChild uc = new UpCastingChild();
		System.out.println("uc.add() = "+uc.add());
		System.out.println("uc.sub() = "+uc.sub()+"\n");
		
		System.out.println("UpCasting된 객체");
		/*업캐스팅 객체를 생성, 타입은 부모클래스인 UpCastingParent이고
		생성자 호출은 자식 클래스인 UpCastingChild의 것을 호출*/
		UpCastingParent upc = new UpCastingChild();
		System.out.println("upc.add() = "+upc.add() +"\n");
		//System.out.println("upc.sub() = "+upc.sub());
		/*sub()호출하는데 upc의 타입이 UpCastingParent이므로
		이 클래스에서는 sub()이 정의되지 않았다. 그래서 에러 발생
		이첢 타입은 부모, 실행되지 형태는 자식인것을 업캐스팅이라 함*/
	}
}