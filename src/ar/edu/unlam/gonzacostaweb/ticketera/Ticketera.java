package ar.edu.unlam.gonzacostaweb.ticketera;
import java.util.ArrayList;

public class Ticketera {
	
	private Integer id;	
	private Integer contadorTurnosAtencion;	
	private Integer contadorTurnosReclamos;	
	private Integer contadorTurnosVentas;
	private Integer contadorTurnosPreferencial;
	private ArrayList<Turno> turnosGenerados;
		
	public Ticketera(Integer id) {
		
		this.id = id;
		this.contadorTurnosAtencion = 0;
		this.contadorTurnosReclamos = 0;
		this.contadorTurnosVentas = 0;
		this.contadorTurnosPreferencial = 0;
		this.turnosGenerados = new ArrayList<Turno>();
		
	}
	
	public Integer getId() {
		
		return id;
		
	}
	
	public ArrayList<Turno> getTurnosGenerados() {
		
		return this.turnosGenerados;
		
	}
	
	public void setId(Integer id) {
		
		this.id = id;
		
	}
	
	public TurnoAtencion generarTurnoAtencion() {
		
		contadorTurnosAtencion++;
		
		TurnoAtencion turnoAtencionGenerado = new TurnoAtencion(contadorTurnosAtencion);
		
		turnosGenerados.add(turnoAtencionGenerado);
		
		return turnoAtencionGenerado;
		
	}
	
	public TurnoReclamos generarTurnoReclamos() {
		
		contadorTurnosReclamos++;
		
		TurnoReclamos turnoReclamosGenerado = new TurnoReclamos(contadorTurnosReclamos);
		
		turnosGenerados.add(turnoReclamosGenerado);
		
		return turnoReclamosGenerado;
		
	}
	
	public TurnoVentas generarTurnoVentas() {
		
		contadorTurnosVentas++;
		
		TurnoVentas turnoVentasGenerado = new TurnoVentas(contadorTurnosVentas);
		
		turnosGenerados.add(turnoVentasGenerado);
		
		return turnoVentasGenerado;
		
	}
	
	public TurnoPreferencial generarTurnoPreferencial() {
		
		contadorTurnosPreferencial++;
		
		TurnoPreferencial turnoPreferencialGenerado = new TurnoPreferencial(contadorTurnosPreferencial);
		
		turnosGenerados.add(turnoPreferencialGenerado);
		
		return turnoPreferencialGenerado;
		
	}
	
	public Integer obtenerCantidadTurnosGenerados() {
		
		return turnosGenerados.size();
		
	}
	
	public void resetearTicketera() {
		
		this.turnosGenerados.clear();
		this.contadorTurnosAtencion = 0;
		this.contadorTurnosReclamos = 0;
		this.contadorTurnosVentas = 0;
		this.contadorTurnosPreferencial = 0;
		
	}

}
