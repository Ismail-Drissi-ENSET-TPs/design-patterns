package com.ismaildrs.controllers;

import com.ismaildrs.boisson.Boisson;
import com.ismaildrs.boisson.Dera;
import com.ismaildrs.boisson.Expresso;
import com.ismaildrs.boisson.Somatra;
import com.ismaildrs.deco.Caramel;
import com.ismaildrs.deco.Choco;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private ChoiceBox<String> choiceBoisson;

    @FXML
    private CheckBox checkSucre;

    @FXML
    private CheckBox checkChocolat;

    @FXML
    private Button btnCalculer;

    @FXML
    private Label lblResult;



    @FXML
    public void initialize() {
        choiceBoisson.getItems().addAll("Café", "Thé", "Lait", "Jus");

        btnCalculer.setOnAction(event -> calculerBoisson());
    }

    private void calculerBoisson() {
        Boisson boisson = null;

        switch (choiceBoisson.getValue()) {
            case "Café" -> boisson = new Dera();
            case "Thé" -> boisson = new Expresso();
            case "Lait" -> boisson = new Somatra();


        }

        if (boisson != null) {
            if (checkSucre.isSelected()) {
                boisson = new Choco(boisson);
            }
            if (checkChocolat.isSelected()) {
                boisson = new Caramel(boisson);
            }

            lblResult.setText(
                    boisson.getDescription() + " => Prix: " + boisson.cout() + " DH"
            );
        }
        else{
            lblResult.setText("Veuillez choisir une boisson");
        }
    }
}
