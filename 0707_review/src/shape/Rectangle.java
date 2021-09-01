package shape;
public class Rectangle extends Shape{
	
	int w, h;
	static final String name = "네모";

	public Rectangle (){}
	public Rectangle (int x, int y, int w, int h){
		super(x, y);
		this.w = w;
		this.h = h;
	}
	public String toString () {
		return "▷ 속성 [x] " + x + " [y] " + y + " [w] " + w + " [h] " + h;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
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
		return (double)x * y;
	}

}
