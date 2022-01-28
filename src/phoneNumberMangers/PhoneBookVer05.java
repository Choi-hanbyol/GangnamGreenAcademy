package phoneNumberMangers;

import java.util.Scanner;

interface INIT_MENU{
	int INPUT=1, SEARCH=2, DELETE=3, EXIT=4;
}

interface INPUT_SELECT{
	int NORMAL=1, UNIV=2, COMPANY=3;
}

class PhoneInfo5{
	String name;
	String phoneNumber;
	
	public PhoneInfo5(String name, String num) {
		this.name=name;
		phoneNumber=num;
	}
	public void showPhoneInfo() {
		System.out.println("name : "+name);
		System.out.println("phone : "+phoneNumber);
	}
}

class PhoneUnivInfo5 extends PhoneInfo5{
	String major;
	int year;
	
	public PhoneUnivInfo5(String name, String num, String major, int year) {
		super(name, num);
		this.major=major;
		this.year=year;
	}
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major : "+major);
		System.out.println("year : "+year);
	}
}

class PhoneCompanyInfo5 extends PhoneInfo5{
String company;
	
	public PhoneCompanyInfo5(String name, String num, String company) {
		super(name, num);
		this.company=company;
	}
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company : "+company);
	}
}

class PhoneBookManager5{
	final int MAX_CNT=100;
	PhoneInfo5[] infoStorage = new PhoneInfo5[MAX_CNT];
	int curCnt=0;
	
	static PhoneBookManager5 inst=null;
	public static PhoneBookManager5 createManagerInst() {
		if(inst==null)
			inst = new PhoneBookManager5();
		return inst;
	}
	
	private PhoneBookManager5() {}
	
	private PhoneInfo5 readFriendInfo5() {
		System.out.println("이름 : ");
		String name = MenuViewer5.Keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer5.Keyboard.nextLine();
		return new PhoneInfo5(name, phone);
	}
	private PhoneInfo5 readUnivFriendInfo5() {
		System.out.println("이름 : ");
		String name = MenuViewer5.Keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer5.Keyboard.nextLine();
		System.out.print("전공 : ");
		String major = MenuViewer5.Keyboard.nextLine();
		System.out.print("학년 : ");
		int year = MenuViewer5.Keyboard.nextInt();
		MenuViewer1.Keyboard.nextLine();
		return new PhoneUnivInfo5(name, phone, major, year);
	}
	private PhoneInfo5 readCompanyFriendInfo5() {
		System.out.println("이름 : ");
		String name = MenuViewer5.Keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer5.Keyboard.nextLine();
		System.out.print("회사 : ");
		String company = MenuViewer5.Keyboard.nextLine();
		return new PhoneCompanyInfo5(name, phone, company);
	}
	
	public void inputData() {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");
		System.out.print("선택>>");
		int choice = MenuViewer5.Keyboard.nextInt();
		MenuViewer5.Keyboard.nextLine();
		PhoneInfo5 info = null;
		
		switch(choice) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo5();
			break;
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo5();
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo5();
			break;
		}
		
		infoStorage[curCnt++]=info;
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	
	public void searchData() {
		System.out.println("데이터 검색을 시작합니다.");
		
		System.out.print("이름 : ");
		String name = MenuViewer1.Keyboard.nextLine();
		
		int dataIdx=search(name);
		if(dataIdx<0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		}
		else {
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.\n");
		}
	}
	
	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다.");
		
		System.out.println("이름 : ");
		String name = MenuViewer1.Keyboard.nextLine();
		
		int dataIdx = search(name);
		if(dataIdx<0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		}
		else {
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				infoStorage[idx]=infoStorage[idx+1];
			
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다.\n");
		}
	}
	
	private int search(String name) {
		for(int idx=0; idx<curCnt; idx++) {
			PhoneInfo5 curInfo=infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}
}

class MenuViewer5{
public static Scanner Keyboard = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.println("선택 : ");
	}
}

class PhoneBookVer05 {
	public static void main(String[] args) {
		PhoneBookManager5 manager = PhoneBookManager5.createManagerInst();
		int choice;
		
		while(true) {
			MenuViewer5.showMenu();
			choice = MenuViewer5.Keyboard.nextInt();
			MenuViewer5.Keyboard.nextLine();
			
			switch(choice) {
			case INIT_MENU.INPUT:
				manager.inputData();
				break;
			case INIT_MENU.SEARCH:
				manager.searchData();
				break;
			case INIT_MENU.DELETE:
				manager.deleteData();
				break;
			case INIT_MENU.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
