package SoloLearn.Maps;/*
 *Created by owel on Oct, 2019 7:40 AM

 Simple example ng pagamit ng Map and put method sa HashMap.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TeluskoMaps {

    public static void main(String[] args) {

        Map <String,String> maps = new HashMap <>();
        maps.put("myName","owel");
        maps.put("food","adobo");
        maps.put("anime","boku no academia");
        maps.put("music","alternative rock");

        System.out.println(maps);
        /*
        Output:
        {music=alternative rock, myName=owel, food=adobo, anime=boku no academia}

        ganito yung itsura kapag nagprint tayo ng map. May possibility na hindi sila
        sunod-sunod. Notice na nauna yung "alternative rock"
         */

        System.out.println(maps.get("food"));
        /*
        Output:
        adobo

        get() para makuha yung value sa key
         */

        System.out.println("---------------------------------");

        for(String keyObj:maps.keySet()){
            System.out.println(keyObj);
        }
        /*
        Output:
        music
        myName
        food
        anime

        obj yung key object kung saan dun naka-store yung keys
        keySet() will give you the set of keys sa map "myName", "food"
         */

        System.out.println("---------------------------------");

        Set <String> setKeys = maps.keySet();

        for (String key: setKeys
             ) {
            System.out.println(key + " -> " + maps.get(key));
        }
        /*
        Output:
        music -> alternative rock
        myName -> owel
        food -> adobo
        anime -> boku no academia

        mapprint yung key ng map tapos gumamit pa ko ng get() para maprint yun value
         */


    }
}
