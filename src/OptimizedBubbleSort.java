/**
 * Created by ajana on 4/5/2017.
 */
public class OptimizedBubbleSort {
    int[] optimizedSort(int [] arrayInput){
        boolean flag= true;
        int j,temp;

        while (flag){
            flag=false;
            for(j=0;j<arrayInput.length-1;j++)
            {
                if(arrayInput[j]>arrayInput[j+1]){
                    temp=arrayInput[j];
                    arrayInput[j]=arrayInput[j+1];
                    arrayInput[j+1]=temp;
                    flag=true;//shows swap occured
                }
            }
        }

        return arrayInput;
    }
}
