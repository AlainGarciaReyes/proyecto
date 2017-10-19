package musica;

public class listadoble {

	private cancion cabeza;
	public listadoble()
	{
		this.cabeza=null;
	}
	public cancion getCabeza(){
		return cabeza;
	}
	public void setcabeza(cancion cabeza){
		this.cabeza=cabeza;
	}
	public boolean vacio(){
		boolean respuesta=true;
		if(this.cabeza!=null){
			respuesta=false;
		}
		return respuesta;
	}
	public void insertar(nododoble valor){
		cancion nuevo=new cancion();
		nuevo.setValor(valor);
		nuevo.setSiguiente(null);
		nuevo.setAnterior(null);
		this.cabeza=nuevo;
	}
	public void insertarnodoadelante(nododoble valor)
	{
		if(vacio()){
			insertar(valor);
		}
		else{
			cancion nuevo=new cancion();
			nuevo.setValor(valor);
			nuevo.setSiguiente(this.cabeza);
			this.cabeza.setAnterior(nuevo);
			nuevo.setAnterior(null);
			this.cabeza=nuevo;
		}
	}
	
}
