package test;

class test1 {
	public static void main(String[] args) {
        Demo d = new Demo();
        d.num = 50;
        d.show();
        System.out.println(d.num);
	}

}
	

class Demo {
	int num = 10;
	
	public void show() {
		num = 100;
		System.out.println(num);
	}
}