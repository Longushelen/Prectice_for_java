package line;

public class StraightLine extends Line {
	static final String name = "����";
	
	public StraightLine (){}
	public StraightLine (int x, int y){
		super(x, y);
	}
	public String toString () {
		return "�� �Ӽ� [x] " + x + " [y] " + y;
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
