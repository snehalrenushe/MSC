import java.util.*;

public class WeatherData implements Subject
{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humadity;
	private float pressure;
	
	public WeatherData()
	{
		observers = new ArrayList<>();
	}
	
	public void registerObserver(Observer o)
	{
		observers.add(o);
	}
	
	public void removeObserver(Observer o)
	{
		int i = observers.indexOf(o);
		if(i >= 0)
		{
			observers.remove(i);
		}
	}
	
	public void notifyObservers()
	{
		for(int i = 0; i < observers.size(); i++)
		{
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature,humadity,pressure);
		}
	}
	
	public void measurementsChanged()
	{
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humadity,float pressure)
	{
		this.temperature = temperature;
		this.humadity = humadity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature()
	{
		return temperature;
	}
	
	public float getHumidity()
	{
		return humadity;
	}
	
	public float getPressure()
	{
		return pressure;
	}
	
}