
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
			newNode.setNode(start);
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
			end.setNode(newNode);
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
				if (ptr != null && ptr.getNode() != null) {
					size++;
					newNode.setNode(ptr.getNode());
					ptr.setNode(newNode);
					Utils.printf("Node inserted successfully");
				}
			}
			ptr = ptr.getNode();
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
				start = firstptr.getNode();
				break;
			} else {
				if (secondptr.getData() == data) {
					firstptr.setNode(secondptr.getNode());
					break;
				}
				if (bmovemarker == false) {
					secondptr = secondptr.getNode();
					bmovemarker = true;
				} else {
					firstptr = firstptr.getNode();
					secondptr = secondptr.getNode();
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
		while (ptr.getNode() != null) {
			Utils.printfr("\t");
			Utils.printfr(Integer.toString(ptr.getData()));
			ptr = ptr.getNode();
		}
		Utils.printfr("\t");
		Utils.printfr(Integer.toString(ptr.getData()));
		Utils.printf("\n");
	}
}