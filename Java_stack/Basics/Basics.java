package DojoAssignments.JavaFun.Basics;
import java.util.ArrayList;
import java.util.Arrays;
public class Basics{
    public void printNumber(int number){
        for(int i = 1; i<number;i++){
        System.out.println(i);}
    }

    public void printOddNumber(int number){
        for(int i = 1; i<number;i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
    public void printNumberSum(int number){
        int sum = 0;
        for(int i = 1; i<number;i++){
            sum = sum +i;
            System.out.printf("number:%s, Sum:%s \n",i,sum);
        }
    }
    public void printArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void printArrayMax(int arr[]){
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public void printArrayAverage(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
            
        }
        int average = sum/arr.length;
        System.out.println(average);
    }
    public void storeArrayY(int number){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0; i<number;i++){
            if(i%2==1){
            y.add(i);}
        }
        System.out.println(y);
    }
    public void printGreaterThanY( int arr[], int y){
        int count = 0;
    for(int i = 0;i<arr.length;i++){ 
        if(arr[i]>y){
            count++;
        }}
        System.out.println(count);
    }

    public void printSquareValues(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] *arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public void removeNegatives(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public void maxMinAverage(int arr[]){
        double [] arr2 = new double[3];
        int sum = 0;
        int max=0;
        int min=0;
        for(int i = 0; i < arr.length; i++){

            sum = sum + arr[i];
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }

        }
        arr2[0]=max;
        arr2[1]=min;
        arr2[2]= sum/arr.length;
        System.out.println(Arrays.toString(arr2));
    }
    public void shiftArray(int [] arr){
            System.arraycopy(arr, 1, arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
}
}