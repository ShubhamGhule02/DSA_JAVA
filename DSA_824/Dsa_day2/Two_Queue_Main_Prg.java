import java.util.Scanner;

public class Two_Queue_Main_Prg {
 public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Two_Queue_in_one obj = new Two_Queue_in_one();        
        System.out.println("Enter size of queue:");
        int choice;
        int size = in.nextInt();
        obj.create_queue(size);

        public class Two_Queue_in_one_Main_prg
{
    //data members
    int front,rear,Maxsize,queue[];
    //function members
    void create_queue(int size)
    {
        front=0;
        rear=-1;
        Maxsize=size;
        queue=new int[Maxsize];
    }
    void enqueue(int e)
    {
        rear++;
        queue[rear]=e;
        //sorting code
        for(int i=front;i<rear;i++)
        {
            for(int j=front;j<rear;j++)
            {
                if(queue[j]>queue[j+1])//APQ for DPQ <
                {
                    int temp=queue[j];
                    queue[j]=queue[j+1];
                    queue[j+1]=temp;
                }
            }
        }
    }
    boolean is_full()
    {
        if(rear==Maxsize-1)
            return true;
        else
            return false;
    }
    int dequeue()
    {
        int temp=queue[front];
        front++;
        return(temp);
    }

    boolean is_empty()
    {
        if(front>rear)
            return true;
        else
            return false;
    }
    void print_queue()
    {
        for(int i=front ;i<=rear;i++)
            System.out.print(queue[i]+"--");
    }

}

    
}
}
