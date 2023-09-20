package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");

        System.out.println(map.get("key2"));

        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        ArrayList<String> us = new ArrayList<>();
        us.add("NYC");
        us.add("LA");
        us.add("DA");

        ArrayList<String> uk = new ArrayList<>();
        uk.add("london");
        uk.add("manchester");
        uk.add("birmingham");

        ArrayList<String> algeria = new ArrayList<>();
        algeria.add("algiers");
        algeria.add("tizi ouzou");
        algeria.add("oran");

        HashMap<String, ArrayList<String>> cities = new HashMap<>();
        cities.put("us", us);
        cities.put("uk", uk);
        cities.put("algeria", algeria);

        System.out.println(cities.get("us"));

    }
}
