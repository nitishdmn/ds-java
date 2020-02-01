import java.util.Scanner;
//Given a linked list and an integer n, append the last n elements of the LL to front.
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class LinkedlistAppend {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(append(input(), s.nextInt()));
	}

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}
	  public static int LengthIterative(LinkedListNode<Integer>head){
			int count=0;
			while(head!=null)
			{
				count++;
				head=head.next;
			}
			return count;
	    }
		public static LinkedListNode<Integer> append(LinkedListNode<Integer> head, int n) {
	        LinkedListNode<Integer>temp1=head;
			LinkedListNode<Integer>temp2=head;
			int length=LengthIterative(head);
			int i=0;
			while(i<length-n-1)
			{
				temp1=temp1.next;
				i++;
			}
			head=temp1.next;
			temp1.next=null;
			LinkedListNode<Integer>tempHead=head;
			while(tempHead.next!=null)
			{
				tempHead=tempHead.next;
			}
			tempHead.next=temp2;
			return head;
		}

}
