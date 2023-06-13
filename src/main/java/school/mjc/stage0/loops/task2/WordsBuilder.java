package school.mjc.stage0.loops.task2;

import java.io.StringWriter;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phraseBuilder = new StringBuilder();
        
        int index = 0;
        while (index < chars.length) {
            phraseBuilder.append(chars[index]);

            index++;

        }

        String phrase = phraseBuilder.toString();
        System.out.println(phrase);

    }
}


//Write a program that will build a phrase from given chars (char...). !HINT check length method in google!