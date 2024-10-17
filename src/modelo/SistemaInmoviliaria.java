package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class SistemaInmoviliaria {
private List<Inmueble>lstInmueble;
private List<Operacion>lstOperacion;
private Alquiler alquiler;
public List<Inmueble> getLstInmueble() {
	return lstInmueble;
}
public void setLstInmueble(List<Inmueble> lstInmueble) {
	this.lstInmueble = lstInmueble;
}
public List<Operacion> getLstOperacion() {
	return lstOperacion;
}
public void setLstOperacion(List<Operacion> lstOperacion) {
	this.lstOperacion = lstOperacion;
}
public SistemaInmoviliaria() {
	super();
	this.lstInmueble = new ArrayList<Inmueble>();
	this.lstOperacion = new ArrayList<Operacion>();
}
public boolean agregarAlquiler(int cantAmbientes, String localidad,LocalDate fechaInicioContrato ,int cantMesesContrato,int frecuenciaMesesActualizacion , double alquilerMensulal, float icl0, LocalDate fechaUlActualizacion) {
	int id=1;
	if(lstInmueble.size()>0) {
		id=lstInmueble.get(lstInmueble.size()-1).getIdInmueble()+1;
	}
	return lstInmueble.add(new Alquiler(id,cantAmbientes,  localidad, fechaInicioContrato ,cantMesesContrato,frecuenciaMesesActualizacion ,  alquilerMensulal,  icl0,  fechaUlActualizacion));
	
}  
public boolean agregarVenta(int cantAmbientes, String localidad,double precioVenta,boolean enDolares) {
	int id=1;
	if(lstInmueble.size()>0) {
		id=lstInmueble.get(lstInmueble.size()-1).getIdInmueble()+1;
	}
	return lstInmueble.add(new Venta(id,cantAmbientes, localidad, precioVenta,enDolares));
	
} 

public Inmueble traerInmueble(int idInmueble) {
	Inmueble inmueble=null;
	int i=0;
	while(lstInmueble.size()>i && inmueble==null){
		if(lstInmueble.get(i).getIdInmueble()==idInmueble) {
			inmueble=lstInmueble.get(i);
		}
		i++;
	}
	return inmueble;
}

public boolean agregarOperacion(LocalDate fecha, Alquiler alquiler2, String detalle , double monto) {
	int id=1;
	boolean flag=false;
	if(lstInmueble.size()>0) {
		id=lstOperacion.get(lstOperacion.size()-1).getIdOperacion()+1;
	}

    if (alquiler2 instanceof Inmueble) {
    	lstOperacion.add(new Operacion(id, fecha, (Inmueble) alquiler2,  detalle ,  monto));
    	flag=true;
    }
    return flag;
}

public boolean agregarOperacion2(LocalDate fecha, Venta venta, String detalle, float ICL1) {
    int id = 1;
    boolean flag=false;

    if (!lstOperacion.isEmpty()) {
        id = lstOperacion.get(lstOperacion.size() - 1).getIdOperacion() + 1;
    }


    if (venta instanceof Inmueble) {
        flag=true;
        lstOperacion.add(new Operacion(id, fecha, (Inmueble) venta, detalle, ICL1));
    } 
return flag;
}


public List<Inmueble> traerInmueble(boolean enDolares){
List<Inmueble>aux=new ArrayList<Inmueble>();

for(int i=0 ;i<lstInmueble.size();i++) {

	if(lstInmueble.get(i) instanceof Venta&&((Venta) lstInmueble.get(i)).isEnDolares()==enDolares) {
		aux.add(lstInmueble.get(i));
		
	}
}
return aux;
}


}