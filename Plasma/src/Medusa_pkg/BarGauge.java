/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medusa_pkg;


import com.sun.javafx.application.PlatformImpl;
import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.Gauge.SkinType;
import eu.hansolo.medusa.GaugeBuilder;
import eu.hansolo.medusa.events.UpdateEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author guillaume
 */
public class BarGauge extends JPanel{
    
    private              Gauge           gauge;
    private              Double          epochSeconds;
    private              DoubleProperty  value;
    private              BooleanProperty toggle;
    private              JFXPanel        jfxPanel;  
    //private static       int             noOfNodes = 0;
        
    public BarGauge(){  
        initComponents();  
    }

    public static void main(String ...args){  
        // Run this later:
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {  
                final JFrame frame = new JFrame();
                 
                frame.getContentPane().add(new BarGauge());  
                 
                frame.setMinimumSize(new Dimension((400), 400));  
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                frame.setVisible(true);  
            }  
        });     
    }  
    
    
    private void initComponents(){  
        
        value  = new SimpleDoubleProperty(100); 
        gauge = GaugeBuilder.create()
                  .skinType(SkinType.MODERN)                                                        // Skin for your Gauge
                  .decimals(0)
                  .build();         
 
        gauge.valueProperty().bindBidirectional(value);
        gauge.getSections().forEach(section -> section.setOnSectionUpdate(sectionEvent -> gauge.fireUpdateEvent(new UpdateEvent(BarGauge.this, UpdateEvent.EventType.REDRAW))));
        
              
        jfxPanel = new JFXPanel();
        createScene();
        jfxPanel.setBackground(java.awt.Color.darkGray);
        setLayout(new BorderLayout());  
        add(jfxPanel, BorderLayout.CENTER);  
         
    }     

    
    private void createScene() {  
        PlatformImpl.startup(new Runnable() {  
            @Override
            public void run() {
                
                StackPane pane;
                pane = new StackPane(gauge);
                pane.setPadding(new Insets(20));
                pane.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);

                LinearGradient gradient = new LinearGradient(0, 0, 0, pane.getLayoutBounds().getHeight(),
                                                             false, CycleMethod.NO_CYCLE,
                                                             new Stop(0.0, Color.rgb(38, 38, 38)),
                                                             new Stop(1.0, Color.rgb(15, 15, 15)));
                pane.setBackground(new Background(new BackgroundFill(gradient, CornerRadii.EMPTY, Insets.EMPTY)));
                pane.setBackground(new Background(new BackgroundFill(Color.rgb(39,44,50), CornerRadii.EMPTY, Insets.EMPTY)));
                pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
                pane.setBackground(new Background(new BackgroundFill(Gauge.DARK_COLOR, CornerRadii.EMPTY, Insets.EMPTY)));


                Scene scene = new Scene(pane);
                scene.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                
                jfxPanel.setScene(scene);  
            }  
        });  
    }

    
}
