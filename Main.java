import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int testScore;
        int quizScore;
        int homeWork;
        double weeklyGrade;

        System.out.println("What is your test score (out of 100%)?");
        testScore = scnr.nextInt();
            if (testScore<0){
                System.out.print("ERROR! ONLY ENTER IN POSISITIVE NUMBERS!");
            }
        System.out.println("What is your quiz score (out of 100%?");
        quizScore = scnr.nextInt();
            if (quizScore < 0) {
                System.out.print("ERROR! ONLY ENTER IN POSISITIVE NUMBERS!");
            }

        System.out.println("What is your grade on your homework (out of 100%)?");
        homeWork = scnr.nextInt();
            if (homeWork < 0) {
                System.out.print("ERROR! ONLY ENTER IN POSISITIVE NUMBERS!");
            }

        weeklyGrade = (testScore * 0.50) + (quizScore * 0.25) + (homeWork * 0.25);
        System.out.println("Your calculated weekly grade is " + weeklyGrade + "%.");

            if (weeklyGrade >= 90) {
                System.out.print("Congratulations! You have an A! Keep up the good work!");
            }



    }
}
