package ch13_DB;

public interface DbInterface {
	void connect();
	
	void select();
	
	void insert();
	
	void update();
	
	void delete();
}