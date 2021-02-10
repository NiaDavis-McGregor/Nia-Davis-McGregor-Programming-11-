package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.util.ArrayList;

public class Controller {
    public TextField textFriendName;
    public Button buttonAddFriend;
    public ListView friendList;
    public Label labelFriendName;
    public Button buttonDelete;
    public Label labelFriendAge;
    public Label labelFriendPersonality;
    public Button buttonDeleteFriend;
    public TextField textFriendAge;
    public TextField textFriendPersonality;
    public Label labelDisplayFriends;

    public void addFriend(ActionEvent actionEvent) {
        String name = textFriendName.getText();
        int age = Integer.parseInt(textFriendAge.getText());
        String personality = textFriendPersonality.getText();

        Friend exampleFriend = new Friend(name, age, personality);

        friendList.getItems().add(exampleFriend);

        textFriendName.clear();
        textFriendAge.clear();
        textFriendPersonality.clear();
    }

    public void deleteFriend(ActionEvent actionEvent) {
        friendList.getItems().remove(friendList.getSelectionModel().getSelectedItem());
        labelFriendName.setText("");
        labelFriendAge.setText("");
        labelFriendPersonality.setText("");

    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend exampleFriend;

        exampleFriend = (Friend) friendList.getSelectionModel().getSelectedItem();
        labelFriendName.setText(exampleFriend.getName());
        labelFriendAge.setText(Integer.toString(exampleFriend.getAge()));
        labelFriendPersonality.setText(exampleFriend.getPersonality());
    }

    public void displayAll(Event event) {
        labelDisplayFriends.setText("Your Friends: " + (String.valueOf(friendList.getItems())));
    }

    public void saveFriends(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> friendsList = friendList.getItems();

        FileWriter fw = new FileWriter("friends.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (Friend friend : friendsList) {
            friend.writeToFile(bw);
        }

        bw.close();
        friendList.getItems().clear();
    }

    public void loadFriends(ActionEvent actionEvent) throws IOException {

        FileReader fr = new FileReader("friends.txt");
        BufferedReader br = new BufferedReader(fr);

        boolean endOfFile = false;

        while (!endOfFile) {
            Friend friend = new Friend();

            if (friend.readFromFile(br)) {
                friendList.getItems().add(friend);
            }
            else {
                endOfFile = true;
            }
        }
    }

    public void loadFriendsTwo(ActionEvent actionEvent) throws IOException {
        FileReader fr = new FileReader("friends2.txt");
        BufferedReader br = new BufferedReader(fr);

        boolean endOfFile = false;

        while (!endOfFile) {
            Friend friend = new Friend();

            if (friend.readFromFile(br)) {
                friendList.getItems().add(friend);
            }
            else {
                endOfFile = true;
            }
        }
    }

    public void saveFriendsTwo(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> friendsList = friendList.getItems();

        FileWriter fw = new FileWriter("friends2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (Friend friend : friendsList) {
            friend.writeToFile(bw);
        }

        bw.close();
        friendList.getItems().clear();
    }
}
