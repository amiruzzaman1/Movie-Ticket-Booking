/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movie;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;




/**
 *
 * @author anan2
 */
public class dashboardController implements Initializable{
    
    @FXML
    private AnchorPane topForm;
    
    
@FXML
    private Button addMovies_btn;

    @FXML
    private Button addMovies_clearBtn;

    @FXML
    private TableColumn<moviesData, String> addMovies_col_date;

    @FXML
    private TableColumn<moviesData, String> addMovies_col_duration;

    @FXML
    private TableColumn<moviesData, String> addMovies_col_genre;

    @FXML
    private TableColumn<moviesData, String> addMovies_col_movieTitle;

      @FXML
    private DatePicker addMovies_date;

    @FXML
    private Button addMovies_deleteBtn;

    @FXML
    private TextField addMovies_duration;

    @FXML
    private AnchorPane addMovies_form;

    @FXML
    private TextField addMovies_genre;

    @FXML
    private ImageView addMovies_imageView;

    @FXML
    private Button addMovies_import;

    @FXML
    private Button addMovies_insertBtn;

    @FXML
    private TextField addMovies_movieTitle;

    @FXML
    private TextField addMovies_search;

    @FXML
    private TableView<moviesData> addMovies_tableView;

    @FXML
    private Button addMovies_updateBtn;

    @FXML
    private TableView<moviesData> addScreening_tableView;

    @FXML
    private Label availableMovies_adult_price;

    @FXML
    private Spinner<Integer> availableMovies_adult_quantity;

    @FXML
    private Button availableMovies_btn;

    @FXML
    private Button availableMovies_buyBtn;

    @FXML
    private Button availableMovies_clearBtn;

    @FXML
    private TableColumn<moviesData,String> availableMovies_col_genre;

    @FXML
    private TableColumn<moviesData,String> availableMovies_col_movieTitle;

    @FXML
    private TableColumn<moviesData,String> availableMovies_col_showingDate;

    @FXML
    private Label availableMovies_date;

    @FXML
    private AnchorPane availableMovies_form;

    @FXML
    private Label availableMovies_genre;

    @FXML
    private ImageView availableMovies_imageView;

    @FXML
    private Label availableMovies_movieTitle;

    @FXML
    private Button availableMovies_receiptBtn;

    @FXML
    private Button availableMovies_selectMovie;

    @FXML
    private Label availableMovies_senior_price;

    @FXML
    private Spinner<Integer> availableMovies_senior_quantity;

    @FXML
    private Label availableMovies_student_price;

    @FXML
    private Spinner<Integer> availableMovies_student_quantity;

    @FXML
    private TableView<moviesData> availableMovies_tableView;

    @FXML
    private Label availableMovies_title;

    @FXML
    private Label availableMovies_total;

    @FXML
    private Button close;

    @FXML
    private Button customers_btn;

    @FXML
    private Button customers_clearBtn;

    @FXML
    private TableColumn<?, ?> customers_col_date;

    @FXML
    private TableColumn<?, ?> customers_col_genre;

    @FXML
    private TableColumn<?, ?> customers_col_movieTitle;

    @FXML
    private TableColumn<?, ?> customers_col_ticketNumber;

    @FXML
    private TableColumn<?, ?> customers_col_time;

    @FXML
    private Label customers_date;

    @FXML
    private Button customers_deleteBtn;

    @FXML
    private AnchorPane customers_form;

    @FXML
    private Label customers_genre;

    @FXML
    private Label customers_movieTitle;

    @FXML
    private Label customers_ticketNumber;

    @FXML
    private Label customers_time;

    @FXML
    private Label dashboard_availableMovies;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private Label dashboard_totalEarnToday;

    @FXML
    private Label dashboard_totalSoldTicket;

    @FXML
    private Button editScreening_btn;

    @FXML
    private TableColumn<moviesData, String> editScreening_col_current;

    @FXML
    private TableColumn<moviesData, String> editScreening_col_duration;

    @FXML
    private TableColumn<moviesData, String> editScreening_col_genre;

    @FXML
    private TableColumn<moviesData, String> editScreening_col_movieTitle;

    @FXML
    private ComboBox<?> editScreening_current;

    @FXML
    private Button editScreening_delete;

    @FXML
    private AnchorPane editScreening_form;

    @FXML
    private ImageView editScreening_imageView;

    @FXML
    private Label editScreening_title;

    @FXML
    private Button editScreening_update;

    @FXML
    private Button minimize;

    @FXML
    private Button signout;

    @FXML
    private Label username;
    
    
    
    
    private double x = 0;
    private double y = 0;
    private Image image ;
    
    
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    
    
    
    private SpinnerValueFactory<Integer>spinner1;
    private SpinnerValueFactory<Integer>spinner2;
    private SpinnerValueFactory<Integer>spinner3;
    
    
    private float price1 = 0;
    private float price2 = 0;
    private float price3 = 0;
    private float total = 0;
    private int qty1 = 0;
    private int qty2 = 0;
    private int qty3 = 0;
    
    
    
    
    public void buy(){
    
        String sql = "INSERT INTO customer (type, total, date) VALUES(?, ?,?)";
        
        connect = database.connectDb();
    
    
        
    String type = "";
    
    if(price1>0 && price2 ==0 && price3 ==0){
        type = "Student: £" + price1+" ("+ qty1 +" Pcs)";
    }
    else if(price2>0 && price1==0 && price3 ==0){
    type = "Adult £" + price2+" ("+ qty2 +" Pcs)";
    }
    
    else if(price3>0 && price1==0 && price2 ==0){
    type = "Senior Citizen £" + price3+" ("+ qty3 +" Pcs)";
    }
    
    
    else if(price1>0 && price2 >0 && price3 ==0){
        type = "Student £" + price1+" ("+ qty1 +" Pcs) AND Adult £" + price2+" ("+ qty2 +" Pcs)";
    }
    else if(price2>0 && price3 >0 && price1 ==0){
         type = "Adult £" + price2+" ("+ qty2 +" Pcs) AND Senior Citizen £" + price3+" ("+ qty3 +" Pcs)";
    }
    
    else if(price1>0 && price3>0 && price2 ==0){
         type = "Student £" + price1+" ("+ qty1 +" Pcs) AND Senior Citizen £" + price3+" ("+ qty3 +" Pcs)";
    }
    
    else{
     type = "Student £" + price1+" ("+ qty1 +" Pcs) AND Adult £" + price2+" ("+ qty2 +" Pcs) AND Senior Citizen £" + price3+" ("+ qty3 +" Pcs)";
    }
   
        Date date = new Date();
        java.sql.Date setDate = new java.sql.Date(date.getTime());
        
    try{
    
    prepare = connect.prepareStatement(sql);
    prepare.setString(1, type);
    prepare.setString(2, String.valueOf(total));
    prepare.setString(3, String.valueOf(setDate));
    
    
    Alert alert;
    if(availableMovies_imageView.getImage() == null || availableMovies_title.getText().isEmpty()){
        alert = new Alert(AlertType.ERROR);
    alert.setTitle("Error");
    alert.setHeaderText(null);
    alert.setContentText("Please select a movie first");
    alert.showAndWait();
    }
    
    else if(price1 == 0 && price2 == 0 && price3 == 0){
    
      alert = new Alert(AlertType.ERROR);
    alert.setTitle("Error");
    alert.setHeaderText(null);
    alert.setContentText("Please choose a ticket");
    alert.showAndWait();
    
    
    }
    else{
        
        
    prepare.executeUpdate();
    
      alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("Information");
    alert.setHeaderText(null);
    alert.setContentText("Your ticket has been purchased!");
    alert.showAndWait();
    
    String sql1 = "SELECT * FROM customer";
    prepare = connect.prepareStatement(sql1);
    result = prepare.executeQuery();
    int num = 0 ;
    
    while(result.next()){
    
    num = result.getInt("id");
    
    }
        String sql2 = "INSERT INTO customer_info (customer_id,type,total,movieTitle) VALUES (?,?,?,?)";
    
    
      prepare = connect.prepareStatement(sql2);
    prepare.setString(1, String.valueOf(num));
    prepare.setString(2, type);
    prepare.setString(3, String.valueOf(total));
    prepare.setString(4, availableMovies_title.getText());
    
    prepare.execute();
    
    clearPurchaseTicketInfo();

    
    
    }
    
    
    
    }catch(Exception e){e.printStackTrace();}
    
    
    
    
    }
    
    
    
    
    
    public void clearPurchaseTicketInfo(){
     spinner1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    spinner2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    spinner3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    
    
     availableMovies_student_quantity.setValueFactory(spinner1);
     availableMovies_adult_quantity.setValueFactory(spinner2);
     availableMovies_senior_quantity.setValueFactory(spinner3);
    
       availableMovies_student_price.setText("£0.00");
       availableMovies_adult_price.setText("£0.00");
         availableMovies_senior_price.setText("£0.00");
         
         availableMovies_total.setText("£0.00");
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    public void showSpinnerValue(){
    
    spinner1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    spinner2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    spinner3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,10,0);
    
    
     availableMovies_student_quantity.setValueFactory(spinner1);
     availableMovies_adult_quantity.setValueFactory(spinner2);
     availableMovies_senior_quantity.setValueFactory(spinner3);
    
  
    
    
    }
    
    
    
      public void getSpinnerValue(MouseEvent event){
          qty1 = availableMovies_student_quantity.getValue();
             qty2 =  availableMovies_adult_quantity.getValue();
                qty3 = availableMovies_senior_quantity.getValue();
                
                
    price1 = (qty1*7);
    price2 = (qty2*15);
    price3 = (qty3*10);
    
    total = (price1+price2+price3);
    
    availableMovies_student_price.setText("£"+String.valueOf(price1));
       availableMovies_adult_price.setText("£"+String.valueOf(price2));
         availableMovies_senior_price.setText("£"+String.valueOf(price3));
         
         availableMovies_total.setText(String.valueOf(total));
          
          
      
      }
    
   
    
    
    
    public ObservableList<moviesData> availableMoviesList(){
    
        ObservableList<moviesData> listAvMovies = FXCollections.observableArrayList();
        String sql = "SELECT * FROM movie WHERE current = 'Showing'";
        connect = database.connectDb();
    
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            moviesData movD;
            
            while(result.next()){
            
            movD = new moviesData(result.getInt("id"),
            result.getString("movieTitle"),
            result.getString("genre"),
            result.getString("duration"),
            result.getString("image"),
            result.getDate("date"),
            result.getString("current"));
                    
            listAvMovies.add(movD);
            
            }
            
            
        } catch(Exception e){e.printStackTrace();}
    
    return listAvMovies;
    }
    
    
    
    
    private ObservableList<moviesData> availableMoviesList;
    public void showAvailableMovies(){
    
    availableMoviesList = availableMoviesList();
    availableMovies_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
    availableMovies_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
    availableMovies_col_showingDate.setCellValueFactory(new PropertyValueFactory<>("date"));
    
    availableMovies_tableView.setItems(availableMoviesList);
    
    
    
    
    
            }
    
    
    
    
    public void selectAvailableMovies(){
    
    
        
           moviesData movD= availableMovies_tableView.getSelectionModel().getSelectedItem();
    int num = availableMovies_tableView.getSelectionModel().getSelectedIndex();
    
    if((num-1) < -1){
        return;
    }
        
        availableMovies_movieTitle.setText(movD.getTitle());
        availableMovies_genre.setText(movD.getGenre());
        availableMovies_date.setText(String.valueOf(movD.getDate()));
        
        getData.path = movD.getImage();
        getData.title = movD.getTitle();
        
    
    }
    
    
    public void selectMovie(){
    
        
        Alert alert;
        
        if(availableMovies_movieTitle.getText().isEmpty()  ||  
                availableMovies_genre.getText().isEmpty()  ||
                availableMovies_date.getText().isEmpty() ){
            
            alert = new Alert (AlertType.ERROR);
            alert.setTitle("Error");
            alert.setTitle(null);
            alert.setHeaderText("Please select a movie");
            alert.showAndWait();
            
        }
        
      
        
        else{
      
        String uri = "file:" + getData.path;
        image = new Image(uri, 136, 180, false, true);
        availableMovies_imageView.setImage(image);
        availableMovies_title.setText(getData.title);
        
    
        //Blank
        
        availableMovies_movieTitle.setText("");
        availableMovies_genre.setText("");
        availableMovies_date.setText("");
        
        }
    
    }
    
    
    
   
    private String[] currentList = {"Showing", "End Showing"};
    
    public void comboBox(){
    
        List<String> listCurrent = new ArrayList<>();
        
        for(String data:currentList){
            listCurrent.add(data);
        
        }
        
    ObservableList listC = FXCollections.observableArrayList(listCurrent);
        editScreening_current.setItems(listC);
    }
    
    
    
    
    
    public void updateEditScreening(){
    
        String sql = "UPDATE movie SET current='" + editScreening_current.getSelectionModel().getSelectedItem() + "'WHERE  movieTitle ='" 
                
                +editScreening_title.getText()+"'";
        
        connect = database.connectDb();
        
        
        try{
        
        statement = connect.createStatement();
        Alert alert;
        
        
        if(editScreening_title.getText().isEmpty() || 
                editScreening_imageView.getImage() == null || editScreening_current.getSelectionModel().isEmpty()){
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setHeaderText(null);
            alert.setContentText("Add movie first");
            alert.showAndWait();
        
         
        
            
        }
        
        
        else{
            statement.executeUpdate(sql);
            
            
            
            
            
               alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setHeaderText("Successful Update");
            alert.showAndWait();
               showEditScreening();
               clearEditScreening();
            
                    }
        
        
        } catch(Exception e){e.printStackTrace();}
        
        
        
    
    }
    
    
     public void clearEditScreening(){
         editScreening_title.setText("");
         editScreening_imageView.setImage(null);
         //editScreening_current.setSelectionModel(null);
         
     
     }
    
    
    
    
    
    
    public void selectEditScreening(){
    
    moviesData movD = addScreening_tableView.getSelectionModel().getSelectedItem();
    int num = addScreening_tableView.getSelectionModel().getFocusedIndex();
    
    if((num-1) < -1){
        return;
    }
    
    String uri = "file:" +movD.getImage();
    image = new Image(uri, 138,183, false, true);
    editScreening_imageView.setImage(image);
    
    editScreening_title.setText(movD.getTitle());
    
    
    }
    
    
    
    
    public ObservableList<moviesData> editScreeningList(){
    
    ObservableList<moviesData> editSList = FXCollections.observableArrayList();
            
    String sql = "SELECT * FROM movie";
    
    connect = database.connectDb();
    
    
    
    try{
    
        prepare = connect.prepareStatement(sql);
    result = prepare.executeQuery();
    moviesData movD;
    
    while(result.next()){
    
        movD = new moviesData(result.getInt("id"),
        result.getString("movieTitle"), result.getString("genre"),
                result.getString("duration"), result.getString("image"),
                result.getDate("date"), result.getString("current"));
        
        
      editSList.add(movD);
    }
    
    
    
    
    }
    
    
    catch(Exception e){e.printStackTrace();}
    
    
    return editSList;
    
    }
    
    
    private ObservableList<moviesData> editScreeningL;
    
    
    public void showEditScreening(){
    
    editScreeningL = editScreeningList();
    editScreening_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
      editScreening_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
      editScreening_col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        editScreening_col_current.setCellValueFactory(new PropertyValueFactory<>("current"));
    
    
    addScreening_tableView.setItems(editScreeningL);
    
    }
    
    
    
    
    
    

    
    
        public void searchAddMovies(){
        FilteredList<moviesData> filter = new FilteredList<>(listAddMovies, e-> true);
        
        addMovies_search.textProperty().addListener((observable, oldValue, newValue) -> { 
            filter.setPredicate(predicateMoviesData -> {
            
                if(newValue.isEmpty() || newValue == null){
                    return true;
                }
                
                String keySearch = newValue.toLowerCase();
                
                if(predicateMoviesData.getTitle().toLowerCase().contains(keySearch)){
                    return true;
                }
                 
                else if(predicateMoviesData.getGenre().toLowerCase().contains(keySearch)){
                    return true;
                }
                
                else if(predicateMoviesData.getDuration().toLowerCase().contains(keySearch)){
                    return true;
                }
                
                else if(predicateMoviesData.getDate().toString().contains(keySearch)){
                    return true;
                }
                
              
                        return false;
                
            });
                    
    
    });
        
          SortedList<moviesData> sortData = new SortedList<>(filter);
                sortData.comparatorProperty().bind(addMovies_tableView.comparatorProperty());
                        addMovies_tableView.setItems(sortData);
    
    }
    
    
    
    
    public void importImage(){
    
        FileChooser open = new FileChooser();
        open.setTitle("Open Image");
        open.getExtensionFilters().add(new ExtensionFilter("Image File", "*png", "*jpg"));
        
        Stage stage = (Stage)addMovies_form.getScene().getWindow();
        File file = open.showOpenDialog(stage);
        
        if(file != null){
            image = new Image(file.toURI().toString(),127,167,false,true);
            addMovies_imageView.setImage(image);
        
            getData.path = file.getAbsolutePath();
        
        }
    
    
    
    }
    
    
    
    public void movieId(){
    
    
        String sql = "SELECT count(id) FROM movie";
        connect = database.connectDb();
    
        try{
        
         prepare = connect.prepareStatement(sql);
        result = prepare.executeQuery();
        
       if(result.next()){
       getData.movieId = result.getInt("count(id)");
       }
    
        
        
        
        
        } catch(Exception e){e.printStackTrace();}
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    public void insertAddMovies(){
    
        String sql1 = "SELECT * From movie WHERE movieTitle = '" + 
                addMovies_movieTitle.getText()+"'";
        
        connect = database.connectDb();
        Alert alert;
    
        try{
        
            statement = connect.createStatement();
            //prepare = connect.prepareStatement(sql1);
            
            
            if(result.next()){
            
                  alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText(addMovies_movieTitle.getText() + " was already exist");
                alert.showAndWait();
            
            
            } else{
                
                
                 if(addMovies_movieTitle.getText().isEmpty() || addMovies_genre.getText().isEmpty()||
                         addMovies_duration.getText().isEmpty() || addMovies_imageView.getImage() == null ||
                         addMovies_date.getValue() == null
                         ){
            
                  alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Please Fill those boxes");
                alert.showAndWait();
                
                 }
                 
                 else{
                     
                  String sql = "INSERT INTO movie (movieTitle,genre,duration,image,date,current) VALUES (?,?,?,?,?,?)";
                   String uri = getData.path;
            uri = uri.replace("\\","\\\\");
            
            
            movieId();
            
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, addMovies_movieTitle.getText());
            prepare.setString(2, addMovies_genre.getText());
            prepare.setString(3, addMovies_duration.getText());
            prepare.setString(4, uri);
            prepare.setString(5, String.valueOf(addMovies_date.getValue()));
             prepare.setString(6,"Not Showing");
            
                prepare.execute();
                 alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText(addMovies_movieTitle.getText() + " is Added Successfully");
                alert.showAndWait();
                clearAddMoviesList();
                showAddMoviesList();
            
                 
                 }
            
            
            }
            
      
        
        }catch(Exception e){ e.printStackTrace();}
    
    
    
    
    }
    
    
    
    public void clearAddMoviesList(){
    
    addMovies_movieTitle.setText("");
    addMovies_genre.setText("");
    addMovies_duration.setText("");
    addMovies_imageView.setImage(null);
    addMovies_date.setValue(null);
    
    
    }
    
    
    
    
    
    
    public ObservableList<moviesData> addMoviesList(){
    
    ObservableList<moviesData> listData = FXCollections.observableArrayList();
    
    String sql = "SELECT * FROM movie";
    
    connect = database.connectDb();
    
    try{
        
        prepare = connect.prepareStatement(sql);
        result = prepare.executeQuery();
        
        moviesData movD;
        
        
        while(result.next()){
        movD = new moviesData(result.getInt("id"), result.getString("movieTitle")
                ,result.getString("genre"), result.getString("duration"), result.getString("image"),
                result.getDate("date"), result.getString("current"));
        
        
        listData.add(movD);
        
        }
    
    } catch(Exception e) {e.printStackTrace();}
    return listData;
    }
    
    private ObservableList<moviesData> listAddMovies;
    public void showAddMoviesList(){
    
        
        listAddMovies = addMoviesList();
        
        addMovies_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        addMovies_col_genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        addMovies_col_duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        addMovies_col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        addMovies_col_movieTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
    
        
        addMovies_tableView.setItems(listAddMovies);
    
    
    }
    
    
    
    public void selectAddMoviesList(){
    
        moviesData movD = addMovies_tableView.getSelectionModel().getSelectedItem();
        int num = addMovies_tableView.getSelectionModel().getSelectedIndex();
        
        
        if((num-1) < -1){
        return ;
        
        }
        
        
        addMovies_movieTitle.setText(movD.getTitle());
        addMovies_genre.setText(movD.getGenre());
        addMovies_duration.setText(movD.getDuration());
        
        String getDate = String.valueOf(movD.getDate());
        
      
        
        String uri = "file:" + movD.getImage();
        
        image = new Image(uri, 127, 167, false, true);
        addMovies_imageView.setImage(image);
        
        addMovies_date.setValue(movD.getDate().toLocalDate());
        
    }
    
    
    
    
    public void logout(){
        signout.getScene().getWindow().hide();
        
        try{
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
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
        
        
        } catch(Exception e){e.printStackTrace();}
    
    }
    
    
    
    public void switchForm(ActionEvent event){
    
        
        if(event.getSource() == dashboard_btn){
    dashboard_form.setVisible(true);
    addMovies_form.setVisible(false);
    availableMovies_form.setVisible(false);
    editScreening_form.setVisible(false);
    customers_form.setVisible(false);
    
    dashboard_btn.setStyle("-fx-background-color:#4BB8FF;");
    addMovies_btn.setStyle("-fx-background-color:transparent");
    availableMovies_btn.setStyle("-fx-background-color:transparent");
    editScreening_btn.setStyle("-fx-background-color:transparent");
    customers_btn.setStyle("-fx-background-color:transparent");
    
        }
        
        else if(event.getSource() == addMovies_btn){
        
            dashboard_form.setVisible(false);
    addMovies_form.setVisible(true);
    availableMovies_form.setVisible(false);
    editScreening_form.setVisible(false);
    customers_form.setVisible(false);
    
    
    addMovies_btn.setStyle("-fx-background-color:#4BB8FF;");
   dashboard_btn.setStyle("-fx-background-color:transparent");
    availableMovies_btn.setStyle("-fx-background-color:transparent");
    editScreening_btn.setStyle("-fx-background-color:transparent");
    customers_btn.setStyle("-fx-background-color:transparent");
    
    showAddMoviesList();
    
        }
        
              else if(event.getSource() == availableMovies_btn){
        
            dashboard_form.setVisible(false);
    addMovies_form.setVisible(false);
    availableMovies_form.setVisible(true);
    editScreening_form.setVisible(false);
    customers_form.setVisible(false);
   
    
      availableMovies_btn.setStyle("-fx-background-color:#4BB8FF;");
    addMovies_btn.setStyle("-fx-background-color:transparent");
    dashboard_btn.setStyle("-fx-background-color:transparent");
    editScreening_btn.setStyle("-fx-background-color:transparent");
    customers_btn.setStyle("-fx-background-color:transparent");
    
    
    showAvailableMovies();
    
    
    
    
        }
        
        
             else if(event.getSource() == editScreening_btn){
        
            dashboard_form.setVisible(false);
    addMovies_form.setVisible(false);
    availableMovies_form.setVisible(false);
    editScreening_form.setVisible(true);
    customers_form.setVisible(false);
    
    
   
      editScreening_btn.setStyle("-fx-background-color:#4BB8FF;");
    addMovies_btn.setStyle("-fx-background-color:transparent");
    availableMovies_btn.setStyle("-fx-background-color:transparent");
     dashboard_btn.setStyle("-fx-background-color:transparent");
    customers_btn.setStyle("-fx-background-color:transparent");
    
    showEditScreening();
        }
        
                  else if(event.getSource() == customers_btn){
        
            dashboard_form.setVisible(false);
    addMovies_form.setVisible(false);
    availableMovies_form.setVisible(false);
    editScreening_form.setVisible(false);
    customers_form.setVisible(true);
    
    
    
    customers_btn.setStyle("-fx-background-color:#4BB8FF;");
    addMovies_btn.setStyle("-fx-background-color:transparent");
    availableMovies_btn.setStyle("-fx-background-color:transparent");
    editScreening_btn.setStyle("-fx-background-color:transparent");
     dashboard_btn.setStyle("-fx-background-color:transparent");
        }
        
        
    
    }
    
    
    
    
    
    
    
    
    
    

    public void displayUsername(){
    username.setText(getData.username);
    }
    
        
    public void close(){
    System.exit(0);
    }
    
    public void minimize(){
        
    Stage stage = (Stage)topForm.getScene().getWindow();
    stage.setIconified(true);
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    
    
    
    
    
    public void initialize(URL location, ResourceBundle resources){
        
        displayUsername();
        showAddMoviesList();
        showEditScreening();
        comboBox();
        showAvailableMovies();
        showSpinnerValue();
    }
    
}
