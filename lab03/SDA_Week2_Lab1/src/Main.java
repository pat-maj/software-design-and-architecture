public class Main {
	public static void main(String[] args) {

		// Create a fully populated student

		Student fullyPopulatedStudent = new Student("FullyPop", 21, new Address("House", "Street", "City", "M1 1MN"),
				new Course("Software Engineering", "SWE001", 360));

		Student partiallyPopulatedStudent = new Student("PartialPop", 22, new Address("House", null, null, "M2 2MN"),
				null);

		Student minimallyPopulatedStudent = new Student("MinimumPop", 23);

		// Tests
		displayStudent(fullyPopulatedStudent);
		System.out.println();
		displayStudent(partiallyPopulatedStudent);
		System.out.println();
		displayStudent(minimallyPopulatedStudent);

	}

	public static void displayStudent(Student student) {
		System.out.print(student);

	}

}
