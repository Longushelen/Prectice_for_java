package shape;

public class Triangle extends Shape {
	
	private int b, h;
	static final String name = "세모";
	
	public Triangle (){	}
	public Triangle (int x, int y, int b, int h){
		super(x, y);
		this.b = b;
		this.h = h;
	}
	public String toString () {
		return "▷ 속성 [x] " + x + " [y] " + y + " [b] " + b + " [h] " + h;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public static String getName() {
		return name;
	}
	@Override
	public void printlnfo() {
		// TODO Auto-generated method stub
		System.out.println(" "+ name);
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ((double)x * y)/2;
	}
}
