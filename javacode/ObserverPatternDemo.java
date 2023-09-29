import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
class WeatherStation {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Observer
interface Observer {
    void update(int temperature);
}

// Concrete Observer
class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display: Temperature is " + temperature + " degrees Celsius.");
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();

        weatherStation.addObserver(temperatureDisplay);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}
