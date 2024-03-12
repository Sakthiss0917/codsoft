import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countsubj = 6;

        System.out.println("Enter marks obtained in each subject:");
        char grade;
        int totalmarks = 0;
        for (int i= 1; i <= countsubj; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalmarks += marks;
        }

        float averagePercentage = (float) totalmarks / countsubj;

        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + averagePercentage);

        if (averagePercentage >= 90 ) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
        if (averagePercentage < 60) {
            System.out.println("Candidate has failed in this attempt with " + grade + " grade");
        }
        else{
            System.out.println("Candidate has passed in this attempt with " + grade + " grade");
        }
        scanner.close();
    }
}