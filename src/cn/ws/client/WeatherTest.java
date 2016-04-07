
package cn.ws.client;

import java.util.Arrays;

import cn.ws.weather.WeatherWebServiceStub;
import cn.ws.weather.WeatherWebServiceStub.ArrayOfString;
import cn.ws.weather.WeatherWebServiceStub.GetWeatherbyCityName;
import cn.ws.weather.WeatherWebServiceStub.GetWeatherbyCityNameResponse;

/**
 *天气预报 
 */
public class WeatherTest {

	public static void main(String[] args) {
		try {
			WeatherWebServiceStub serviceStub = new WeatherWebServiceStub();
			GetWeatherbyCityName getWeatherbyCityName4 = new GetWeatherbyCityName();
			getWeatherbyCityName4.setTheCityName("北京");
			GetWeatherbyCityNameResponse cityNameResponse = serviceStub.getWeatherbyCityName(getWeatherbyCityName4);
			ArrayOfString arrayOfString = cityNameResponse.getGetWeatherbyCityNameResult();
			System.out.println(Arrays.toString(arrayOfString.getString()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
