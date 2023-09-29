public class StudentReportCard {
    public static void main(String[] args) {
        String[] studentNames = { "Alice", "Bob", "Charlie" };
        String[] subjects = { "Math", "Science", "History" };
        int[][] grades = {
            { 85, 92, 78 },
            { 90, 88, 75 },
            { 78, 85, 92 }
        };

        System.out.println("Student Report Card");
        System.out.println("====================");

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Student: " + studentNames[i]);

            for (int j = 0; j < subjects.length; j++) {
                System.out.println(subjects[j] + ": " + grades[i][j]);
            }

            int totalScore = 0;
            for (int score : grades[i]) {
                totalScore += score;
            }

            double averageScore = (double) totalScore / subjects.length;
            System.out.println("Average Score: " + averageScore);
            System.out.println("====================");
        }
    }
}
