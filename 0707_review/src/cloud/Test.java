package cloud;
import line.*;
import shape.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(3,4,2);
		Triangle triangle = new Triangle(3,4,5,6);
		Rectangle rectangle = new Rectangle(3,4,6,5);
		
		Curve curve = new Curve(3,4,5);
		LineSeg lineSeg = new LineSeg(3,4,5,5);
		StraightLine straightLine = new StraightLine(1,2);
		
		System.out.print("\n[ Circle ]");
		circle.printlnfo();
		System.out.print(circle + "\n");
		System.out.print("- 변경 전 - ");
		circle.printOriginal();
		circle.move(2, 2);
		System.out.print("- 변경 후 - ");
		circle.printOriginal();
		System.out.println("▶ 면적 : " + circle.getArea());
		
		System.out.print("\n[ Triangle ]");
		triangle.printlnfo();
		System.out.print(triangle + "\n");
		System.out.print("- 변경 전 - ");
		triangle.printOriginal();
		triangle.move(2, 2);
		System.out.print("- 변경 후 - ");
		triangle.printOriginal();
		System.out.println("▶ 면적 : " + triangle.getArea());
		
		System.out.print("\n[ Rectangle ]");
		rectangle.printlnfo();
		System.out.print(rectangle + "\n");
		System.out.print("- 변경 전 - ");
		rectangle.printOriginal();
		rectangle.move(2, 2);
		System.out.print("- 변경 후 - ");
		rectangle.printOriginal();
		System.out.println("▶ 면적 : " + rectangle.getArea());
		
		System.out.print("\n[ Curve ]");
		curve.printlnfo();
		System.out.print(curve + "\n");
		System.out.print("- 변경 전 - ");
		curve.printOriginal();
		curve.move(2, 2);
		System.out.print("- 변경 후 - ");
		curve.printOriginal();
		
		System.out.print("\n[ LineSeg ]");
		lineSeg.printlnfo();
		System.out.print(lineSeg + "\n");
		System.out.print("- 변경 전 - ");
		lineSeg.printOriginal();
		lineSeg.move(2, 2);
		System.out.print("- 변경 후 - ");
		lineSeg.printOriginal();
		System.out.println("▶ 직선의 길이 : "+ lineSeg.getDistance());
		
		System.out.print("\n[ StraightLine ]");
		straightLine.printlnfo();
		System.out.print(straightLine + "\n");
		System.out.print("- 변경 전 - ");
		straightLine.printOriginal();
		straightLine.move(2, 2);
		System.out.print("- 변경 후 - ");
		straightLine.printOriginal();
		
	}

}
