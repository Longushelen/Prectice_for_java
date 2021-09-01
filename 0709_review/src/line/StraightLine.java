package line;

public class StraightLine extends Line {
	static final String name = "직선";
	
	public StraightLine (){}
	public StraightLine (int x, int y){
		super(x, y);
	}
	public String toString () {
		return "▷ 속성 [x] " + x + " [y] " + y;
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
