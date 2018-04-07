import java.util.Scanner;
public class Temperature
{
	private float temperature;
	private char scale;
	private float result;

	public Temperature()
	{
		setTemp((float)0.0);
		setScale('C');  
	}
	public Temperature(float degree)
	{
		setTemp(degree);
		setScale('C');
	}

	public Temperature(char scaleChar)
	{
		setScale(scaleChar); 
		setTemp((float)0.0);
	}

	public Temperature(char scaleChar, float degree)
	{
		setScale(scaleChar); 
		setTemp(degree);
	}

	public void setTemp(float degree)
	{
		temperature = degree;
	}

	public float getTemp()
	{      
		return temperature;
	}
	public void setScale(char scaleValue)
	{
		scale = scaleValue;

	}
	public char getScale()
	{
		return scale;
	}

	public void setResult(float resultValue)
	{
		result = resultValue;
	}

	public float getResult()
	{

		return result;
	}

	public void setValues(char scaleValue, float result)
	{

		setScale(scaleValue);
		setTemp(result);
	}

	public float FahrenheitToCelsius(float value)
	{


		return (5*(value - 32))/9;
	}

	public float CelsiusToFahrenheit(float value)
	{


		return ((9*value)/5) + 32;
	}

	public boolean ifEqual(float temperature1, float temperature2)
	{

		if (temperature1 == temperature2)

			return true;

		else 

			return false;

	}

	public boolean ifGreater(float temperature1, float temperature2)
	{

		if (temperature1 > temperature2)

			return true;

		else 

			return false;

	}

	public boolean ifLess(float temperature1, float temperature2)
	{

		if (temperature1 < temperature2)

			return true;

		else
			return false;



	}
}