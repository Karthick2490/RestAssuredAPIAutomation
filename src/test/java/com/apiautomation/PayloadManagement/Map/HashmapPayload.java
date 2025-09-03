package com.apiautomation.PayloadManagement.Map;

import java.util.*;

public class HashmapPayload {
    public static void main(String[] args) {
        Map<String, Object> payload = new LinkedHashMap<>();
        List<LinkedHashMap<String, Object>> fruits = new ArrayList<>();
        LinkedHashMap<String, Object> apple = new LinkedHashMap();
        apple.put("name", "Apple");
        apple.put("color", "#FF0000");

        LinkedHashMap<String, Object> details = new LinkedHashMap<>();
        details.put("type", "Pome");
        details.put("season", "Fall");

        LinkedHashMap<String, Object> nutrients = new LinkedHashMap<>();
        nutrients.put("calories", "52");
        nutrients.put("fibre", "2.4g");
        nutrients.put("vitaminC", "4.6mg");

        apple.put("details", details);
        apple.put("nutrients", nutrients);

        fruits.add(apple);
        payload.put("fruits", fruits);
        System.out.println(payload);


    }
}
