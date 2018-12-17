package test;

public class test2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(50);
		String name = s.getName();
		int age = s.getAge();
		System.out.println(name + "----" + age);
	}

}

class Student {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
}