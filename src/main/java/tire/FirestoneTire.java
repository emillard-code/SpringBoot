package tire;

import org.springframework.stereotype.Component;

@Component("firestone")
public class FirestoneTire implements Tire {

    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void brandName() {
        System.out.println("Firestone");
    }

}
