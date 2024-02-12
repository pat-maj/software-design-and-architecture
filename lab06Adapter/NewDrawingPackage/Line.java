
public class Line {

	public void draw(int x1, int y1, int x2, int y2) {
		
		double rad1 = calculateRadius(x1, y1);
		double theta1 = calculateTheta(x1, y1);
		double rad2 = calculateRadius(x2, y2);
		double theta2 = calculateTheta(x2, y2);
		
		StraightLine sl = new StraightLine();
		sl.drawIt(rad1, theta1, rad2, theta2);
	}
	
	private double calculateRadius(int x, int y) {
		return Math.sqrt(x*x + y*y);
	}
	
	private double calculateTheta(int x, int y) {
		return Math.atan2(y, x);
	}
}
