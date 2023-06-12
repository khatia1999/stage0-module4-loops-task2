package school.mjc.stage0.loops.task2;

import java.lang.foreign.SymbolLookup;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {

        int num = 1;

        while(num <= printTillInclusive){

            if(printTillInclusive % 2 == 0){
                System.out.println("even number : " + num);
            } else{
                System.out.println("not even numbers :" + num);
            }

            num++;
        }

    }
}

//Write a program that will write to console even numbers from zero to the number from method arguments using while loop, each on new line:
