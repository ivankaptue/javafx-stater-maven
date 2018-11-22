package controllers;

import javafx.fxml.Initializable;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Logger logger = LogManager.getLogger(Controller.class);

    public Controller() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        logger.info("Controller successfully launch");
    }
}
