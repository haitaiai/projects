import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	protected TextField txtA;
	@FXML
	protected TextField txtB;
	@FXML
	protected TextField txtC;
	@FXML
	private Label lblDelta;
	@FXML
	private Label lblX1;
	@FXML
	private Label lblX2;
	@FXML
	private Button btnCalcular;
	
	
	public void initialize() {
		
		
	}
	
	@FXML
	public void calcular() {
		Conta c1 = new Conta();
		
		lblDelta.setText(c1.delta());
	}
	
}
