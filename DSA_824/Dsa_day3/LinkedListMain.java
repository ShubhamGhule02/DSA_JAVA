import java.util.Scanner;

public class LinkedListMain {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			//Linear_Linked_List obj = new Linear_Linked_List();
			Doubly_Linked_List obj = new Doubly_Linked_List();
			int choice;
			do {
				System.out.print("\nLinked_list Menu");
				System.out.print("\n-----------");
				System.out.print("\n1.addLeft");
				System.out.print("\n2.addRight");
				System.out.print("\n3.removeLeft");
				System.out.print("\n4.removeRight");
				System.out.print("\n5.printList");
				//System.out.print("\n6.Search");
				System.out.print("\n6.printList_rev");
				// System.out.print("\n7.Search_&_Delete");
				// System.out.print("\n8.Insert_after");
				 System.out.println("\n0.exit");
				choice = in.nextInt();
				int e;
				int e1;
				switch (choice) {
					case 1:
						System.out.print("\nEnter element:");
						int left = in.nextInt();
						obj.insert_left(left);
						break;
					case 2:
						System.out.print("\nEnter element:");
						int right = in.nextInt();
						obj.insert_right(right);

						break;
					case 3:
						obj.delete_left();
						break;
					case 4:
						obj.delete_right();
						break;
					case 5:
						obj.print_list();
						break;
					case 6:
						//System.out.println("Enter the element tobe search");
						//e = in.nextInt();
						 obj.print_list_rev();
						break;
					// case 7:
					// 	System.out.println("Enter the element tobe search and delete");
					// 	e = in.nextInt();
					// 	obj.delete_element(e);
					// 	break;	
						
					// case 8:
					// 	System.out.println("Enter the element tobe insert after");
					// 	e = in.nextInt();
					// 	System.out.println("Enter the element tobe insert");
					// 	e1= in.nextInt();
					// 	obj.insert_after( e, e1);
					// 	break;	
					case 0:
						System.out.println("Element");
						break;
					default:
						System.out.print("\nWrong option selected..");
						break;
				}
			} while (choice != 0);
		}
	}
}