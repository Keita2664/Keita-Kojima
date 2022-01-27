package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.lang.reflect.Field;

public class HelloController {
    public TextField GetName;
    public TextField GetAge;
    public TextField GetGender;
    public Button AddFriend;
    public ListView list;
    public Label lblName;
    public Label lblAge;
    public Label lblGender;
    public Button deleteFriend;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void addFriend(ActionEvent actionEvent) {
        String name = GetName.getText();
        int age = Integer.parseInt(GetAge.getText());
        String gender = GetGender.getText();
        Friend friend = new Friend(name, age, gender);
        list.getItems().add(friend);
        GetName.clear();
        GetAge.clear();
        GetGender.clear();
        deleteFriend.setDisable(true);
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend friend;
        friend = (Friend) list.getSelectionModel().getSelectedItem();
        lblName.setText(friend.getName());
        lblAge.setText(Integer.toString(friend.getAge()));
        lblGender.setText(friend.getGender());
        deleteFriend.setDisable(false);

    }

    public void deleteFriend(ActionEvent actionEvent) {
        Friend friend;
        friend = (Friend) list.getSelectionModel().getSelectedItem();
        list.getItems().remove(list.getSelectionModel().getSelectedIndex());
        friend = (Friend) list.getSelectionModel().getSelectedItem();
        if (friend != null){
            lblName.setText(friend.getName());
            lblAge.setText(Integer.toString(friend.getAge()));
            lblGender.setText(friend.getGender());
        }
        else{
            lblName.setText(null);
            lblAge.setText(null);
            lblGender.setText(null);
        }

        //list.getSelectionModel().getSelectedItems().remove(list.getSelectionModel().getSelectedIndex()+1);

        //friend.delete();

        //lblName.setText(null);
        //lblGender.setText(null);
        //lblAge.setText(null);
       // list.getItems().add(friend);
       // friend = null;
    }
}