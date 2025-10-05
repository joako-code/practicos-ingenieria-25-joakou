public class CurrentConditionsCentigradosDisplay implements Observer, DisplayElement {
    float temperature;
    float humidity;
    WeatherData weatherData;

    public CurrentConditionsCentigradosDisplay(){

    }

    public CurrentConditionsCentigradosDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + (temperature -32) * 5/9
			+ "G degrees and " + humidity + "% humidity");
	}
}
