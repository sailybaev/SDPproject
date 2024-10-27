package duduPizza.services;
import com.fasterxml.jackson.databind.ObjectMapper;
import duduPizza.models.Pizza;

import java.io.File;
import java.util.List;

public class MenuService {
    public List<Pizza> loadMenu() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File("src/main/resources/menu.json"), List.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}