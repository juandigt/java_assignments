package exercises;


import java.util.ArrayList;

public class PrimeFactor {
    //n = 30
    public ArrayList<Integer> factorizar(int n){

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++){
            while (n % i == 0){
                factors.add(i);
                n = n/i;
            }
        }

        return factors;

    }


}
