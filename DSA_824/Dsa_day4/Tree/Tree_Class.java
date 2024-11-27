package Tree;
public class Tree_Class
{
    Tnode root;
    void insert(Tnode r,Tnode n)//r:root ref n:new node
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                    r.left=n;
                else
                    insert(r.left,n);
            }
            else
            {
                if(r.right==null)
                    r.right=n;
                else
                    insert(r.right,n);
            }
        }
        System.out.println(n.data+" inserted in tree");
    }
    void inorder(Tnode r)
    {
        if(r!=null)//LPR
        {
            inorder(r.left);//L
            System.out.print(r.data+",");//P
            inorder(r.right);//R
        }
    }
    void preorder(Tnode r)
    {
        if(r!=null)//PLR
        {
            System.out.print(r.data+",");//P
            preorder(r.left);//L
            preorder(r.right);//R
        }
    }
    void postorder(Tnode r)
    {
        if(r!=null)//LRP
        {
            postorder(r.left);//L
            postorder(r.right);//R
            System.out.print(r.data+",");//P
        }
    }
    boolean search(int key,Tnode r)
    {
        if(r!=null)
        {
       if(r.data==key)
       return true;
      else
       {
        if(key>r.data)
        {
           r=r.right;
         return  search(key, r);
        }
        else
        {
            r=r.left;
           
         return search(key, r);
        }
       }
    }
    else
    return false;
}
int Countkar(Tnode r)
    {  
        //int count=0;
        if(r!=null)//LPR
        {
           // count++;
           int i= Countkar(r.left);//L
           // System.out.print(r.data+",");//P
            int i1=Countkar(r.right);//R
            return (1+i+i1);
        }
                return 0;
        
    }

    int count_leaf_node(Tnode r)
    {
        if(r==null)
            return 0;
        else
        {
            int count=0;
            if(r.left==null && r.right==null)
                count++;
            return count+count_leaf_node(r.left)+count_leaf_node(r.right);
        }

        }
}