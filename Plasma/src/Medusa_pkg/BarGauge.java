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
import eu.hansolo.medusa.LcdFont;
import eu.hansolo.medusa.Marker;
import eu.hansolo.medusa.Section;
import eu.hansolo.medusa.TickLabelLocation;
import eu.hansolo.medusa.events.UpdateEvent;
import java.awt.BorderLayout;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
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
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                frame.getContentPane().add(new BarGauge());  
                 
                //frame.setMinimumSize(new Dimension((400), 400));  
                
                frame.setVisible(true);  
            }  
        });     
    }  
    
    
    private void initComponents(){  
        
        value  = new SimpleDoubleProperty(25); 
        gauge = GaugeBuilder.create()
                            .skinType(SkinType.MODERN)
                            //.prefSize(400, 400)
                            .knobPosition(Pos.BOTTOM_LEFT)
                            .tickLabelLocation(TickLabelLocation.OUTSIDE)
                            .decimals(0)
                            .minValue(-30)
                            .maxValue(120)
                            .startFromZero(true)
                            .animated(true)
                            //.checkThreshold(true)
                            //.onThresholdExceeded(e -> System.out.println("threshold exceeded"))
                            .lcdVisible(true)
                            .lcdFont(LcdFont.LCD)
                            //.locale(Locale.GERMANY)
                            .title("Very Large Titlee")
                            .unit("\u00B0C")
                            .subTitle("Only")
                            //.interactive(true)
                            //.onButtonPressed(o -> System.out.println("Button pressed"))
                            .sections(new Section(-30,  0, Color.rgb(  0,   0, 255), Color.rgb(  0,   0, 255)),
                                      new Section(  0, 25, Color.rgb(255, 255,   0), Color.rgb(255, 255,   0)),
                                      new Section( 75,100, Color.rgb(255,   0,   0), Color.rgb(255, 255,   0)))
                            .sectionsVisible(false)
                            .highlightSections(true)
                            .autoScale(true)
                            .averagingEnabled(true)
                            .averagingPeriod(10)
                            .averageVisible(true)
                            .markers(
                                new Marker( 0, "M1", Color.rgb(  0,   0, 255, 0.95), Marker.MarkerType.DOT),
                                new Marker(25, "M2", Color.rgb(255, 255,   0, 0.95), Marker.MarkerType.STANDARD),
                                new Marker(50, "M3", Color.rgb(255, 255,   0, 0.95), Marker.MarkerType.TRIANGLE)
                            )
                            .markersVisible(true)
                            .ledVisible(true)
                            //.ledType(LedType.FLAT)
                            .thresholdVisible(true)
                            .threshold(40)
                            .checkThreshold(true)
                            .onThresholdExceeded(e -> gauge.setLedBlinking(true))
                            .onThresholdUnderrun(e -> gauge.setLedBlinking(false))
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
