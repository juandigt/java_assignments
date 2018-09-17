package exercises;


public class DiamondExercises {

    public String getAsterisk() {

        return "*";
    }

    public String getTopTriangle(int n) {
        String triangle = "";

        int espacios = n-1;
        int asteriscos = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < espacios; j++) {
                triangle += " ";
            }
            for (int k = 0; k < asteriscos ; k++) {
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
        int asteriscos = n  ;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < espacios+1; j++) {
                triangle += " ";
            }
            for (int k = 0; k < asteriscos ; k++) {
                triangle += this.getAsterisk();
            }
            triangle += "\n";
            espacios++;
            asteriscos -= 2;
        }

        return triangle;
    }

    public String getDiamondTriangle( int n){
        String triangle;

        triangle =  this.getTopTriangle(n) + this.getBottomTriangle(n);

        return triangle;

    }

    public String getDiamondWhithNAme( int n, String name){
        String triangle;
        if (n > 0) {
            triangle =  this.getTopTriangle(n) + name + "\n"+ this.getBottomTriangle(n);
            return triangle;

        } else {

            triangle = "";
            return triangle;
        }


    }

}
