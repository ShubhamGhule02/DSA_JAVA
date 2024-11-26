public class Doubly_Linked_List {
Dnode root;
    void create_List() {
        root = null;
    }

    void insert_left(int data) {
        Dnode n = new Dnode(data);
        if (root == null)
            root = n;// first
        else {
            n.right = root;// 1
            root.left = n; // 2
            root=n;
        }
        System.out.println(data + " inserted");
    }

    void delete_left() {

        if (root == null)
            System.out.println("\nList Empty");
        else {
            Dnode t = root;// 1
            root = root.right;// 2
            root.left=null;
            System.out.println(t.data + " deleted");// 3
        }

    }

    void insert_right(int data) {
        Dnode n = new Dnode(data);
        if (root == null)
            root = n;// first
        else {
            Dnode t = root;// 1
            while (t.right != null)// 2
                t = t.right;
            t.right = n;// 3
            n.left=t;//4
        }
        System.out.println(data + " inserted");
    }

    void delete_right() {

        if (root == null)
            System.out.println("\nList Empty");
        else {
            Dnode t = root;// 1
           // Dnode t2 = root;// 1
            while (t.right != null)// 2
            {
               // t2 = t;
                t = t.right;
            }
            if (root == t)
                root = null;// 3 single Dnode
            else{
              Dnode t2=t.left; // 3
                t2.right=null;//4
            System.out.println(t.data + " deleted");// 3\
            }
        }
    }
    void print_list() {
        if (root == null)
            System.out.println("\nList Empty");
        else {
            Dnode t = root;// 1
            while (t != null)// 2
            {
                System.out.print("<-|" + t.data + "|->");
                t = t.right;
            }
        }
    }
    void print_list_rev()
    {
        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Dnode t=root;//1
            while(t.right!=null)//2 goto  last
                t=t.right;
            while(t!=null)//3
            {
                System.out.print(t.data+" ");
                t=t.left;
            }
        }
    }
    
}
