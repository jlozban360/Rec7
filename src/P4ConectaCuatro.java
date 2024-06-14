import javax.swing.*;
import java.awt.*;

public class P4ConectaCuatro extends JFrame {
    //false = JUGADOR 1, true = JUGADOR 2
    private boolean turnoJugador = false;
    private int movimientosLeft;

    P4ConectaCuatro( ) throws HeadlessException {
        //Vars
        int FILAS = 6;
        int COLUMNAS = 6;
        movimientosLeft = 36;

        //Ventana
        this.setTitle( "P3 - Conecta 4" );
        this.setSize( 288, 340 );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setLayout( new BorderLayout( ) );
        this.setResizable( false );

        //Label
        JLabel label = new JLabel( "Turno del jugador " + ( turnoJugador ? "2" : "1" ), JLabel.CENTER );
        this.add( label, BorderLayout.NORTH );

        //Panel
        JPanel panel = new JPanel( );
        panel.setLayout( new GridLayout( FILAS, COLUMNAS ) );

        for( int i = 0; i < FILAS * COLUMNAS; i++ ) {
            JButton button = new JButton( );
            button.addActionListener( new P4Listener( this ) );
            panel.add( button );
        }

        this.add( panel, BorderLayout.CENTER );

        //Visible
        this.setVisible( true );
    }

    public boolean isTurnoJugador( ) {
        return turnoJugador;
    }

    public void setTurnoJugador( boolean turnoJugador ) {
        this.turnoJugador = turnoJugador;
    }

    public int getMovimientosLeft( ) {
        return movimientosLeft;
    }

    public void setMovimientosLeft( int movimientosLeft ) {
        this.movimientosLeft = movimientosLeft;
    }
}
