package demo1;
import java.util.Scanner;

class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长方形长：");
		int length = sc.nextInt();
		System.out.println("请输入长方形宽：");
		int width = sc.nextInt();
		
		Changfangxing cfx = new Changfangxing();
		cfx.setLength(length);
		cfx.setWidth(width);
		System.out.println("周长：" + cfx.getZhouChang());
		System.out.println("面积：" + cfx.getArea());
	}

}

class Changfangxing {
	private int length;
	private int width;
	
	public Changfangxing() {
		
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getZhouChang() {
		return (length + width)*2;
	}
	public int getArea() {
		return length*width;
	}
}
