
public class Dato extends Cluster{
	private String nombreArchivo;
	private int parteArchivo;
	private int totalArchivo;
	
	public Dato(String nombre, int parte, int total)
	{
		nombreArchivo = nombre;
		//hay que calcular las partes
		parteArchivo = parte;
		totalArchivo = total;
	}
	
	public String getNombre()
	{
		return nombreArchivo;
	}
	
	public int getParte()
	{
		return parteArchivo;
	}
	
	public int getTotal()
	{
		return totalArchivo;
	}
	
	public void setNombre(String nombre)
	{
		nombreArchivo = nombre;
	}
	
	public void setParte(int parte)
	{
		parteArchivo = parte;
	}
	
	public void setTotal(int total)
	{
		totalArchivo = total;
	}
}
