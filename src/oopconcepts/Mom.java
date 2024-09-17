package oopconcepts;

public class Mom {
	public void run() {
		System.out.println("mom says.......");
	}

}
class Daughter extends Mom{
	public void run() {
		System.out.println("daughter says.........");
	}
	public static void main(String[] args) {
		Mom m = new Daughter();
		m.run();
	}
	
}
