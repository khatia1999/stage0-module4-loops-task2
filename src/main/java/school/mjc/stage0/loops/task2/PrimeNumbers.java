package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int num = 0;

        while(num <= printToInclusive){
            if(num % 2 !=0) {
                System.out.println("Prime number:" + num);
            } else{
                System.out.println("Not a prime number:" + num);
            }
        }

    }
}

//Write a program that will write to console all simple numbers from 0 up to input from method arguments using while loop, each on new line: