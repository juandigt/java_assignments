package exercises;

public class Main {

    public static void main(String[] args) {
        AsteriskExercises printAsterisk = new AsteriskExercises();

        System.out.println("Print asterisk");
        String result = printAsterisk.getAsterisk();
        System.out.println(result  + "\n");

        System.out.println("Print horizontal line");
        result = printAsterisk.getHorizontalLine(4);
        System.out.println(result);

        System.out.println("Print vertical line");
        result = printAsterisk.getVerticalLine(4);
        System.out.println(result);

        System.out.println("Print isosceles triangle");
        result = printAsterisk.getTopTriangle(4);
        System.out.println(result);

    }
}
