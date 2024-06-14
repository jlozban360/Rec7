import javax.swing.*;
import java.awt.*;

public class P1EtiquetasColoridas extends JFrame {
    public P1EtiquetasColoridas( ) throws HeadlessException {
        //Ventana
        this.setTitle( "Etiquetas coloridas" );
        this.setSize( 800, 600 );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setLayout( new BorderLayout( ) );
        this.setLocationRelativeTo( null );

        //Label
        JLabel label = new JLabel( "Selecciona un color", JLabel.CENTER );
        this.add( label, BorderLayout.NORTH );

        //Panel
        JPanel panel = new JPanel( );
        panel.setLayout( new GridLayout( 3, 1 ) );

        ButtonGroup group = new ButtonGroup( );

        JRadioButton checkRojo = new JRadioButton( "Rojo" );
        JRadioButton checkVerde = new JRadioButton( "Verde" );
        JRadioButton checkAzul = new JRadioButton("Azul" );

        checkRojo.addActionListener( e -> {
            label.setText( "Seleccionado: Rojo" );
            label.setForeground( Color.red );
        });

        checkVerde.addActionListener( e -> {
            label.setText( "Seleccionado: Verde" );
            label.setForeground( Color.green );
        });

        checkAzul.addActionListener( e -> {
            label.setText( "Seleccionado: Azul" );
            label.setForeground( Color.blue );
        });

        group.add( checkRojo );
        group.add( checkVerde);
        group.add( checkAzul );

        panel.add( checkRojo );
        panel.add( checkVerde );
        panel.add( checkAzul );

        this.add( panel, BorderLayout.CENTER );

        //Visible
        this.setVisible( true );
    }
}
