package business;

public class RealLogger extends AbstractLogger{

	@Override
	public void log(String info) {
		System.out.print("Real Logger: " + info);
	}

}
