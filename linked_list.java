

//Creating a Linked List
class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int d){
			data = d;
			next = null;
	  }
		
	public static void main (String[] args){
		Node head = new Node(1);
		Node second = new Node(2);
		head.next = second;
	}

	public void AddLast(int d){
		Node end = new Node (d);
		Node n = this;
		while (n.next != null){
		  n = n.next;
	  }
	  n.next = end;
	  }
	}

	//Deleting a node from a Singly Linked List
	public void deleteNode(ListNode n) {	
	if(head ==null){
	    System.out.println("List is Empty");
	}
	if(head.val == n){          //Check if the first node is to be deleted 
	    head=head.next;
	}

	ListNode prev = head;
	ListNode curr = head.next;

	while (curr != null){
		 if(curr.val == n.val){
		     prev.next = curr.next;
		  }
		  else{
		     prev = prev.next;
		     curr = curr.next 
		  }
		}
	}

	//Removing duplicates
	public void deleteDups(LinkedListNode n) {
	  HashSet<Integer> set = new HashSet<Integer>(); 
	  LinkedListNode previous = null;
	  while (n != null) {
	    if (set.contains(n.data)){
	      previous.next = n.next;
	      }
	    else {
	      set.add(n.data);
	      previous = n;
	      }
	    n = n.next;
	    }
	}

	//Sum of Linked List
	LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry) {
	if (l1 == null && l2 == null) {
	  return null;
	  }
	LinkedListNode result = new LinkedListNode(carry, null, null);
	int value = carry;
	if (l1 != null) {
	  value += l1.data;
	  }
	if (l2 != null) {
	  value += l2.data;
	}
	result.data = value % 10;
	LinkedListNode more = addLists(l1 == null ? null : l1.next, 
	l2 == null ? null : l2.next, value > 10 ? 1 : 1);
	result.setNext(more);
	return result;
	}

