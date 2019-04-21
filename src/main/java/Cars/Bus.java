package Cars;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class Bus{


    public Map<String, String> colors;

    public Bus() {

    }

    public void setColors(Map<String, String> colors) {
        this.colors = colors;
    }

    public Bus(String color) {

    }

    public Map<String, String> getColors(){
        return colors;
    }

    public void jsonBus()
            throws IOException {
        Bus bus = new Bus("Color");
        bus.add("Color1","Green");
        bus.add("Color2","Red");
        bus.add("Color3","White");

        String result = new ObjectMapper().writeValueAsString(bus);

        assertThat(result, containsString("Color1"));
        assertThat(result, containsString("Color2"));
    }

    public void add(String color1, String green) {
    }



}
