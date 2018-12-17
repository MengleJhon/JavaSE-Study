package test;

public class test4 {
	public static void main(String[] args) {
		StudentDemo s1 = new StudentDemo();
		s1.show();
		System.out.println("====");
		
		StudentDemo s2 = new StudentDemo("林青霞");
		s2.show();
		System.out.println("====");
		
		StudentDemo s3 = new StudentDemo(27);
		s3.show();
		System.out.println("====");
		
		StudentDemo s4 = new StudentDemo("林青霞",27);
		s4.show();
		System.out.println("====");
	}

}

class StudentDemo {
	private String name;
	private int age;
	
	public StudentDemo() {
		System.out.println("无参构造方法");
	}
	
	public StudentDemo(String name) {
		System.out.println("有参构造方法");
		this.name = name;
	}
	
	public StudentDemo(int age) {
		System.out.println("有参构造方法");
		this.age = age;
	}
	
	public StudentDemo(String name,int age) {
		System.out.println("有参构造方法");
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name + "====" + age);
	}
}