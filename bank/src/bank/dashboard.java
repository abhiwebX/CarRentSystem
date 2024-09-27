package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard frame = new dashboard();
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
	public dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 21, 917, 435);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(10, 11, 114, 413);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Customer = new JLabel("Rent Car");
		Customer.setHorizontalAlignment(SwingConstants.CENTER);
		Customer.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		Customer.setBounds(0, 177, 114, 41);
		panel_1.add(Customer);
		
		JLabel Customer_1 = new JLabel("Customer");
		Customer_1.setHorizontalAlignment(SwingConstants.CENTER);
		Customer_1.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		Customer_1.setBounds(0, 116, 114, 41);
		panel_1.add(Customer_1);
		
		JLabel lblReturnCar = new JLabel("Return Car");
		lblReturnCar.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturnCar.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		lblReturnCar.setBounds(0, 233, 114, 41);
		panel_1.add(lblReturnCar);
		
		JLabel Jlog = new JLabel("Logout");
		Jlog.setHorizontalAlignment(SwingConstants.CENTER);
		Jlog.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		Jlog.setBounds(0, 361, 114, 41);
		panel_1.add(Jlog);
		
		JLabel lblNewLabel_1 = new JLabel("MakeEassy");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 40, 104, 14);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(134, 11, 773, 413);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setToolTipText("ljk\t");
		table.setBounds(10, 224, 753, 178);
		panel_2.add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Cars List");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(10, 199, 71, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel RegNum = new JLabel("Registration No");
		RegNum.setBounds(31, 40, 87, 14);
		panel_2.add(RegNum);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBounds(31, 74, 87, 14);
		panel_2.add(lblBrand);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(31, 113, 87, 14);
		panel_2.add(lblModel);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(341, 40, 87, 14);
		panel_2.add(lblStatus);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setBounds(351, 87, 87, 14);
		panel_2.add(lblPrice);
		
		textField = new JTextField();
		textField.setBounds(128, 36, 188, 23);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 70, 188, 23);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 104, 188, 23);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(448, 84, 164, 20);
		panel_2.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(464, 38, 124, 22);
		panel_2.add(comboBox);
		
		JButton savebtn = new JButton("Save");
		savebtn.setBounds(105, 158, 89, 23);
		panel_2.add(savebtn);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(227, 158, 89, 23);
		panel_2.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(452, 158, 89, 23);
		panel_2.add(btnReset);
		
		JButton delebtn = new JButton("Delete");
		delebtn.setBounds(339, 158, 89, 23);
		panel_2.add(delebtn);
		
		JLabel lblNewLabel = new JLabel("DashBoard");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(370, -4, 285, 28);
		contentPane.add(lblNewLabel);
	}
}
