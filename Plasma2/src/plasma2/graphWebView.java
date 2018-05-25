/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plasma2;

/**
 *
 * @author guillaumeb
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
  
/** 
 * graphWebView 
 */  
public class graphWebView extends JPanel  {  
          
    private JFXPanel jfxPanel;  
      
  
    public graphWebView(){  
        initComponents();  
    }  
  
    public static void main(String ...args){  
        // Run this later:
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {  
                final JFrame frame = new JFrame();
                 
                frame.getContentPane().add(new graphWebView());  
                 
                frame.setMinimumSize(new Dimension((400), 400));  
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                frame.setVisible(true);  
            }  
        });     
    }  
     
    private void initComponents(){  
        
        jfxPanel = new JFXPanel();             
        createScene();
        jfxPanel.setBackground(java.awt.Color.darkGray);
        setLayout(new BorderLayout());  
        add(jfxPanel, BorderLayout.CENTER);  
         
    }     
     
    /** 
     * createScene 
     * 
     * Note: Key is that Scene needs to be created and run on "FX user thread" 
     *       NOT on the AWT-EventQueue Thread 
     * 
     */  
    private void createScene() {       
       WebEngine webEngine; 
       WebView browser;               
                 
                StackPane root = new StackPane(); 
                Scene scene;  
                scene = new Scene(root);
                             
                browser = new WebView();               
                
                webEngine = browser.getEngine();
                
                webEngine.load("http://192.168.0.60/index.htm");
                
                root.getChildren().add(browser);
                
                
                jfxPanel.setScene(scene); 
                
                
        //return false;
    }


    
}