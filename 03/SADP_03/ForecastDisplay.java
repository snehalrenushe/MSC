public class ForecastDisplay implements Observer
{
	private float currentPressure = 29.9f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData)
	{
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temp,float humadity,float pressure)
	{
		lastPressure = currentPressure;
		currentPressure = pressure;
		
		display();
	}

	public void display()
	{
		System.out.println("Forecast: ");
		
		if(currentPressure>lastPressure)
		{
			System.out.println("Improving weather on the way!");
		}
		else if(currentPressure == lastPressure)
		{
			System.out.println("More of the same");
		}
		else if(currentPressure < lastPressure)
		{
			System.out.println("Watch out for cooler,rainy weather");
		}
	}
}