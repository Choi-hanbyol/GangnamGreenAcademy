package ch13_DB;

public class Process {
	private DbInterface db;
	
	public Process(DbInterface db) {
		this.db=db;
	}
	void connect() {
		db.connect();
	}
	void select() {
		db.select();
	}
	void insert() {
		db.select();
	}
	void update() {
		db.update();
	}
	void delete() {
		db.delete();
	}
}