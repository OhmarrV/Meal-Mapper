package com.example;

import java.sql.*;

public class DBRecipe {

    private String title = "null";
    private String url = "null"; 
    private String image = "null"; 
    private String ingredients = "null";
    private String category = "null"; 

    //constructor to pass title variable
    public void setIngredients(String v){
        ingredients = v;
    }
    
    public Connection connect() throws SQLException
    {
        return DriverManager.getConnection("jdbc:sqlite:meal_mapper.db"); // connect to the SQLite database file
    }

    public void getRecipeData(Connection conn) throws SQLException
    {

        if(ingredients == "null") return;
        Statement st = conn.createStatement();

        String query = "SELECT Title, ImagePath, URL, Category, Ingredients FROM Recipes WHERE Ingredients= ?";
        PreparedStatement recipeQuery = conn.prepareStatement(query);
        recipeQuery.setString(1, ingredients);

        //unused for now ResultSet rs = st.executeQuery("SELECT * FROM Recipes"); // SQL statement to get all the records in the table
        ResultSet recipe = recipeQuery.executeQuery();

        while (recipe.next()) // go through the next record in the table
        {
            this.title = recipe.getString("Title"); // get the current value from the vinlastfour column
            this.url = recipe.getString("URL");
            this.image = recipe.getString("ImagePath");
            this.ingredients = recipe.getString("Ingredients");
            this.category = recipe.getString("Category");
        }
    }

    public String getTitle(){
        return title;
    }

    public String getURL(){
        return url;
    }

    public String getImage(){
        return image;
    }

    public String getIngredients(){
        return ingredients;
    }

    public String getCategory(){
        return category;
    }

    //********************************************************************************** */
}
