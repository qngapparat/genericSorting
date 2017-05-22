import java.util.ArrayList;
import java.util.List;

/**
 * Created by qngapparat on 22.05.17.
 */
public class GenericSort<T extends Comparable> {


    public static <T> List<T> createRandomList(Randomized<T> entity, int length){

        List<T> myList = new ArrayList<>();
        for(int i = 0; i < length; i++){
            myList.add(entity.getNextRandomized());
        }

        return myList;
    }

    private static <E> void swap (List<E> myList, int a, int b){
        //swap elements in list myList with index a and b
        E temp = myList.get(a);
        myList.set(a, myList.get(b));
        myList.set(b, temp);

    }

    public static <E extends Comparable<E>> void bubbleSort(List<E> myList){

        boolean success = false;
        //bubble sort
        while(!success){
            success = true;
            for(int i = 0; i < myList.size()-1; i++){
                if((myList.get(i).compareTo(myList.get(i + 1))) < 1)  {
                    swap(myList, i, i+1);
                    success = false;
                }
            }
        }

    }


}

