package javaproject_4w;



//오류 해결 안되고 있음. 문제가 뭔지 찾아야함.

import java.util.Calendar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.stage.Stage;



public class BioRhythms162 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	int dayWith= 25;
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//생일
		int year=1971;
		int month=9;
		int day=28;
		
		long live= BioCalendar162.days(year, month, day); //오늘까지 살아온 날
		
		CategoryAxis xAxis= new CategoryAxis();
		NumberAxis yAxis= new NumberAxis();
		yAxis.setLabel("Bio Power");
		xAxis.setLabel("Date");
		
		LineChart<String, Number> lineChart = new LineChart<String, Number>(xAxis, yAxis);
		lineChart.setTitle("My Biorhythm");
		
		//신체지수
		XYChart.Series<String, Number> series1= new XYChart.Series<String, Number>();
		XYChart.Series<String, Number> series5= new XYChart.Series<String, Number>();
		physicalChartData(series1,live); //신체지수 그리기
		vertical(series5); //수직선 그리기
		
		Scene scene= new Scene(lineChart,1200, 600);
		
		lineChart.getData().addAll(series1,series5); //점들을 선으로 연결
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	//오늘 수직선
	public void vertical(XYChart.Series<String, Number> series) {
		// TODO Auto-generated method stub
		Calendar todayCal = Calendar.getInstance();
		series.setName("Today");
		
		//오늘- 최대값, 최소값을 수직 연결
		series.getData().add(new XYChart.Data<String, Number>(RestDay.toStrDate(todayCal),125));
		series.getData().add(new XYChart.Data<String, Number>(RestDay.toStrDate(todayCal),-125));
		
	}
	
	//신체지수 그리기 -점 연결
	public void physicalChartData(Series<String, Number> series, long live) {
		// TODO Auto-generated method stub
		Calendar todayCal=Calendar.getInstance();
	    series.setName("PHYSICAL");
	    for (int i = -dayWith; i < dayWith+1; i++) {
	    	 Calendar bf15day=RestDay.dateAfOrBf(todayCal,i);  // 살아온 날
	    	 double value=BioCalendar162.getPhysical(live+i,100); // 신체지수 값
	    	 // 날짜에 대하여 신체지수 값을 XY로 점을 찍고 연결
	    	 series.getData().add(new XYChart.Data<String, Number>(RestDay.toStrDate(bf15day), value));
	 	}
	}

}
