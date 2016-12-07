
public class EntradaDirectorio {
	private String nombre;
	private int clusterIn;
	private char tipo;
	
	public EntradaDirectorio(String nom,int clusterInicio, char tipoCluster)
	{
		nombre = nom;
		clusterIn = clusterInicio;
		tipo = tipoCluster;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getClusterIn()
	{
		return clusterIn;
	}
	
	public char getTipo()
	{
		return tipo;
	}
	
	public void setNombre(String nom)
	{
		nombre = nom;
	}
	
	public void setClusterIn(int numCluster)
	{
		clusterIn = numCluster;
	}
	
	public void setTipo(char tipoCluster)
	{
		tipo = tipoCluster;
	}
}
