/**
 * Main
 * Objetivo: diferentes funcionalidades del vector
 * 
 * @author Carlos Martinez
 * @author Paulo Sánchez
 * @author Carlos Estrada 
 * @version 1.0 finalizado 01/02/2022
 */
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Stack;
import java.util.Vector;


public class Main {
	public static void main(String[] args) {

		// PREGUNTAR A DOUBLAS
		StackVector<Double> miStack = new StackVector<Double>(); // Stack<Double> miStack = new StackVector<Double>();
		
		//-------------------------
		
		Calculadora calcu = new Calculadora();
		
		ArrayList<String> lista = new ArrayList<>();
		
		 try(FileReader fileReader = new FileReader("Prueba.txt")){
		        int caracterLeido = fileReader.read();
		        while(caracterLeido!= -1) {
		            char caracter = (char) caracterLeido;
		            String caracter1 = String.valueOf(caracter);
		            lista.add(caracter1);
		            caracterLeido = fileReader.read();
		        }
		    }catch(IOException ex){
		        System.err.println("Erorr al leer el archivo");
		        ex.printStackTrace();

		    }

		 ArrayList<String>removed = new ArrayList<>();  
		 removed.add(" ");
		 
		 lista.removeAll(removed);
		 
		 System.out.print(lista);
		 
		 ArrayList<String>operaciones = new ArrayList<>();  
		 
		 for (String x : lista) {
			 
			 try {
				 double digito = Double.parseDouble(x);
				 miStack.add(digito); //push
				 //System.out.print(digito);
				 
			 }catch(NumberFormatException nfe){
				 double num2 = miStack.remove();
				 //System.out.print(num1);
				 double num1 = miStack.remove();
				 //System.out.print(num2);
				 //System.out.print(x);
				 double num = calcu.calculate(x, num1, num2);
				 //System.out.print(num);
				 miStack.add(num);				 
			 }
		 }
		 
		 System.out.print(miStack.peek());

	}
}
