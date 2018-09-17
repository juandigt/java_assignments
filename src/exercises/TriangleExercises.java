package exercises;

public class TriangleExercises {


    public String getAsterisk() {

        return "*";
    }

    public String getHorizontalLine(int n) {
        String line = "";

        for (int i = 0; i < n; i++) {
            line += this.getAsterisk();
        }

        return line + "\n";
    }

    public String getVerticalLine(int n) {
        String line = "";

        for (int i = 0; i < n; i++) {
            line += this.getAsterisk() + "\n";
        }

        return line;
    }

    public String getTriangle(int n) {
        String triangle = "";

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                triangle += this.getAsterisk();
            }
            triangle += "\n";
        }

        return triangle;
    }

}