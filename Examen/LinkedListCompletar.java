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

public class LinkedListCompletar
{
	//Class variables for the Linked List
	private static Node head;
	private static int numNodes;
	
	public static void main(String [] args)
	{
		System.out.println("/=/=/=/= TESTING /=/=/=/=");
		//Con esta funcion, se van agregando los numeros en la lista
		LinkedListCompletar ll = new LinkedListCompletar(10);
		ll.addAtHead(6);
		ll.addAtHead(4);
		ll.addAtHead(2);
		ll.printList();
		ll.addNum(4);
		//Con esta funcion se le da el dato para poder comparar en la lista
		ll.printList();
		
	}
	
	public LinkedListCompletar(Object dat)
	{
		head = new Node(dat);
		numNodes=1;
	}
	
	public void addAtHead(Object dat)
	{
		Node temp = head;
		head = new Node(dat);
		head.setLink(temp);
		numNodes++;
	}
	
	public void addNum(int x){
		Node holder;
		Node temp=head;
		int bandera =1;
		
		while(temp.getLink()!=null){
		if(temp.getData()<x && temp.getLink().getData()>x){
			holder=temp.getLink();
			temp.setLink(new Node(x));
			temp.getLink().setLink(holder);
			bandera=0;
			break;
		} 
		else{
			if(temp.getLink().getData()==x){
				temp.setLink(temp.getLink().getLink());
				x=2*x;
			
			}
		}
		temp=temp.getLink();
		}
		if(temp.getLink()==null && bandera==1){
			temp.setLink(new Node(x));
		}

	}
	
	public static void printList()
	{
		System.out.println("Lista:");
		Node temp = head;
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