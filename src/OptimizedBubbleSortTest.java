import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ajana on 4/7/2017.
 */
public class OptimizedBubbleSortTest {
    @Test
    public void test(){
        OptimizedBubbleSort obj=new OptimizedBubbleSort();
        int[] testInput={6,5,3,2};
        int[] expectedResult={2,3,5,6};
        int[] result=obj.optimizedSort(testInput);
        assertArrayEquals(expectedResult,result);

    }

}