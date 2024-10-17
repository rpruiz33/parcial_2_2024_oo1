package modelo;

import java.time.LocalDate;

public class Operacion {
private int idOperacion;
private LocalDate fecha;
private Inmueble inmueble;
private String detalle;
private double monto;
public int getIdOperacion() {
	return idOperacion;
}
public void setIdOperacion(int idOperacion) {
	this.idOperacion = idOperacion;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public Inmueble getInmueble() {
	return inmueble;
}
public void setInmueble(Inmueble inmueble) {
	this.inmueble = inmueble;
}
public String getDetalle() {
	return detalle;
}
public void setDetalle(String detalle) {
	this.detalle = detalle;
}
public double getMonto() {
	return monto;
}
public void setMonto(double monto) {
	this.monto = monto;
}
public Operacion(int idOperacion, LocalDate fecha, Inmueble inmueble, String detalle, double monto) {
	super();
	this.idOperacion = idOperacion;
	this.fecha = fecha;
	this.inmueble = inmueble;
	this.detalle = detalle;
	this.monto = monto;
}
@Override
public String toString() {
	return "Operacion [idOperacion=" + idOperacion + ", fecha=" + fecha + ", inmueble=" + inmueble + ", detalle="
			+ detalle + ", monto=" + monto + "]";
}


}
