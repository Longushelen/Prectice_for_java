package line;
public class Curve extends Line {
	int curveDeg;
	static final String name = "°î¼±";
	
	public Curve(){}
	public Curve(int x, int y, int curveDeg){
		super(x, y);
		this.curveDeg = curveDeg;
	}
	public String toString () {
		return "¢¹ ¼Ó¼º [x] " + x + " [y] " + y + " [curveDeg] " + curveDeg;
	}
	public int getCurveDeg() {
		return curveDeg;
	}
	public void setCurveDeg(int curveDeg) {
		this.curveDeg = curveDeg;
	}
	public static String getName() {
		return name;
	}
	@Override
	public void printlnfo() {
		// TODO Auto-generated method stub
		System.out.println(" "+ name);
	}
	
}
