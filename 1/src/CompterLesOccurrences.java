import java.util.HashMap;
public class CompterLesOccurrences {
    public static void main(String[] args) {
        int[] numbres = {1,2,3,4,3,2,};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : numbres){
            if (map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else{
                map.put(n, 1);
            }
        }
        System.out.println(map);
    }
}


