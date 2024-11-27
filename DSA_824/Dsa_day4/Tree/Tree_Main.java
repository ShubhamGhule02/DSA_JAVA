package Tree;
import java.util.Scanner;
public class Tree_Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int choice;
        Tree_Class obj=new Tree_Class();
        do
        {
            System.out.print("\nTree Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Insert");
            System.out.print("\n2.Inorder");
            System.out.print("\n3.Preorder");
            System.out.print("\n4.Postorder");
            System.out.print("\n5.search");
            System.out.print("\n6.countkar");
            System.out.print("\n7.countkar");

            System.out.print("\n0.Exit");
            System.out.print("\nchoice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                        System.out.print("\nEnter element:");
                        int e=in.nextInt();
                        Tnode n=new Tnode(e);
                        obj.insert(obj.root,n);
                        break;
                case 2:
                    if(obj.root!=null)//not empty
                    {
                        System.out.print("\ninorder Elements in tree:\n");
                        obj.inorder(obj.root);
                    }
                    else
                    {
                        System.out.print("\nTree not created...");
                    }
                    break;
                    case 3:
                    if(obj.root!=null)//not empty
                    {
                        System.out.print("\npreorder Elements in tree:\n");
                        obj.preorder(obj.root);
                    }
                    else
                    {
                        System.out.print("\nTree not created...");
                    }
                    break; 
                    case 4:
                    if(obj.root!=null)//not empty
                    {
                        System.out.print("\npostorder Elements in tree:\n");
                        obj.postorder(obj.root);
                    }
                    else
                    {
                        System.out.print("\nTree not created...");
                    }
                    break;   
                case 5: 
                if(obj.root!=null)//not empty
                {
                     e=in.nextInt();
                     System.out.println(obj.search(e, obj.root));   
                }
                else
                System.out.println(""); 
                 break;
                case 6:
                 System.out.println(obj.Countkar(obj.root));
                 break;
                 case 7:
                 System.out.println(obj.count_leaf_node(obj.root));
                 break;
                case 0:
                    System.out.print("\nExiting code...bye");
                    break;

                default:
                    System.out.print("\nWrong option selected..");
                    break;
            }
        }while(choice!=0);
    }
}