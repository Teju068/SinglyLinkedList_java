
public class LinkedList {

	Node start = null;
	Node end = null;
	int size = 0;

	public LinkedList() {

	}

	public void addStartNode(int data) {
		size++;
		Node newNode = new Node(data, null);
		if (start == null) {
			start = newNode;
			end = newNode;
		} else {
			newNode.setNextNode(start);
			start = newNode;
		}
	}

	public void addEndNode(int data) {
		size++;
		Node newNode = new Node(data, null);
		if (start == null) {
			start = newNode;
			end = newNode;
		} else {
			end.setNextNode(newNode);
			end = newNode;
		}
	}

	public void addNodeAtPos(int data, int pos) {
		int nCounter = 0;
		if (pos <= -1 || pos > size) {
			Utils.printf("Please enter the correct position");
			return;
		}
		Node ptr;
		ptr = start;
		while (ptr != null) {
			nCounter++;
			if (nCounter == pos - 1) {
				Node newNode = new Node(data, null);
				if (ptr != null && ptr.getNextNode() != null) {
					size++;
					newNode.setNextNode(ptr.getNextNode());
					ptr.setNextNode(newNode);
					Utils.printf("Node inserted successfully");
				}
			}
			ptr = ptr.getNextNode();
		}
	}

	public void removeNode(int data) {
		Node firstptr;
		Node secondptr;
		boolean bmovemarker = false;
		firstptr = start;
		secondptr = start;
		while (firstptr != null) {

			/**
			 * condition for first item
			 */
			if (firstptr.getData() == data && secondptr.getData() == data) {
				// Removing first item
				start = firstptr.getNextNode();
				break;
			} else {
				if (secondptr.getData() == data) {
					firstptr.setNextNode(secondptr.getNextNode());
					break;
				}
				if (bmovemarker == false) {
					secondptr = secondptr.getNextNode();
					bmovemarker = true;
				} else {
					firstptr = firstptr.getNextNode();
					secondptr = secondptr.getNextNode();
				}
			}
		}
	}

	public void traverseNode() {
		Node ptr;
		if (size == 0) {
			Utils.printf("List is empty..");
			return;
		}
		if (start == null) {
			Utils.printf("List is empty..");
			return;
		}
		ptr = start;
		while (ptr.getNextNode() != null) {
			Utils.printfr("\t");
			Utils.printfr(Integer.toString(ptr.getData()));
			ptr = ptr.getNextNode();
		}
		Utils.printfr("\t");
		Utils.printfr(Integer.toString(ptr.getData()));
		Utils.printf("\n");
	}
	
	public void reverseList() {
		Node ptr,tailNode;
		ptr = start;
		tailNode = start;
		tailNode.setNextNode(null);
		while(ptr.getNextNode() != null) {
			ptr = ptr.getNextNode();
			ptr.setNextNode(tailNode);
			tailNode = ptr;
		}
		traverseNode(ptr);
	}
	
	public void traverseNode(Node ptr) {
		while (ptr.getNextNode() != null) {
			Utils.printfr("\t");
			Utils.printfr(Integer.toString(ptr.getData()));
			ptr = ptr.getNextNode();
		}
		Utils.printfr("\t");
		Utils.printfr(Integer.toString(ptr.getData()));
		Utils.printf("\n");
	}
}