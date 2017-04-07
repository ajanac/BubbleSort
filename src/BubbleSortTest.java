import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ajana on 4/5/2017.
 */
public class BubbleSortTest {
    @Test
    public  void test(){
        BubbleSort bs=new BubbleSort();
        int[]testArray={6,5,3,2};
        int[]expected={2,3,5,6};
        int []result=bs.buSort(testArray);
        assertArrayEquals(expected,result);

    }

}