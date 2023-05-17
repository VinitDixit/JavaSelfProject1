package TestLearn.problemPractice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Integer array[]= new Integer[]{5,10,20,1,2,3,4};
        List<Integer> asList = Arrays.asList(1,2,3,4);
        List<Integer> integers = Arrays.asList(array);

        Collections.sort(integers);

        HashMap<String,String> tempMap=new HashMap<String,String>();
        tempMap.put("1","Vinit");
        tempMap.put("2","Simpy");

        for (Map.Entry e:tempMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Iterator<Map.Entry<String, String>> iterator = tempMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getKey());
        }

        Set<String> keySet = tempMap.keySet();
        Collection<String> values = tempMap.values();
        for (String s : keySet) {
            tempMap.get(s);
        }

        Comparator<String> c= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        Comparator<Integer> c1= (i1,i2)->{
            return 0;
        };
        c1.compare(2,3);

        Collections.sort(integers,(i1,i2)->{
            return i1-i2;
        });

    }
}
