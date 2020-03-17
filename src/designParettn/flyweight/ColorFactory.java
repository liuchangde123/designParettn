package designParettn.flyweight;

import designParettn.factory.Color;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ColorFactory {
    private Map<String, Color> map = new ConcurrentHashMap<>(16);

    public Color getColor(String type){
        if(type==null || type.trim().length()==0){
            return null;
        }
        Color color = map.get(type.toLowerCase());
        if(color==null){
            color = ()->type;
            map.put(type.toLowerCase(),color);
        }
        return color;
    }
}
