package com.example;

import java.io.IOException;
import java.net.URL;
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
import java.sql.*;

//public class mainframe implements Initializable{
public class mainframe {


    private Stage stage;
    private Scene scene;
    public Parent root;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button beefBtn;

    @FXML
    private Button breadBtn;

    @FXML
    private Button eggBtn;

    @FXML
    private Button riceBtn;

    @FXML 
    private WebView webview;

    private WebEngine engine;
    public static String ing;
    public static String file;


    //Switch to Main Scene
    public void switchToMainScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainframe.fxml"));
        root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //All Egg Scene Switches
    public void switchToEggScene(ActionEvent event) throws IOException, SQLException
    {
        ing = "E";
        file = "eggframe.fxml";

        FXMLLoader Efxml = new FXMLLoader(getClass().getResource(file));
        root = (Parent) Efxml.load();

        DBRecipe recipe = new DBRecipe();
        Connection conn = recipe.connect();
        recipe.setIngredients(ing);
        recipe.getRecipeData(conn);
        Efxml.getNamespace().put("title", recipe.getTitle());
        Efxml.setLocation(getClass().getResource(file));

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEggBreadScene(ActionEvent event) throws IOException, SQLException
    {
        ing = "EB";
        file = "eggBread.fxml";

        FXMLLoader EBfxml = new FXMLLoader(getClass().getResource(file));
        root = (Parent) EBfxml.load();

        DBRecipe recipe = new DBRecipe();
        Connection conn = recipe.connect();
        recipe.setIngredients(ing);
        recipe.getRecipeData(conn);
        EBfxml.getNamespace().put("title", recipe.getTitle());
        EBfxml.setLocation(getClass().getResource(file));

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEggRiceScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eggRice.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //All Rice Scene Switches
    public void switchToRiceScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("riceframe.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToRiceBreadScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("riceBread.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    

    //All Bread Scene Switches
    public void switchToBreadScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("breadframe.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //All Beef scene switches
    public void switchToBeefScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("beefframe.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEggBeefScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eggBeef.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToRiceBeefScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("riceBeef.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToBreadBeefScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("breadBeef.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //All 3 choices scene switches
    public void switchToEggBreadBeefScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eggBreadBeef.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToRiceBreadBeefScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("riceBreadBeef.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEggRiceBeefScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eggRiceBeef.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEggRiceBreadScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eggRiceBread.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //All 4 choices scene switches
    public void switchToEggRiceBreadBeefScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eggRiceBreadBeef.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Switches to Web Scene
    public void switchToWebScene(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("webEggFrame.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
   

}
