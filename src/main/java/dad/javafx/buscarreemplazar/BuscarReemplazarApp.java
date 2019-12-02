package dad.javafx.buscarreemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazarApp extends Application {

	Label buscarLabel;
	TextField buscarTextField;

	Label reemplazarLabel;
	TextField reemplazarTextField;

	CheckBox mayusMinusCheckBox;
	CheckBox buscarHaciaAtrasCheckBox;

	CheckBox regexCheckBox;
	CheckBox resalResultadosCheckBox;

	Button buscarButton;
	Button reemplazarButton;
	Button reemplazarAllButton;
	Button cerrarButton;
	Button ayudaButton;

	public void start(Stage primaryStage) throws Exception {

		// botones
		
		buscarButton = new Button("Buscar");
		buscarButton.setMinWidth(130);
		buscarButton.setMaxWidth(130);
		
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setMinWidth(130);
		reemplazarButton.setMaxWidth(130);
		
		reemplazarAllButton = new Button("Reemplazar todo");
		reemplazarAllButton.setMinWidth(130);
		reemplazarAllButton.setMaxWidth(130);
		
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMinWidth(130);
		cerrarButton.setMaxWidth(130);
		
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMinWidth(130);
		ayudaButton.setMaxWidth(130);
		
		
		VBox botonesVbox = new VBox(buscarButton, reemplazarButton, reemplazarAllButton, cerrarButton, ayudaButton);
		botonesVbox.setPadding(new Insets(5));
		botonesVbox.setSpacing(5);
		
		// labels

		buscarLabel = new Label("Buscar:");
		buscarLabel.setPrefWidth(90);
		buscarLabel.setMinWidth(48);

		reemplazarLabel = new Label("Reemplazar con:");
		reemplazarLabel.setPrefWidth(90);
		reemplazarLabel.setMinWidth(48);

		VBox textoLabelVbox = new VBox(buscarLabel, reemplazarLabel);
		textoLabelVbox.setSpacing(15);
		textoLabelVbox.setPadding(new Insets(5));

		buscarTextField = new TextField();
		reemplazarTextField = new TextField();

		// opciones primera linea
		
		mayusMinusCheckBox = new CheckBox("Mayúsculas y minúsculas");
		mayusMinusCheckBox.setPrefWidth(165);
		mayusMinusCheckBox.setMinWidth(135);
		
		buscarHaciaAtrasCheckBox = new CheckBox("Buscar hacia atrás");
		buscarHaciaAtrasCheckBox.setPrefWidth(130);
		buscarHaciaAtrasCheckBox.setMinWidth(98);
		
		HBox opcionesArribaHbox = new HBox(mayusMinusCheckBox, buscarHaciaAtrasCheckBox);

		// opciones segunda linea
		
		regexCheckBox = new CheckBox("Expresión regular");
		regexCheckBox.setPrefWidth(165);
		regexCheckBox.setMinWidth(135);
		
		resalResultadosCheckBox = new CheckBox("Resaltar resultados");
		resalResultadosCheckBox.setPrefWidth(130);
		resalResultadosCheckBox.setMinWidth(98);

		HBox opcionesAbajoHbox = new HBox(regexCheckBox, resalResultadosCheckBox);

		// union de textFields y opciones
		
		VBox textoLabelOpcionesVbox = new VBox(buscarTextField, reemplazarTextField, opcionesArribaHbox, opcionesAbajoHbox);
		
		textoLabelOpcionesVbox.setPadding(new Insets(5));
		textoLabelOpcionesVbox.setSpacing(5);


		// unificacion final
		
		HBox root = new HBox(textoLabelVbox, textoLabelOpcionesVbox, botonesVbox);

		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);

		Scene scene = new Scene(root, 560, 240);

		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
