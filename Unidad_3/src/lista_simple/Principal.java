package lista_simple;

public class Principal {
	public static void main(String[] args) {
		Lista lista= new Lista();
		lista.insertarInicio("Juan");
		lista.insertarInicio("Pedro");
		lista.insertarInicio("Miguel");
		lista.insertarInicio("Mario");
		lista.insertarInicio("Javier");
		lista.mostrarLista();
		lista.insertarFinal("Martha");
		lista.insertarFinal("Silvia");
		lista.insertarFinal("Yolanda");
		lista.mostrarLista();
		lista.eliminarInicio();
		lista.eliminarInicio();
		lista.mostrarLista();
		
	}

}
