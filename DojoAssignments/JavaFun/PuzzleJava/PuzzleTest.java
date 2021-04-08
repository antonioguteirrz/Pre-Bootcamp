package DojoAssignments.JavaFun.PuzzleJava;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PuzzleTest {
    public static void main(String[]args){
        Puzzle numb = new Puzzle();
    
        // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
        //Print the sum of all numbers in the array. Also have the function 
        //return an array that only includes numbers that are greater than 10 
        //(e.g. when you pass the array above, it should return an array with the values of 13,25,32)
        // int [] arr = {3,5,1,2,7,9,8,13,25,32};
        // ArrayList<Integer> arrlist = new ArrayList<Integer>();
        // arrlist = numb.arrGreaterThanTen(arr);
        // System.out.println(arrlist);

        // Create an array with the following values: Nancy, Jinichi, Fujibayashi, 
        //Momochi, Ishikawa. Shuffle the array and print the name of each person. 
        //Have the method also return an array with names that are longer than 5 characters.
        //String [] arr = {"Nancy", "Jinichi", "Fujibayashi","Momochi", "Ishikawa"};
        //System.out.println(numb.arrShuffle(arr));
        
        // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        //Shuffle the array and, after shuffling, display the last letter from the array. Have it also 
        //display the first letter of the array. If the first letter in the array is a vowel, have it 
        //display a message.
        //numb.createArray();


        //Generate and return an array with 10 random numbers between 55-100.
        //System.out.println(Arrays.toString(numb.generateRandNumb()));


        //Generate and return an array with 10 random numbers between 55-100 and have it be sorted 
        //(showing the smallest number in the beginning). Display all the numbers in the array. 
        //Next, display the minimum value in the array as well as the maximum value.
        //System.out.println(numb.generateRandNumSort());
        //numb.randomStringFive();

        //Generate an array with 10 random strings that are each 5 characters long
        System.out.println(numb.randomStringFiveArray());

    }
    
}
