package sample;

import com.sun.javafx.scene.control.TabObservableList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;

import java.io.*;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TableView<user> seac;
    @FXML
    private TabPane tabpa;
    @FXML
    private Tab tab10;
    @FXML
    private HBox box;
    @FXML
    private TableColumn<user, String> sn;
    @FXML
    private TableColumn<user, String> cn;

    ObservableList<user> ob = FXCollections.observableArrayList();
   public void showtab(){
       for(int i = 0;i<3;i++) {
           user us = new user();
           us.setName("mingzi");
           us.setCcno("yihang");
           sn.setCellValueFactory(new PropertyValueFactory<user, String>("name"));
           cn.setCellValueFactory(new PropertyValueFactory<user, String>("ccno"));
//           ob.add(us);
//       seac.setItems(ob);
//       user us = new user();
//       us.setName("liuli");
//       us.setCcno("yihang");
//       sn.setCellValueFactory(new PropertyValueFactory<user,String>("name"));
//       cn.setCellValueFactory(new PropertyValueFactory<user,String>("ccno"));
           ob.add(us);
           seac.setItems(ob);
       }
   }
   int i = 0;
   public void adtab(ActionEvent event){
       TextArea tx = new TextArea("keyide");
       tab10.setContent(tx);
       tx.requestFocus();//焦点
       tab10.isSelected();//选中
       Tab tab = new Tab();
       HBox hbox = new HBox();
       tab.setContent(hbox);
       Line li = new Line();
       li.setStartX(0.0f);
       li.setStartY(0.0f);
       li.setEndX(100.0f);
       li.setEndY(100.0f);
       hbox.getChildren().add(li);
       tab.setText("tab"+i);
       i++;
//       tab.setStyle("-fx-background-color;pink");
       tabpa.getTabs().add(tab);
   }
//   public void getscen(){
//       Image image = new Image(getClass().getResourceAsStream("icon.png"));
//       ToggleButton tb = new ToggleButton ("Press me", new ImageView(image));
//       ProgressBar p2 = new ProgressBar();//进度条
//       PasswordField passwordField = new PasswordField();//密码框
//       Hyperlink link = new Hyperlink("www.w3cschool.cn");//超链接
//       ProgressBar p21 = new ProgressBar();//进度条
//       customMenuItem.setHideOnClick(false);//菜单之间加线条
//       ScrollBar s1 = new ScrollBar();//滚动条
//Pagination pagination1 = new Pagination();//分页
//
//   }
//   public void savefile(){
//       FileChooser fileChooser1 = new FileChooser();
//       fileChooser1.setTitle("Save Image");
//       System.out.println(pic.getId());
//       File file = fileChooser1.showSaveDialog(stage);
//       System.out.println(file);
//   }
public void readchar(){
       char a = 'a';
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("shuruqtuichu");
    do{
        try {
            a = (char)br.read();//readline 获取字符串；本来read得到的是数值
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }while (a!=' ');

}
public void readfi(){
       File d = new File("c/java/helloword");
    try {
        InputStream a = new FileInputStream(d);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    try {
        OutputStream s = new FileOutputStream(d);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    byte writer[] = {11,12,50};
    try {
        OutputStream s = null;
        try {
            s = new FileOutputStream("text.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        for (int x = 0; x < writer.length; x++) {
            try {
                s.write(writer[x]);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        try {
            s.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    } finally {

    }
}


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       showtab();
       //焦点requestFocus
        readchar();

    }
}
