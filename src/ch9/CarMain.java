package ch9;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car(); //��ü����
		
		System.out.println("����ȸ�� : "+myCar.company); //�ʵ尪 �б�
		System.out.println("�𵨸� : "+myCar.model);
		System.out.println("���� : "+myCar.color);
		System.out.println("�ְ�ӵ� : "+myCar.maxspeed);
		System.out.println("����ӵ� : "+myCar.speed);
		
		myCar.speed=60; //�ʵ尪 ����
		System.out.println("������ �ӵ� : "+myCar.speed);
	}

}