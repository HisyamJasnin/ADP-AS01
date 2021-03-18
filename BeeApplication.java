package ADPassignment1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BeeApplication extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		Bee bee = new Bee();
		
		Pane root = new Pane();
		root.getChildren().addAll(bee);
		
		Scene scene = new Scene(root, 1400, 800);
		arg0.setScene(scene);
		arg0.show();
		arg0.setTitle("Drawing a bee");
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	

}
