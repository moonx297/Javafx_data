package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			// stage -> scene -> container -> node
			
			Label label = new Label();
//			label.setText(num);  타입이 label이라 num를 쓸 수 없다. 그래서 에러가 뜸
			label.setText(Integer.toString(num));
			label.setStyle("-fx-font-size:50");
			
			Button button = new Button();
			button.setText("Add");
			button.setStyle("-fx-font-size: 15");
			button.setOnAction(e -> {			//람다식 -> 객체로 되어있는 것을 함수로 만들때 쓰는거야!
				//버튼을 누르면 밑에거를 실행해줘~ 라는 식.
				num++;
				label.setText(Integer.toString(num));
			});
						
			StackPane pane = new StackPane(); 			//container 
//			pane.getChildren().add(label);
//			pane.getChildren().add(button);
			//-> 여러번 쓸 필요 없고, 한번에 추가하는 함수 : addAll
			pane.getChildren().addAll(label, button);
			StackPane.setAlignment(button, Pos.BOTTOM_CENTER);
			
			Scene scene = new Scene(pane, 350, 150); 	//scene
			
			stage.setScene(scene);						//stage
			stage.setTitle("Add Program");
			stage.setResizable(false);
			
			//여기까지 했지만 실행이 안되는 이유는? show가 없어서!
		//	stage.setResizable(false);  				이거 실행하면 창이 사이즈가 움직이지 않아~
			stage.show();								//show가 있어야 창이 뜨는거얌
					
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	int num = 0;		//변수를 밖에다가 선언하면 전역변수가 된다. 전역변수 쓸래!
	
	public static void main(String[] args) {
		launch(args);
	}
}
