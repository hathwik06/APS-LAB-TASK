import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        int i, prev;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                prev = map.get(a[i]);
                if (i - prev <= k) {
                    return true;
                }
            }
            map.put(a[i], i);
        }
        return false;
    }
}