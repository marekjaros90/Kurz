
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class RingingCentre {

    private Map<Bird, List<String>> observations;

    public RingingCentre() {
        this.observations = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!observations.containsKey(bird)) {
            this.observations.put(bird, new ArrayList<String>());
        }
        this.observations.get(bird).add(place);
    }

    public void observations(Bird bird) {
         if (!observations.containsKey(bird)) {
            System.out.println(bird + " observations: 0");
            return;
        }
        System.out.println(bird + " observations: " + observations.get(bird).size());
       
        for (String str : observations.get(bird)) {
            System.out.println(str);
        }
    }
}
