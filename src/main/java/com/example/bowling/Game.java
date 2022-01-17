package com.example.bowling;

public class Game {

    int score = 0;
    private int rolls = 0;
    boolean strike = false;
    int frameScore = 0;
    int frameCount = 0;

    public int score(){
        return score;
    }

    public void roll(int pins) {
        if(frameCount == 9){
            frameScore += pins;
            score += pins;
            rolls++;
            return;
        }


        if(rolls == 2 && frameScore == 10){
                score += pins;
                frameScore = 0;
                rolls = 0;
                frameCount++;
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
            frameCount++;
        }

        if(rolls == 2) {
            rolls = 0;
            frameScore = 0;
            frameCount++;
        }

        frameScore += pins;
        score += pins;
        rolls++;
    }
}