public class Postfix_Queue{
    int front,rear,Maxsize,queue[],count;
    
    void create_queue(int size)
    {
        front=0;
        rear=-1;
        count=0;
        Maxsize=size;
        queue=new int[Maxsize];
    }
}