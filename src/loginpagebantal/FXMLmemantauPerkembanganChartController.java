 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loginpagebantal;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLmemantauPerkembanganChartController implements Initializable {
    XYChart.Series depresi = new XYChart.Series<>();
    XYChart.Series tinggi = new XYChart.Series<>();
    
    
    
    XYChart.Series datagejala = new XYChart.Series<>();
    XYChart.Series dataKonsultasi = new XYChart.Series<>();
    XYChart.Series datalc = new XYChart.Series<>();
    
    @FXML
    private LineChart lcDurasi;
    
    @FXML
    private BarChart bcGejalaKunjung;
    
    
    @FXML
    private BarChart bcMood;
    
    @FXML
    private Button bDashProfil;
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //piechart mood                                   
        
        depresi.setName("Depresi");       
        depresi.getData().add(new XYChart.Data("1", 3));
        depresi.getData().add(new XYChart.Data("2", 2));
        depresi.getData().add(new XYChart.Data("3", 3));
        depresi.getData().add(new XYChart.Data("4", 2));
        depresi.getData().add(new XYChart.Data("5", 0));
        depresi.getData().add(new XYChart.Data("6", 1));
        depresi.getData().add(new XYChart.Data("7", 0));
        
        
        tinggi.setName("tinggi");       
        tinggi.getData().add(new XYChart.Data("1", 3));
        tinggi.getData().add(new XYChart.Data("2", 1));
        tinggi.getData().add(new XYChart.Data("3", 2));
        tinggi.getData().add(new XYChart.Data("4", 0));
        tinggi.getData().add(new XYChart.Data("5", 0));
        tinggi.getData().add(new XYChart.Data("6", 1));
        tinggi.getData().add(new XYChart.Data("7", 3));
        
        
        
        bcMood.getData().addAll(depresi, tinggi);
        
        
        
        
        
        //linechar durasi tidur
        datalc.setName("Durasi tidur");
        datalc.getData().add(new XYChart.Data("1" , 8));
        datalc.getData().add(new XYChart.Data("2" , 7));
        datalc.getData().add(new XYChart.Data("3" , 4));
        datalc.getData().add(new XYChart.Data("4" , 6));
        datalc.getData().add(new XYChart.Data("5" , 8));
        datalc.getData().add(new XYChart.Data("6" , 9));
        datalc.getData().add(new XYChart.Data("7" , 12));
        
        lcDurasi.getData().addAll(datalc);
        
        //Bar chart gejala psikotik dan kunjungan tenaga ahli
        datagejala.getData().add(new XYChart.Data("gejala" , 8));
        dataKonsultasi.getData().add(new XYChart.Data("konsultasi" , 7));
        
        bcGejalaKunjung.getData().addAll(datagejala, dataKonsultasi);
        
    }
    
}

