class LinkedList{
	private Link head;
	
	public LinkedList(){
		head = null;
	}
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insert(int data){
		Link newLink = new Link(data);
		newLink.next = head;
		head = newLink;
	}
	public boolean delete(){
		if(head == null)
			return false;
		else
			head = head.next;
		return true;
		
	}
	public void display(){
		Link current = head;
		
		while(current != null){
			System.out.println(current.getData());
			current = current.next;
		}
		
	}
	
	public static void main(String[] args){
		LinkedList obj = new LinkedList();
		  obj.insert(10);
		  obj.insert(20);
		  obj.insert(30);
		  obj.delete();
		  obj.display();
		  
		
	}
	
}