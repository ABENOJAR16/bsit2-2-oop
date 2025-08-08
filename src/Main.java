public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "BSIT", 85.0, 90.0, 88.0);
        Student s2 = new Student("Bob", 19, "BSCS", 92.0, 95.0, 89.0);
        Student s3 = new Student("Charlie", 21, "BSIT", 65.0, 70.0, 68.0);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student s : students) {
            System.out.println("\nStudent Information:");
            s.displayInfo();
            double average = s.calculateAverage();
            System.out.printf("Average: %.2f\n", average);
            String letterGrade = s.getLetterGrade();
            System.out.println("Letter Grade: " + letterGrade);

            if (s.isPassing()) {
                System.out.println("Status: PASSING");
                passingCount++;
            } else {
                System.out.println("Status: FAILING");
            }
        }

        System.out.println("\nSummary: " + passingCount + " out of " + students.length + " students are passing.");
    }
}