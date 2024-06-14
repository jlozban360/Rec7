import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2ImprimirPagina extends JFrame {
    private int pagina;
    private JButton anteriorBoton;
    private JButton siguienteBoton;

    P2ImprimirPagina() throws HeadlessException {
        pagina = 1;

        //Ventana
        this.setTitle( "Página " + pagina );
        this.setSize( 300, 150 );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setLayout( new BorderLayout( ) );

        //JMenubar
        JMenuBar menuBar = new JMenuBar( );
        JMenu menu = new JMenu( "Operaciones" );

        JMenuItem itemReiniciar = new JMenuItem( "Reiniciar" );
        itemReiniciar.addActionListener( e -> {
            pagina = 1;
            this.setTitle( "Página" + pagina );
        } );

        JMenuItem itemSalir = new JMenuItem( "Salir" );
        itemSalir.addActionListener( e -> {
           System.exit( 0 );
        });

        menu.add( itemReiniciar );
        menu.add( itemSalir );
        menuBar.add( menu );

        this.setJMenuBar( menuBar );

        //Panel
        JPanel panel = new JPanel( );
        panel.setLayout( new FlowLayout( ) );

        anteriorBoton = new JButton( "< Anterior" );
        siguienteBoton = new JButton( "Siguiente >" );

        anteriorBoton.addActionListener( new P2Listener( this ) );
        siguienteBoton.addActionListener( new P2Listener( this ) );

        panel.add( anteriorBoton );
        panel.add( siguienteBoton );

        this.add( panel, BorderLayout.NORTH );

        //Visible
        this.setVisible( true );
    }

    public int getPagina( ) {
        return pagina;
    }

    public void setPagina( int pagina ) {
        this.pagina = pagina;
    }

    public JButton getAnteriorBoton( ) {
        return anteriorBoton;
    }

    public JButton getSiguienteBoton( ) {
        return siguienteBoton;
    }
}
