public class main {
    public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();
        double average = gc.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = gc.getLetterGrade(average);

        gc.displayResult("John Smith", average);
        gc.displayResult("John Smith", average, letterGrade);
    }
}
