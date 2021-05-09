package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
/*
This class represents a score that can be inputted into the scoreboard. A score is defined by the players name,
score, and the date.
 */

public class Score {

    // Fields:
    public String playerName;
    public int score;
    public String date;

    // Score constructors:
    Score(String playerName, int score, String date) {
        this.playerName = playerName;
        this.score = score;
        this.date = date;
    }

    public Score() {

    }

    // This method is used to write a score (player name, score, date) into a .txt file.
    public void writeToFile(BufferedWriter bw) throws IOException {
        bw.write("Player name: " + playerName + "\r");
        bw.write("Score: " + Integer.toString(score) + "\r");
        bw.write("Date: " + date + "\r");
        bw.write("\r");
    }

    // This method is meant to read the components of the .txt file so they can be retrieved.
    public boolean readFromFile(BufferedReader br) throws IOException {

        String line = br.readLine();
        if (line == null) {
            return false;
        }

        playerName = line.substring(13);
        line = br.readLine();
        line = line.substring(7);
        score = Integer.parseInt(line);
        date = br.readLine().substring(6);
        br.readLine();

        return true;
    }

    // Getters for player name, score, and date:
    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return "Name: " + playerName + "\tScore: " + score + "\tDate: " + date;
    }
}
