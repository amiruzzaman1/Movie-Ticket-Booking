/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package movie;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;




public class FXMLDocumentController implements Initializable {
    
  @FXML
    private Button signIn_close;

    @FXML
    private Hyperlink signIn_createAccount;

    @FXML
    private AnchorPane signIn_form;

    @FXML
    private Button signIn_loginBtn;

    @FXML
    private Button signIn_minimize;

    @FXML
    private TextField signIn_password;

    @FXML
    private TextField signIn_username;

    @FXML
    private Hyperlink signUp_alreadyHaveAccount;

    @FXML
    private Button signUp_btn;

    @FXML
    private Button signUp_close;

    @FXML
    private TextField signUp_email;

    @FXML
    private AnchorPane signUp_form;

    @FXML
    private Button signUp_minimize;

    @FXML
    private TextField signUp_password;

    @FXML
    private TextField signUp_username;
    
    
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    
    
    
  
    
   public void signup(){
   
   String sql = "INSERT INTO admin(email,username,password) VALUEs (?,?,?)";
    
   connect = database.connectDb();
   
   //Sign Up
   
   try{
   prepare = connect.prepareStatement(sql);
   prepare.setString(1, signUp_email.getText());
   prepare.setString(2, signUp_username.getText());
   prepare.setString(3, signUp_password.getText());
   
   
   Alert alert;
   
   //Validating data for sign up
    
    if(signUp_email.getText().isEmpty() || signUp_username.getText().isEmpty() || signUp_password.getText().isEmpty()){
        
        alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("Please fill all blanks");
        alert.showAndWait();
        
    }
     
    else if(signUp_password.getText().length() < 8){
    
     alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("Password must be 8 characters");
        alert.showAndWait();
    
    
    }
    
    else{
        
        prepare.execute();
        
        alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Message");
        alert.setHeaderText(null);
        alert.setContentText("Account Created Successfully!");
        alert.showAndWait();
        
        
        //Setting the values as empty
        signUp_email.setText("");
        signUp_username.setText("");
        signUp_password.setText("");
      
  }
   
   
   }  catch(Exception e) {e.printStackTrace();}
   
   
   
   }
    
    
 private double x = 0;
    private double y = 0;
   
     public void signin(){
    
    String sql = "SELECT * FROM admin WHERE username = ? and password = ?";
    connect = database.connectDb();
    
    try{
    prepare = connect.prepareStatement(sql);
    prepare.setString(1, signIn_username.getText());
    prepare.setString(2, signIn_password.getText());
    
    result = prepare.executeQuery();
    
    Alert alert;
    
    
    //Validating of username and password value
    
    if(signIn_username.getText().isEmpty() || signIn_password.getText().isEmpty()){
        
        alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("Please fill all blank fields");
        alert.showAndWait();
        
     
    
    }
    
    else{
    
    if(result.next()){
        
        
        getData.username = signIn_username.getText();
        
        alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Message");
        alert.setHeaderText(null);
        alert.setContentText("Loggen In!");
        alert.showAndWait();
        
        
        //Hiding login form
        
        signIn_loginBtn.getScene().getWindow().hide();
        
        
        // Moving to dashboard
        Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        
 root.setOnMousePressed((MouseEvent event) ->{
            x = event.getSceneX();
            y = event.getSceneY();
    
    });
        
        root.setOnMouseDragged((MouseEvent event) ->{
        
        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    
    });
        
        
        stage.initStyle(StageStyle.TRANSPARENT);
        
        stage.setScene(scene);
        stage.show();
    }
    
    else{
    alert = new Alert(AlertType.ERROR);
    alert.setTitle("Error Message");
    alert.setHeaderText(null);
    alert.setContentText("Wrong Information");
    alert.showAndWait();
    }
    
  }
    
    } catch(Exception e) {e.printStackTrace();}
    
    
  }
    
     
     
    
    public void switchForm(ActionEvent event){
    
    if(event.getSource() == signIn_createAccount){
    signIn_form.setVisible(false);
    signUp_form.setVisible(true);
    
    } else if(event.getSource() == signUp_alreadyHaveAccount){
    signIn_form.setVisible(true);
    signUp_form.setVisible(false);
    
    }
    
    
    }
    
    
    
    
    
    public void signIn_close(){
    System.exit(0);
    }
    
    public void signIn_minimize(){
        
    Stage stage = (Stage)signIn_form.getScene().getWindow();
    stage.setIconified(true);
    
    }
    
    
      public void signUp_close(){
    System.exit(0);
    }
    
    public void signUp_minimize(){
        
    Stage stage = (Stage)signUp_form.getScene().getWindow();
    stage.setIconified(true);
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
