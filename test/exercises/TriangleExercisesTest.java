package test;
import org.junit.Test;

import exercises.TriangleExercises;

public class TriangleExercisesTest {

    @Test
    public void printAsteriskTest() {
        TriangleExercises printAsterisk = new TriangleExercises();
        String asterisk = printAsterisk.getAsterisk();
        assert(asterisk.equals("*"));
    }

    @Test
    public void printAsteriskInLineTest(){
        TriangleExercises printAsterisk = new TriangleExercises();
        TriangleExercises obj = new TriangleExercises();
        String resultado = obj.getHorizontalLine(-2);
        assert(resultado.equals("\n"));

        resultado = obj.getHorizontalLine(0);
        assert(resultado.equals("\n"));

        resultado = obj.getHorizontalLine(4);
        assert(resultado.equals("****\n"));
    }

    @Test

    public void printVerticalLineTest(){

        TriangleExercises obj = new TriangleExercises();
        String result = obj.getVerticalLine(-2);
        assert(result.equals(""));

        result = obj.getVerticalLine(0);
        assert(result.equals(""));

        result = obj.getVerticalLine(3);
        assert(result.equals("*\n" + "*\n" + "*\n"));
    }

    @Test

    public void printTriangleTest(){

        TriangleExercises obj = new TriangleExercises();
        String result = obj.getTriangle(-2);
        assert(result.equals(""));

        result = obj.getTriangle(0);
        assert(result.equals(""));

        result = obj.getTriangle(3);
        assert(result.equals("*\n" + "**\n" + "***\n"));
    }


}
