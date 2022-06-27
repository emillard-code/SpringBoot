package tire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("firestone")
public class FirestoneTire implements Tire {

    @Value("Firestone Winterforce CV")
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void brandName() {
        System.out.println(name);
    }

}
