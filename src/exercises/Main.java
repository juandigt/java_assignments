package exercises;

public class Main {

    public static void main(String[] args) {
        TriangleExercises printTriangle = new TriangleExercises();
        DiamondExercises printDiamond = new DiamondExercises();

        System.out.println("Print asterisk");
        String result = printTriangle.getAsterisk();
        System.out.println(result  + "\n");

        System.out.println("Print horizontal line");
        result = printTriangle.getHorizontalLine(4);
        System.out.println(result);

        System.out.println("Print vertical line");
        result = printTriangle.getVerticalLine(4);
        System.out.println(result);

        System.out.println("Print isosceles triangle");
        result = printDiamond.getTopTriangle(4);
        System.out.println(result);

        System.out.println("Print diamond");
        result = printDiamond.getDiamondTriangle(3);
        System.out.println(result);

        System.out.println("Print diamond with name");
        result = printDiamond.getDiamondWhithNAme(3, "Juandi");
        System.out.println(result);


    }
}
