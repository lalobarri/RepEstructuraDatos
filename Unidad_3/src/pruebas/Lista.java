package pruebas;

public class Lista {
	Nodo inicio;
	Nodo fin;
	
	public Lista(){
		inicio=null;
		fin=null;
	}
	
	public void insertarInicio(String info){
		Nodo nuevo=new Nodo(info, inicio);
		inicio=nuevo;
		if(fin==null)
			fin=inicio;
	}
	public void insertarFinal(String info){
		Nodo nuevo=new Nodo(info, null);
		if(inicio ==null){
			fin=nuevo;
			inicio=fin;
		}else{
			fin.siguiente=nuevo;
			fin=nuevo;
		}
		
	}
	
	public void eliminarInicio(){
		if(inicio!=null)
			inicio=inicio.siguiente;
		else{
			inicio=null;fin=null;
		}
	}
	//Hacer este métodos
	public void eliminarFinal(){
		
	}
	//Metodo para devolver el primer elemento de la lista
	//Metodo para devolver el último elemento de la lista
	
	public void Listar(){
		Nodo temp=inicio;
		while(temp != null){
			System.out.print(temp.getInfo()+"->");
			temp=temp.siguiente;
		}
	}

}
