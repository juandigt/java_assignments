package test;
import org.junit.Test;
import exercises.AsteriskExercises;
    public class AsteriskExercisesTest {

        @Test
        public void printAsteriskTest() {
            AsteriskExercises printAsterisk = new AsteriskExercises();
            String asterisk = printAsterisk.getAsterisk();
            assert(asterisk.equals("*"));
        }

        @Test
        public void writeAsteriskInLineTest(){
            AsteriskExercises printAsterisk = new AsteriskExercises();
            AsteriskExercises obj = new AsteriskExercises();
            String resultado = obj.getHorizontalLine(-2);
            assert(resultado.equals("\n"));

            resultado = obj.getHorizontalLine(0);
            assert(resultado.equals("\n"));

            resultado = obj.getHorizontalLine(4);
            assert(resultado.equals("****\n"));
        }

        @Test

        public void writeVerticalLineTest(){

            AsteriskExercises obj = new AsteriskExercises();
            String result = obj.getVerticalLine(-2);
            assert(result.equals(""));

            result = obj.getVerticalLine(0);
            assert(result.equals(""));

            result = obj.getVerticalLine(3);
            assert(result.equals("*\n" + "*\n" + "*\n"));
        }

        @Test

        public void writeTriangleTest(){

            AsteriskExercises obj = new AsteriskExercises();
            String result = obj.getTriangle(-2);
            assert(result.equals(""));

            result = obj.getTriangle(0);
            assert(result.equals(""));

            result = obj.getTriangle(3);
            assert(result.equals("*\n" + "**\n" + "***\n"));
        }

        @Test

        public void writeTopTriangleTest(){

            AsteriskExercises obj = new AsteriskExercises();
            String result = obj.getTopTriangle(-2);
            assert(result.equals(""));

            result = obj.getTopTriangle(0);
            assert(result.equals(""));

            result = obj.getTopTriangle(3);
            assert(result.equals("  *\n" + " ***\n" + "*****\n"));
        }
}
