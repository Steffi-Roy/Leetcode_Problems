// Last updated: 2/5/2026, 2:40:58 AM
class Foo {
   
    mutex m;
    int turn =0;
    condition_variable cv;
    
 
public:
    Foo() {
       
         
    }

    void first(function<void()> printFirst) {
        
        // p(m)rintFirst() outputs "first". Do not change or remove this line.
       unique_lock<mutex> lk(m);
        {
            printFirst();}
        turn =1;
        cv.notify_all();
        }
    

    void second(function<void()> printSecond) {
        
        // printSecond() outputs "second". Do not change or remove this line.
        //m
        unique_lock<mutex> lk(m);
        cv.wait(lk, [&]{return turn==1;});
        {
        printSecond();}
        turn=2;
        //flag2=true;
        cv.notify_all();
    }

    void third(function<void()> printThird) {
        
        // printThird() outputs "third". Do not change or remove this line.
        unique_lock<mutex> lk(m);
        cv.wait(lk, [&] {return turn==2;});
        
        printThird();

            
        
        
    }
        
};