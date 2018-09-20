package test;

import exercises.PrimeFactor;
import org.junit.Test;

import java.util.ArrayList;

public class PrimeFactorTest {

    @Test

    public void primeFactorTest() {
        PrimeFactor objeto = new PrimeFactor();
        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();


        myList = objeto.factorizar(0);
        assert(myList.equals(expected));

        myList = objeto.factorizar(1);
        assert(myList.equals(expected));

        myList = objeto.factorizar(30);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        //expected = new ArrayList<>(Arrays.asList(2,3,5));
        assert(myList.equals(expected));


    }

}