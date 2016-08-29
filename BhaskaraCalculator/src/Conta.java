import javafx.scene.control.TextField;

public class Conta extends Controller {
	
	int A = Integer.parseInt(txtA.getText());
	int B = Integer.parseInt(txtB.getText());
	int C = Integer.parseInt(txtC.getText());
	
	public String delta() {
		int delta = (B*B) - 4 * A * C;
		return delta();
	}
	
}
