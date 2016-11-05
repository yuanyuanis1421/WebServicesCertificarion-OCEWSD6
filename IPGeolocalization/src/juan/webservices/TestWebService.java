package juan.webservices;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class TestWebService {

	/**
	 * Este método prueba un Servicio Web Service
	 * @param args
	 */
	public static void main(String... args) {
		GlobalWeather globalWeather = new GlobalWeather();
		GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
		System.out.println(globalWeatherSoap.getCitiesByCountry("spain"));
		
		
	}
}
