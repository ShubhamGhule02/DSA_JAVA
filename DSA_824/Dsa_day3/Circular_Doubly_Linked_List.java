public class Circular_Doubly_Linked_List {
    Dnode root,last,left,right;

    void create_List()
    {
        root=last=null;
    }
    void insert_left(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null) {
            root =last= n;//first
            last.right=root;
        }
        else
        {
            n.next=root;//1
            root=n; //2
            last.next=root;//3
        }
        System.out.println(data+" inserted");
    }
    void delete_left()
    {

        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Dnode t=root;//1
            if(root==last)//single node
            {
                root=last=null;//manual reset
            }
            else
                root=root.next;//2
                last.next=root;
            System.out.println(t.data+" deleted");//3
        }

    }
    void insert_right(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)
        {
            root =last= n;//first
            last.next=root;
        }
        else
        {
          last.next=n;//1
          last=n;//2
          last.next=root;//3
        }
        System.out.println(data+" inserted");
    }
    void delete_right()
    {

        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Dnode t=root;//1
            Dnode t2=root;//1
            while(t.next!=root)//2
            {
                t2=t;
                t=t.next;
            }
            if(root==t)
                root=last=null;//manual reset
            else {
                last=t2;//3
                last.next=root;//4
            }
            System.out.println(t.data+" deleted");//3
        }
    }
    void print_list()
    {
        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Dnode t=root;//1
            do
            {
                System.out.print("|"+t.data+"|->");
                t=t.next;
            }while(t!=root);//2
        }
    }
}
