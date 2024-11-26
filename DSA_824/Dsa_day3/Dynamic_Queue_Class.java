public class Dynamic_Queue_Class {

 
    int Maxsize,queue[];
        Node rear,front;
    void create_queue(int size)
    {
        //front=0;
       // rear=-1;
        Maxsize=size;
        queue=new int[Maxsize];
    }
    void enqueue(int e){
        Node n = new Node(e);
        if (rear == null)
            rear = n;
        else {
            n.next = rear;
            rear = n; 
        }
        System.out.println(e + " inserted");
    }
        //rear++;
        //queue[rear]=e;

    int dequeue()
    {
        
        if (front == null)
        System.out.println("\nList Empty");
    else {
        Node t = rear;// 1
        rear = rear.next;// 2
        System.out.println(t.data + " deleted");// 3
    }
        // int temp=queue[front];
        // front++;
        // return(temp);
                return Maxsize;
    }

 
    void printQueue() {
        if (front == null)
            System.out.println("\nList Empty");
        else {
            Node t = front;// 1
            while (t != null)// 2
            {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }

}
    

