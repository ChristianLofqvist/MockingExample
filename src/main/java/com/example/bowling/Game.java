package com.example.bowling;

public class Game {

    int score = 0;
    private int rolls = 0;
    boolean strike = false;
    int frameScore = 0;

    public int score(){
        return score;
    }

    public void roll(int pins) {
        if(rolls == 2 && frameScore == 10){
                score += pins;
                frameScore = 0;
                rolls = 0;
        }

        if(strike){
            score += pins;
            strike = false;
        }

        if(rolls == 1 && frameScore == 10){
            score += pins;
            strike = true;
            frameScore = 0;
            rolls = 0;
        }

        frameScore += pins;
        score += pins;
        rolls++;

    }
}