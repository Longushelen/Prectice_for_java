package cloud;
import line.*;
import shape.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Line [] line = {new Curve(3,4,5),new LineSeg(3,4,5,5), new StraightLine(1,2)};
		for ( int i = 0 ; i < line.length ; i ++) {
			System.out.print("[" + line[i].getClass().getName()+ "] " + line[i]);
			line[i].printlnfo();
			System.out.print("- 변경 전 - ");
			line[i].printOriginal();
			line[i].move(2, 2);
			System.out.print("- 변경 후 - ");
			line[i].printOriginal();
			if(line[i] instanceof LineSeg) {
				System.out.println("▶ 직선의 길이 : " + ((LineSeg)line[i]).getDistance());
			}
			System.out.println();
		}
		Shape [] shape = {new Circle(3,4,2), new Triangle(3,4,5,6), new Rectangle(3,4,6,5)};
		for ( int i = 0 ; i < shape.length ; i ++) {
			System.out.print("[" + shape[i].getClass().getName()+ "] " + shape[i]);
			shape[i].printlnfo();
			System.out.print("- 변경 전 - ");
			shape[i].printOriginal();
			shape[i].move(2, 2);
			System.out.print("- 변경 후 - ");
			shape[i].printOriginal();
			System.out.println("▶ 면적 : " + shape[i].getArea());
			System.out.println();
		}
		
	}

}
