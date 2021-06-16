
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class TiketPesawat {

	public JFrame pesawat;
	private JTextField nama;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea output;
	public JRadioButton bi;
	public JRadioButton ek;
	
	int hargad;
	int hargak;
	int hargakk;
	
	ArrayList<Tiket> tklist = new ArrayList<Tiket>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TiketPesawat window = new TiketPesawat();
					window.pesawat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TiketPesawat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pesawat = new JFrame();
		pesawat.getContentPane().setBackground(Color.GRAY);
		pesawat.setTitle("Tiket Pesawat");
		pesawat.setBounds(100, 100, 808, 355);
		pesawat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pesawat.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 52, 395, 253);
		pesawat.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nama");
		lblNewLabel.setBounds(21, 10, 96, 15);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));

		nama = new JTextField();
		nama.setBounds(116, 9, 256, 19);
		panel.add(nama);
		nama.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 35, 362, 64);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblTujuan = new JLabel("Tujuan");
		lblTujuan.setBounds(10, 10, 60, 13);
		panel_1.add(lblTujuan);
		lblTujuan.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblDari = new JLabel("Dari");
		lblDari.setBounds(105, 10, 60, 13);
		panel_1.add(lblDari);
		lblDari.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JComboBox cbd = new JComboBox();
		cbd.setModel(new DefaultComboBoxModel(new String[] {"", "Pontianak", "Jakarta", "Bandung", "Ketapang", "Samarinda"}));
		cbd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbd.getSelectedItem() == "Pontianak") {
					hargad = 100000;
				}
				if (cbd.getSelectedItem() == "Jakarta") {
					hargad = 120000;
				}
				if (cbd.getSelectedItem() == "Bandung") {
					hargad = 110000;
				}
				if (cbd.getSelectedItem() == "Ketapang") {
					hargad = 80000;
				}
				if (cbd.getSelectedItem() == "Samarinda") {
					hargad = 90000;
				}
			}
		});
		cbd.setBounds(150, 7, 85, 21);
		panel_1.add(cbd);

		JLabel lblKe = new JLabel("Ke");
		lblKe.setBounds(105, 41, 60, 13);
		panel_1.add(lblKe);
		lblKe.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JComboBox cbk = new JComboBox();
		cbk.setModel(new DefaultComboBoxModel(new String[] {"", "Semarang", "Denpasar", "Kendari", "Malang", "Palembang"}));
		cbk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbk.getSelectedItem() == "Semarang") {
					hargak = 5;
				}
				if (cbk.getSelectedItem() == "Denpasar") {
					hargak = 8;
				}
				if (cbk.getSelectedItem() == "Kendari") {
					hargak = 7;
				}
				if (cbk.getSelectedItem() == "Malang") {
					hargak = 5;
				}
				if (cbk.getSelectedItem() == "Palembang") {
					hargak = 6;
				}
			}
		});
		cbk.setBounds(150, 34, 85, 21);
		panel_1.add(cbk);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 109, 362, 70);
		panel.add(panel_2);

		JLabel lblTanggalBerangkat = new JLabel("Tanggal");
		lblTanggalBerangkat.setBounds(10, 10, 114, 15);
		panel_2.add(lblTanggalBerangkat);
		lblTanggalBerangkat.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JComboBox tgl = new JComboBox();
		tgl.setModel(new DefaultComboBoxModel(new String[] {"TGL", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		tgl.setBounds(134, 8, 67, 21);
		panel_2.add(tgl);

		JComboBox bln = new JComboBox();
		bln.setModel(new DefaultComboBoxModel(new String[] {"BULAN", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"}));
		bln.setBounds(211, 8, 67, 21);
		panel_2.add(bln);

		JComboBox thn = new JComboBox();
		thn.setModel(new DefaultComboBoxModel(new String[] {"TAHUN", "2021", "2022", "2023", "2024", "2025"}));
		thn.setBounds(288, 8, 64, 21);
		panel_2.add(thn);

		ek = new JRadioButton("Ekonomi");
		ek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ek.getText() == "Ekonomi") {
					hargakk = 1;
				}
			}
		});
		ek.setBounds(126, 42, 85, 21);
		panel_2.add(ek);
		buttonGroup.add(ek);

		bi = new JRadioButton("Bisnis");
		bi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bi.getText() == "Bisnis") {
					hargakk = 2;
				}
			}
		});
		bi.setBounds(211, 42, 90, 21);
		panel_2.add(bi);
		buttonGroup.add(bi);

		JLabel lblKelas = new JLabel("Kelas");
		lblKelas.setBounds(10, 45, 60, 13);
		panel_2.add(lblKelas);
		lblKelas.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton pesan = new JButton("Pesan");
		pesan.setBounds(10, 197, 81, 42);
		panel.add(pesan);
		pesan.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JButton refresh = new JButton("Refresh");
		refresh.setBounds(101, 197, 86, 42);
		panel.add(refresh);
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nama.setText(null);
				cbd.setSelectedItem(null);
				cbk.setSelectedItem(null);
				tgl.setSelectedItem(null);
				bln.setSelectedItem(null);
				thn.setSelectedItem(null);
			}
		});
		refresh.setFont(new Font("Tahoma", Font.PLAIN, 10));

		JButton hapus = new JButton("Hapus");
		hapus.setBounds(197, 197, 81, 42);
		panel.add(hapus);
		hapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(null);
				
			}
		});
		hapus.setFont(new Font("Tahoma", Font.PLAIN, 10));

		pesan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				String nma = nama.getText();
				String cbdari = cbd.getSelectedItem().toString();
				String cbke = cbk.getSelectedItem().toString();
				String tglbh = tgl.getSelectedItem().toString();
				String tglbb = bln.getSelectedItem().toString();
				String tglbt = thn.getSelectedItem().toString();
				String kelas = "";
				if (ek.isSelected()) {
					kelas = ek.getText();
				}
				if (bi.isSelected()) {
					kelas = bi.getText();
				}
				
				int hg = hargad * hargak * hargakk;
				String harga = String.valueOf(hg);

				Tiket inputan = (new Tiket(nma, cbdari, cbke, tglbh, tglbb, tglbt, kelas, harga));
				tklist.add(inputan);
				
				
				String isi = "";
				for (int i = 0; i < tklist.size(); i++) {
					isi = ("\n+--------------------------------------------------------------------------------------+"
							+ "\n- Nama : " + tklist.get(i).nama + "\n- Dari : " + tklist.get(i).cbdari + "\n- Ke : "
							+ tklist.get(i).cbkembali + "\n- Tanggal Pergi : " + tklist.get(i).tglh + " - "
							+ tklist.get(i).tglb + " - " + tklist.get(i).tglt + "\n- Tanggal Kembali : "
							+ "\n- Kelas : " + tklist.get(i).kelas + "\n- Harga Tiket : Rp." + tklist.get(i).harga);		
				}
				output.append(isi);
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(405, 52, 377, 253);
		pesawat.getContentPane().add(scrollPane);
		
				output = new JTextArea();
				scrollPane.setViewportView(output);
				output.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						output.setEditable(false);
					}
				});

		JLabel lblNewLabel_1 = new JLabel("  PESAN TIKET PESAWAT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(151, 9, 226, 30);
		pesawat.getContentPane().add(lblNewLabel_1);
		
		JButton kembali = new JButton("Kembali");
		kembali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesawat.setVisible(false);
			}
		});
		kembali.setBounds(10, 11, 89, 30);
		pesawat.getContentPane().add(kembali);
	}
}
