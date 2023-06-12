package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int num = 0;

        while(num <= multiplyByAndToInclusive){

         int   multiplyResult = num * multiplyByAndToInclusive;

         System.out.println(multiplyResult);

         num++;

        }

    }
}

//Write a program that will write to console multiplied numbers by input from
// zero to the number from method arguments using while loop,
// each on new line(program should also be able to work with negatives):