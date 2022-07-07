/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loginpagebantal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class TableKonsultasiController implements Initializable {

    @FXML
    private Button Simpan;
    
    @FXML
    private Button Edit;
            
    @FXML
    private TableView <Konsultasi> TableKonsultasi;
    
    
    @FXML
    private TableColumn <Konsultasi,String> Alamat;
    
    @FXML
    private TableColumn <Konsultasi,String> Tanggalhari;
    
    @FXML
    private TableColumn <Konsultasi,String> tcwaktu;
    
    @FXML
    private TableColumn <Konsultasi,String> tatapmuka;
    
    @FXML
    private TableColumn <Konsultasi,String> Keluhan;
    
    DataArray datak;
    KonsultasiList dataKonsultasiList;
  
    ObservableList <Konsultasi> datakonsultasi = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Alamat.setCellValueFactory(new PropertyValueFactory <> ("Alamat"));
      Keluhan.setCellValueFactory(new PropertyValueFactory <> ("Keluhan"));
      tatapmuka.setCellValueFactory(new PropertyValueFactory <> ("tatapmuka"));
      tcwaktu.setCellValueFactory(new PropertyValueFactory <> ("Waktu"));
      Tanggalhari.setCellValueFactory(new PropertyValueFactory <> ("Tanggalhari"));
      
      XStream xstream = new XStream(new StaxDriver());
        FileInputStream berkasMasuk;
        try{
            berkasMasuk = new FileInputStream ("ListKonsultasi.xml");
            int isi;
            char c;
            String s = "";
            while ((isi = berkasMasuk.read()) != -1){
                c= (char) isi;
                s = s+ c;
            }
            dataKonsultasiList = (KonsultasiList) xstream.fromXML(s);
            berkasMasuk.close();
        } catch (Exception e){
            System.err.println("Terjadi kesalahan " + e.getMessage());
        }
        TableKonsultasi.setItems(dataKonsultasiList.getDataKonsultasi());
        dataKonsultasiList.showData();
        
        
        
        
        
        
//        try{
//            berkasMasuk = new FileInputStream ("dataKonsultasi.xml");
//            int isi;
//            char c;
//            String s = "";
//            while ((isi = berkasMasuk.read()) != -1){
//                c= (char) isi;
//                s = s+ c;
//            }
//            datak = (DataArray) xstream.fromXML(s);
//            berkasMasuk.close();
//        } catch (Exception e){
//            System.err.println("Terjadi kesalahan " + e.getMessage());
//        }
//        
//        datak.showData();
//        System.out.println("");
        
        
        
        
        
      
      
    }    
}