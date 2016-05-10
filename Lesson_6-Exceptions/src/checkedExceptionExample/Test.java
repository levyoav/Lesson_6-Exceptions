package checkedExceptionExample;

public class Test {
	
	public static void main(String[] args) {
		
		Point p1 = null;
		
		try {
			
			p1 = new Point(10, 10);
			System.out.println(p1);
			p1.setX(-15);
			p1.setY(18);
			System.out.println(p1);
			
		} catch (IllegalXYException e) {
			e.printStackTrace(System.out);
		}
		
		System.out.println("end of main");
	}

}
