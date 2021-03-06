
public class Directorio extends Cluster{
	private String nombreDirectorio;
	private EntradaDirectorio [] listaDirectorios;
	private int numDirec = 0;
	
	public Directorio(String nombre)
	{
		nombreDirectorio = nombre;
		listaDirectorios = new EntradaDirectorio[20];
		for(int i = 0; i < 20; i++)
		{
			listaDirectorios[i] = null;
		}
	}
	
	public String getNombre()
	{
		return nombreDirectorio;
	}
	
	public void introducirEntrada(String nombre, int num, char tipo)
	{
		listaDirectorios[numDirec] = new EntradaDirectorio(nombre, num, tipo);
		numDirec++;
	}
	
	public void eliminarEntrada(int posicion)
	{
		listaDirectorios[posicion].setClusterIn(-1);
		listaDirectorios[posicion].setNombre("");
		listaDirectorios[posicion].setTipo(' ');
	}
	
	public String getNombreListaDirectorios(int i)
	{
		return listaDirectorios[i].getNombre();
	}
	
	public int getClusterIn(int i)
	{
		return listaDirectorios[i].getClusterIn();
	}
	
	public char getTipoDato(int i)
	{
		return listaDirectorios[i].getTipo();
	}
	
	public int getNumDir(int i)
	{
		return numDirec;
	}
	
}
