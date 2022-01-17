package com.example.bowling;

public class Game {

    int score = 0;
    private int rolls = 0;

    public int score(){
        return score;
    }

    public void roll(int pins) {
        if(rolls == 2 && score == 10){
                score += pins;
        }
        score += pins;
        rolls++;
    }
}