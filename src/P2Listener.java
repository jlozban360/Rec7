import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2Listener implements ActionListener {
    P2ImprimirPagina ventana;

    public P2Listener( P2ImprimirPagina ventana ) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = ( JButton ) e.getSource( );

        if( button.getText( ).equals( "< Anterior" ) ) {
            if( ventana.getPagina( ) > 1 )
                ventana.setPagina( ventana.getPagina( ) - 1 );
        }
        else if( button.getText( ).equals( "Siguiente >" ) ) {
            if( ventana.getPagina( ) < 20 )
                ventana.setPagina( ventana.getPagina( ) + 1 );
        }

        if( ventana.getPagina( ) == 1 ) {
            ventana.getAnteriorBoton( ).setEnabled( false );
        }
        else if( ventana.getPagina( ) > 1 && ventana.getPagina( ) < 20 ) {
            ventana.getAnteriorBoton( ).setEnabled( true );
            ventana.getSiguienteBoton( ).setEnabled( true );
        }
        else {
            ventana.getSiguienteBoton( ).setEnabled( false );
        }

        ventana.setTitle( "Página " + ventana.getPagina( ) );
    }
}
