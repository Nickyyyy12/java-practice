package oop.test;

import java.util.HashMap;
import java.util.Map;

public class MapPracticeTest {
    public static void main(String[] args) {
        Map<String, String> lockerMap = new HashMap<>();
        lockerMap.put("0721","张三");
        lockerMap.put("0021","李四");
        lockerMap.put("2111","王五");

        if (lockerMap.containsKey("9999")){
            String c = lockerMap.get("9999");
            System.out.println(c);
        }else {
            lockerMap.put("9999","赵六");
        }

        System.out.println(lockerMap.size());

        lockerMap.remove("0021");
        System.out.println(lockerMap.containsKey("0021"));

        for(Map.Entry<String, String> entry : lockerMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+", value:"+value);
        }
    }


}
