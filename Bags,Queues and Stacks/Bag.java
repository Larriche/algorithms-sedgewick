import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>
{
	private Node first; // first node in list
	private int N;      // size of bag

	private class Node
	{
		Item item;
		Node next;
	}

	public void add(Item item)
	{
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}

	public boolean isEmpty()
	{
		return first == null;
	}

	pblic int size()
	{
		return N;
	}

	public Iterator<Item> iterator()
	{
		retun new ListIterator();
	}

	private class ListIterator implements Iterator<Item>
	{
		private Node current = first;

		public boolean hasNext()
		{
			return current != null;
		}

		public void remove()
		{
			// no implementation
		}

		public Item next()
		{
			Item item = current.item;
			current = current.next;
			return item;
		}
	}
}