
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import java.awt.Color;

public class SewaMobil {

	public JFrame sewamobil;
	private JTextField noktp;
	private JTextField nama;
	private JTextField alamat;
	private JTextField nohp;
	int hargam;
	
	ArrayList<Mobil> mobilist = new ArrayList<Mobil>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SewaMobil window = new SewaMobil();
					window.sewamobil.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SewaMobil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		sewamobil = new JFrame();
		sewamobil.getContentPane().setBackground(Color.GRAY);
		sewamobil.setBounds(100, 100, 808, 355);
		sewamobil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sewamobil.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 380, 294);
		sewamobil.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("No KTP");
		lblNewLabel.setBounds(10, 64, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblNama = new JLabel("Nama");
		lblNama.setBounds(10, 95, 46, 14);
		panel.add(lblNama);

		JLabel lblAlamat = new JLabel("Alamat");
		lblAlamat.setBounds(10, 120, 46, 14);
		panel.add(lblAlamat);

		JLabel lblNoHp = new JLabel("No HP");
		lblNoHp.setBounds(10, 157, 46, 14);
		panel.add(lblNoHp);

		JLabel lblJenisMobil = new JLabel("Jenis Mobil");
		lblJenisMobil.setBounds(10, 192, 85, 14);
		panel.add(lblJenisMobil);

		noktp = 		new JTextField();
		noktp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char id = e.getKeyChar();
				if (!(Character.isDigit(id))) {
					e.consume();
				}
			}
		});
		noktp.setBounds(91, 61, 271, 20);
		panel.add(noktp);
		noktp.setColumns(10);

		nama = new JTextField();
		nama.setColumns(10);
		nama.setBounds(91, 92, 271, 20);
		panel.add(nama);

		alamat = new JTextField();
		alamat.setColumns(10);
		alamat.setBounds(91, 123, 271, 20);
		panel.add(alamat);

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
		nohp.setBounds(91, 154, 271, 20);
		panel.add(nohp);

		JComboBox jemobil = new JComboBox();
		jemobil.setModel(
				new DefaultComboBoxModel(new String[] { "PILIH MOBIL", "Ayla", "Avanza", "Pick Up", "Kijang" }));
		jemobil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jemobil.getSelectedItem().toString() == "Ayla") {
					hargam = 100000;
				}
				if (jemobil.getSelectedItem().toString() == "Avanza") {
					hargam = 150000;
				}
				if (jemobil.getSelectedItem().toString() == "Pick Up") {
					hargam = 90000;
				}
				if (jemobil.getSelectedItem().toString() == "Kijang") {
					hargam = 110000;
				}
			}
		});
		jemobil.setBounds(91, 188, 138, 22);
		panel.add(jemobil);

		JLabel lblNewLabel_1 = new JLabel("SEWA MOBIL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(119, 11, 187, 39);
		panel.add(lblNewLabel_1);

		JSpinner lama = new JSpinner();
		lama.setModel(new SpinnerNumberModel(0, 0, 30, 1));
		lama.addMouseListener(new MouseAdapter() {
		});
		lama.setBounds(91, 232, 63, 20);
		panel.add(lama);

		JLabel lblLamaPinjam = new JLabel("Lama Pinjam");
		lblLamaPinjam.setBounds(10, 235, 85, 14);
		panel.add(lblLamaPinjam);

		JLabel lblHari = new JLabel("Hari");
		lblHari.setBounds(161, 235, 46, 14);
		panel.add(lblHari);
		
		JButton kembali = new JButton("Kembali");
		kembali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sewamobil.setVisible(false);
			}
		});
		kembali.setBounds(10, 13, 89, 30);
		panel.add(kembali);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 11, 382, 248);
		sewamobil.getContentPane().add(scrollPane);

		JTextArea out = new JTextArea();
		out.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				out.setEditable(false);
			}
		});
		out.setFont(new Font("Monospaced", Font.PLAIN, 17));
		scrollPane.setViewportView(out);

		JButton sewa = new JButton("Sewa");
		sewa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nk = noktp.getText();
				String nm = nama.getText();
				String am = alamat.getText();
				String nh = nohp.getText();
				String jm = jemobil.getSelectedItem().toString();
				String lm = lama.getValue().toString();
				int hg = hargam * lama.getValue().hashCode();
				String hargatotal = String.valueOf(hg);

				Mobil mo = (new Mobil(nk, nm, am, nh, jm, lm, hargatotal));
				mobilist.add(mo);
				String isi = "";
				for (int i = 0; i < mobilist.size(); i++) {
					isi = "\n===================================" + "\n Nomor KTP	: " + mobilist.get(i).noktp
							+ "\n Nama		: " + mobilist.get(i).nama + "\n Alamat		: " + mobilist.get(i).alamat
							+ "\n No HP		: " + mobilist.get(i).nohp + "\n jenis Mobil\t: "
							+ mobilist.get(i).jenismobil + "\n Lama Sewa\t: " + mobilist.get(i).lamasewa
							+ "\n Harga		: Rp." + mobilist.get(i).harga + "\n===================================";
				}
				out.append(isi);
			}
		});
		sewa.setBounds(401, 270, 89, 35);
		sewamobil.getContentPane().add(sewa);

		JButton hapus = new JButton("Hapus");
		hapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				out.setText(null);
			}
		});
		hapus.setBounds(693, 270, 89, 35);
		sewamobil.getContentPane().add(hapus);
		
		JButton refresh = new JButton("Refresh");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noktp.setText("");
				nama.setText("");
				alamat.setText("");
				nohp.setText("");
				jemobil.setSelectedItem("PILIH MOBIL");
				lama.setValue(0);
			}
		});
		refresh.setBounds(549, 270, 89, 35);
		sewamobil.getContentPane().add(refresh);
	}
}
