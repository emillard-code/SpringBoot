package vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import tire.Tire;

@Component("car")
@Scope(value="prototype")
public class Car implements Vehicle {

    private int id;
    private String model;

    @Autowired
    @Qualifier("firestone")
    private Tire tire;

    public int getId() { return id; }
    public String getModel() { return model; }
    public Tire getTire() { return tire; }

    public void setId(int id) { this.id = id; }
    public void setModel(String model) { this.model = model; }
    public void setTire(Tire tire) { this.tire = tire; }

    @Override
    public void drive() {
        System.out.println("Driving a Car...");
        System.out.print("Car Tire: ");
        tire.brandName();
    }

}
