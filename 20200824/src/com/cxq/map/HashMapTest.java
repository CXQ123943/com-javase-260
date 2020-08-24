package com.cxq.map;

import javafx.scene.media.VideoTrack;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author CXQ
 * @version 1.0
 */
public class HashMapTest {

    private HashMap<String, Object> hashMap;

    @Before
    public void before() {
        hashMap = new HashMap<>(5);
    }

    @Test
    public void create() {
        hashMap.put("gong-zuo", "");
        hashMap.put("gong-zuo", "singer");
        hashMap.put("job", "singer");
        hashMap.put("t", null);
        hashMap.put(null, "k");
        hashMap.put(null, null);
        HashMap<String, Object> newHashMap = new HashMap<>(5);
        newHashMap.put("a",1);
        newHashMap.put("b",2);
        hashMap.putAll(newHashMap);
        System.out.println("create over: " + hashMap);
    }

    @Test
    public void retrieve() {
        this.create();
        System.out.println(hashMap.get("gong-zuo"));
        System.out.println(hashMap.containsKey("t"));
        System.out.println(hashMap.containsValue("singer"));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
    }

    @Test
    public void delete() {
        this.create();
        System.out.println(hashMap.remove("gong-zuo"));
        System.out.println(hashMap.remove(null));
        hashMap.clear();
    }

    /**
     * 遍历
     * */
    @Test
    public void iteratorByEntrySet() {
       this.create();
        Set<Map.Entry<String, Object>> entries = hashMap.entrySet();
        for (Map.Entry<String,Object> e: entries) {
            System.out.print(e.getKey() + "：" + e.getValue());
        }
    }

    @Test
    public void iteratorByKeySet() {
        this.create();
        Set<String> strings = hashMap.keySet();
        for (String key: strings) {
            System.out.println(key + "：" + hashMap.get(key));
        }
    }
}
