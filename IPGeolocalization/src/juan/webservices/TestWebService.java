package juan.webservices;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class TestWebService {

	public static void main(String... args) {
		GlobalWeather globalWeather = new GlobalWeather();
		GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
		System.out.println(globalWeatherSoap.getCitiesByCountry("spain"));
	}
}
