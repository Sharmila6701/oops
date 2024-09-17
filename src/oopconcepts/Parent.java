package oopconcepts;

public class Parent {
	int a = 10;
	public void display() {
		System.out.println("parent says");
	}
}
	class Child1 extends Parent{
		public void clean() {
			System.out.println("child says");
		}
	}
	class Child2 extends Child1{
		public void test() {
			System.out.println("child2 says");
		}
	
		public static void main(String[] args) {
			Child2 c = new Child2();
			c.clean();
			c.display();
			c.test();
			System.out.println(c.a);
			
			
		}
	}
	
	

