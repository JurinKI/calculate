import java.util.Scanner;
public class CalculateGrademedo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.print("Input Score ");
        int score = in.nextInt();
        CalculateGradeTest c = new CalculateGradeTest(score);
        System.out.println("grade "+c.calcuate());
    }
}
