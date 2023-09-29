public class GradeBook {
    public static void main(String[] args) {
        String[] studentNames = { "Alice", "Bob", "Charlie", "David", "Eve" };
        int[] studentScores = { 85, 92, 78, 88, 95 };
        char[] studentGrades = new char[studentNames.length];

        for (int i = 0; i < studentScores.length; i++) {
            int score = studentScores[i];
            char grade;

            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            studentGrades[i] = grade;
            System.out.println(studentNames[i] + ": " + grade);
        }
    }
}
