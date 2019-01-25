public class LinkedList
{
	//Class variables for the Linked List
	private static NodeP head1;
	private static NodeP head2;
	private static NodeP head3;
    public static int numNodes1;
	public static int numNodes2;
	public static int numNodes3;
	
	public static void main(String [] args)
	{
		System.out.println("/=/=/=/= TESTING /=/=/=/=");
		numNodes1=0;
		numNodes2=0;
		numNodes3=0;
		LinkedList ll = new LinkedList(3,1);
		ll.add(2,1);	
		ll.add(5,1);
		ll.add(2,2);	
		ll.add(5,2);
		ll.add(3,2);
		ll.add(2,3);	
		ll.add(5,3);
		ll.add(3,3);
		ll.printList();

	}
	
	public LinkedList(float dat, int prio)
	{
		
		switch(prio){
			case 1:
				head1 = new NodeP(dat,prio);
				numNodes1++;
				break;
			case 2:
				head2 = new NodeP(dat,prio);
				numNodes2++;
				break;
			case 3:
				head3 = new NodeP(dat,prio);
				numNodes3++;
				break;
			default:
				break;
			}
	}

	public void add(float dat, int prio)
		{
	
		switch (prio){
			case 1:
				
				NodeP temp1 = head1;
				NodeP holder;
				if (temp1==null){
					head1 = new NodeP(dat,prio);
					numNodes1++;
					break;
				}
				else{
					if(dat>temp1.getValor()){
			
					head1 = new NodeP(dat,prio);
					
					
					head1.setLink(temp1);
					numNodes1++;

					}
				else
				{
					if(dat<temp1.getValor() && temp1.getLink()==null){

						
						temp1.setLink(new NodeP(dat,prio));
						numNodes1++;
					}
					else{
							
							while (temp1!=null) {	
								if (temp1.getLink()==null){
										
											temp1.setLink(new NodeP(dat,prio));
											numNodes1++;
											break;

									}
								
								else{
									if(dat<temp1.getValor() && dat>temp1.getLink().getValor()){
									holder=temp1.getLink();
									temp1.setLink(new NodeP(dat,prio));
									temp1.getLink().setLink(holder);
									numNodes1++;
									break;
									}

								}
								temp1=temp1.getLink();
					
							}			
						}
				}
				}
				
				break;

			case 2:

				NodeP temp2 = head2;
				NodeP holder2;
				if (temp2==null){
					head2 = new NodeP(dat,prio);
					numNodes2++;
					break;
				}
				else{
					if(dat>temp2.getValor()){
			
					head2 = new NodeP(dat,prio);
					
					
					head2.setLink(temp2);
					numNodes2++;

					}
				else
				{
					if(dat<temp2.getValor() && temp2.getLink()==null){

						
						temp2.setLink(new NodeP(dat,prio));
						numNodes2++;
					}
					else{
							
							while (temp2!=null) {	
								if (temp2.getLink()==null){
										
											temp2.setLink(new NodeP(dat,prio));
											numNodes2++;
											break;

									}
								
								else{
									if(dat<temp2.getValor() && dat>temp2.getLink().getValor()){
									holder2=temp2.getLink();
									temp2.setLink(new NodeP(dat,prio));
									temp2.getLink().setLink(holder2);
									numNodes2++;
									break;
									}

								}
								temp2=temp2.getLink();
					
							}			
						}
				}
				}
				
				break;

			case 3:

					NodeP temp3 = head3;
					NodeP holder3;
					if (numNodes3==0){
					head3 = new NodeP(dat,prio);
					numNodes3++;
					break;
				}
				else{
					if(dat>temp3.getValor()){
			
						head3 = new NodeP(dat,prio);
						
					
						head3.setLink(temp3);
						numNodes3++;

						}
					else
					{
						if(dat<temp3.getValor() && temp3.getLink()==null){
							temp3.setLink(new NodeP(dat,prio));
							numNodes3++;
						}
					
					else{
							
							while (temp3!=null) {	
								if (temp3.getLink()==null){
										
											temp3.setLink(new NodeP(dat,prio));
											numNodes3++;
											break;
									}
								
								else{
									if(dat<temp3.getValor() && dat>temp3.getLink().getValor()){
										holder3=temp3.getLink();
										temp3.setLink(new NodeP(dat,prio));
										temp3.getLink().setLink(holder3);
										numNodes3++;
										break;
									}

								}
								temp3=temp3.getLink();
					
							}			
						}
					}	
				}
					
					break;
				default:
					break;
		}
		
	}
	


	public static void printList()
	{
		System.out.println("Number of elements:");
		NodeP temp1  = head1;
		NodeP temp2 = head2;
		NodeP temp3 = head3;
		int bandera=0;

		for(int i=0;i<numNodes2+numNodes3+numNodes1;i++)
		{
			
			if (i<numNodes1){
				System.out.println(temp1.getValor());
				//temp = temp.next;
				temp1 = temp1.getLink();
			
			}
			else
			{
				if(bandera<numNodes2)
				{
					
					System.out.println(temp2.getValor());
				//temp = temp.next;
					temp2 = temp2.getLink();
					bandera++;
					
				}
				else
				{
					
					System.out.println(temp3.getValor());
				//temp = temp.next;
					temp3 = temp3.getLink();
					bandera++;
				}
			}
			
		}
	}
}
	