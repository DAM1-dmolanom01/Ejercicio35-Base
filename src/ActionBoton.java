import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que implementa el listener de los botones del Buscaminas.
 * De alguna manera tendrá que poder acceder a la ventana principal.
 * Se puede lograr pasando en el constructor la referencia a la ventana.
 * Recuerda que desde la ventana, se puede acceder a la variable de tipo ControlJuego
 * @author jesusredondogarcia
 **
 */
public class ActionBoton implements ActionListener{
VentanaPrincipal ventanaPrincipal;
int i;
int j;
	

	public ActionBoton() {
		//TODO
	}
	
	public ActionBoton(VentanaPrincipal ventanaPrincipal, int i, int j) {
		this.ventanaPrincipal = ventanaPrincipal;
		this.i = i;
		this.j = j;
	}

	/**
	 *Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (ventanaPrincipal.juego.abrirCasilla(i, j)) {
			ventanaPrincipal.mostrarNumMinasAlrededor(i, j);
			ventanaPrincipal.refrescarPantalla();
			ventanaPrincipal.actualizarPuntuacion();
			if (ventanaPrincipal.juego.esFinJuego()) {
				ventanaPrincipal.mostrarFinJuego(false);
			}
			
		}else {
			ventanaPrincipal.mostrarFinJuego(true);
		
		}
	}

}
