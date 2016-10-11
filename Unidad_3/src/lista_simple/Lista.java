package lista_simple;

public class Lista {
	Nodo inicio;
	Nodo fin;
	
	//Constructor de la lista
	public Lista(){
		inicio=null; fin=null;
	}
	
	public void insertarInicio(String info){
		Nodo nuevo= new Nodo(info, inicio);
		inicio=nuevo;
		if(fin==null)
			fin=inicio;
	}
	public void insertarFinal(String info){
		Nodo nuevo=new Nodo(info, null);
		if(inicio==null){
			fin=nuevo;
			inicio=fin;
			
		}else{
			fin.siguiente=nuevo;
			fin=nuevo;
			
		}
	}
	//        inicio
	// juan -> pedro-> miguel-> antonio->
	public void eliminarInicio(){
		if(inicio!=null){
			inicio=inicio.siguiente;
			System.out.println("Se ha eliminado un dato al Inicio...");
		}
		else{
			inicio=null;fin=null;
		}
	}
	//Desarrollar estos tres métodos faltantes:
	//Eliminar al final
	
	public void eliminarFinal(){
		Nodo temp=inicio;
		Nodo penultimo=null;
		while(temp.siguiente !=null){
		    penultimo = temp;
			temp=temp.siguiente; //iterador para recorrer la lista
		}
		fin=penultimo;
		System.out.println();
	}
	//Obtener el primer elemento de la lista
	//Obtener el último elemento de la lista
	
	
	
	public void mostrarLista(){
		Nodo temp=inicio;
		while(temp !=null){
			System.out.print(temp.getInfo()+"->");
			temp=temp.siguiente; //iterador para recorrer la lista
		}
		System.out.println();
	}
	

}
