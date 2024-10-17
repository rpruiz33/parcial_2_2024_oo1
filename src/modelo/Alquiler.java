package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler extends Inmueble {
private LocalDate fechaInicioContrato;

private int CantMesesContrato;
private int frecuenciaMesesActualizacion;
private double alquilerMensual;
private float ICL0;
private LocalDate fechaUlActulizacion;
public LocalDate getFechaInicioContrato() {
	return fechaInicioContrato;
}
public void setFechaInicioContrato(LocalDate fechaInicioContrato) {
	this.fechaInicioContrato = fechaInicioContrato;
}
public int getCantMesesContrato() {
	return CantMesesContrato;
}
public void setCantMesesContrato(int cantMesesContrato) {
	CantMesesContrato = cantMesesContrato;
}
public int getFrecuenciaMesesActualizacion() {
	return frecuenciaMesesActualizacion;
}
public void setFrecuenciaMesesActualizacion(int frecuenciaMesesActualizacion) {
	this.frecuenciaMesesActualizacion = frecuenciaMesesActualizacion;
}
public double getAlquilerMensual() {
	return alquilerMensual;
}
public void setAlquilerMensual(double alquilerMensual) {
	this.alquilerMensual = alquilerMensual;
}
public float getICLO() {
	return ICL0;
}
public void setICLO(float iCL0) {
	ICL0 = iCL0;
}
public LocalDate getFechaUlActulizacion() {
	return fechaUlActulizacion;
}
public void setFechaUlActulizacion(LocalDate fechaUlActulizacion) {
	this.fechaUlActulizacion = fechaUlActulizacion;
}

public Alquiler(int idInmueble, int cantAmbientes, String localidad, LocalDate fechaInicioContrato,
		int cantMesesContrato, int frecuenciaMesesActualizacion, double alquilerMensual, float iCL0,
		LocalDate fechaUlActulizacion) {
	super(idInmueble, cantAmbientes, localidad);
	this.fechaInicioContrato = fechaInicioContrato;
	CantMesesContrato = cantMesesContrato;
	this.frecuenciaMesesActualizacion = frecuenciaMesesActualizacion;
	this.alquilerMensual = alquilerMensual;
	ICL0 = iCL0;
	this.fechaUlActulizacion = fechaUlActulizacion;
}
public void actualizarAlquiler(LocalDate fecha, float ICL1) {
	int diferenciaMeses=Period.between(this.getFechaUlActulizacion(), fecha).getYears()*12+Period.between(this.getFechaUlActulizacion(), fecha).getMonths();
	if(diferenciaMeses<this.frecuenciaMesesActualizacion) {
		setAlquilerMensual(alquilerMensual*ICL1/ICL0);	
		setICLO( ICL1);
		setFechaUlActulizacion(fecha);
	}
	
}
@Override
public String toString() {
	return "\nAlquiler [fechaInicioContrato=" + fechaInicioContrato + ", CantMesesContrato=" + CantMesesContrato
			+ ", frecuenciaMesesActualizacion=" + frecuenciaMesesActualizacion + ", alquilerMensual=" + alquilerMensual
			+ ", ICL0=" + ICL0 + ", fechaUlActulizacion=" + fechaUlActulizacion + ", idInmueble=" + idInmueble
			+ ", cantAmbientes=" + cantAmbientes + ", localidad=" + localidad + "]";
}
}
