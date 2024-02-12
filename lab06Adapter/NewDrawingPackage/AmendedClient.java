
public class AmendedClient {

	public static void main(String[] args) {
		System.out.print("hello world\n");
        // create and draw a rectangle by drawing four lines
		double x1=10, y1=100;  // top left
		double x2=100, y2=100; // top right
		double x3=100, y3=10;  // lower right
		double x4=10, y4=10;   // lower left

        StraightLine upperLine = new StraightLine();
        StraightLine rightLine = new StraightLine();
        StraightLine lowerLine = new StraightLine();
        StraightLine leftLine = new StraightLine();


        upperLine.drawIt(x1,y1, x2,y2);
        rightLine.drawIt(x2,y2, x3,y3);
        lowerLine.drawIt(x3,y3, x4,y4);
        leftLine.drawIt(x4,y4, x1,y1);
			
        return;
	}

}
