package com.example.bowling;

public class Game {

    private int score = 0;
    private int rolls = 0;
    boolean strike = false;
    private int frameScore = 0;
    private int frameCount = 0;

    public int score() {
        return score;
    }

    public void roll(int pins) {
        if (ifTenthFrame(pins)) return;
        strikeBonus(pins);
        ifSpare(pins);
        ifStrike(pins);
        resetFrameScore();

        frameScore += pins;
        score += pins;
        rolls++;
    }

    private void ifStrike(int pins) {
        if (rolls == 1 && frameScore == 10) {
            score += pins;
            strike = true;
            frameScore = 0;
            rolls = 0;
            frameCount++;
        }
    }

    private void resetFrameScore() {
        if (rolls == 2) {
            rolls = 0;
            frameScore = 0;
            frameCount++;
        }
    }

    private void ifSpare(int pins) {
        if (rolls == 2 && frameScore == 10) {
            score += pins;
            frameScore = 0;
            rolls = 0;
            frameCount++;
        }
    }

    private boolean ifTenthFrame(int pins) {
        if (frameCount == 9) {
            frameScore += pins;
            score += pins;
            rolls++;
            return true;
        }
        return false;
    }

    private void strikeBonus(int pins) {
        if (strike) {
            score += pins;
            strike = false;
        }
    }
}