package cloud;

public interface Active {
	
	public void move(int dx, int dy); // 변수 값 변경
	public void printOriginal(); // global 변수 출력
	public abstract void printlnfo(); // static 변수 출력
	
}

/*
printOriginal(): 기준점을 출력하는 함수

move(): 기준점을 이동하는 함수



printInfo(): 도형이나 선의 정보를 출력하는 함수 
      (원, 사각형, 삼각형, 직선, 선분 등등..)
      
      
      
      
getArea(): 면적을 구하는 함수

getDistance(): 거리를 구하는 함수


      
*/