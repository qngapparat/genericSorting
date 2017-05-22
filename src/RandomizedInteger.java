import java.util.Random;

/**
 * Created by qngapparat on 22.05.17.
 */
public class RandomizedInteger implements RandomizedNumber<Integer> {

    public Integer getNextRandomized(){

        return new Random(399564).nextInt(MAX_NUMBER+1);

    }

    public Integer getNextRandomized(int digits){

        //for digits = n, it returns 10^(n-1), the lowest number with n digits.
        int lowBorder = 10^(digits - 1);

        //for lowborder = 100 (digits = 3), it returns 1000-1 = 999, the biggest number with 3 digits.
        int highBorder = (lowBorder * 10) -1;

        //calculate random number between lowBorder and highBorder:

        return lowBorder + ((highBorder - lowBorder) * (int)(new Random(334485).nextDouble()));

    }

}
