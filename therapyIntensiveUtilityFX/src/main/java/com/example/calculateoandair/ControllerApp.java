package com.example.calculateoandair;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerApp {
    @FXML
    public TextField fiO2Input;
    public TextField flowInput;

    @FXML
    //On this label will pop up the result of the O2 and Air
    public Label calculatedO2Label;
    public Label calculatedAirLabel;
    @FXML
    // If the value is out of range will pop up in this label
    public Label valueOutOfRangeO2;
    public Label valueOutOfRangeFlow;

    @FXML
    public Button calculateBtn;
    public Button clearBtn;


    @FXML
    public void calculateAction(ActionEvent actionEvent) throws RuntimeException {
        double calculateValueO2;
        double calculateValueAir;
        CalculateValueO2 calculateValue = new CalculateValueO2();

        if (fiO2Input.getText().isEmpty() || flowInput.getText().isEmpty()) {
            return;
        }
        // clear all the display or label
        if (actionEvent.getSource() == clearBtn) {
            fiO2Input.clear();
            flowInput.clear();

            calculatedO2Label.setText("0");
            calculatedAirLabel.setText("0");


            valueOutOfRangeFlow.setText(" ");
            valueOutOfRangeO2.setText(" ");
            return;
        }

        if (fiO2Input.getText().matches("[0-9]*") && flowInput.getText().matches("[0-9]*")) {

            //Control the security range
            int valueInputFiO2 = Integer.parseInt(fiO2Input.getText());
            int valueInputFlow = Integer.parseInt(flowInput.getText());

            if (valueInputFiO2 > 100 || valueInputFiO2 < 21) {
                valueOutOfRangeO2.setText("The value is out of range!");
                 return;
            } else {
                valueOutOfRangeO2.setText(" ");
            }
            if (valueInputFlow < 10 || valueInputFlow > 60) {
                valueOutOfRangeFlow.setText("The value is out of range!");
                return;
            } else {
                valueOutOfRangeFlow.setText(" ");
            }


            //Here is applied the formula for calculate the value
            calculateValueO2 = calculateValue.oxigen(valueInputFiO2, valueInputFlow);
            calculateValueAir = calculateValue.air(valueInputFlow, calculateValueO2);

            //display the result of the label
            calculatedO2Label.setText(String.valueOf(calculateValueO2));
            calculatedAirLabel.setText(String.valueOf(calculateValueAir));

        } else {
            if (!fiO2Input.getText().matches("[0-9]*")) {
                valueOutOfRangeO2.setText("Enter a numeric character !");
                return;
            } else {
                valueOutOfRangeO2.setText(" ");
            }
            if (!flowInput.getText().matches("[0-9]*")) {
                valueOutOfRangeFlow.setText("Enter a numeric character !");
                return;
            }else {
                valueOutOfRangeFlow.setText(" ");
        }
    }

}
}