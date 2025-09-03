class MyCircularDeque {
    int[] cq;
    int capacity,front,last,csize;
    public MyCircularDeque(int k) {
        cq=new int[k];
        capacity=k;
        csize=0;
        front=0;
        last=k-1;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        front=(front-1+capacity)%capacity;
        cq[front]=value;
        csize++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        last=(last+1)%capacity;
        cq[last]=value;
        csize++;
        return true;
        
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        front=(front+1)%capacity;
        csize--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        last=(last-1+capacity)%capacity;
        csize--;
        return true;
        
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return cq[front];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        return cq[last];
        
    }
    
    public boolean isEmpty() {
        return csize==0;
    }
    
    public boolean isFull() {
        return csize==capacity;
    }
}