

public class Course {

	private String name;
	private String code;
	private int credits;

	public Course(String name, String code, int credits) {
		this.name = name;
		this.code = code;
		this.credits = credits;
	}

	@Override
	public String toString() {
		return String.format("Course:%s Code:%s Credits:%d%n", name, code, credits);
	}

}
