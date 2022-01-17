package com.example.bowling;

public class Game {

    int score = 0;

    public int score(){
        return score;
    }

    public void roll(int pins) {
        score += pins;
    }
}
