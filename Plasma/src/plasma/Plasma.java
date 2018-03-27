/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plasma;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author guillaumeb
 */
public class Plasma extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        String[] args = null;
        
        MainForm.main(args);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
}
