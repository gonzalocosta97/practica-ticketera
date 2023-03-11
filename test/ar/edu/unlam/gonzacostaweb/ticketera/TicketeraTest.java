package ar.edu.unlam.gonzacostaweb.ticketera;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class TicketeraTest {
	
	@Test
	public void queAlCrearUnaTicketeraSuIdSeaElEstablecido() {
		
		// Preparaci�n
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecuci�n
		
		Integer VE = 1;
		Integer VO = ticketera1.getId();
		
		// Comprobaci�n
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queUnaTicketeraPuedaGenerarUnTurnoAtencion() {
		
		// Preparaci�n
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecuci�n
		
		TurnoAtencion turnoAtencion1 = ticketera1.generarTurnoAtencion();
		
		// Comprobaci�n
		
		assertTrue(turnoAtencion1 instanceof TurnoAtencion);
		
	}
	
	@Test
	public void queElPrimerTurnoAtencionGeneradoSeaNumero1() {
		
		// Preparaci�n
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecuci�n
				
		TurnoAtencion turnoAtencion1 = ticketera1.generarTurnoAtencion();
		
		// Comprobaci�n
		
		Integer VE = 1;
		Integer VO = turnoAtencion1.getNumero();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queUnaTicketeraPuedaGenerarUnTurnoReclamos() {
		
		// Preparaci�n
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecuci�n
		
		TurnoReclamos turnoReclamos1 = ticketera1.generarTurnoReclamos();
		
		// Comprobaci�n
		
		assertTrue(turnoReclamos1 instanceof TurnoReclamos);
		
	}
	
	@Test
	public void queElPrimerTurnoReclamosGeneradoSeaNumero1() {
		
		// Preparaci�n
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecuci�n
				
		TurnoReclamos turnoReclamos1 = ticketera1.generarTurnoReclamos();
		
		// Comprobaci�n
		
		Integer VE = 1;		
		Integer VO = turnoReclamos1.getNumero();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queUnaTicketeraPuedaGenerarUnTurnoVentas() {
		
		// Preparaci�n
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecuci�n
		
		TurnoVentas turnoVentas1 = ticketera1.generarTurnoVentas();
		
		// Comprobaci�n
		
		assertTrue(turnoVentas1 instanceof TurnoVentas);
		
	}
	
	@Test
	public void queElPrimerTurnoVentasGeneradoSeaNumero1() {
		
		// Preparaci�n
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecuci�n
				
		TurnoVentas turnoVentas1= ticketera1.generarTurnoVentas();
	
		// Comprobaci�n
		
		Integer VE = 1;		
		Integer VO = turnoVentas1.getNumero();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queUnaTicketeraPuedaGenerarUnTurnoPreferencial() {
		
		// Preparaci�n
		
		Ticketera ticketera1 = new Ticketera(1);
		
		// Ejecuci�n
		
		TurnoPreferencial turnoPreferencial1 = ticketera1.generarTurnoPreferencial();
		
		// Comprobaci�n
		
		assertTrue(turnoPreferencial1 instanceof TurnoPreferencial);
		
	}
	
	@Test
	public void queElPrimerTurnoPreferencialGeneradoSeaNumero1() {
		
		// Preparaci�n
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecuci�n
				
		TurnoPreferencial turnoPreferencial1= ticketera1.generarTurnoPreferencial();
	
		// Comprobaci�n
		
		Integer VE = 1;		
		Integer VO = turnoPreferencial1.getNumero();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queLosTurnosGeneradosPorUnaTicketeraSeGuardenEnTurnosGenerados() {
		
		// Preparaci�n
		
	    Ticketera ticketera1 = new Ticketera(1);
				
		// Ejecuci�n
				
	    ticketera1.generarTurnoAtencion();
	    ticketera1.generarTurnoVentas();
	    ticketera1.generarTurnoReclamos();
	    ticketera1.generarTurnoPreferencial();
	    ticketera1.generarTurnoAtencion();
	
		// Comprobaci�n
		
		Integer VE = 5;		
		Integer VO = ticketera1.obtenerCantidadTurnosGenerados();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queSePuedaResetearLaTicketera() {
		
		// Preparaci�n
		
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
	    			
		// Ejecuci�n
				
	    ticketera1.resetearTicketera();
	
		// Comprobaci�n
		
		Integer VE = 0;		
		Integer VO = ticketera1.obtenerCantidadTurnosGenerados();
		
		assertEquals(VE, VO);
		
	}
	
	@Test
	public void queElPrimerTicketGeneradoDeCadaTipoLuegoDeResetearLaTicketeraSeanNumero1() {
		
		// Preparaci�n
		
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
	    			
		// Ejecuci�n
				
	    TurnoAtencion turnoAtencion1 = ticketera1.generarTurnoAtencion();
	    TurnoVentas turnoVentas1 = ticketera1.generarTurnoVentas();
	    TurnoReclamos turnoReclamos1 = ticketera1.generarTurnoReclamos();
	    TurnoPreferencial turnoPreferencial1 = ticketera1.generarTurnoPreferencial();
	
		// Comprobaci�n 1
		
		Integer VE = 1;		
		Integer VO = turnoAtencion1.getNumero();
		
		assertEquals(VE, VO);
		
		// Comprobaci�n 2
		
		Integer VE2 = 1;		
		Integer VO2 = turnoVentas1.getNumero();
		
		assertEquals(VE2, VO2);
		
		// Comprobaci�n 3
		
		Integer VE3 = 1;		
		Integer VO3 = turnoReclamos1.getNumero();
		
		assertEquals(VE3, VO3);
		
		// Comprobaci�n 4
		
		Integer VE4 = 1;		
		Integer VO4 = turnoPreferencial1.getNumero();
		
		assertEquals(VE4, VO4);
		
	}
		
}
