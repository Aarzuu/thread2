import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thread3 implements Runnable{
    private String cumle;

    public Thread3(String cumle) {
        this.cumle = cumle;
    }

    @Override
    public void run() {
        List<String> list = List.of(cumle.split(" "));
        Map<String,Integer> map = new HashMap<>();

        for (String i : list) {
            if (map.containsKey(i.toLowerCase())) {
                map.put(i.toLowerCase(), map.get(i) + 1);
            } else {
                map.put(i.toLowerCase(), 1);
            }
        }
        System.out.println(map);
    }
}
