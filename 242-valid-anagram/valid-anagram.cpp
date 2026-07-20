class Solution {
public:
    bool isAnagram(string s, string t) {
        
        // If lengths are different,
        // they can never be anagrams.
        if (s.length() != t.length())
            return false;

        // Sort both strings alphabetically.
        sort(s.begin(), s.end());
        sort(t.begin(), t.end());

        // If sorted strings become identical,
        // then frequencies are identical.
        return s == t;
    }
};