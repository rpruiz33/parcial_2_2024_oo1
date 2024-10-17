package test;

import java.time.LocalDate;

import modelo.SistemaInmoviliaria;
import modelo.Venta;
import modelo.SistemaInmoviliaria;
import modelo.Alquiler;
public class Test {

	public static void main(String[] args) {
		SistemaInmoviliaria sistema= new SistemaInmoviliaria();
		System.out.println(sistema.agregarVenta(5,"Banfield",150000 , true));
		System.out.println(sistema.agregarAlquiler(2,"Temperley",LocalDate.of(2024, 2, 1) , 24,4,200000, 8.13f, LocalDate.of(2024, 2, 1)));
		System.out.println(sistema.agregarVenta(4,"Remedios de Escalada",200000 , true));
		System.out.println(sistema.agregarAlquiler(3,"Lomas de Zamora",LocalDate.of(2024, 4, 1) , 24,3,200000, 10.8f, LocalDate.of(2024, 4, 1)));
		System.out.println(sistema.agregarVenta(1,"Avellaneda",9.0E7 , false));
		System.out.println(sistema.traerInmueble(4));
		System.out.println(sistema.agregarOperacion(LocalDate.of(2024, 3, 1),  (Venta) sistema.traerInmueble(1), "Alta inmueble para la venta", 0f));
		System.out.println(sistema.agregarOperacion(LocalDate.of(2024, 2, 1),(Alquiler)sistema.traerInmueble(2), "Alta contrato alquiler", 200000));
		System.out.println(sistema.agregarOperacion(LocalDate.of(2024, 3, 1),  (Venta) sistema.traerInmueble(3), "Alta inmueble para la venta", 0f));
		System.out.println(sistema.agregarOperacion(LocalDate.of(2024, 2, 1),(Alquiler)sistema.traerInmueble(4), "Alta contrato alquiler", 200000));
		System.out.println(sistema.agregarOperacion(LocalDate.of(2024, 3, 1),  (Venta) sistema.traerInmueble(5), "Alta inmueble para la venta", 0f));
	
		System.out.println(sistema.agregarOperacion(LocalDate.of(2024, 10, 16), (Alquiler) sistema.traerInmueble(2), "Cobro Alquiler", 13.95f));
		System.out.println(sistema.getLstOperacion());
		System.out.println(sistema.agregarOperacion(LocalDate.of(2024, 10, 16), (Venta) sistema.traerInmueble(1), "vendido",(float)(((Venta) sistema.traerInmueble(1)).getPrecioVenta())) );
		System.out.println(sistema.getLstOperacion());
		System.out.println(sistema.traerInmueble(true));
	}
}

