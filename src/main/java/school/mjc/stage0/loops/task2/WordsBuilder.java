package school.mjc.stage0.loops.task2;

import java.io.StringWriter;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0;
        while(i<chars.length)
        {
            System.out.print(chars[i]);
            i++;
        }

    }
}


//Write a program that will build a phrase from given chars (char...). !HINT check length method in google!