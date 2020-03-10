import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory {


    /**
     * Creacion de map 
     */

    public Map makeMap(String mapType){

        Map map = null;

        if (mapType.equals("HashMap")){
            map = new HashMap();
        } else if (mapType.equals("TreeMap")){
            map = new TreeMap();
        } else if (mapType.equals("LinkedHashMap")){
            map = new LinkedHashMap();
        }

        return map;

    }
}