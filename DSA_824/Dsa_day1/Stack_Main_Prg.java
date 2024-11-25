import java.util.Scanner;

public class Stack_Main_Prg {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stack_Class obj =new Stack_Class();
        System.out.println("Enter the size of stack:");
        int choice;
        int size=in.nextInt();
        obj.create_stack(size);
        do{
            System.out.println("Stack Menu");
            System.out.println("\n--------");
            System.out.println("1.Push"); 
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Print Stack");
            System.out.println("0.Exit");
            System.out.println("choice:");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                if(!obj.is_full()){
                    System.out.println("Enter element:");
                    int e=in.nextInt();
                    obj.push(e);
                }
                else{
                    System.out.println("Stack Full:");
                }                    
                    break;
                case 2:
                if(!obj.is_empty()){
                    System.out.println("Element poped");
                }    
                else{
                    System.out.println("Stack Empty");
                }
                break;
                case 3:
                    if(!obj.is_empty())//if not empty
                    {
                        System.out.print("\nElement @ Peek is:"+obj.peek());
                    }
                    else
                    {
                        System.out.print("\nStack Empty:");
                    }
                    break;
                case 4:
                    if(!obj.is_empty())//if not empty
                    {
                        System.out.println("\nElements on stack");
                        obj.print_stack();
                    }
                    else
                    {
                        System.out.print("\nStack Empty:");
                    }
                    break;
                case 0:
                    System.out.print("\nExiting code...bye");
                    break;
                default:
                    System.out.print("\nWrong option selected..");
                    break;                       
                  
            }
        }
            while (choice!=0);         
            

        }
    
        }

