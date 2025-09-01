class MyCircularQueue {
    int capacity, csize, front, rear;
    int q[];

    public MyCircularQueue(int k) {
        q = new int[k];
        capacity = k;
        csize = 0;
        front = 0;
        rear = -1;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        front = (front + 1 + capacity) % capacity;
        csize--;
        return true;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        rear = (rear + 1 + capacity) % capacity;
        q[rear] = value;
        csize++;
        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return q[front];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        return q[rear];

    }

    public boolean isEmpty() {
        return csize == 0;
    }

    public boolean isFull() {
        return csize == capacity;
    }
}