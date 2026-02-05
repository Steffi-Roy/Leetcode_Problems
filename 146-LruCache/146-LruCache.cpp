// Last updated: 2/5/2026, 2:41:03 AM
#include <unordered_map>   // hash table (O(1) average lookup)
#include <list>            // doubly linked list
using namespace std;

class LRUCache {
    int capacity_;  // how many items can fit in cache at most

    // this list keeps track of recency order of keys.
    // front = most recently used (MRU), back = least recently used (LRU).
    list<int> order;  

    // this map connects a key → (its value, and an iterator pointing
    // to where that key lives inside `order` list).
    // why? so we can both: 
    //   - get the value quickly
    //   - also remove/move that key in the list quickly (O(1))
    unordered_map<int, pair<int, list<int>::iterator>> mp; 

    // helper to mark a key as "most recently used"
    void touch(int key) {
        // mp[key].second is the iterator pointing to key’s node in `order`
        auto it = mp[key].second;

        // erase this node from wherever it currently sits in the list
        order.erase(it);

        // push it to the front (now MRU)
        order.push_front(key);

        // update the stored iterator to this new position
        mp[key].second = order.begin();
    }

public:
    LRUCache(int capacity) : capacity_(capacity) {}

    int get(int key) {
        // find the key in the map
        auto it = mp.find(key);

        if (it == mp.end()) {
            // not found
            return -1;
        }

        // found: move it to MRU position
        touch(key);

        // return the stored value
        return it->second.first;
    }
    
    void put(int key, int value) {
        // does the key already exist?
        auto it = mp.find(key);

        if (it != mp.end()) {
            // yes → update the value
            it->second.first = value;

            // and move it to MRU
            touch(key);
            return;
        }

        // key is new

        if ((int)mp.size() == capacity_) {
            // if cache is full, evict the LRU (back of list)
            int lruKey = order.back();
            order.pop_back();     // remove from list
            mp.erase(lruKey);     // remove from map
        }

        // insert new key at front (MRU)
        order.push_front(key);

        // record {value, iterator-to-front} in the map
        mp[key] = {value, order.begin()};
    }
};

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache* obj = new LRUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */