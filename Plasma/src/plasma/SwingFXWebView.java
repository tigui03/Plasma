/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plasma;

/**
 *
 * @author guillaumeb
 */
import com.sun.javafx.application.PlatformImpl;
import java.awt.BorderLayout;
//import java.awt.Color;
import java.awt.Dimension;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
  
/** 
 * SwingFXWebView 
 */  
public class SwingFXWebView extends JPanel {  
     
    //public Stage stage;  
    private WebView browser;  
    private JFXPanel jfxPanel;  
    private WebEngine webEngine;  
  
    public SwingFXWebView(){  
        initComponents();  
    }  
  
    public static void main(String ...args){  
        // Run this later:
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {  
                final JFrame frame = new JFrame();
                 
                frame.getContentPane().add(new SwingFXWebView());  
                 
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
        PlatformImpl.startup(new Runnable() {  
            @Override
            public void run() {
   
                VBox root = new VBox();  
                Scene scene;  
                scene = new Scene(root,1174,800);
                //scene.setFill(Color.TRANSLUCENT);
                
                browser = new WebView();               
             
                webEngine = browser.getEngine();
                
                webEngine.load("http://192.168.0.60");
                
                ObservableList<Node> children = root.getChildren();
                children.add(browser);                     
                 
                jfxPanel.setScene(scene);  
            }  
        });  
    }

}