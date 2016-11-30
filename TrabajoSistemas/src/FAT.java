
public class FAT {
	EntradaFat [] entradasFat;
	Cluster [] clusters;
	
	public FAT()
	{
		entradasFat = new EntradaFat[20];
		clusters = new Cluster [20];
		
		for(int  i = 0; i < 20; i++)
		{
			entradasFat[i] = new EntradaFat();
			clusters[i] = new Cluster();
		}
		
		clusters[0] = new Directorio("C:/");
		entradasFat[0].setDisponible(false);
		entradasFat[0].setFin(true);
	}
	
	public void mostrarMetadatos()
	{
		for(int i = 0; i < 20; i++)
		{
			System.out.println("\nCluster " + i + ":");
			entradasFat[i].mostrar();
		}
	}
	
	public void crearDirectorio(String nombre)
	{
		int clust = buscarClusterDisponible();
		clusters[clust] = new Directorio(nombre);
		entradasFat[clust].setDisponible(false);
		entradasFat[clust].setFin(false);
	}
	
	public void crearArchivo()
	{
		
	}
	
	public int buscarClusterDisponible()
	{
		for(int i = 0; i < 20; i++)
		{
			if(entradasFat[i].getDispoible() == true) return i;
		}
		return -1;
	}
	
	public int numeroClustersDisponibles()
	{
		int contador = 0;
		for(int i = 0; i < 20; i++)
		{
			if(entradasFat[i].getDispoible() == true) contador ++;
		}
		return contador;
	}
	
	
	
}
