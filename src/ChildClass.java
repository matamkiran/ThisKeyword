
public class ChildClass extends BaseClass {
	int age=16;
	ChildClass(){
		System.out.println(" I am child class constructor");
		this.display();
		super.display();
	}
	
	
	void display() {
		System.out.println("I am child class method ");
		System.out.println(this.age);
	}
	void display(int age) {
		this.age=age;
		System.out.println(this.age);
	}

	
}
