import java.util.Scanner;

public class LinkedListDataStructure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList linkedList = new LinkedList();
		do {

			Utils.printf("1 : Add Node at End");
			Utils.printf("2 : Add Node at Start");
			Utils.printf("3 : Add Node at Position");
			Utils.printf("4 : Remove Data");
			Utils.printf("5 : Remove at Start");
			Utils.printf("6 : Remove at End");
			Utils.printf("7 : Traverse");
			Utils.printf("8 : Reverse List");

			Utils.printfr("Enter the choice ==>");
			int nChoice = scanner.nextInt();
			int npos = -1;
			switch (nChoice) {
			case 1:
				Utils.printf("Enter the value which you want to insert");
				int data = scanner.nextInt();
				linkedList.addEndNode(data);
				break;
			case 2:
				Utils.printf("Enter the value which you want to insert");
				data = scanner.nextInt();
				linkedList.addStartNode(data);
				break;
			case 3:
				Utils.printf("Enter the value which you want to insert");
				data = scanner.nextInt();
				Utils.printf("Enter the position where you want to insert");
				npos = scanner.nextInt();
				linkedList.addNodeAtPos(data, npos);
				break;
			case 4:
				Utils.printf("Enter the value which you want to remove");
				int nremovableItem = scanner.nextInt();
				linkedList.removeNode(nremovableItem);
				break;
			case 5:
				//TODO
				break;
			case 6:
				//TODO
				break;
			case 7:
				linkedList.traverseNode();
				break;
			case 8:
				 Utils.printf("Reversing the list");
				 linkedList.reverseList();
				break;
				
			default:
				break;

			}
			//Utils.printf("Press Y or y to continue!");
			//ch = (char) scanner.next().charAt(0);
		} while (true);
	}
}
