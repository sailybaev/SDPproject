package duduPizza.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class MenuServiceTest {
    public List<Pizza> loadMenu() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File("src/main/resources/menu.json"), new TypeReference<List<Pizza>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}