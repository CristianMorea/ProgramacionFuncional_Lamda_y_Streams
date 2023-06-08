package Funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args)
	{
		new Main();
		
	}

	public Main()
	{
		//QUE QUEREMOS HACER
		// 1. CREAR LISTA DE ENTEROS
		List<Integer> numeros = crearLista();
		System.out.println(numeros);
		// 2. QUEDARME SOLO CON LOS PARES
		List<Integer> pares = filtrarPares(numeros);
		System.out.println(pares);
		// 3. PASAR CADA NUMERO AL CUADRADO
		List<Integer>cuadrados= elevarAlCuadrado(pares);
		System.out.println(cuadrados);
		// 4. MOSTRAR CADA CUADRADO POR PANTALLA
		List<Integer> mostrados = mostrarLista(cuadrados); 
		// 5. OBTENER LA SUMA DE LOS CUADRADOS
		int total = sumarLista(mostrados);
		System.out.println("LA SUMA TOTAL ES: "+total);

	}
	
	
	
	private List<Integer> crearLista()
	{
		//return Arrays.asList(0,1,2,3,5,8,13,21,34,55,89,144);
	return List.of(0,1,2,3,5,8,13,21,34,55,89,144);
	}
	
	private List<Integer> filtrarPares(List<Integer> numeros)
	{
		List<Integer> resultado = new ArrayList<>();
		//SE RECORRE LA LISTA Y AGREGO A LA LISTA RESULTADO SOLO LOS NUMEROS PARES
		//DE LA LISTA ORIGINAL
		
		for(Integer numero:numeros)
		{
			if(numero %2 ==0)
			{
				resultado.add(numero);	
			}
		}
		
		return resultado;
	}
	
	private List<Integer>elevarAlCuadrado(List<Integer>numeros)
	{
		List<Integer> cuadrado = new ArrayList<>();
		//SE RECORRE LA LISTA Y AGREGO A LA LISTA EL CUADRADOD DE LOS NUMEROS PARES
		//DE LA LISTA ORIGINAL
		
		for(Integer numero:numeros)
		{
			
		cuadrado.add(numero*numero);	
			
		}
		
		return cuadrado;
	}
	private List<Integer>mostrarLista(List<Integer>numeros)
	{
		for(Integer numero: numeros)
		{
		System.out.println(numero);
		}
		return numeros;
	}
	private int sumarLista(List<Integer>numeros)
	{
		int total=0;
		for(Integer numero: numeros)
		{
		total +=numero;
		}
		return total;
	}
}
