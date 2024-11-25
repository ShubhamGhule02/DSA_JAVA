public class Queue_Circular {
    

    //data members
    int front,rear,Maxsize,queue[],count;
    //function members
    void create_queue(int size)
    {
        front=0;
        rear=-1;
        count=0;
        Maxsize=size;
        queue=new int[Maxsize];
    }
    void enqueue(int e)
    {
        rear =(rear+1)%Maxsize;
        count++;
         queue[rear]=e;
    }
    boolean is_full()
    {
        if(count==Maxsize)
        // if(rear==Maxsize-1)
            return true;
        else
            return false;
    }
    int dequeue()
    {
        int temp=queue[front];
        front =(front+1)%Maxsize;
        count--;
        // front++;
        return(temp);
    }

    boolean is_empty()
    {
        if(count==0)
        // if(front>rear)
            return true;
        else
            return false;
    }
    void print_queue()
    {
        int c=0,i=front;
       while (c<count) {
        System.out.print(queue[i]+"--");
        i=(i+1)%Maxsize;
        c++;
       }
        
    }

}