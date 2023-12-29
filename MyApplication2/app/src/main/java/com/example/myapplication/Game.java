package com.example.myapplication;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private String answer;
    private boolean win = false;
    //    getter
    String getAnswer() {
        return answer;
    }
    boolean isWin() {
        return win;
    }
    //    function

    public void generateAnswer() {
        ArrayList<Character> list = new ArrayList<>();
        for (char digit = '0'; digit <= '9'; digit++) {
            list.add(digit);
        }

        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(list.size());
            char selectedDigit = list.remove(index);
            result.append(selectedDigit);
        }

        answer = result.toString();
    }

    String checkAnswer(String guess){
        int a = 0, b = 0;
        boolean[] answerUsed = {false,false,false,false};
        boolean[] guessUsed = {false,false,false,false};
        for(int i = 0; i < 4; i++)
        {
            if(guess.charAt(i)==answer.charAt(i)) {
                answerUsed[i]=true;
                guessUsed[i]=true;
                a++;
            }
            System.out.println();
        }
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++) {
                if (!guessUsed[i] && !answerUsed[j] && guess.charAt(i) == answer.charAt(j)) {
                    answerUsed[j] = true;
                    guessUsed[i] = true;
                    b++;
                    break;
                }
            }
        }
        String result = a + "A" + b + "B";
        if(a==4)
        {
            win = true;
        }
        return result;
    }
}
