package exercises;

import org.junit.Test;

public class DiamondExercisesTest {


    @Test

    public void printTopTriangleTest(){

        DiamondExercises obj = new DiamondExercises();
        String result = obj.getTopTriangle(-2);
        assert(result.equals(""));

        result = obj.getTopTriangle(0);
        assert(result.equals(""));

        result = obj.getTopTriangle(3);
        assert(result.equals("  *\n" + " ***\n" + "*****\n"));
    }

    @Test

    public void printBottomTriangleTest(){

        DiamondExercises obj = new DiamondExercises();
        String result = obj.getBottomTriangle(-2);
        assert(result.equals(""));

        result = obj.getBottomTriangle(0);
        assert(result.equals(""));

        result = obj.getBottomTriangle(3);
        assert(result.equals(" ***\n" + "  *\n" + "   \n"));
    }

    @Test

    public void printDiamondTest(){

        DiamondExercises obj = new DiamondExercises();
        String result = obj.getDiamondTriangle(-2);
        assert(result.equals(""));

        result = obj.getDiamondTriangle(0);
        assert(result.equals(""));

        result = obj.getDiamondTriangle(3);
        assert(result.equals("  *\n" + " ***\n" + "*****\n" +" ***\n" + "  *\n" + "   \n" ));
    }

    @Test

    public void printDiamondWithNameTest(){

        DiamondExercises obj = new DiamondExercises();
        String result = obj.getDiamondWhithNAme(-2, "Juandi");
        assert(result.equals(""));

        result = obj.getDiamondWhithNAme(0, "Juandi");
        assert(result.equals(""));

        result = obj.getDiamondWhithNAme(3, "Juandi");
        assert(result.equals("  *\n" + " ***\n" + "*****\n" + "Juandi\n" +" ***\n" + "  *\n" + "   \n" ));
    }



}