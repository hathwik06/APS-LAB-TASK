class MyCircularQueue {
    int [] q;
    int f, r;
    int size, capacity;

    public MyCircularQueue(int x) {
        q = new int[x];
        f = r = -1;
        size = 0;
        capacity = x;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false; 
        }
        else{
            if(f == -1){
                f = r = 0; 
            }
            else{
                r = (r + 1) % capacity;
            }
            q[r] = value; 
            size++;      
            return true;
        }
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(size == 1){
            f = r = -1;
        }
        else{
            f = (f + 1) % capacity;
        }
        size--;
        return true; 
    }
    
    public int Front() {
        if(!isEmpty()){
            return q[f]; 
        }
        return -1;
    }
    
    public int Rear() {
        if(!isEmpty()){
            return q[r];
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}
