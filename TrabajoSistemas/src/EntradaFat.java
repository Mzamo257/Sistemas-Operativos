
public class EntradaFat {

	private	boolean disponible;
	private	boolean fin;
	private	int siguiente;
		
	public boolean getDispoible()
	{
		return disponible;
	}
	
	public boolean getFin()
	{
		return fin;
	}
	
	public int getSiguiente()
	{
		return siguiente;
	}
	
	public void setDisponible(boolean cambio)
	{
		disponible = cambio;
	}
	
	public void setFin(boolean cambio)
	{
		fin = cambio;
	}
	
	public void setSiguiente(int numCluster)
	{
		siguiente = numCluster;
	}
	
	
		
}
