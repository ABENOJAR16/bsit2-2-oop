public class GradeCalculator {

    // Method to calculate the average of grades
    public double calculateAverage(double... grades) {
        if (grades.length == 0) {
            return 0.0; // Return 0.0 if no grades are provided
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to determine the letter grade based on the average
    public String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student name and average only
    public void displayResult(String studentName, double average) {
        System.out.println("Student: " + studentName + ", Average: " + average);
    }

    // Method to display student name, average, and letter grade
    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.println("Student: " + studentName + ", Average: " + average + ", Grade: " + letterGrade);
    }
}