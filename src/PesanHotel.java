
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class PesanHotel {

	public JFrame hotel;
	private JTextField nama;
	private JTextField nohp;
	int hargakelas;
	
	ArrayList<Hotel> hotelist = new ArrayList<Hotel>();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesanHotel window = new PesanHotel();
					window.hotel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PesanHotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		hotel = new JFrame();
		hotel.getContentPane().setBackground(Color.GRAY);
		hotel.setBounds(100, 100, 808, 355);
		hotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hotel.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 366, 275);
		hotel.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nama");
		lblNewLabel.setBounds(10, 63, 70, 14);
		panel.add(lblNewLabel);

		JLabel lblTanggal = new JLabel("Tanggal");
		lblTanggal.setBounds(10, 101, 70, 14);
		panel.add(lblTanggal);

		JLabel lblNoHp = new JLabel("No HP");
		lblNoHp.setBounds(10, 134, 70, 14);
		panel.add(lblNoHp);

		JLabel lblKelasKamar = new JLabel("Kelas Kamar");
		lblKelasKamar.setBounds(10, 170, 70, 14);
		panel.add(lblKelasKamar);

		JLabel lblLamaMenginap = new JLabel("Lama Menginap");
		lblLamaMenginap.setBounds(10, 206, 89, 14);
		panel.add(lblLamaMenginap);

		JLabel lblJumlahKamar = new JLabel("Jumlah Kamar");
		lblJumlahKamar.setBounds(10, 240, 89, 14);
		panel.add(lblJumlahKamar);

		nama = new JTextField();
		nama.setBounds(101, 60, 255, 20);
		panel.add(nama);
		nama.setColumns(10);

		JComboBox tgl1 = new JComboBox();
		tgl1.setModel(new DefaultComboBoxModel(new String[] { "TGL", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
				"28", "29", "30", "31" }));
		tgl1.setBounds(101, 94, 67, 21);
		panel.add(tgl1);

		JComboBox bln1 = new JComboBox();
		bln1.setModel(new DefaultComboBoxModel(new String[] { "BULAN", "Januari", "Februari", "Maret", "April", "Mei",
				"Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
		bln1.setBounds(178, 94, 67, 21);
		panel.add(bln1);

		JComboBox thn1 = new JComboBox();
		thn1.setModel(new DefaultComboBoxModel(new String[] { "TAHUN", "2021", "2022", "2023", "2024", "2025" }));
		thn1.setBounds(255, 94, 64, 21);
		panel.add(thn1);

		nohp = new JTextField();
		nohp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
					char id = e.getKeyChar();
					if (!(Character.isDigit(id))) {
						e.consume();
					}
			}
		});
		nohp.setColumns(10);
		nohp.setBounds(101, 131, 255, 20);
		panel.add(nohp);

		JRadioButton deluxe = new JRadioButton("Deluxe");
		deluxe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (deluxe.isSelected()) {
					hargakelas = 150000;
			}}
		});
		buttonGroup.add(deluxe);
		deluxe.setBounds(100, 163, 85, 21);
		panel.add(deluxe);

		JRadioButton royal = new JRadioButton("Royal");
		royal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (royal.isSelected()) {
					hargakelas = 200000;
				}
			}
		});
		buttonGroup.add(royal);
		royal.setBounds(185, 163, 70, 21);
		panel.add(royal);

		JRadioButton suite = new JRadioButton("Suite");
		suite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (suite.isSelected()) {
					hargakelas = 100000;
				}
			}
		});
		buttonGroup.add(suite);
		suite.setBounds(266, 163, 90, 21);
		panel.add(suite);

		JSpinner lama = new JSpinner();
		lama.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		lama.setBounds(101, 203, 67, 20);
		panel.add(lama);

		JLabel lblHari = new JLabel("Hari");
		lblHari.setBounds(177, 206, 33, 14);
		panel.add(lblHari);

		JSpinner kamar = new JSpinner();
		kamar.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		kamar.setBounds(101, 237, 67, 20);
		panel.add(kamar);

		JLabel lblPemesananKamarHotel = new JLabel("Pemesanan Kamar Hotel");
		lblPemesananKamarHotel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPemesananKamarHotel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPemesananKamarHotel.setBounds(101, 11, 218, 45);
		panel.add(lblPemesananKamarHotel);
		
		JButton kembali = new JButton("Kembali");
		kembali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hotel.setVisible(false);
			}
		});
		kembali.setBounds(10, 11, 89, 30);
		panel.add(kembali);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(386, 11, 396, 248);
		hotel.getContentPane().add(scrollPane);

		JTextArea out = new JTextArea();
		out.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				out.setEditable(false);
			}
		});
		out.setFont(new Font("Monospaced", Font.PLAIN, 14));
		scrollPane.setViewportView(out);

		JButton pesan = new JButton("Pesan");
		pesan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nm = nama.getText();
				String tgl = tgl1.getSelectedItem().toString() + " - " + bln1.getSelectedItem().toString() + " - "
						+ thn1.getSelectedItem().toString();
				String np = nohp.getText();
				
				String kelas = "";
				if (deluxe.isSelected()) {
					kelas = deluxe.getText();
//					hargakelas = 150000;
				}
				if (royal.isSelected()) {
					kelas = royal.getText();
//					hargakelas = 200000;
				}
				if (suite.isSelected()) {
					kelas = suite.getText();
//					hargakelas = 100000;
				}
				String lamah = lama.getValue().toString();
				String kamarh = kamar.getValue().toString();

				int hargat = hargakelas * lama.getValue().hashCode() * kamar.getValue().hashCode();
				String hargatotal = String.valueOf(hargat);

				Hotel hot = (new Hotel(nm, tgl, np, kelas, lamah, kamarh, hargatotal));
				hotelist.add(hot);
				
				String isi = "";
				for (int i = 0; i < hotelist.size(); i++) {
					isi = "\n============================================"+"\n Nama 		: " + hotelist.get(i).namapesan + "\n Tgl CheckIn	: "
							+ hotelist.get(i).tglcheck + "\n No HP		: " + hotelist.get(i).nohp + "\n Kelas		: "
							+ hotelist.get(i).kelaskamar + "\n Lama Menginap	: " + hotelist.get(i).nginap
							+ "\n Jumlah Kamar	: " + hotelist.get(i).jumkamar + "\n Harga		: "
							+ hotelist.get(i).harga+"\n============================================";
				}
				out.append(isi);
			}
		});
		pesan.setBounds(386, 270, 89, 35);
		hotel.getContentPane().add(pesan);

		JButton hapus = new JButton("Hapus");
		hapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				out.setText(null);
			}
		});
		hapus.setBounds(693, 270, 89, 35);
		hotel.getContentPane().add(hapus);
		
		JButton refresh = new JButton("Refresh");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nama.setText("");
				tgl1.setSelectedItem("TGL");
				bln1.setSelectedItem("BULAN");
				thn1.setSelectedItem("TAHUN");
				nohp.setText("");
				lama.setValue(0);
				kamar.setValue(0);

			}
		});
		refresh.setBounds(537, 270, 89, 35);
		hotel.getContentPane().add(refresh);
	}
}
