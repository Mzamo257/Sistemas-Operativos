
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
	
	public void crearDirectorio(String nombre, String dondeGuardar)
	{
		//Compruebo que haya hueco en los clusters
		if(numeroClustersDisponibles() != 0)
		{
			int clust = buscarClusterDisponible();
			//busco el directorio en el que quiero guardar el archivo
			for(int i = 0; i < 20; i++)
			{
				if(((Directorio) clusters[i]).getNombre() == dondeGuardar){((Directorio) clusters[i]).introducirEntrada(nombre, clust, 'D');break;};
			}
			//Guardo el directorio
			clusters[clust] = new Directorio(nombre);
			entradasFat[clust].setDisponible(false);
			entradasFat[clust].setFin(true);
		}
	}
	
	public void crearArchivo(String nombreArchivo, int tam, String nombreDirectorio)//tam = tamaño máximo, se debería cambiar a un double para poder poner decimales y redondear
	{		
		int clusterAnterior = 0;
		int i;
		//Compruebo que haya hueco en los clusters
		if(numeroClustersDisponibles() > tam)
		{
			int clust = buscarClusterDisponible();
			//busco el directorio en el que quiero guardar el archivo
			for(i = 0; i < 20; i++)
			{
				if(((Directorio) clusters[i]).getNombre() == nombreDirectorio){((Directorio) clusters[i]).introducirEntrada(nombreArchivo, clust, 'A'); break;};
			}
			//meto los trocitos del archivo en los distintos clusters
			for(i = 1; i <= tam; i++)
			{
				clust = buscarClusterDisponible();
				clusters[clust] = new Dato(nombreArchivo, i, tam);
				entradasFat[clust].setDisponible(false);
				entradasFat[clusterAnterior].setSiguiente(clust);
				//comprueba si es el ultimo trozo de archivo
				if(i == tam){entradasFat[clust].setFin(true);}
				else{entradasFat[clust].setFin(false);}		
				//Guardamos el cluster actual para despues asignarle en siguiente el cluster correspondiente
				clusterAnterior = clust;
			}
		}
		else{System.out.println("No hay espacio disponible");}
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
