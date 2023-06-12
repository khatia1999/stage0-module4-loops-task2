package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {

        int num = 0;
        while(0 <= lastPrinted){
            System.out.println(lastPrinted);
            lastPrinted++;
        }

    }
}

//Write a program that will write to console numbers from zero to the number
// from method arguments using while loop, each on new line: