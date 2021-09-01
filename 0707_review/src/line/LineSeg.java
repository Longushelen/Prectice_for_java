package line;

public class LineSeg extends Line{
	int ex, ey;
	static final String name = "선분";
	
	public LineSeg(){}
	public LineSeg(int x, int y, int ex, int ey){
		super(x, y);
		this.ex = ex;
		this.ey = ey;
	}
	public String toString () {
		return "▷ 속성 [x] " + x + " [y] " + y + " [ex] " + ex + " [ey] " + ey;
	}
	public int getEx() {
		return ex;
	}
	public void setEx(int ex) {
		this.ex = ex;
	}
	public int getEy() {
		return ey;
	}
	public void setEy(int ey) {
		this.ey = ey;
	}
	public static String getName() {
		return name;
	}
	public double getDistance() {
		double resx = (double)ex - x;
		double resy = (double)ey - y;
		double jegop = Math.pow(resx, 2) + Math.pow(resy, 2);
		double res = Math.sqrt(jegop);
		return res;
	}
	@Override
	public void printlnfo() {
		// TODO Auto-generated method stub
		System.out.println(" "+ name);
	}
}
