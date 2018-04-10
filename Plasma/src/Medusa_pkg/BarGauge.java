/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medusa_pkg;


import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.Gauge.SkinType;
import eu.hansolo.medusa.GaugeBuilder;
import eu.hansolo.medusa.LcdFont;
import eu.hansolo.medusa.Marker;
import eu.hansolo.medusa.Section;
import eu.hansolo.medusa.Test;
import eu.hansolo.medusa.TickLabelLocation;
import eu.hansolo.medusa.events.UpdateEvent;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

/**
 *
 * @author guillaume
 */
public class BarGauge extends Application{
    
    private              Gauge           gauge;
    private              Double          epochSeconds;
    private              DoubleProperty  value;
    private              BooleanProperty toggle;
    private              JFXPanel        jfxPanel;  
    //private static       int             noOfNodes = 0;
    
     @Override public void init() { 
         
        value  = new SimpleDoubleProperty(0);  
        value.setValue(98.0);  
        gauge = GaugeBuilder.create()
                  .skinType(SkinType.MODERN)                                                        // Skin for your Gauge
                  .decimals(1)
                  .build();         
 
        gauge.valueProperty().bindBidirectional(value);
        gauge.getSections().forEach(section -> section.setOnSectionUpdate(sectionEvent -> gauge.fireUpdateEvent(new UpdateEvent(BarGauge.this, UpdateEvent.EventType.REDRAW))));
     
     }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
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

        primaryStage.setTitle("Medusaaa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    @Override public void stop() {
        System.exit(0);
    }

    
}
