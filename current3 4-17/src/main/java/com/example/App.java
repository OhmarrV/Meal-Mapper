package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    public void start(Stage primaryStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainframe.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Scene scene = new Scene(root);

            primaryStage.setTitle("Meal Mapper");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws SQLException {

        //DBRecipe db = new DBRecipe();

        //Connection conn = db.connect();

        //db.getRecipeData(conn);
        launch();
    }

}