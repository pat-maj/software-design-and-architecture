package sda.diProblem.business;

public class RealLogger extends AbstractLogger{

	@Override
	public void log(String info) {
		System.out.println("Logger: " + info);
	}

}
