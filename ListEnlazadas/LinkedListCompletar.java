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
		LinkedListCompletar ll = new LinkedListCompletar(10);
		ll.addAtHead(11);
		ll.addAtHead(12);
		ll.addAtHead(13);
		ll.addAtTail(8);
		ll.addAtTail(7);
		ll.printList();
		ll.addAtIndex(4,9);
		ll.printList();
		ll.deleteAtIndex(0);
		ll.printList();
		ll.deleteAtNode(7);
		ll.printList();
		ll.modifyAtNode(11,15);
		ll.printList();		
		ll.modifyAtIndex(4,20);
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
	
	public void addAtTail(Object xNode)
	{
		Node temp = head;
		while(temp.getLink() != null)
		{
			//temp = temp.next;
			temp = temp.getLink();
		}
		temp.setLink(new Node(xNode));
		//temp.next = new Node(dat);
		numNodes++;
	}
	
	public void addAtIndex(int index, Object xNode)
	{
		Node temp= head;
		Node holder;
		if(index>=0 && index<=getSize()){
			for(int i=0;i<index-1 && temp.getLink() != null;i++){
			temp = temp.getLink();
			
		}
		holder = temp.getLink();
		temp.setLink(new Node(xNode));
		temp.getLink().setLink(holder);

		numNodes++;


		}
		else{
			System.out.println("Indice no valido en la lista");
		}
	}
	
	public void deleteAtIndex(int index)
	{
		Node temp= head;
		if (index>=0 && index<=getSize()) {
			if (index==0){
			head=temp.getLink();
		
			}
			else{
				for(int i=0;i<index-1 && temp.getLink() != null;i++){
				temp = temp.getLink();
				}	
			temp.setLink(temp.getLink().getLink());
			}
			numNodes--;
		}
		else{
			System.out.println("No hay elemento en el indice ingresado");
		}
		
	}


	public void deleteAtNode(int xNode)
	{
		int index;
		index= find(xNode);
		if (index<0){
			System.out.println("El numero que se quiere eliminar no se encuentra en la lista");
		}
		else{
			deleteAtIndex(index);	
		}
	}

	public void modifyAtNode(Object n, int x){
		Node aux=head;
		while(aux.getData() != n && aux.getLink()!=null){
			aux=aux.getLink();
		}
		if(aux.getLink()==null)
		{
			System.out.println("El numero que se quiere modifcar no se encuentra en la lista");
		}
		else{
			aux.setData(x);
		}

	}

	public void modifyAtIndex(int index, int x){
		Node temp=head;
		if(index>=0 && index<=getSize()){
			if(index==0){
				temp.setData(x);
			}
			else{
				for(int i=0;i<index-1 && temp.getLink() != null;i++)
				{
				temp = temp.getLink();
				}
				temp.getLink().setData(x);
			}
		}
		else{
			System.out.println("El indice que se quiere modificar no existe en la lista");
		}
	}
	
	public static int find(Object n)
	{
		Node aux = head;
		int index = 0;
		while(aux.getData() != n && aux.getLink()!=null)
		{
			index++;
			aux=aux.getLink();
			//t = t.next;
		}
		if (aux.getData()==n){
			
			return index;
		}
		else{
			index=-1;
			return index;
		}


	}
	
	
	public static void printList()
	{
		System.out.println("Number of elements:"+getSize());
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