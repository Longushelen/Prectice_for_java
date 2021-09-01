package shape;
import cloud.Active;

public abstract class Shape implements Active {
	int x, y;
	static final String name = "모양";
	
	public Shape (){ }
	public Shape (int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString () {
		return "▷ 속성 : [x] " + x + " [y] " + y ;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
	    x += dx;
	    y += dy;
	}
	@Override
	public void printlnfo() {
		// TODO Auto-generated method stub
		System.out.println(" "+ name);
	}
	@Override
	public void printOriginal() {
		// TODO Auto-generated method stub
		System.out.println("▶ 기준점 : x - "+ x + ", y - " + y);
	}
	public abstract double getArea();
}
