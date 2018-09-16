package exercises;

public class AsteriskExercises {


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

    public String getTopTriangle(int n) {
        String triangle = "";

        int espacios = n - 1;
        int asteriscos = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < espacios; j++) {
                triangle += " ";
            }
            for (int k = 0; k < asteriscos; k++) {
                triangle += this.getAsterisk();
            }
            triangle += "\n";
            espacios--;
            asteriscos += 2;
        }

        return triangle;
    }

    public String getBottomTriangle(int n) {
        String triangle = "";

        int espacios = 0;
        int asteriscos = n;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < espacios + 1; j++) {
                triangle += " ";
            }
            for (int k = 0; k < asteriscos; k++) {
                triangle += this.getAsterisk();
            }
            triangle += "\n";
            espacios++;
            asteriscos -= 2;
        }
        return triangle;

    }
}