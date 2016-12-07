
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FAT fat = new FAT();
		
		fat.mostrarMetadatos();
		fat.crearDirectorio("peliculasNoVistas", "C:/");
		fat.crearArchivo("exmachina", 3, "peliculasNoVistas");
		fat.mostrarMetadatos();
		fat.crearDirectorio("peliculasVistas", "C:/");
		fat.moverArchivo("exmachina", "peliculasVistas", "peliculasNoVistas");
		fat.mostrarMetadatos();
		//eliminar peliculasVistas
		fat.mostrarMetadatos();
		//4) Listar procesos en ejecución.
		fat.crearDirectorio("tmp", "C:/");
		fat.crearArchivo("Gattaca", 3, "tmp");
		fat.crearArchivo("Memento", 3, "tmp");
		
		/*. Esperar un minuto y mostrar el contenido del directorio "tmp”,

     5) Lanzar el proceso BorraTMPcada5Segundos. Volver a listar procesos en ejecución. Esperar 5 segundos y mostrar el contenido del directorio "tmp”,

     6) Matar el proceso BorraTMPcada5Segundos. Volver a listar procesos en ejecución.*/

		fat.crearArchivo("EternalSunshineOfTheSpotlessMind", 3, "tmp");
		
    /* 7) Esperar un minuto y mostrar el contenido del directorio "tmp”,

    8)  Matar el proceso Consola.

    9) En Eclipse, mostrar la implementación de BorrarDirectorio.

	10) En Eclipse, mostrar la implementación de matar proceso*/
	}

}
