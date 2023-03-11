package ar.edu.unlam.gonzacostaweb.ticketera;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class TicketeraTest {
	
	@Test
	public void queAlCrearUnaTicketeraSuIdSeaElEstablecido() {
		
		// Preparación
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecución
		
		Integer VE = 1;
		Integer VO = ticketera1.getId();
		
		// Comprobación
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queUnaTicketeraPuedaGenerarUnTurnoAtencion() {
		
		// Preparación
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecución
		
		TurnoAtencion turnoAtencion1 = ticketera1.generarTurnoAtencion();
		
		// Comprobación
		
		assertTrue(turnoAtencion1 instanceof TurnoAtencion);
		
	}
	
	@Test
	public void queElPrimerTurnoAtencionGeneradoSeaNumero1() {
		
		// Preparación
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecución
				
		TurnoAtencion turnoAtencion1 = ticketera1.generarTurnoAtencion();
		
		// Comprobación
		
		Integer VE = 1;
		Integer VO = turnoAtencion1.getNumero();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queUnaTicketeraPuedaGenerarUnTurnoReclamos() {
		
		// Preparación
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecución
		
		TurnoReclamos turnoReclamos1 = ticketera1.generarTurnoReclamos();
		
		// Comprobación
		
		assertTrue(turnoReclamos1 instanceof TurnoReclamos);
		
	}
	
	@Test
	public void queElPrimerTurnoReclamosGeneradoSeaNumero1() {
		
		// Preparación
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecución
				
		TurnoReclamos turnoReclamos1 = ticketera1.generarTurnoReclamos();
		
		// Comprobación
		
		Integer VE = 1;		
		Integer VO = turnoReclamos1.getNumero();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queUnaTicketeraPuedaGenerarUnTurnoVentas() {
		
		// Preparación
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecución
		
		TurnoVentas turnoVentas1 = ticketera1.generarTurnoVentas();
		
		// Comprobación
		
		assertTrue(turnoVentas1 instanceof TurnoVentas);
		
	}
	
	@Test
	public void queElPrimerTurnoVentasGeneradoSeaNumero1() {
		
		// Preparación
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecución
				
		TurnoVentas turnoVentas1= ticketera1.generarTurnoVentas();
	
		// Comprobación
		
		Integer VE = 1;		
		Integer VO = turnoVentas1.getNumero();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queUnaTicketeraPuedaGenerarUnTurnoPreferencial() {
		
		// Preparación
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecución
		
		TurnoPreferencial turnoPreferencial1 = ticketera1.generarTurnoPreferencial();
		
		// Comprobación
		
		assertTrue(turnoPreferencial1 instanceof TurnoPreferencial);
		
	}
	
	@Test
	public void queElPrimerTurnoPreferencialGeneradoSeaNumero1() {
		
		// Preparación
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecución
				
		TurnoPreferencial turnoPreferencial1= ticketera1.generarTurnoPreferencial();
	
		// Comprobación
		
		Integer VE = 1;		
		Integer VO = turnoPreferencial1.getNumero();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queLosTurnosGeneradosPorUnaTicketeraSeGuardenEnTurnosGenerados() {
		
		// Preparación
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecución
				
	    ticketera1.generarTurnoAtencion();
	    ticketera1.generarTurnoVentas();
	    ticketera1.generarTurnoReclamos();
	    ticketera1.generarTurnoPreferencial();
	    ticketera1.generarTurnoAtencion();
	
		// Comprobación
		
		Integer VE = 5;		
		Integer VO = ticketera1.obtenerCantidadTurnosGenerados();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queSePuedaResetearLaTicketera() {
		
		// Preparación
		
	    Ticketera ticketera1 = new Ticketera(1);
	    
	    ticketera1.generarTurnoAtencion();
	    ticketera1.generarTurnoAtencion();
	    ticketera1.generarTurnoVentas();
	    ticketera1.generarTurnoVentas();
	    ticketera1.generarTurnoReclamos();
	    ticketera1.generarTurnoReclamos();
	    ticketera1.generarTurnoPreferencial();
	    ticketera1.generarTurnoPreferencial();
	    ticketera1.generarTurnoAtencion();
	    ticketera1.generarTurnoAtencion();
	    			
		// Ejecución
				
	    ticketera1.resetearTicketera();
	
		// Comprobación
		
		Integer VE = 0;		
		Integer VO = ticketera1.obtenerCantidadTurnosGenerados();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queElPrimerTicketGeneradoDeCadaTipoLuegoDeResetearLaTicketeraSeanNumero1() {
		
		// Preparación
		
	    Ticketera ticketera1 = new Ticketera(1);
	    
	    ticketera1.generarTurnoAtencion();
	    ticketera1.generarTurnoAtencion();
	    ticketera1.generarTurnoVentas();
	    ticketera1.generarTurnoVentas();
	    ticketera1.generarTurnoReclamos();
	    ticketera1.generarTurnoReclamos();
	    ticketera1.generarTurnoPreferencial();
	    ticketera1.generarTurnoPreferencial();
	    ticketera1.generarTurnoAtencion();
	    ticketera1.generarTurnoAtencion();
	
	    ticketera1.resetearTicketera();
	    			
		// Ejecución
				
	    TurnoAtencion turnoAtencion1 = ticketera1.generarTurnoAtencion();
	    TurnoVentas turnoVentas1 = ticketera1.generarTurnoVentas();
	    TurnoReclamos turnoReclamos1 = ticketera1.generarTurnoReclamos();
	    TurnoPreferencial turnoPreferencial1 = ticketera1.generarTurnoPreferencial();
	
		// Comprobación 1
		
		Integer VE = 1;		
		Integer VO = turnoAtencion1.getNumero();
		
		assertEquals(VE, VO);
		
		// Comprobación 2
		
		Integer VE2 = 1;		
		Integer VO2 = turnoVentas1.getNumero();
		
		assertEquals(VE2, VO2);
		
		// Comprobación 3
		
		Integer VE3 = 1;		
		Integer VO3 = turnoReclamos1.getNumero();
		
		assertEquals(VE3, VO3);
		
		// Comprobación 4
		
		Integer VE4 = 1;		
		Integer VO4 = turnoPreferencial1.getNumero();
		
		assertEquals(VE4, VO4);
		
	}
		
}
