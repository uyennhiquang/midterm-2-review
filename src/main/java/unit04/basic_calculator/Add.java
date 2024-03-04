package unit04.basic_calculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class Add implements EventHandler<ActionEvent>{
  private Label displayLabel;

  public Add(Label displayLabel) {
    this.displayLabel = displayLabel;
  }


  @Override
  public void handle(ActionEvent event) {
    int parsedNum = Integer.parseInt(this.displayLabel.getText());
    this.displayLabel.setText(Integer.toString((parsedNum + 1)));
  }
  
}
