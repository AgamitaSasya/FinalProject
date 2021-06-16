
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Menu {

	private JFrame frame;
	TiketPesawat a = new TiketPesawat();
	SewaMobil b = new SewaMobil();
	PesanHotel c = new PesanHotel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton petiket = new JButton("Pemesanan Tiket");
		petiket.setFont(new Font("Tahoma", Font.BOLD, 13));
		petiket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.pesawat.setVisible(true);
			}
		});
		petiket.setBounds(313, 95, 153, 68);
		frame.getContentPane().add(petiket);
		
		JButton semobil = new JButton("Sewa Mobil");
		semobil.setFont(new Font("Tahoma", Font.BOLD, 13));
		semobil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.sewamobil.setVisible(true);
			}
		});
		semobil.setBounds(313, 210, 153, 68);
		frame.getContentPane().add(semobil);
		
		JButton pehotel = new JButton("Pesan Hotel");
		pehotel.setFont(new Font("Tahoma", Font.BOLD, 13));
		pehotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.hotel.setVisible(true);
			}
		});
		pehotel.setBounds(313, 331, 153, 68);
		frame.getContentPane().add(pehotel);
		
		JButton exit = new JButton("Exit");
		exit.setFont(new Font("Tahoma", Font.BOLD, 13));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(313, 446, 153, 68);
		frame.getContentPane().add(exit);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(176, 11, 426, 539);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("TRAV GO");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}

}

