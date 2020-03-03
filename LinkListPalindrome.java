

import java.util.Scanner;

//Check if a given linked list is palindrome or not. Return true or false.
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

public class Runner {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print(isPalindrome_2(input()));
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
  public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
        ArrayList<Integer> a=new ArrayList<Integer>();

        LinkedListNode<Integer> temp=head;

        while(temp!=null)
        {
            a.add(0,temp.getData());
            temp=temp.next;
        }

        temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.getData()!=a.get(i++))
                return false;
            temp=temp.next;
        }

        return true;

    }


}
