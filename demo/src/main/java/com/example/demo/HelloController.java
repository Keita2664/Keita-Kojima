package com.example.demo;

import javafx.beans.binding.DoubleExpression;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class HelloController {
    public Button equals;
    public Button times;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button minus;
    public Button plus;
    public Label answer;
    public Button four;
    public Button five;
    public Button six;
    public Button one;
    public Button two;
    public Button three;
    public Button zero;
    public Button clear;
    public Button remember;

    public int total = 0;
    public int numPlus = 0;
    public int numMinus = 0;
    public int num = 0;
    public int num2 = 0;
    public int integer = 0;
    public String action = "";
    public int ans = 0;
    public Button divide;
    public String numTotal = "";
    ArrayList<String> numbers = new ArrayList<>();
    ArrayList<String> operators = new ArrayList<>();
    ArrayList<String> label = new ArrayList<>();


    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void equals(ActionEvent actionEvent) {
        operators.add(Integer.toString(integer));
        numTotal = "";
        integer = 0;
        for (int i = 0; i < operators.size() - 1; i++){
            /*switch (operators.get(i)) {
                case "+" : total = Integer.parseInt(operators.get(i - 1)) + Integer.parseInt(operators.get(i + 1));
                case "-" :  total = Integer.parseInt(operators.get(i - 1)) - Integer.parseInt(operators.get(i + 1));
                case "*" :  total = Integer.parseInt(operators.get(i - 1)) * Integer.parseInt(operators.get(i + 1));
                default:
                    System.out.println(total);
            }

             */
            if (operators.get(i) == "+"){
                total = Integer.parseInt(operators.get(i - 1)) + Integer.parseInt(operators.get(i + 1));
                numbers.add(Integer.toString(total));
                i = 0;
                if (operators.size() >= 4){
                    for (int k = 3; k < operators.size(); k++){
                        numbers.add(operators.get(k));
                    }
                    operators.clear();
                    operators.add(Integer.toString(total));
                    for (int x = 1; x < numbers.size(); x++){
                        operators.add(numbers.get(x));
                    }
                    numbers.clear();
                }
                else{
                    operators.clear();
                    answer.setText(Integer.toString(total));
                    integer = total;
                    //operators.add(Integer.toString(total));
                    break;
                }
            }
              else if (operators.get(i) == "-"){
                  total = Integer.parseInt(operators.get(i - 1)) - Integer.parseInt(operators.get(i + 1));
                  numbers.add(Integer.toString(total));
                  i = 0;
                  if (operators.size() >= 4){
                      for (int k = 3; k < operators.size(); k++){
                          numbers.add(operators.get(k));
                      }
                      operators.clear();
                      operators.add(Integer.toString(total));
                      for (int x = 1; x < numbers.size(); x++){
                          operators.add(numbers.get(x));
                      }
                      numbers.clear();
                }
                else{
                    operators.clear();
                    answer.setText(Integer.toString(total));
                    integer = total;
                    //operators.add(Integer.toString(total));
                    break;
                }
            }
            else if (operators.get(i) == "x"){
                total = Integer.parseInt(operators.get(i - 1)) * Integer.parseInt(operators.get(i + 1));
                numbers.add(Integer.toString(total));
                i = 0;
                if (operators.size() >= 4){
                    for (int k = 3; k < operators.size(); k++){
                        numbers.add(operators.get(k));
                    }
                    operators.clear();
                    operators.add(Integer.toString(total));
                    for (int x = 1; x < numbers.size(); x++){
                        operators.add(numbers.get(x));
                    }
                    numbers.clear();
                }
                else{
                    operators.clear();
                    answer.setText(Integer.toString(total));
                    integer = total;
                    //operators.add(Integer.toString(total));
                    break;
                }
            }

        }
        answer.setText(Integer.toString(total));
        integer = total;
    }

    public void seven(ActionEvent actionEvent) {
        //label.add(Integer.toString(7));
        //for (int i = 0; i < label.size(); i++){
            numTotal += 7;
            integer = Integer.parseInt(numTotal);
        //}
            answer.setText(Integer.toString(integer));

        //operators.add(Integer.toString(integer));
        //System.out.println("OP" + operators.size());
        /*
        if (num == 0){
            num = 7;
            answer.setText(Double.toString(num));
        }
        else if (num != 0){
            num2 = 7;
            answer.setText(Double.toString(num2));
        }

         */
    }

    public void eight(ActionEvent actionEvent) {
        //label.add(Integer.toString(8));
        numTotal += 8;
        integer = Integer.parseInt(numTotal);
        answer.setText(Integer.toString(integer));
        //operators.add(Integer.toString(8));

        /*
        if (num == 0){
            num = 8;
            answer.setText(Double.toString(num));
        }
        else if (num != 0){
            num2 = 8;
            answer.setText(Double.toString(num2));
        }

         */
    }

    public void nine(ActionEvent actionEvent) {
        //label.add(Integer.toString(9));
        numTotal += 9;
        integer = Integer.parseInt(numTotal);
        answer.setText(Integer.toString(integer));
        /*

        if (num == 0){
            num = 9;
            answer.setText(Double.toString(num));
        }
        else if (num != 0){
            num2 = 9;
            answer.setText(Double.toString(num2));
        }

         */
    }

    public void minus(ActionEvent actionEvent) {
        operators.add(Integer.toString(integer));
        numTotal = "";
        //action = "-";
        operators.add("-");
        /*
        action = "minus";


         */
    }

    public void plus(ActionEvent actionEvent) {
        operators.add(Integer.toString(integer));
        numTotal = "";
        //action = "+";
        operators.add("+");

        /*
        for (int i = 0; i < numbers.size() - 1; i++){
            total += numbers.get(i);
        }
         */
        /*
        action = "plus";

         */
    }

    public void four(ActionEvent actionEvent) {
        numTotal += 4;
        integer = Integer.parseInt(numTotal);
        answer.setText(Integer.toString(integer));
        /*
        if (num == 0){
            num = 4;
            answer.setText(Double.toString(num));
        }
        else if (num != 0){
            num2 = 4;
            answer.setText(Double.toString(num2));
        }

         */
    }

    public void five(ActionEvent actionEvent) {
        numTotal += 5;
        integer = Integer.parseInt(numTotal);
        answer.setText(Integer.toString(integer));
        /*
        if (num == 0){
            num = 5;
            answer.setText(Double.toString(num));
        }
        else if (num != 0){
            num2 = 5;
            answer.setText(Double.toString(num2));
        }

         */
    }

    public void six(ActionEvent actionEvent) {
        numTotal += 6;
        //label.add(Integer.toString(6));
        integer = Integer.parseInt(numTotal);
        answer.setText(Integer.toString(integer));
        /*
        if (num == 0){
            num = 6;
            answer.setText(Double.toString(num));
        }
        else if (num != 0){
            num2 = 6;
            answer.setText(Double.toString(num2));
        }

         */
    }

    public void one(ActionEvent actionEvent) {
        numTotal += 1;
        //label.add(Integer.toString(1));
        integer = Integer.parseInt(numTotal);
        answer.setText(Integer.toString(integer));
        /*
        if (num == 0){
            num = 1;
            answer.setText(Double.toString(num));
        }
        else if (num != 0){
            num2 = 1;
            answer.setText(Double.toString(num2));
        }

         */

    }

    public void two(ActionEvent actionEvent) {
        numTotal += 2;
        //label.add(Integer.toString(2));
        integer = Integer.parseInt(numTotal);
        answer.setText(Integer.toString(integer));
        /*
        if (num == 0){
            num = 2;
            answer.setText(Double.toString(num));
        }
        else if (num != 0){
            num2 = 2;
            answer.setText(Double.toString(num2));
        }

         */
    }

    public void three(ActionEvent actionEvent) {
        numTotal += 3;
        //label.add(Integer.toString(3));
        integer = Integer.parseInt(numTotal);
        answer.setText(Integer.toString(integer));
        /*
        if (num == 0){
            num = 3;
            answer.setText(Double.toString(num));
        }
        else if (num != 0){
            num2 = 3;
            answer.setText(Double.toString(num2));
        }

         */
    }

    public void zero(ActionEvent actionEvent) {
        numTotal += 0;
        //label.add(Integer.toString(0));
        integer = Integer.parseInt(numTotal);
        answer.setText(Integer.toString(integer));
    }

    public void clear(ActionEvent actionEvent) {
        numbers.clear();
        operators.clear();
        numTotal ="";
        answer.setText(Integer.toString(0));
        numPlus = 0;
        numMinus = 0;
        integer = 0;
        /*
        num = 0;
        num2 = 0;
        answer.setText(Double.toString(num));

         */
    }

    public void remember(ActionEvent actionEvent) {
        /*
        ans = total;
        if (num == 0){
            num = ans;
            answer.setText(Double.toString(ans));
        }
        else if (num > 0){
            num2 = ans;
            answer.setText(Double.toString(ans));
        }

         */
    }

    public void divide(ActionEvent actionEvent) {
        /*
        action = "divide";

         */
    }

    public void times(ActionEvent actionEvent) {
        operators.add(Integer.toString(integer));
        numTotal = "";
        operators.add("x");
    }
}