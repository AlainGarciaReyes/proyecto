package musica;

public class cancion {

	private nododoble valor;
	private cancion siguiente;
	private cancion anterior;
	public nododoble getValor(){
		return valor;
	}
	public void setValor(nododoble valor){
		this.valor=valor;
	}
	public cancion getSiguiente(){
		return siguiente;
	}
	public void setSiguiente(cancion siguiente){
		this.siguiente=siguiente;
	}
	public cancion getAnterior(){
		return anterior;
	}
	public void setAnterior(cancion anterior){
		this.anterior=anterior;
	}
	
	
}
