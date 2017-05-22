import java.util.Random;

/**
 * Created by qngapparat on 22.05.17.
 */
public class RandomizedDouble implements RandomizedNumber<Double>{

    public Double getNextRandomized(){

        Random rand = new Random();
        Double randDouble;

        while(true) {
            randDouble = rand.nextDouble();
            if(randDouble < MAX_NUMBER){
                return randDouble;
            }
        }

    }



}
