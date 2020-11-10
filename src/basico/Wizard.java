package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
	}
	
	private void criarPasso1() {
		Button proximoPasso = new Button("Próximo passo >> 2");
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
	
		passo1 = new Scene(box, 400, 400);
	}
	
	private void criarPasso2() {
		Button passoAnterior = new Button("1 << Passo anterior");
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo1);
		});
		Button proximoPasso = new Button("Próximo passo >> 3");
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo3);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
	
		passo2 = new Scene(box, 400, 400);
	}
	
	private void criarPasso3() {
		Button passoAnterior = new Button("2 << Passo anterior");
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo2);
		});
		Button proximoPasso = new Button("Finalizar");
		proximoPasso.setOnAction(e -> {
			System.out.println("Finalizar");
			System.exit(0);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
	
		passo3 = new Scene(box, 400, 400);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
