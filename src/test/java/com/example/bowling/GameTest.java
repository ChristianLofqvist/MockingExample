package com.example.bowling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    @DisplayName("Checking score should return current score")
    void scoreShouldReturnScore(){
        Game game = new Game();

        var result = game.score();

        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Checking score should return number of pins knocked down")
    void scoreAfterOneRoll(){
        Game game = new Game();

        game.roll(5);
        var result = game.score();

        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("Checking score should return correct score after two rolls")
    void scoreAfterTwoRolls(){
        Game game = new Game();

        game.roll(5);
        game.roll(4);
        var result = game.score();

        assertThat(result).isEqualTo(9);
    }

    @Test
    @DisplayName("Checking score should return correct score after spare")
    void scoreAfterSpare() {
        Game game = new Game();

        game.roll(6);
        game.roll(4);
        game.roll(3);
        var result = game.score();

        assertThat(result).isEqualTo(16);
    }
}

