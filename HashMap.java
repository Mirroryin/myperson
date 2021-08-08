package sample;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args){
       Map<String,String> map = new java.util.HashMap<>();
        map.put("sks","ly");
        System.out.println(map);
        System.out.println(map.put("sks","lyh"));
        System.out.println(map);
        String sk = map.get("sks");
        System.out.println(sk);
        Set<String> keySet =  map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
