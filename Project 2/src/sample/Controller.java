package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.*;

public class Controller {
    public ListView scoreboardList;
    public TextField textPlayerName;
    public TextField textScore;
    public TextField textDate;
    public Button buttonSubmitScore;
    public Button buttonLoadScore;
    public Button buttonSaveScore;
    public Label labelFirstNumber;
    public Button buttonGetNumber;
    public Button buttonAddNumber;
    public Label labelAddedNumber;
    public Label labelNewScore;
    public Label labelYouLost;
    public Label labelFinalScore;
    public Button buttonPlayAgain;
    public Button buttonDone;

    /*
    When a player wants to submit their score, they press the "Submit Score" button and it runs this method. It takes
    the text that the player has submitted into the "Name", "Score", and "Date" text fields and adds them to the scoreboard
    as one Score.
     */
    public void submitScore(ActionEvent actionEvent) {
        String playerName = textPlayerName.getText();
        int score = Integer.parseInt(textScore.getText());
        String date = textDate.getText();

        Score newScore = new Score(playerName, score, date);
        scoreboardList.getItems().add(newScore);

        textPlayerName.clear();
        textScore.clear();
        textDate.clear();
    }

    /*
    When the player presses the "Save Scores" button, this method is run. It takes the submitted score from the scoreboard
    and uses the Score.writeToFile to add the score to the .txt file.
     */
    public void saveScore(ActionEvent actionEvent) throws IOException {
        ObservableList<Score> scoreList = scoreboardList.getItems();
        FileWriter fw = new FileWriter("Scoreboard.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (Score example : scoreList) {
            example.writeToFile(bw);
        }
        bw.close();

        scoreboardList.getItems().clear();
    }

    /*
    When the player presses the "Load Scores" button, this method runs. It reads from the .txt file and uses the
    Score.readFromFile method to add the scores from the .txt file to the scoreboard.
     */
    public void loadScore(ActionEvent actionEvent) throws IOException {
        FileReader fr = new FileReader("Scoreboard.txt");
        BufferedReader br = new BufferedReader(fr);
        boolean endOfFile = true;

        while (endOfFile) {
            Score example = new Score();
            if (example.readFromFile(br)) {
                scoreboardList.getItems().add(example);
            } else {
                endOfFile = false;
            }
        }
    }

    // When the "Get Number" button is pressed, it runs this method. It generates a random number from 1 to 20.
    public void getFirstNumber(ActionEvent actionEvent) {
        int number = (int) ((Math.random() * 19 + 2));
        labelFirstNumber.setText(String.valueOf(number));
        buttonGetNumber.setDisable(true);
        buttonAddNumber.setDisable(false);
    }

    /*
     This method is run when the player clicks the "Add Number" button. It generates a second number (1-20) and adds
     it onto the the new score. If the player clicks the button and it goes over 100, the player loses and the final score
     is set to 0.
     */
    public void addNumber(ActionEvent actionEvent) {
        if (!(labelFirstNumber.getText()).equals(String.valueOf(101)) && !(labelFirstNumber.getText()).equals(String.valueOf(102)) && !(labelFirstNumber.getText()).equals(String.valueOf(103)) && !(labelFirstNumber.getText()).equals(String.valueOf(104)) && !(labelFirstNumber.getText()).equals(String.valueOf(105)) && !(labelFirstNumber.getText().equals(String.valueOf(106))) && !(labelFirstNumber.getText()).equals(String.valueOf(107)) && !(labelFirstNumber.getText()).equals(String.valueOf(108)) && !(labelFirstNumber.getText()).equals(String.valueOf(109)) && !(labelFirstNumber.getText()).equals(String.valueOf(110)) && !(labelFirstNumber.getText()).equals(String.valueOf(111)) && !(labelFirstNumber.getText().equals(String.valueOf(112))) && !(labelFirstNumber.getText()).equals(String.valueOf(113)) && !(labelFirstNumber.getText()).equals(String.valueOf(114)) && !(labelFirstNumber.getText()).equals(String.valueOf(115)) && !(labelFirstNumber.getText()).equals(String.valueOf(116)) && !(labelFirstNumber.getText()).equals(String.valueOf(117)) && !(labelFirstNumber.getText()).equals(String.valueOf(118)) && !(labelFirstNumber.getText()).equals(String.valueOf(119))) {
            buttonDone.setDisable(false);

            int number = (int) ((Math.random() * 19 + 2));
            labelAddedNumber.setText("+" + String.valueOf(number));

            int initialScore = Integer.parseInt(labelFirstNumber.getText());
            int newScore = initialScore + number;
            labelFirstNumber.setText(String.valueOf(newScore));

            labelNewScore.setText(String.valueOf(newScore));
        }
        else {
            labelYouLost.setText("You lost! (You went over 100)");
            labelFinalScore.setText(String.valueOf(0));
            buttonAddNumber.setDisable(true);
            buttonDone.setDisable(true);
            buttonPlayAgain.setDisable(false);
        }

        if (labelNewScore.getText().equals(String.valueOf(101)) || labelNewScore.getText().equals(String.valueOf(102)) || labelNewScore.getText().equals(String.valueOf(103)) || labelNewScore.getText().equals(String.valueOf(104)) || labelNewScore.getText().equals(String.valueOf(105)) || labelNewScore.getText().equals(String.valueOf(106)) || labelNewScore.getText().equals(String.valueOf(107)) || labelNewScore.getText().equals(String.valueOf(108)) || labelNewScore.getText().equals(String.valueOf(109)) || labelNewScore.getText().equals(String.valueOf(110)) || labelNewScore.getText().equals(String.valueOf(111)) || labelNewScore.getText().equals(String.valueOf(112)) || labelNewScore.getText().equals(String.valueOf(113)) || labelNewScore.getText().equals(String.valueOf(114)) || labelNewScore.getText().equals(String.valueOf(115)) || labelNewScore.getText().equals(String.valueOf(116)) || labelNewScore.getText().equals(String.valueOf(117)) || labelNewScore.getText().equals(String.valueOf(118)) || labelNewScore.getText().equals(String.valueOf(119))) {
            buttonDone.setDisable(true);
        }
    }

    // This method is run by the "Play Again" button. It restarts the game.

    public void playAgain(ActionEvent actionEvent) {
        buttonGetNumber.setDisable(false);
        buttonPlayAgain.setDisable(true);
        labelFirstNumber.setText("");
        labelAddedNumber.setText("");
        labelNewScore.setText("");
        labelYouLost.setText("");
        labelFinalScore.setText("");

    }

    // This method is run by the "DONE" button. It disables the "Add Number" button so the player has a final score.
    public void stopAddingNumbers(ActionEvent actionEvent) {
        buttonAddNumber.setDisable(true);
        buttonDone.setDisable(true);
        buttonPlayAgain.setDisable(false);
        labelFirstNumber.setText("");
        labelAddedNumber.setText("");

        int finalScore = Integer.parseInt(labelNewScore.getText());
        labelFinalScore.setText(String.valueOf(finalScore));
    }
}
