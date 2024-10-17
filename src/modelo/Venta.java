package modelo;

public class Venta  extends Inmueble{
private double precioVenta;
private boolean enDolares;
public double getPrecioVenta() {
	return precioVenta;
}
public void setPrecioVenta(double precioVenta) {
	this.precioVenta = precioVenta;
}
public boolean isEnDolares() {
	return enDolares;
}
public void setEnDolares(boolean enDolares) {
	this.enDolares = enDolares;
}
public Venta(int idInmueble, int cantAmbientes, String localidad, double precioVenta, boolean enDolares) {
	super(idInmueble, cantAmbientes, localidad);
	this.precioVenta = precioVenta;
	this.enDolares = enDolares;
}
@Override
public String toString() {
	return "\nVenta [precioVenta=" + precioVenta + ", enDolares=" + enDolares + ", idInmueble=" + idInmueble
			+ ", cantAmbientes=" + cantAmbientes + ", localidad=" + localidad + "]";
}




}
