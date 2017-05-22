import java.util.Date;
import java.util.List;

/**
 * Created by qngapparat on 22.05.17.
 */
public class GenericSortTest {

    public static void main(String[] args){

        System.out.println("ayy");
        List<Integer> listI= GenericSort.createRandomList(new RandomizedInteger(), 7);
        GenericSort.bubbleSort(listI);
        List<Double> listD = GenericSort.createRandomList(new RandomizedDouble(), 8);
        GenericSort.bubbleSort(listD);
        List<Credential> listC = GenericSort.createRandomList(new RandomizedCredential(), 4);
        List<Date> listDt = GenericSort.createRandomList(new RandomizedDate(), 3);
        //GenericSort.bubbleSort(listDt);

        System.out.println(listI.toString());
        System.out.println(listD.toString());
        System.out.println(listC.toString());
        System.out.println(listDt.toString());
        System.out.println("terminating");
    }
}
