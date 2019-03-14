package bdj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Simple_Loan_CalculatorController implements Initializable {

    @FXML
    private AnchorPane loanCalculatorPane;
    @FXML
    private Label amount_label;
    @FXML
    private Label interest_label;
    @FXML
    private Label terms_label;
    @FXML
    private Label payments_label;
    @FXML
    private TextField amountTextField;
    @FXML
    private Slider interestSlider;
    @FXML
    private ChoiceBox<?> termChoice;
    @FXML
    private TextField paymentsTextField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        interest_label.setText(String.format("Interest %.2f%%", interestSlider.getValue()));
        
        interestSlider.valueProperty().addListener{
            new ChangeListener()
        }
    }    
    
}
