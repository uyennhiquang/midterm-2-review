package unit04.basic_calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorGUI extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {

    HBox hbox = new HBox();
    VBox vbox = new VBox();
    
    Label titleLabel = makeLabel("Increment/Decrement Calculator");
    Label numberLabel = makeLabel("0");

    Button incrementBtn = makeButton("+");
    Button decrementBtn = makeButton("-");

    incrementBtn.setOnAction(new Add(numberLabel));
    decrementBtn.setOnAction(new Sub(numberLabel));

    hbox.getChildren().addAll(incrementBtn, decrementBtn);

    vbox.getChildren().addAll(titleLabel, numberLabel, hbox);
    Scene scene = new Scene(vbox);

    primaryStage.setScene(scene);
    primaryStage.setTitle("Hello, World!");
    primaryStage.show();
  }

  private Label makeLabel(String msg) {

    Label label = new Label(msg);
    label.setMaxWidth(Integer.MAX_VALUE);
    label.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    label.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID,
        CornerRadii.EMPTY, BorderStroke.THIN)));
    return label;
  }

      private Button makeButton(String msg){
        Button button = new Button(msg);
        button.setMaxWidth(Integer.MAX_VALUE);
        button.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        button.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, 
        CornerRadii.EMPTY, BorderStroke.THIN)));
        return button;
    }

  public static void main(String[] args) {
    launch(args);
  }
}
