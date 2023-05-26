package creational.builder.guru.builders;

import creational.builder.guru.cars.CarType;
import creational.builder.guru.components.Engine;
import creational.builder.guru.components.GPSNavigator;
import creational.builder.guru.components.Transmission;
import creational.builder.guru.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}