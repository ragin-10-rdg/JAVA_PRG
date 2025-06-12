package week4;
public class StudentGradeCalculator {
    public double calculateFinalGrade(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        return average;
    }

    // Main method to test
    public static void main(String[] args) {
        StudentGradeCalculator calculator = new StudentGradeCalculator();

        // Example marks for 5 subjects
        int[] marks = {85, 90, 78, 88, 92};

        double finalGrade = calculator.calculateFinalGrade(marks);
        System.out.println("Final Grade: " + finalGrade);
    }
}
