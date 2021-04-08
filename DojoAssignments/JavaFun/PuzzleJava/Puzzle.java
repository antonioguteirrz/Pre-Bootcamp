package DojoAssignments.JavaFun.PuzzleJava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
import java.lang.Math;


public class Puzzle {
    public ArrayList arrGreaterThanTen(int [] arr){
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]>10){
                arr2.add(arr[i]);
            }
        }
        return arr2;
    }
    public ArrayList arrShuffle(String [] arr){
        ArrayList<String> arr2 = new ArrayList<String>();
        List<String> list = Arrays.asList(arr);
        Collections.shuffle(list);
        for(int i =0;i<arr.length;i++){
            System.out.println(list.get(i));    
        if(arr[i].length()>5){
            arr2.add(arr[i]);
        }
        }
        return arr2;
    }
    public void createArray(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        List<String> apl = Arrays.asList(alphabet);
        Collections.shuffle(apl);
        System.out.println(Arrays.toString(alphabet));
        if(alphabet[0]== "a"|| alphabet[0] == "e"|| alphabet[0] == "i"|| alphabet[0] =="o"|| alphabet[0] =="u"){
            System.out.println("We made it");
        }
    }
    public int[] generateRandNumb(){
        int [] arr = new int[10];
        int low = 55;
        int high = 100;
        Random r = new Random();
        for(int i = 0;i<arr.length;i++){
            arr[i] = r.nextInt(high-low) + low;
        }
        return arr;
    }

    public ArrayList generateRandNumSort(){
        ArrayList<Integer> arr =new ArrayList<Integer>();
        int low = 55;
        int high = 100;
        Random r = new Random();
        for(int i = 0;i<10;i++){
            arr.add(r.nextInt(high-low) + low);
        }
        Collections.sort(arr);
        
        return arr;
    }
    public void randomStringFive(){
        
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    StringBuilder sb = new StringBuilder();

    Random random = new Random();
    int length = 5;
    for(int i = 0; i < length; i++) {
    int index = random.nextInt(alphabet.length());
    char randomChar = alphabet.charAt(index);
    sb.append(randomChar);
    }
    String randomString = sb.toString();
    System.out.println("Random String is: " + randomString);

}
public ArrayList randomStringFiveArray(){
    ArrayList<String> arr = new ArrayList<String>();
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    int length = 5;
    for(int i = 0; i < length; i++) {
    int index = random.nextInt(alphabet.length());
    char randomChar = alphabet.charAt(index);
    sb.append(randomChar);
    }
    String randomString = sb.toString();
    for(int i = 0; i<10;i++){
        arr.add(randomString);
    }
    

    return arr;

}

}
