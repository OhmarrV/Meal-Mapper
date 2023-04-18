package com.example;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.web.*;

public class webScene implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML 
    private WebView webview;

    private WebEngine engine;

    @FXML
    private Button backBtn;


    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        engine = webview.getEngine();
        try {
            loadPage();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void loadPage() throws SQLException
    {
        //how to pass the ingredients variable from the main controller?
        DBRecipe recipe = new DBRecipe();
        Connection conn = recipe.connect();
        recipe.setIngredients(mainframe.ing);
        recipe.getRecipeData(conn);
        String url = recipe.getURL();
        engine.load(url);
    }

    public void switchToEggScene(ActionEvent event) throws IOException, SQLException
    {
        String ing = "E";
        String file = "eggframe.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eggframe.fxml"));
        Parent root = (Parent) fxmlLoader.load();

        DBRecipe recipe = new DBRecipe();
        Connection conn = recipe.connect();
        recipe.setIngredients(ing);
        recipe.getRecipeData(conn);
        fxmlLoader.getNamespace().put("title", recipe.getTitle());
        fxmlLoader.setLocation(getClass().getResource(file));

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
   

}
