/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loginpagebantal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLmemantauPerkembanganController implements Initializable {
//    private Stage stg;
//    private double moodDep, moodTing, moodCem;

    @FXML
    private TextField catatanperkembangan;
    @FXML
    private DatePicker tanggalharini;
    
    @FXML
    private TextField durasitidur;

    @FXML
    private CheckBox gejalapsikotikharini;

    @FXML
    private CheckBox ldknemosi;

    @FXML
    private CheckBox menemuitngaahli;

    
    @FXML
    private ToggleGroup Moddepresi;
    @FXML
    private RadioButton moddepr0;
    @FXML
    private RadioButton moddepr1;
    @FXML
    private RadioButton moddepr2;
    @FXML
    private RadioButton moddepr3;

    @FXML
    private Button Simpan;
    @FXML
    private Button Lanjut;
    
    
    @FXML
    private ToggleGroup moddtinggi;

    @FXML
    private RadioButton modtinggi0;

    @FXML
    private RadioButton modtinggi1;

    @FXML
    private RadioButton modtinggi2;

    @FXML
    private RadioButton modtinggi3;

    @FXML
    private RadioButton rasacemas0;

    @FXML
    private RadioButton rasacemas1;

    @FXML
    private RadioButton rasacemas2;

    @FXML
    private RadioButton rasacemas3;

    @FXML
    private ToggleGroup rasacms;

    @FXML
    private CheckBox sulitfokus;

    @FXML
    private void scenememantauperkembangan (ActionEvent event) throws IOException {
        Parent scene5 = FXMLLoader.load(getClass().getResource("FXMLmemantauPerkembanganChart.fxml"));
        Scene scene = new Scene(scene5);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Memantau Perkembangan chart");
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
////        mood depresi
//    if (moddepr0.isSelected()){
//        moodDep = 0;
//    }
//    else if ( dep1.isSelected()){
//        moodDep = 1;
//    }
//    else if ( dep2.isSelected()){
//        moodDep = 2;
//    }
//    else if ( dep3.isSelected()){
//        moodDep = 3;
//    }
//    
////    mood Tinggi
//    if (ting0.isSelected()){
//        moodTing = 0;
//    }
//    else if(ting1.isSelected()){
//        moodTing = 1;
//    }
//    else if(ting2.isSelected()){
//        moodTing = 2;
//    }
//    else if(ting3.isSelected()){
//        moodTing = 3;
//    }
//    
////    mood cemas
//    if (cem0.isSelected()){
//        moodCem = 0;
//    }
//    else if (cem1.isSelected()){
//        moodCem = 1;
//    }
//    else if (cem2.isSelected()){
//        moodCem = 2;
//    }
//    else if (cem3.isSelected()){
//        moodCem = 3;
//    }

    }

}
