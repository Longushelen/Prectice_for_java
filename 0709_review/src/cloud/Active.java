package cloud;

public interface Active {
	
	public void move(int dx, int dy); // ���� �� ����
	public void printOriginal(); // global ���� ���
	public abstract void printlnfo(); // static ���� ���
	
}

/*
printOriginal(): �������� ����ϴ� �Լ�

move(): �������� �̵��ϴ� �Լ�



printInfo(): �����̳� ���� ������ ����ϴ� �Լ� 
      (��, �簢��, �ﰢ��, ����, ���� ���..)
      
      
      
      
getArea(): ������ ���ϴ� �Լ�

getDistance(): �Ÿ��� ���ϴ� �Լ�


      
*/