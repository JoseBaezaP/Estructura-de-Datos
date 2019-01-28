/*============================================================================
Name        : LinkedList.java
Author      : Eric Swanson
Date	    : Sep 7, 2011
Version     : 
Description : 
Copyright (C) 2011 netherwolfe
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.


  
  Some modifications added by Joel  2019-01-07
============================================================================*/

public class ListaP
{
	//Class variables for the Linked List
	private static NodePi head;
	private static int numNodes;
	
	public static void main(String [] args)
	{
		System.out.println("/=/=/=/= TESTING /=/=/=/=");
		ListaP ll = new ListaP(10);
		ll.push(11);
		ll.push(12);
		ll.push(13);
		ll.printList();
		ll.pop();
		ll.printList();
		

	}
	
	public ListaP(Object dat)
	{
		head = new NodePi(dat);
		numNodes=1;
	}
	
	public void push(Object dat)
	{
		NodePi temp = head;
		head = new NodePi(dat);
		head.setLink(temp);
		numNodes++;
	}
	
	public void pop()
	{
		NodePi temp = head;

		temp.setLink(temp.getLink());
		
	}
	
	
	
	
	public static void printList()
	{
		System.out.println("Number of elements:"+getSize());
		NodePi temp = head;
		while(temp != null)
		{
			System.out.println(temp.getData());
			//temp = temp.next;
			temp = temp.getLink();
		}
	}
	
	public static int getSize()
	{
		return numNodes;
	}
	
}