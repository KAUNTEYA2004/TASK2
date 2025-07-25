package IF_ELSE;
import java.util.Scanner;
public class grade_according_to_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("finding the grade of student according to their percentage->");

        System.out.println("enter number of subjects->");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("enter the marks of student in each subject->");
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }

        int den = n*100;

        double p;
        double total_marks = 0;

        for(int i=0;i<n;i++){
            total_marks += marks[i];
        }

        System.out.println("total marks of student are:"+total_marks);

        p = (total_marks/den)*100;
        System.out.println("percentage of student is:"+p);
        System.out.print("grade of student is:");
        if (p >= 91 && p <= 100) {
            System.out.println("excellent");
        }
        else if (p >= 81 && p <= 91) {
            System.out.println("very good");
        }
        else if (p >= 71 && p <= 80) {
            System.out.println("good");
        }
        else if (p >= 61 && p <= 70) {
            System.out.println("can do better");
        }
        else if (p >= 51 && p <= 60) {
            System.out.println("average");
        }
        else if (p >= 41 && p <= 50) {
            System.out.println("below average");
        }
        else {
            System.out.println("fail");
        }
    }
}
