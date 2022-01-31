/**
 * StackVector
 * Objetivo: diferentes funcionalidades del vector
 * 
 * @author Carlos Martinez
 * @author Paulo Sánchez
 * @author Carlos Estrada 
 * @version 1.0 finalizado 01/02/2022
 */
import java.util.Vector;

public class StackVector<E> implements Stack<E>{
	
	protected Vector<E> vector;
	
	public StackVector()
	// post: constructs a new, empty stack
	{
		vector = new Vector<E>();
	}
	

	public void add(E num) {
		vector.add(num);
		
	}

	// Devuelve el ultimo valor y lo elimina
	public E remove() {
		return vector.remove(vector.size()-1);
		
	}

	
	public E peek() {
		return vector.elementAt(vector.size()-1);
	}

	// Si regresa true entonces esta vacio
	public boolean empty() {
		return vector.size() == 0;
	}

	
	public int size() {
		return vector.size();
	}


	
}
