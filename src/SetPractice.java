import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        // 생성자를 통한 HashMap 생성
        Map<String, Integer> map = new HashMap<>();
        // map에 데이터 저장 (return void)
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        // map의 크기 출력
        System.out.println("size of map : " + map.size());

        // map의 값 출력
        System.out.println("value of D : " + map.get("D"));
        
        // keySet과 Entry를 이용한 출력
        Set<String> keys = map.keySet();
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();

        Iterator<String> iter1 = keys.iterator();
        Iterator<Map.Entry<String, Integer>> iter2 = entrys.iterator();

        while(iter1.hasNext()){
            String key = iter1.next();
            System.out.println(map.get(key));
        }

        while(iter2.hasNext()){
            Map.Entry<String, Integer> entry = iter2.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key : " + key + ", value : " + value);
        }

    }
}
