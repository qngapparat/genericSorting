import java.util.Date;
import java.util.Random;

/**
 * Created by qngapparat on 22.05.17.
 */
public class RandomizedDate implements Randomized<Date>{

    public Date getNextRandomized(){

        //1. january 1940
        long startTime = -946771200000L;

        //create a time of up to 70 years (random time mod 70 years) to add
        Random rand = new Random(487586);
        long addTime = (Math.abs(rand.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));

        //add fixed and random long and convert to Date
        long randomTime = startTime + addTime;
        return new Date(randomTime);


    }
}
