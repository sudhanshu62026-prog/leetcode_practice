class Solution {
public:
    vector<int> circularGameLosers(int n, int k) {
        vector<bool> visited(n, false);

        int curr = 0;      
        int turn = 1;

        while (!visited[curr]) {
            visited[curr] = true;
            curr = (curr + turn * k) % n;
            turn++;
        }

        vector<int> ans;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans.push_back(i + 1);
            }
        }

        return ans;
    }
};