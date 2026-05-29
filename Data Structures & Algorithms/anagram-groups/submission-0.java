class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for(String s : strs) {

            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            if(!hm.containsKey(sorted)) {
                hm.put(sorted, new ArrayList<>());
            }

            hm.get(sorted).add(s);
        }

        return new ArrayList<>(hm.values());
        
    }
}
