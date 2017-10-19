package musica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class musica extends JFrame {

	private JPanel contentPane;
	private JTextField txtgenero;
	private JTextField txtnombre;
	private JTextField txtalbum;
	private JTextField txtartista;
	private JTextField txtid;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					musica frame = new musica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public musica() {
		listadoble ld=new listadoble();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el G\u00E9nero de la Cancion");
		lblNewLabel.setBounds(267, 29, 174, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnInsertarNodoAdelante = new JButton("Insertar Nodo Adelante");
		btnInsertarNodoAdelante.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			 
			 
				nododoble nuevo=new nododoble();
				nuevo.setId_cancion(Integer.parseInt(txtid.getText()));
				nuevo.setNombrecancion(txtnombre.getText());
				nuevo.setAlbum(txtalbum.getText());
				nuevo.setArtista(txtartista.getText());
				nuevo.setGenero(txtgenero.getText());
				
				ld.insertarnodoadelante(nuevo);
				JOptionPane.showMessageDialog(null, "valores insertados adelante ");
				
			}
		});
		btnInsertarNodoAdelante.setBounds(10, 53, 158, 23);
		contentPane.add(btnInsertarNodoAdelante);
		
		JButton btnNodoAtras = new JButton("Insertar Nodo Atr\u00E1s");
		btnNodoAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNodoAtras.setBounds(10, 108, 158, 23);
		contentPane.add(btnNodoAtras);
		
		JButton btnEliminarPrimerNodo = new JButton("Eliminar Primer Nodo");
		btnEliminarPrimerNodo.setBounds(10, 165, 158, 23);
		contentPane.add(btnEliminarPrimerNodo);
		
		JButton btnEliminarUltimoNodo = new JButton("Eliminar \u00DAltimo Nodo");
		btnEliminarUltimoNodo.setBounds(10, 224, 158, 23);
		contentPane.add(btnEliminarUltimoNodo);
		
		JButton btnRecorridoHaciaAdelante = new JButton("Recorrido hacia Adelante");
		btnRecorridoHaciaAdelante.setBounds(10, 282, 158, 23);
		contentPane.add(btnRecorridoHaciaAdelante);
		
		JButton btnNewButton = new JButton("Recorrido Hacia Atr\u00E1s");
		btnNewButton.setBounds(10, 340, 158, 23);
		contentPane.add(btnNewButton);
		
		txtgenero = new JTextField();
		txtgenero.setBounds(267, 54, 174, 20);
		contentPane.add(txtgenero);
		txtgenero.setColumns(10);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(267, 109, 174, 22);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		txtalbum = new JTextField();
		txtalbum.setBounds(267, 166, 174, 22);
		contentPane.add(txtalbum);
		txtalbum.setColumns(10);
		
		txtartista = new JTextField();
		txtartista.setBounds(267, 225, 174, 23);
		contentPane.add(txtartista);
		txtartista.setColumns(10);
		
		txtid = new JTextField();
		txtid.setBounds(267, 283, 174, 22);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Ingrese el nombre de la canci\u00F3n");
		lblNewLabel_1.setBounds(267, 85, 174, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Ingrese el \u00E1lbum");
		lblNewLabel_2.setBounds(267, 141, 174, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Ingrese el Artista");
		lblNewLabel_3.setBounds(267, 199, 174, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Ingrese el ID");
		lblNewLabel_4.setBounds(267, 259, 174, 14);
		contentPane.add(lblNewLabel_4);
	}
}
