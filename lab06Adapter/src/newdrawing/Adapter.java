package newdrawing;

import drawing.Line;

public class Adapter implements Line {
	
	double rad1, theta1;
	double rad2, theta2;
	
	public Adapter(int x1, int y1, int x2, int y2) {
		rad1 = calculateRadius(x1, y1);
		theta1 = calculateTheta(x1, y1);
		rad2 = calculateRadius(x2, y2);
		theta2 = calculateTheta(x2, y2);
	}
	
	@Override
	public void draw() {
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
