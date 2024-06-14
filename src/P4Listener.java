import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P4Listener implements ActionListener {
    P4ConectaCuatro ventana;

    public P4Listener( P4ConectaCuatro ventana ) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed( ActionEvent e ) {
        JButton boton = ( JButton ) e.getSource( );

        if( !ventana.isTurnoJugador( ) ) { //Jugador 1
            Icon iconAmarillo = new ImageIcon("amarillo.png" );
            boton.setIcon( iconAmarillo );
            ventana.setTurnoJugador( true );
        }
        else {
            Icon iconRojo = new ImageIcon("rojo.png" );
            boton.setIcon( iconRojo );
            ventana.setTurnoJugador( false );
        }

        if( ventana.getMovimientosLeft() > 0 )
            ventana.setMovimientosLeft( ventana.getMovimientosLeft( ) - 1 );
        else
            JOptionPane.showMessageDialog( ventana, "Empate" );
    }
}
