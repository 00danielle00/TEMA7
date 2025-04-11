package org.example.demofx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    static int contador;

    @FXML
    private Label welcomeText;
    @FXML
    private Label contadorEtiqueta;


    @FXML
    private Button sumar1;

    @FXML
    public void initialize(){
        sumar1.setOnAction(e -> contadorEtiqueta.setText(Integer.toString(++contador)));
    }

    @FXML
    public void contar(){
        System.out.println(++contador);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}