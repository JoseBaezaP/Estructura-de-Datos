	public class NodeP
	{
		//Declare class variables
		private NodeP next;
		private int prioridad;
		private float valor;


		public void setLink(NodeP X){
           this.next=X;
		}

		public NodeP getLink(){
			return this.next;
		}
		
		public NodeP(float _valor,int _prioridad)
		{
			valor = _valor;
			prioridad= _prioridad;
		}

		public void setPrioridad(int _Data)
		{
			this.prioridad= _Data;
		}

		public Object getPrioridad()
		{
			return prioridad;
		}

		public void setValor(float _Data)
		{
			this.valor= _Data;
		}

		public float getValor()
		{
			return valor;
		}
	}