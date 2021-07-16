package escuela;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class personas extends JFrame {
	
	private void limpiarCajas() {
		textClave.setText(null);
		textNombre.setText(null);
		textDomicilio.setText(null);
		textTelefono.setText(null);
		textCorreo.setText(null);
		textFecha.setText(null);
		
		
	}
	
	//AÑADIMOS EL METODO DE CONEXION
	public static final String URL="jdbc:mysql://localhost:3306/escuela";
	public static final String username="rootAdm";
	public static final String password="root3579";
	
	PreparedStatement ps;
	ResultSet res;
	
	
	public static Connection getConection() {
	
		Connection con = null;

		try {
			// driver del conexión
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(URL, username, password);
			JOptionPane.showMessageDialog(null, "Conexión exitosa");

			// LA EXCEPCION ES PARA QUE MANDE EL ERROR QUE SE PUEDA GENERAR
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	

	private JPanel contentPane;
	private JTextField textClave;
	private JTextField textNombre;
	private JTextField textDomicilio;
	private JTextField textTelefono;
	private JTextField textCorreo;
	private JTextField textFecha;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personas frame = new personas();
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
	public personas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("clave:");
		lblNewLabel.setBounds(10, 30, 49, 14);
		contentPane.add(lblNewLabel);
		
		textClave = new JTextField();
		textClave.setBounds(69, 27, 96, 20);
		contentPane.add(textClave);
		textClave.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("nombre");
		lblNewLabel_1.setBounds(10, 71, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("domicilio");
		lblNewLabel_2.setBounds(10, 110, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("telefono");
		lblNewLabel_3.setBounds(10, 158, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("correo_electronico");
		lblNewLabel_4.setBounds(10, 212, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("fecha_nacimiento");
		lblNewLabel_5.setBounds(10, 269, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		textNombre = new JTextField();
		textNombre.setBounds(69, 68, 197, 17);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textDomicilio = new JTextField();
		textDomicilio.setBounds(69, 107, 197, 20);
		contentPane.add(textDomicilio);
		textDomicilio.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setText("");
		textTelefono.setBounds(69, 155, 197, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(69, 209, 197, 20);
		contentPane.add(textCorreo);
		textCorreo.setColumns(10);
		
		textFecha = new JTextField();
		textFecha.setBounds(69, 266, 197, 20);
		contentPane.add(textFecha);
		textFecha.setColumns(10);
		
		JComboBox cbxGenero = new JComboBox();
		cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"Selecciona", "Masculino", "Femenino"}));
		cbxGenero.setBounds(69, 310, 197, 22);
		contentPane.add(cbxGenero);
		
		JLabel lblNewLabel_6 = new JLabel("Genero");
		lblNewLabel_6.setBounds(10, 314, 49, 14);
		contentPane.add(lblNewLabel_6);
		
		//BOTON DE GUARDAR- CODIGO
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				
				try {
					con = getConection();
					ps= con.prepareStatement("INSERT INTO personas (clave, nombre, domicilio, telefono, correo_electronico, fecha_nacimiento, genero) VALUES(?, ?, ?, ?, ?, ?, ?)");
					ps.setString(1, textClave.getText());
					ps.setString(2, textNombre.getText());
					ps.setString(3, textDomicilio.getText());
					ps.setString(4, textTelefono.getText());
					ps.setString(5, textCorreo.getText());
					ps.setDate(6, Date.valueOf(textFecha.getText()));
					ps.setString(7, cbxGenero.getSelectedItem().toString());
					
					int res = ps.executeUpdate();
					if(res>0) {
						JOptionPane.showMessageDialog(null, "Persona guardada");
						limpiarCajas();
					}else {
						JOptionPane.showMessageDialog(null, "Error al guardar persona");
						limpiarCajas();
					}
					con.close();
				}catch(Exception eX) {
					System.out.println(eX);
					
				}
			
				
			}
		});
		btnGuardar.setBounds(10, 369, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnModifica = new JButton("Modifica");
		btnModifica.setBounds(125, 369, 89, 23);
		contentPane.add(btnModifica);
		
		JButton btnElimina = new JButton("Elimina");
		btnElimina.setBounds(247, 369, 89, 23);
		contentPane.add(btnElimina);
		
		JButton btnLimpia = new JButton("Limpia");
		btnLimpia.setBounds(364, 369, 89, 23);
		contentPane.add(btnLimpia);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(364, 26, 89, 23);
		contentPane.add(btnBuscar);
		
		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setBounds(170, 27, 96, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
	}
}
