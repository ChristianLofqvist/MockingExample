package com.example.bowling;

public class Game {

    int score = 0;
    private int rolls = 0;
    boolean strike = false;

    public int score(){
        return score;
    }

    public void roll(int pins) {
        if(rolls == 2 && score == 10){
                score += pins;
        }

        if(strike){
            score += pins;
            strike = false;
        }

        if(rolls == 1 && score == 10){
            score += pins;
            strike = true;
        }

        score += pins;
        rolls++;

    }
}