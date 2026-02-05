// Last updated: 2/5/2026, 2:41:00 AM

class Solution {
public:
    bool isMonotonic(std::vector<int>& nums) {
        if (nums.size() <= 1) {
            return true; // Empty or single-element arrays are monotonic
        }
        // this is kind of mutex flags,
        bool increasing = true; // Assume increasing initially
        bool decreasing = true; // Assume decreasing initially

        for (int i = 0; i < nums.size() - 1; ++i) { // Iterate up to the second-to-last element
            if (nums[i] > nums[i+1]) { // If a decrease is found, it's not strictly increasing
                increasing = false;
            }
            if (nums[i] < nums[i+1]) { // If an increase is found, it's not strictly decreasing
                decreasing = false;
            }
        }

        // Return true if it's either entirely non-decreasing OR entirely non-increasing
        return increasing || decreasing;
    }
};