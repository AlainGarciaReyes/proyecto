package musica;

public class nododoble {

		private int id_cancion;
		private String nombrecancion;
		private String album, artista;
		public String getNombrecancion(){
			return nombrecancion;
		}
		/*public void setNombrecancion(String nombrecancion){
			this.nombrecancion = nombrecancion;
						
		}*/
		private String genero;
		public int getId_cancion(){
			return id_cancion;
		}
		public String getArtista() {
			return artista;
		}
		public void setNombrecancion(String nombrecancion) {
			this.nombrecancion = nombrecancion;
		}
		public void setId_cancion(int id_cancion){
			this.id_cancion = id_cancion;
		}
		public String getAlbum(){
			return album;
		}
		public void setAlbum(String album){
			this.album = album;
		}
		public String getArtista(String artista){
			return artista;
		}
		public void setArtista(String artista){
			this.artista=artista;
		}
		public String getGenero(){
			return genero;
		}
		public void setGenero(String genero){
			this.genero=genero;
		}
		
		
/*
	private Object nombrecancion;

	public void setNombrecancion(String text) {
		this.nombrecancion = nombrecancion;		
	}

	public void setId_cancion(int parseInt) {
		// TODO Auto-generated method stub
		
	}
*/
}
