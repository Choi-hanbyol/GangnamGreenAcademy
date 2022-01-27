package ch13;

public abstract class Parent extends GrandParent{

	@Override
	public void print() {
		System.out.println("parent");
		System.out.println("name = "+name);
	}
}