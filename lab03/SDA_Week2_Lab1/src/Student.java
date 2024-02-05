public class Student {

	private String name;
	private int age;
	private Address address;
	private Course course;

	public Student(String name, int age, Address address, Course course) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.course = course;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Name:%s Age:%d", name, age));
		if (address != null) {
			sb.append(' ');

			sb.append(address);
		}
		if (course != null) {

			sb.append(course);

		}

		return sb.toString();
	}

}
