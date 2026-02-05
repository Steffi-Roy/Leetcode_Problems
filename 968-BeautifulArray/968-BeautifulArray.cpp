// Last updated: 2/5/2026, 2:40:57 AM
class Solution {
public:
    vector<int> beautifulArray(int n) {
        // Previously I used a for loop and tried using rand to generate unique values but now I will try to use the logic I am suppsed to follow


    vector<int> res{1};              // start with a base array [1]
    while (res.size() < n) {
        vector<int> tmp;
        
        // First: generate "odd" numbers
        for (int x : res) 
            if (2*x - 1 <= n) 
                tmp.push_back(2*x - 1);
        
        // Second: generate "even" numbers
        for (int x : res) 
            if (2*x <= n) 
                tmp.push_back(2*x);
        
        res = tmp;                   // replace res with the new list
    }
    return res;

        
    }
};