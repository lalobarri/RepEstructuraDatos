package Singleton;

public class UTSingleTest {
/*
 * Problema: Este ejemplo permite crear sólo 1 instancia de la creación de una universidad,
 * como es bien sabido no podemos tener 2 Universidades con el mismo nombre, pueden ser
 * Campus pero no la misma con el mismo nombre sin ser incomporada al Campus Central,
 * para ejemplicar use la idea de la UT en donde laboro por lo cual solo puede haber una UTNG,
 * tiene un campus pero no se puede replicar el campus Central ya que solo puede haber 1.
 */
	public static void main(String[] args) {
		UT	tecnologica = UT.getInstance("UTNG");// Sólo hago el instanciamiento no hay atributos en la clase base.
		/*
		 * Al tratar de crear un nuevo instanciamiento a la clase base, no es permitido por el compilador ya que
		 * estamos privatizando la clase al impedir que lo vuelva ha hacer, esto se encuentra en la
		 * sección UT.java con el instance.
		 * 
		 */
		UT utz = UT.getInstance("UTZ");
		
		
		
		}

}
