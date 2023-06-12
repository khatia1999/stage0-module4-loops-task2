package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int num = 1;
        int factorial =1;
        while(num <= printToInclusive){

            factorial *= num;
            System.out.println(factorial);

            num++;
        }

    }
}

//Write a program that will write to console all numbers from factorial row,
// from 0 up to input from method arguments using while loop, each on new line: