package plz;

import java.util.List;

public class WeatherMain {
	
	public void showList() {
		
	}

    public static void main(String[] args) {
        WeatherDAO handler = new WeatherDAO();

        List<Weather> list = handler.getWeather();
        for (Weather weather : list) {
            System.out.println(weather);
        }
    }
}
