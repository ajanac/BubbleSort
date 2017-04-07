/**
 * Created by ajana on 4/5/2017.
 */
public class BubbleSort {
    public int[] buSort(int[]inputArray){
        int inputArrayLength=inputArray.length;
        int temp=0;
        for(int i=0;i<inputArrayLength;i++){//n-1 passes
            for(int j=1;j<inputArrayLength-i;j++){//n-i iterations
                if(inputArray[j-1]>inputArray[j]){

                    temp=inputArray[j-1];
                    inputArray[j-1]=inputArray[j];
                    inputArray[j]=temp;
                }
            }
        }
        return inputArray;
    }
}
