package DojoAssignments.JavaFun.FizzBuzz;

public class FizzBuzz {
    public String fizzBuzz(int number){
        if(number%3==0 && number%5 ==0){
            return "FizzBuzz";
        }
        if(number%3 == 0){
            return "Fizz";
        }
        if(number%5 == 0){
            return "Buzz";
        }
    return "Number was not divisible by 3 or 5";
        
    }

}

//Write a program that will take an integer and print Fizz if the number is 
//divisible by 3, Buzz if the number is divisible by 5, FizzBuzz if the number 
//is divisible by 3 and 5, and the number itself for all other cases.