package checkedExceptionExample;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) throws IllegalXYException {
		super();
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) throws IllegalXYException {
		if (x >= 0 && x <= 100) {
			this.x = x;
		} else {
			throw new IllegalXYException("illegal x value: " + x);
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws IllegalXYException {
		if (y >= 0 && y <= 100) {
			this.y = y;
		} else {
			throw new IllegalXYException("illegal y value: " + y);
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
