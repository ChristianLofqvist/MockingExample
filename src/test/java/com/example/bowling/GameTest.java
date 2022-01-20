package com.example.bowling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    @DisplayName("Checking score should return current score")
    void scoreShouldReturnScore() {
        Game game = new Game();

        var result = game.score();

        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Checking score should return number of pins knocked down")
    void scoreAfterOneRoll() {
        Game game = new Game();

        game.roll(5);
        var result = game.score();

        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("Checking score should return correct score after two rolls")
    void scoreAfterTwoRolls() {
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

    @Test
    @DisplayName("Checking score should return correct score after strike")
    void scoreAfterStrike() {
        Game game = new Game();

        game.roll(10);
        game.roll(7);
        game.roll(1);
        var result = game.score();

        assertThat(result).isEqualTo(26);
    }

    @Test
    @DisplayName("Checking score should return correct score rolling several times after strike")
    void scoreAfterSeveralRolls() {
        Game game = new Game();

        game.roll(10);
        game.roll(7);
        game.roll(1);
        game.roll(1);
        var result = game.score();

        assertThat(result).isEqualTo(27);
    }

    @Test
    @DisplayName("Checking score should return correct score rolling several spares")
    void scoreAfterSeveralSpares() {
        Game game = new Game();

        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(7);
        game.roll(2);
        var result = game.score();

        assertThat(result).isEqualTo(41);
    }

    @Test
    @DisplayName("Checking score should return correct score rolling several strikes")
    void scoreAfterSeveralStrikes() {
        Game game = new Game();

        game.roll(10);
        game.roll(10);
        game.roll(5);
        game.roll(2);
        var result = game.score();

        assertThat(result).isEqualTo(49);
    }

    @Test
    @DisplayName("Checking score should return correct score rolling spare after several strikes")
    void scoreAfterSeveralStrikesAndThenSpare() {
        Game game = new Game();

        game.roll(10);
        game.roll(10);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(2);
        var result = game.score();

        assertThat(result).isEqualTo(67);
    }

    @Test
    @DisplayName("Checking score should return correct score rolling strike after several strikes and spare")
    void scoreAfterSeveralStrikesAndSpareAndThenStrike() {
        Game game = new Game();

        game.roll(10);
        game.roll(10);
        game.roll(5);
        game.roll(5);
        game.roll(10);
        game.roll(2);
        game.roll(0);
        var result = game.score();

        assertThat(result).isEqualTo(79);
    }

    @Test
    @DisplayName("Checking score should return correct score after ten frames played")
    void scoreAfterTenFrames() {
        Game game = new Game();

        game.roll(10);
        game.roll(10);
        game.roll(5);
        game.roll(5);
        game.roll(10);
        game.roll(2);
        game.roll(0);
        game.roll(9);
        game.roll(0);
        game.roll(7);
        game.roll(3);
        game.roll(4);
        game.roll(2);
        game.roll(7);
        game.roll(1);
        game.roll(0);
        game.roll(10);
        game.roll(2);
        var result = game.score();

        assertThat(result).isEqualTo(128);
    }

    @Test
    @DisplayName("Checking score should return correct score after nine frames with strike")
    void scoreAfterNineFramesWithStrike() {
        Game game = new Game();

        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(1);
        game.roll(1);
        var result = game.score();

        assertThat(result).isEqualTo(245);
    }

    @Test
    @DisplayName("Checking score should return correct score after nine frames with spare")
    void scoreAfterNineFramesWithSpare() {
        Game game = new Game();

        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(1);
        game.roll(1);
        var result = game.score();

        assertThat(result).isEqualTo(133);
    }
}

