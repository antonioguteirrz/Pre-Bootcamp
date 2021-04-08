package DojoAssignments.JavaFun.Basics;

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
        int [] y ;
        for(int i = 0; i<number;i++){
            y [i] = i;
        }

    }
}
