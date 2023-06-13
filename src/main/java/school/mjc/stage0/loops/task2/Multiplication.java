package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int counter = 0;
        if (multiplyByAndToInclusive < 0) {
            while (counter <= -multiplyByAndToInclusive) {
                System.out.println(multiplyByAndToInclusive * counter);
                counter++;
            }
        }
        while (counter <= multiplyByAndToInclusive && multiplyByAndToInclusive != 0) {
            System.out.println(multiplyByAndToInclusive * counter);
            counter++;
        }


        }

    }


//Write a program that will write to console multiplied numbers by input from
// zero to the number from method arguments using while loop,
// each on new line(program should also be able to work with negatives):