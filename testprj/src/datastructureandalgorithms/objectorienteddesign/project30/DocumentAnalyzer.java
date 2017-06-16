package datastructureandalgorithms.objectorienteddesign.project30;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DocumentAnalyzer extends Application {

	//private static final String SOURCE = "file:src/datastructureandalgorithms/objectorienteddesign/project30/article.txt";
	
	private static final String SOURCE = "https://www.google.de/search/about/";

	private static final int ChartSize = 10;

	private static Map<String, Integer> topFrequentWords;

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void start(Stage stage){
		
		AbstractDocument document = new TextDocument(SOURCE);
		try {
			topFrequentWords = document.getMostFrequentWords(ChartSize);
		} catch (Exception e) {
			
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Word Frequency Chart");
		    dialogStage.initModality(Modality.WINDOW_MODAL);

		    VBox vbox = new VBox(new Text(sw.toString()));
		    vbox.setAlignment(Pos.CENTER);
		    vbox.setPadding(new Insets(15));

		    dialogStage.setScene(new Scene(vbox));
		    dialogStage.show();
		    
		    return;
		}
		
		
		stage.setTitle("Word Frequency Chart");

		final CategoryAxis xAxis = new CategoryAxis();
		final NumberAxis yAxis = new NumberAxis();
		final BarChart<String, Number> bc = new BarChart<>(xAxis, yAxis);

		bc.setTitle("Word Frequency Chart");
		xAxis.setLabel("Word");
		yAxis.setLabel("Frequency");
		yAxis.setAutoRanging(false);
		yAxis.setUpperBound((int)(document.getMaxFrequency()*1.2));
		
		XYChart.Series series = new XYChart.Series();
		series.setName(SOURCE);   
		

		for (Map.Entry<String, Integer> entry : topFrequentWords.entrySet())
			series.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
		
		Scene scene = new Scene(bc, 800, 600);
		bc.getData().addAll(series);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {

		launch(args);
	}
}