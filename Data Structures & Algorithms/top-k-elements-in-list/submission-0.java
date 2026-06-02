class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<int[]> ans = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            ans.add(new int[]{entry.getValue(), entry.getKey()});
        }

        ans.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = ans.get(i)[1];
        }

        return res;
    }
}