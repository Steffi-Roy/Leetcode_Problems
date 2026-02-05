// Last updated: 2/5/2026, 2:40:56 AM
class FooBar {
    mutex m;
    condition_variable cv;
    bool word_foo =false;
    //int word_bar=0;
private:
    int n;

public:
    FooBar(int n) {
        this->n = n;
    }

    void foo(function<void()> printFoo) {
        unique_lock<mutex> lk(m);
        
        for (int i = 0; i < n; i++) {
            cv.wait(lk,[&]{return !word_foo;});
            
        	// printFoo() outputs "foo". Do not change or remove this line.
        	printFoo();
            word_foo=true;
            cv.notify_all();
            //word_bar=0;
        }
       
    }

    void bar(function<void()> printBar) {
        unique_lock<mutex> lk(m);
        
        
        for (int i = 0; i < n; i++) {
            cv.wait(lk,[&]{return word_foo;});
            
        	// printBar() outputs "bar". Do not change or remove this line.
        	printBar();
            word_foo=false;
            cv.notify_all();
        }
            

            //word_bar=1;
        
    }
};