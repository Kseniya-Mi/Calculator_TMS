package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    private Label screen;

    String expression = "";

    @FXML
    public void onOneButtonClick(ActionEvent actionEvent) {
        expression += "1";
        screen.setText(expression);
    }

    public void onClearButtonClick(ActionEvent actionEvent) {
        expression = "";
        screen.setText(expression);
    }

    public void onBaksButtonClick(ActionEvent actionEvent) {
        expression = expression.substring(0, expression.length() - 1);
        screen.setText(expression);
    }

    public void onDotButtonClick(ActionEvent actionEvent) {
        expression += ".";
        screen.setText(expression);
    }

    public void onSevenButtonClick(ActionEvent actionEvent) {
        expression += "7";
        screen.setText(expression);
    }

    public void onEightButtonClick(ActionEvent actionEvent) {
        expression += "8";
        screen.setText(expression);
    }

    public void onNineButtonClick(ActionEvent actionEvent) {
        expression += "9";
        screen.setText(expression);
    }

    public void onDivideButtonClick(ActionEvent actionEvent) {
        expression += " / ";
        screen.setText(expression);
    }

    public void onFourButtonClick(ActionEvent actionEvent) {
        expression += "4";
        screen.setText(expression);
    }

    public void onFiveButtonClick(ActionEvent actionEvent) {
        expression += "5";
        screen.setText(expression);
    }

    public void onSixButtonClick(ActionEvent actionEvent) {
        expression += "6";
        screen.setText(expression);
    }

    public void onTwoButtonClick(ActionEvent actionEvent) {
        expression += "2";
        screen.setText(expression);
    }

    public void onThreeButtonClick(ActionEvent actionEvent) {
        expression += "3";
        screen.setText(expression);
    }

    public void onZeroButtonClick(ActionEvent actionEvent) {
        expression += "0";
        screen.setText(expression);
    }

    public void onPlusButtonClick(ActionEvent actionEvent) {
        expression += " + ";
        screen.setText(expression);
    }

    public void onMinusButtonClick(ActionEvent actionEvent) {
        expression += " - ";
        screen.setText(expression);
    }

    public void onEqualsButtonClick(ActionEvent actionEvent) {
      String[] arrayExpr = expression.split(" ");
      String temp = "";
      double result = 0;
      for(int i = 0; i <= arrayExpr.length - 1; i++){
          switch (arrayExpr[i]){
              case "*":
                  result = Double.parseDouble(arrayExpr[i - 1]) * Double.parseDouble(arrayExpr[i + 1]);
                  arrayExpr[i + 1] = String.valueOf(result);
                  temp = temp.substring(0, temp.length() - arrayExpr[i - 1].length() - 1);
                  temp += result + " ";
                  i++;
                  break;
              case "/":
                  if (Double.parseDouble(arrayExpr[i + 1]) == 0)
                      screen.setText("Error! Division by zero!");
                  result = Double.parseDouble(arrayExpr[i - 1]) / Double.parseDouble(arrayExpr[i + 1]);
                  arrayExpr[i + 1] = String.valueOf(result);
                  temp = temp.substring(0, temp.length() - arrayExpr[i - 1].length() - 1);
                  temp += result + " ";
                  i++;
                  break;
              default:
                  temp += arrayExpr[i] + " ";
                  break;
          }
      }

      arrayExpr = temp.split(" ");
      temp = "";
      for(int i = 0; i <= arrayExpr.length - 1; i++){
          switch (arrayExpr[i]){
              case "+":
                  result = Double.parseDouble(arrayExpr[i - 1]) + Double.parseDouble(arrayExpr[i + 1]);
                  arrayExpr[i + 1] = String.valueOf(result);
                  temp = temp.substring(0, temp.length() - arrayExpr[i - 1].length() - 1);
                  temp += result + " ";
                  i++;
                  break;
              case "-":
                  result = Double.parseDouble(arrayExpr[i - 1]) - Double.parseDouble(arrayExpr[i + 1]);
                  arrayExpr[i + 1] = String.valueOf(result);
                  temp = temp.substring(0, temp.length() - arrayExpr[i - 1].length() - 1);
                  temp += result + " ";
                  i++;
                  break;
              default:
                  temp += arrayExpr[i] + " ";
                  break;
          }
      }
      expression = String.valueOf(arrayExpr[arrayExpr.length - 1]);
      screen.setText(expression);
    }

    public void onMultiplyButtonClick(ActionEvent actionEvent) {
        expression += " * ";
        screen.setText(expression);
    }
}