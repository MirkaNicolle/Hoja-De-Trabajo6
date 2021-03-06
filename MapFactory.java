/**
* HOJA DE TRABAJO 6
* INTERFACE MAP Y SUS 3 IMPLEMENTACIONES
* UVG - 10 DE MARZO DEL 2020
* MIRKA MONZÓN 18139
* DANIELA VILLAMAR 19086
*/

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
