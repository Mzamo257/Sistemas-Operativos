
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FAT fat = new FAT();
		
		fat.mostrarMetadatos();
		fat.crearDirectorio("peliculasNoVistas", "C:/");
		fat.crearArchivo("exmachina", 3, "C:/");
		fat.mostrarMetadatos();
	}

}
