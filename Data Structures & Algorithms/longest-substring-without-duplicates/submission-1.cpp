class Solution {
public:
    int lengthOfLongestSubstring(string str) {
        unordered_map<char , int> mp;
    
        int i = 0, j = 0;
        int cnt = 0;
        
        while(j < str.size()) {
            mp[str[j]]++;

            // Valid window: all characters unique
            if(mp.size() == j - i + 1) {
                cnt = max(cnt, j - i + 1);
                j++;
            }
            // Invalid window: duplicate found, shrink from left
            else if(mp.size() < j - i + 1) {
                while(mp.size() < j - i + 1) {
                    mp[str[i]]--;
                    if(mp[str[i]] == 0) {
                        mp.erase(str[i]);
                    }
                    i++;
                }
                j++;
            }
        }
        
        return cnt;
    }
};
