package shape;

public class Circle extends Shape {
	int r;
	static final String name = "동그라미";

	public Circle() {
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	public String toString () {
		return "▷ 속성 [x] " + x + " [y] " + y + " [r] " + r;
	}
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public static String getName() {
		return name;
	}

	@Override
	public void printlnfo() {
		// TODO Auto-generated method stub
		System.out.println(" " + name);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return r*r*3.14;
	}
}
