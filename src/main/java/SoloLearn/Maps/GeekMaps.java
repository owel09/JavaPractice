package SoloLearn.Maps;

import java.util.HashMap;
import java.util.Set;

public class GeekMaps {

    public static void main(String[] args) {

        HashMap <String, Integer> owelMaps = new HashMap<>();
        
        owelMaps.put("Owel",28);
        owelMaps.put("Lucas",9);
        owelMaps.put("Chelsea",3);

        System.out.println(owelMaps);

        System.out.println(owelMaps.get("Lucas"));

        System.out.println(owelMaps.keySet());
        /*
        Output:
        [Chelsea, Lucas, Owel]

        piniprint nya lang talaga yung key ng owelMap

         */

        for (String keyObj: owelMaps.keySet()) {
            System.out.println(keyObj);
        }

        /*
        Output:
        Chelsea
        Lucas
        Owel
         */

        System.out.println("-----------------------------------------");

        Set <String> sKey = owelMaps.keySet();

        for (String owelMapObj: sKey
             ) {

            System.out.println(owelMapObj + " -> " + owelMaps.get(owelMapObj));

        }
    }
}
