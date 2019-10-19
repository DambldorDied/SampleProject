package fubyaka5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigraotryBird {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> list = new HashMap<>();

        for (Integer x : arr) {

            if (list.containsKey(x)) {
                list.put(x, list.get(x) + 1);
            } else {
                list.put(x, 1);
            }

        }int birdcount = 0;
        int  vivod = 0;
        for (Map.Entry<Integer, Integer> pair : list.entrySet()) {
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " : " + value);
        }
        for (Map.Entry<Integer, Integer> pair : list.entrySet()) {
            if(pair.getValue()> birdcount){
                birdcount = pair.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> pair : list.entrySet()) {
            if(pair.getValue() == birdcount){
                vivod = pair.getKey();
                break;
            }
        }
        return vivod;
    }
}
