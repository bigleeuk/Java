
public class Ex6_10 {

	public static void main(String args[])
    {
		//double a;
        System.out.println("testing the First temperature");
        Temperature temperatureNo1 = new Temperature(0);
       // a=(double)temperatureNo1.getTemp();
        System.out.println("Current Value of Scale: " + temperatureNo1.getScale());
        System.out.println("Current Value of Temperature: " + temperatureNo1.getTemp());            
        System.out.println("Equal: " + temperatureNo1.ifEqual((float)temperatureNo1.getTemp(), temperatureNo1.FahrenheitToCelsius((float)32.0)));         
        System.out.println("Less: " + temperatureNo1.ifLess((float)temperatureNo1.getTemp(), temperatureNo1.FahrenheitToCelsius((float)32.0)));       
        System.out.println("Greater: " + temperatureNo1.ifGreater((float)temperatureNo1.getTemp(), temperatureNo1.FahrenheitToCelsius((float)32.0)));                 
        System.out.println("");
        System.out.println("");         
        System.out.println("testing the Second temperature");
        
        Temperature temperatureNo2 = new Temperature(-40);      
        System.out.println("Current Value of Scale: " + temperatureNo2.getScale());
        System.out.println("Current Value of Temperature: " + temperatureNo2.getTemp());                 
        System.out.println("Equal: " + temperatureNo2.ifEqual((float)temperatureNo2.getTemp(), temperatureNo2.FahrenheitToCelsius((float)-40)));         
        System.out.println("Less: " + temperatureNo2.ifLess((float)temperatureNo2.getTemp(), temperatureNo2.FahrenheitToCelsius((float)-40.0)));         
        System.out.println("Greater: " + temperatureNo2.ifGreater((float)temperatureNo2.getTemp(), temperatureNo2.FahrenheitToCelsius((float)-40.0)));         
        System.out.println("");
        System.out.println("");        
        System.out.println("testing the third temperature");
        
        Temperature temperatureNo3 = new Temperature(100);
         
        System.out.println("Current Value of Scale: " + temperatureNo3.getScale());
        System.out.println("Current Value of Temperature: " + temperatureNo3.getTemp());                
        System.out.println("Equal: " + temperatureNo3.ifEqual((float)temperatureNo3.getTemp(), temperatureNo3.FahrenheitToCelsius((float)212.0)));        
        System.out.println("Less: " + temperatureNo3.ifLess((float)temperatureNo3.getTemp(), temperatureNo3.FahrenheitToCelsius((float)212.0)));
         
        System.out.println("Greater: " + temperatureNo3.ifGreater((float)temperatureNo3.getTemp(), temperatureNo3.FahrenheitToCelsius((float)212.0)));
         
       
         
    }

}
