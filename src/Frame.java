package knapsack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Panel;
import java.awt.Color;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNesnelerabcd;
	 private static final long serialVersionUID = 1L;
	//Kombinasyonlari tutan array
	combinations[] combineArray = new combinations[31];
	combinationClass deneme = new combinationClass();
	//int x = 0;
	int capacity;
	
	private JTextField txtNesnelerbcd;
	private JTextField txtNesnelerbcde;
	private JTextField txtNesnelercde_2;
	private JTextField txtNesnelercde_3;
	private JTextField txtNesnelercde_1;
	private JTextField txtNesnelercde;
	private JTextField txtNesnelerde;
	private JTextField txtNesnelerde_1;
	private JTextField txtNesnelerde_2;
	private JTextField txtNesnelerde_3;
	private JTextField txtNesnelerde_4;
	private JTextField txtNesnelerde_5;
	private JTextField txtNesnelerde_6;
	private JTextField txtNesnelerde_7;
	private JTextField txtN;
	private JTextField txtN_1;
	private JTextField txtNe;
	private JTextField txtNe_1;
	private JTextField txtNe_2;
	private JTextField txtNe_3;
	private JTextField txtNe_4;
	private JTextField txtNe_5;
	private JTextField txtNe_6;
	private JTextField txtNe_7;
	private JTextField txtNe_8;
	private JTextField txtNe_9;
	private JTextField txtNe_10;
	private JTextField txtNe_11;
	private JTextField txtNe_12;
	private JTextField txtNe_13;
	private JTextField txtN_2;
	private JTextField txtN_18;
	private JTextField txtN_19;
	private JTextField txtN_20;
	private JTextField txtN_21;
	private JTextField txtN_22;
	private JTextField txtN_23;
	private JTextField txtN_24;
	private JTextField txtN_16;
	private JTextField txtN_15;
	private JTextField txtN_13;
	private JTextField txtN_7;
	private JTextField txtN_6;
	private JTextField txtN_5;
	private JTextField txtN_4;
	private JTextField txtN_3;
	private JTextField txtN_32;
	private JTextField txtN_31;
	private JTextField txtN_30;
	private JTextField txtN_29;
	private JTextField txtN_28;
	private JTextField txtN_27;
	private JTextField txtN_26;
	private JTextField txtN_25;
	private JTextField txtN_17;
	private JTextField txtN_14;
	private JTextField txtNabcde;
	private JTextField txtN_12;
	private JTextField txtN_11;
	private JTextField txtN_10;
	private JTextField txtN_9;
	private JTextField txtN_8;
	private JTextField txtNesneler;
	private JTextField textField_31;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Frame() {
		setResizable(false);
		func();
		
		JLabel lblNewLabel_1_2 = new JLabel("select C");
		lblNewLabel_1_2.setBounds(220, 324, 59, 28);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblAyEsGe_1_2 = new JLabel("skip C");
		lblAyEsGe_1_2.setBounds(396, 324, 64, 28);
		contentPane.add(lblAyEsGe_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("select C");
		lblNewLabel_1_2_1.setBounds(583, 324, 59, 28);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblAyEsGe_1_2_1 = new JLabel("skip C");
		lblAyEsGe_1_2_1.setBounds(768, 324, 64, 28);
		contentPane.add(lblAyEsGe_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("select C");
		lblNewLabel_1_2_2.setBounds(953, 324, 59, 28);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblAyEsGe_1_2_2 = new JLabel("skip C");
		lblAyEsGe_1_2_2.setBounds(1134, 324, 64, 28);
		contentPane.add(lblAyEsGe_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("select C");
		lblNewLabel_1_2_3.setBounds(1312, 324, 59, 28);
		contentPane.add(lblNewLabel_1_2_3);
		
		JLabel lblAyEsGe_1_2_3 = new JLabel("skip C");
		lblAyEsGe_1_2_3.setBounds(1508, 324, 64, 28);
		contentPane.add(lblAyEsGe_1_2_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("select B");
		lblNewLabel_1_3.setBounds(1033, 193, 59, 28);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblAyEsGe_1_3 = new JLabel("skip B");
		lblAyEsGe_1_3.setBounds(1398, 193, 64, 28);
		contentPane.add(lblAyEsGe_1_3);
		
		JLabel lblNewLabel_1_1_4_2 = new JLabel("select E (9)");
		lblNewLabel_1_1_4_2.setBounds(157, 770, 70, 28);
		contentPane.add(lblNewLabel_1_1_4_2);
		
		JLabel lblAyEsGe_1_1_4_2 = new JLabel("skip E (9)");
		lblAyEsGe_1_1_4_2.setBounds(245, 770, 64, 28);
		contentPane.add(lblAyEsGe_1_1_4_2);
		
		JLabel lblNewLabel_1_1_1_3_2 = new JLabel("select E (10)");
		lblNewLabel_1_1_1_3_2.setBounds(343, 770, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_3_2);
		
		JLabel lblAyEsGe_1_1_1_3_2 = new JLabel("skip E (10)");
		lblAyEsGe_1_1_1_3_2.setBounds(431, 770, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_3_2);
		
		JLabel lblNewLabel_1_1_2_2_2 = new JLabel("select E (11)");
		lblNewLabel_1_1_2_2_2.setBounds(529, 770, 70, 28);
		contentPane.add(lblNewLabel_1_1_2_2_2);
		
		JLabel lblAyEsGe_1_1_2_2_2 = new JLabel("skip E (11)");
		lblAyEsGe_1_1_2_2_2.setBounds(617, 770, 64, 28);
		contentPane.add(lblAyEsGe_1_1_2_2_2);
		
		JLabel lblNewLabel_1_1_4_3 = new JLabel("select E (12)");
		lblNewLabel_1_1_4_3.setBounds(715, 770, 70, 28);
		contentPane.add(lblNewLabel_1_1_4_3);
		
		JLabel lblAyEsGe_1_1_4_3 = new JLabel("skip E (12)");
		lblAyEsGe_1_1_4_3.setBounds(803, 770, 64, 28);
		contentPane.add(lblAyEsGe_1_1_4_3);
		
		JLabel lblNewLabel_1_1_1_3_3 = new JLabel("select E (13)");
		lblNewLabel_1_1_1_3_3.setBounds(901, 770, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_3_3);
		
		JLabel lblAyEsGe_1_1_1_3_3 = new JLabel("skip E (13)");
		lblAyEsGe_1_1_1_3_3.setBounds(989, 770, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_3_3);
		
		JLabel lblNewLabel_1_1_2_2_4 = new JLabel("select E (14)");
		lblNewLabel_1_1_2_2_4.setBounds(1087, 770, 70, 28);
		contentPane.add(lblNewLabel_1_1_2_2_4);
		
		JLabel lblAyEsGe_1_1_2_2_4 = new JLabel("skip E (14)");
		lblAyEsGe_1_1_2_2_4.setBounds(1175, 770, 64, 28);
		contentPane.add(lblAyEsGe_1_1_2_2_4);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		panel.setBounds(54, 35, 348, 133);
		contentPane.add(panel);
		
		textField_31 = new JTextField();
		textField_31.setEnabled(false);
		textField_31.setVisible(false);
		textField_31.setEditable(false);
		textField_31.setText("Nesneler: <dynamic>");
		textField_31.setColumns(10);
		textField_31.setBounds(10, 7, 126, 20);
		panel.add(textField_31);
		
		TextField textField_1 = new TextField();
		textField_1.setText("0");
		textField_1.setBounds(77, 54, 30, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Degerler");
		lblNewLabel_2.setBounds(10, 85, 66, 20);
		panel.add(lblNewLabel_2);
		
		TextField textField_1_1 = new TextField();
		textField_1_1.setText("0");
		textField_1_1.setBounds(113, 54, 30, 20);
		panel.add(textField_1_1);
		
		TextField textField_1_2 = new TextField();
		textField_1_2.setText("0");
		textField_1_2.setBounds(149, 54, 30, 20);
		panel.add(textField_1_2);
		
		TextField textField_1_3 = new TextField();
		textField_1_3.setText("0");
		textField_1_3.setBounds(185, 54, 30, 20);
		panel.add(textField_1_3);
		
		TextField textField_1_4 = new TextField();
		textField_1_4.setText("0");
		textField_1_4.setBounds(221, 54, 30, 20);
		panel.add(textField_1_4);
		
		TextField textField_1_5 = new TextField();
		textField_1_5.setText("0");
		textField_1_5.setBounds(77, 80, 30, 20);
		panel.add(textField_1_5);
		
		TextField textField_1_6 = new TextField();
		textField_1_6.setText("0");
		textField_1_6.setBounds(113, 80, 30, 20);
		panel.add(textField_1_6);
		
		TextField textField_1_7 = new TextField();
		textField_1_7.setText("0");
		textField_1_7.setBounds(149, 80, 30, 20);
		panel.add(textField_1_7);
		
		TextField textField_1_8 = new TextField();
		textField_1_8.setText("0");
		textField_1_8.setBounds(185, 80, 30, 20);
		panel.add(textField_1_8);
		
		TextField textField_1_9 = new TextField();
		textField_1_9.setText("0");
		textField_1_9.setBounds(221, 80, 30, 20);
		panel.add(textField_1_9);
		
		JLabel lblNewLabel_2_1 = new JLabel("Agirliklar");
		lblNewLabel_2_1.setBounds(10, 54, 66, 20);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("A");
		lblNewLabel_2_1_1.setBounds(77, 28, 20, 20);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("B");
		lblNewLabel_2_1_1_1.setBounds(113, 28, 20, 20);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("C");
		lblNewLabel_2_1_1_2.setBounds(149, 28, 20, 20);
		panel.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("D");
		lblNewLabel_2_1_1_3.setBounds(185, 28, 20, 20);
		panel.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_1_4 = new JLabel("E");
		lblNewLabel_2_1_1_4.setBounds(221, 28, 20, 20);
		panel.add(lblNewLabel_2_1_1_4);
		
		
		JLabel lblNewLabel_3 = new JLabel("Hata!");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setBounds(64, 174, 179, 20);
		contentPane.add(lblNewLabel_3);
		
		
		TextField textField_Kapasite = new TextField();
		textField_Kapasite.setText("0");
		textField_Kapasite.setBounds(272, 54, 30, 20);
		panel.add(textField_Kapasite);
		
		//Yeniden hesaplanmak istendiðinde kullanýlan buton
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Kapasitenin istenilen degerde olmasýný saglayan if blogu
				if ( Integer.parseInt(textField_Kapasite.getText()) < 5 ||  Integer.parseInt(textField_Kapasite.getText()) > 25) {
					lblNewLabel_3.setVisible(true);
					lblNewLabel_3.setText("Kapasite 5-25 arasi olmalidir" );
					return;
				}
				int kap = Integer.parseInt(textField_Kapasite.getText());
				//Agirliklarin 1 ila K arasi kontrolu yapilmaktadir
				if ( Integer.parseInt(textField_1.getText()) < 1 || Integer.parseInt(textField_1_1.getText()) < 1 || Integer.parseInt(textField_1_2.getText()) < 1  || Integer.parseInt(textField_1_3.getText()) < 1 || Integer.parseInt(textField_1_4.getText()) < 1) {
					lblNewLabel_3.setVisible(true);
					lblNewLabel_3.setText("Agirliklar 1-" + kap + " arasi olmalidir");
					return;
				}
				if ( Integer.parseInt(textField_1.getText()) > kap || Integer.parseInt(textField_1_1.getText()) > kap || Integer.parseInt(textField_1_2.getText()) > kap  || Integer.parseInt(textField_1_3.getText())  > kap || Integer.parseInt(textField_1_4.getText()) > kap) {
					lblNewLabel_3.setVisible(true);
					lblNewLabel_3.setText("Agirliklar kden kucuk olmalidir" );
					return;
				}
				//Degerlerin 1 ila 25 olma kontrolu yapilmaktar
				if ( Integer.parseInt(textField_1_5.getText()) < 1 || Integer.parseInt(textField_1_6.getText()) < 1 || Integer.parseInt(textField_1_7.getText()) < 1  || Integer.parseInt(textField_1_8.getText()) < 1 || Integer.parseInt(textField_1_9.getText()) < 1) {
					lblNewLabel_3.setVisible(true);
					lblNewLabel_3.setText("Degerle 1 ila 25 arasi olmalidir" );
					return;
				}	
				if ( Integer.parseInt(textField_1_5.getText()) > 25 || Integer.parseInt(textField_1_6.getText()) > 25 || Integer.parseInt(textField_1_7.getText()) > 25  || Integer.parseInt(textField_1_8.getText()) > 25  || Integer.parseInt(textField_1_9.getText()) > 25) {
					lblNewLabel_3.setVisible(true);
					lblNewLabel_3.setText("Degerle 1 ila 25 arasi olmalidir" );
					return;
				}	
				System.out.print("deneme");
				lblNewLabel_3.setVisible(false);
				int degerler[] = new int[5];
				int agirliklar[] = new int[5];//Degerler arraylere atanmakta
				degerler[0] = Integer.parseInt(textField_1_5.getText());
				degerler[1] = Integer.parseInt(textField_1_6.getText());
				degerler[2] = Integer.parseInt(textField_1_7.getText());
				degerler[3] = Integer.parseInt(textField_1_8.getText());
				degerler[4] = Integer.parseInt(textField_1_9.getText());
				
				agirliklar[0] = Integer.parseInt(textField_1.getText());
				agirliklar[1] = Integer.parseInt(textField_1_1.getText());
				agirliklar[2] = Integer.parseInt(textField_1_2.getText());
				agirliklar[3] = Integer.parseInt(textField_1_3.getText());
				agirliklar[4] = Integer.parseInt(textField_1_4.getText());
				deneme.itemAssign(agirliklar, degerler);//Esyalari ve esyalarin kombinasyonlarini tutan obje guncellenmekte
				capacity = kap;	//Kapasite ayarlanmakta
				//Atamalar yapildiktan sonra grafiksel olarak uygulama yenilenmektedir
				fonksiyon2();
			}
		});
		btnNewButton.setBounds(258, 111, 90, 22); panel.add(btnNewButton);
		
		JLabel lblNewLabel_2_2 = new JLabel("Kapasite");lblNewLabel_2_2.setBounds(272, 31, 66, 20);panel.add(lblNewLabel_2_2);
	}
	//Son 32 lik sonuc kisminin text alanlari
	TextField textField_0_1;
	TextField textField_0_1A;
	TextField textField_0_2;
	TextField textField_0_2A;
	TextField textField_0_3;
	TextField textField_0_3A;
	TextField textField_0_4;
	TextField textField_0_4A;
	TextField textField_0_5;
	TextField textField_0_5A;

	TextField textField_1_0;
	TextField textField_1_0A;
	TextField textField_1_1;
	TextField textField_1_1A;
	TextField textField_1_2;
	TextField textField_1_2A;
	TextField textField_1_3;
	TextField textField_1_3A;
	
	TextField textField_2_0;
	TextField textField_2_0A;
	TextField textField_2_1;
	TextField textField_2_1A;
	TextField textField_2_2;
	TextField textField_2_2A;
	
	TextField textField_3_0;
	TextField textField_3_0A;
	TextField textField_3_1;
	TextField textField_3_1A;
	
	TextField textField_4_0;
	TextField textField_4_0A;
	
	TextField textField_5_0;
	TextField textField_5_0A;
	TextField textField_5_1;
	TextField textField_5_1A;
	TextField textField_5_2;
	TextField textField_5_2A;
	TextField textField_5_3;
	TextField textField_5_3A;
	
	TextField textField_6_0;
	TextField textField_6_0A;
	TextField textField_6_1;
	TextField textField_6_1A;
	TextField textField_6_2;
	TextField textField_6_2A;

	TextField textField_7_0;
	TextField textField_7_0A;
	TextField textField_7_1;
	TextField textField_7_1A;
	
	TextField textField_8_0;
	TextField textField_8_0A;

	TextField textField_9_0;
	TextField textField_9_0A;
	TextField textField_9_1;
	TextField textField_9_1A;
	TextField textField_9_2;
	TextField textField_9_2A;
	
	TextField textField_10_0;
	TextField textField_10_0A;
	TextField textField_10_1;
	TextField textField_10_1A;
	
	TextField textField_11_0;
	TextField textField_11_0A;
	
	TextField textField_12_0;
	TextField textField_12_0A;
	TextField textField_12_1;
	TextField textField_12_1A;
	
	TextField textField_13_0;
	TextField textField_13_0A;
	
	TextField textField_14_0;
	TextField textField_14_0A;
	
	TextField textField_15_0;
	TextField textField_15_0A;
	TextField textField_15_1;
	TextField textField_15_1A;
	TextField textField_15_3;
	TextField textField_15_3A;
	
	TextField textField_16_0;
	TextField textField_16_0A;
	TextField textField_16_1;
	TextField textField_16_1A;
	
	TextField textField_17_0;
	TextField textField_17_0A;
	
	TextField textField_18_0;
	TextField textField_18_0A;
	TextField textField_18_1;
	TextField textField_18_1A;
	
	TextField textField_19_0;
	TextField textField_19_0A;
	
	TextField textField_20_0;
	TextField textField_20_0A;
	
	TextField textField_21_0;
	TextField textField_21_0A;
	TextField textField_21_1;
	TextField textField_21_1A;
	
	TextField textField_22_0;
	TextField textField_22_0A;
	
	TextField textField_23_0;
	TextField textField_23_0A;
	
	TextField textField_24_0; 
	TextField textField_24_0A;
	
	TextField textField_25_0;
	TextField textField_25_0A;
	TextField textField_25_1;
	TextField textField_25_1A;
	
	TextField textField_26_0;
	TextField textField_26_0A;
	TextField textField_27_0;
	TextField textField_27_0A;
	TextField textField_28_0;
	TextField textField_28_0A;
	TextField textField_29_0;
	TextField textField_29_0A;
	TextField textField_30_0;
	TextField textField_30_0A;

	TextField textField_1_B;
	TextField textField_1_BA;
	//Sonuc kisimdaki paneller
	//Yesil veya kirmiziya donmesini saglanmaktadir
	Panel panel_S0;
	Panel panel_S1;
	Panel panel_S2;
	Panel panel_S3;
	Panel panel_S4;
	Panel panel_S5;
	Panel panel_S6;
	Panel panel_S7;
	Panel panel_S8;
	Panel panel_S9;
	Panel panel_S10;
	Panel panel_S11;
	Panel panel_S12;
	Panel panel_S13;
	Panel panel_S14;
	Panel panel_S15;
	Panel panel_S16;
	Panel panel_S17;
	Panel panel_S18;
	Panel panel_S19;
	Panel panel_S20;
	Panel panel_S21;
	Panel panel_S22;
	Panel panel_S23;
	Panel panel_S24;
	Panel panel_S25;
	Panel panel_S26;
	Panel panel_S27;
	Panel panel_S28;
	Panel panel_S29;
	Panel panel_S30;
	Panel panel_SE;
	Panel panel_1B;
	
	//Gerekli alanlarýn yenilenmesini saglayan fonksiyon
	//Birden fazla hesaplanmayý saglamaktadýr
	public void fonksiyon2() {
		textField_0_1.setText("Secilenler: "+ deneme.returnCombination(0)); //Kombinasyonlari olusturulan objeden alarak text alanina eklemektedir
		textField_0_1A.setText(deneme.returnValues(0));						//Kombinasyon degerlerinide objeden alarak duzenlemektedir
		textField_0_2.setText("Secilenler: "+ deneme.returnCombination(0));
		textField_0_2A.setText(deneme.returnValues(0));
		textField_0_3.setText("Secilenler: "+ deneme.returnCombination(0));
		textField_0_3A.setText(deneme.returnValues(0));
		textField_0_4.setText("S: "+ deneme.returnCombination(0));
		textField_0_4A.setText(deneme.returnValues(0));
		textField_0_5.setText("S: "+ deneme.returnCombination(0));
		textField_0_5A.setText(deneme.returnValues(0));
		
		textField_1_0.setText("Secilenler: "+ deneme.returnCombination(1));
		textField_1_0A.setText(deneme.returnValues(1));
		textField_1_1.setText("Secilenler: "+ deneme.returnCombination(1));
		textField_1_1A.setText(deneme.returnValues(1));
		textField_1_2.setText("S: "+ deneme.returnCombination(1));
		textField_1_2A.setText(deneme.returnValues(1));
		textField_1_3.setText("S: "+ deneme.returnCombination(1));
		textField_1_3A.setText(deneme.returnValues(1));
		
		textField_2_0.setText("Secilenler: "+ deneme.returnCombination(2));
		textField_2_0A.setText(deneme.returnValues(2));
		textField_2_1.setText("S: "+ deneme.returnCombination(2));
		textField_2_1A.setText(deneme.returnValues(2));
		textField_2_2.setText("S: "+ deneme.returnCombination(2));
		textField_2_2A.setText(deneme.returnValues(2));
		
		textField_3_0.setText("S: "+ deneme.returnCombination(3));
		textField_3_0A.setText(deneme.returnValues(3));
		textField_3_1.setText("S: "+ deneme.returnCombination(3));
		textField_3_1A.setText(deneme.returnValues(3));
		
		textField_4_0.setText("S: "+ deneme.returnCombination(4));
		textField_4_0A.setText(deneme.returnValues(4));

		textField_5_0.setText("Secilenler: "+ deneme.returnCombination(5));
		textField_5_0A.setText(deneme.returnValues(5));
		textField_5_1.setText("Secilenler: "+ deneme.returnCombination(5));
		textField_5_1A.setText(deneme.returnValues(5));
		textField_5_2.setText("S: "+ deneme.returnCombination(5));
		textField_5_2A.setText(deneme.returnValues(5));
		textField_5_3.setText("S: "+ deneme.returnCombination(5));
		textField_5_3A.setText(deneme.returnValues(5));
		
		textField_6_0.setText("Secilenler: "+ deneme.returnCombination(6));
		textField_6_0A.setText(deneme.returnValues(6));
		textField_6_1.setText("S: "+ deneme.returnCombination(6));
		textField_6_1A.setText(deneme.returnValues(6));
		textField_6_2.setText("S: "+ deneme.returnCombination(6));
		textField_6_2A.setText(deneme.returnValues(6));
		
		textField_7_0.setText("S: "+ deneme.returnCombination(7));
		textField_7_0A.setText(deneme.returnValues(7));
		textField_7_1.setText("S: "+ deneme.returnCombination(7));
		textField_7_1A.setText(deneme.returnValues(7));
		
		textField_8_0.setText("S: "+ deneme.returnCombination(8));
		textField_8_0A.setText(deneme.returnValues(8));
		
		textField_9_0.setText("Secilenler: "+ deneme.returnCombination(9));
		textField_9_0A.setText(deneme.returnValues(9));
		textField_9_1.setText("S: "+ deneme.returnCombination(9));
		textField_9_1A.setText(deneme.returnValues(9));
		textField_9_2.setText("S: "+ deneme.returnCombination(9));
		textField_9_2A.setText(deneme.returnValues(9));
		
		textField_10_0.setText("S: "+ deneme.returnCombination(10));
		textField_10_0A.setText(deneme.returnValues(10));
		textField_10_1.setText("S: "+ deneme.returnCombination(10));
		textField_10_1A.setText(deneme.returnValues(10));
		
		textField_11_0.setText("S: "+ deneme.returnCombination(11));
		textField_11_0A.setText(deneme.returnValues(11));
		
		textField_12_0.setText("S: "+ deneme.returnCombination(12));
		textField_12_0A.setText(deneme.returnValues(12));
		textField_12_1.setText("S: "+ deneme.returnCombination(12));
		textField_12_1A.setText(deneme.returnValues(12));
		
		textField_13_0.setText("S: "+ deneme.returnCombination(13));
		textField_13_0A.setText(deneme.returnValues(13));
		
		textField_14_0.setText("S: "+ deneme.returnCombination(14));
		textField_14_0A.setText(deneme.returnValues(14));
		
		textField_15_0.setText("Secilenler: "+ deneme.returnCombination(15));
		textField_15_0A.setText(deneme.returnValues(15));
		textField_15_1.setText("S: "+ deneme.returnCombination(15));
		textField_15_1A.setText(deneme.returnValues(15));
		textField_15_3.setText("S: "+ deneme.returnCombination(15));
		textField_15_3A.setText(deneme.returnValues(15));
		
		textField_16_0.setText("S: "+ deneme.returnCombination(16));
		textField_16_0A.setText(deneme.returnValues(16));
		textField_16_1.setText("S: "+ deneme.returnCombination(16));
		textField_16_1A.setText(deneme.returnValues(16));
		
		textField_17_0.setText("S: "+ deneme.returnCombination(17));
		textField_17_0A.setText(deneme.returnValues(17));
		
		textField_18_0.setText("S: "+ deneme.returnCombination(18));
		textField_18_0A.setText(deneme.returnValues(18));
		textField_18_1.setText("S: "+ deneme.returnCombination(18));
		textField_18_1A.setText(deneme.returnValues(18));
		
		textField_19_0.setText("S: "+ deneme.returnCombination(19));
		textField_19_0A.setText(deneme.returnValues(19));
		
		textField_20_0.setText("S: "+ deneme.returnCombination(20));
		textField_20_0A.setText(deneme.returnValues(20));
		
		textField_21_0.setText("S: "+ deneme.returnCombination(21));
		textField_21_0A.setText(deneme.returnValues(21));
		textField_21_1.setText("S: "+ deneme.returnCombination(21));
		textField_21_1A.setText(deneme.returnValues(21));
		
		textField_22_0.setText("S: "+ deneme.returnCombination(22));
		textField_22_0A.setText(deneme.returnValues(22));
		textField_23_0.setText("S: "+ deneme.returnCombination(23));
		textField_23_0A.setText(deneme.returnValues(23));
		textField_24_0.setText("S: "+ deneme.returnCombination(24));
		textField_24_0A.setText(deneme.returnValues(24));
		
		textField_25_1.setText("S: "+ deneme.returnCombination(25));
		textField_25_1A.setText(deneme.returnValues(25));
		textField_25_0.setText("S: "+ deneme.returnCombination(25));
		textField_25_0A.setText(deneme.returnValues(25));
		
		textField_26_0.setText("S: "+ deneme.returnCombination(26));
		textField_26_0A.setText(deneme.returnValues(26));
		textField_27_0.setText("S: "+ deneme.returnCombination(27));
		textField_27_0A.setText(deneme.returnValues(27));
		textField_28_0.setText("S: "+ deneme.returnCombination(28));
		textField_28_0A.setText(deneme.returnValues(28));
		textField_29_0.setText("S: "+ deneme.returnCombination(29));
		textField_29_0A.setText(deneme.returnValues(29));
		textField_30_0.setText("S:"+ deneme.returnCombination(30));
		textField_30_0A.setText(deneme.returnValues(30));
		
		textField_1_B.setText(deneme.returnCombination(deneme.returnBestSolution(capacity)));
		textField_1_BA.setText(deneme.returnValues(deneme.returnBestSolution(capacity)));
		
		//Panellerin kapasitenin altindaysa yesile degilse kirmiziya dondurmekte olan if bloklari
		if(deneme.capControl(0, capacity)) 
			panel_S0.setBackground(Color.GREEN);	//Eger kapasite alti veya esdegerse yesil yanmaktadir
		else panel_S0.setBackground(Color.RED);		//Kapasiteyi asan bir durumda kirmizi yanarak cozum olmadigini gostermektedir
		
		if(deneme.capControl(1, capacity)) 
			panel_S1.setBackground(Color.GREEN);
		else panel_S1.setBackground(Color.RED);
		
		if(deneme.capControl(2, capacity)) 
			panel_S2.setBackground(Color.GREEN);
		else panel_S2.setBackground(Color.RED);
		
		if(deneme.capControl(3, capacity)) 
			panel_S3.setBackground(Color.GREEN);
		else panel_S3.setBackground(Color.RED);
		
		if(deneme.capControl(4, capacity)) 
			panel_S4.setBackground(Color.GREEN);
		else panel_S4.setBackground(Color.RED);
		
		if(deneme.capControl(5, capacity)) 
			panel_S5.setBackground(Color.GREEN);
		else panel_S5.setBackground(Color.RED);
		
		if(deneme.capControl(6, capacity)) 
			panel_S6.setBackground(Color.GREEN);
		else panel_S6.setBackground(Color.RED);
		
		if(deneme.capControl(7, capacity)) 
			panel_S7.setBackground(Color.GREEN);
		else panel_S7.setBackground(Color.RED);
		
		if(deneme.capControl(8, capacity)) 
			panel_S8.setBackground(Color.GREEN);
		else panel_S8.setBackground(Color.RED);
		
		if(deneme.capControl(9, capacity)) 
			panel_S9.setBackground(Color.GREEN);
		else panel_S9.setBackground(Color.RED);
		if(deneme.capControl(0, capacity)) 
			panel_S0.setBackground(Color.GREEN);
		else panel_S0.setBackground(Color.RED);
		
		if(deneme.capControl(1, capacity)) 
			panel_S1.setBackground(Color.GREEN);
		else panel_S1.setBackground(Color.RED);
		
		if(deneme.capControl(2, capacity)) 
			panel_S2.setBackground(Color.GREEN);
		else panel_S2.setBackground(Color.RED);
		
		if(deneme.capControl(3, capacity)) 
			panel_S3.setBackground(Color.GREEN);
		else panel_S3.setBackground(Color.RED);
		
		if(deneme.capControl(4, capacity)) 
			panel_S4.setBackground(Color.GREEN);
		else panel_S4.setBackground(Color.RED);
		
		if(deneme.capControl(5, capacity)) 
			panel_S5.setBackground(Color.GREEN);
		else panel_S5.setBackground(Color.RED);
		
		if(deneme.capControl(6, capacity)) 
			panel_S6.setBackground(Color.GREEN);
		else panel_S6.setBackground(Color.RED);
		
		if(deneme.capControl(7, capacity)) 
			panel_S7.setBackground(Color.GREEN);
		else panel_S7.setBackground(Color.RED);
		
		if(deneme.capControl(8, capacity)) 
			panel_S8.setBackground(Color.GREEN);
		else panel_S8.setBackground(Color.RED);
		
		if(deneme.capControl(9, capacity)) 
			panel_S9.setBackground(Color.GREEN);
		else panel_S9.setBackground(Color.RED);
		if(deneme.capControl(10, capacity)) 
			panel_S10.setBackground(Color.GREEN);
		else panel_S10.setBackground(Color.RED);
		
		if(deneme.capControl(11, capacity)) 
			panel_S11.setBackground(Color.GREEN);
		else panel_S11.setBackground(Color.RED);
		
		if(deneme.capControl(12, capacity)) 
			panel_S12.setBackground(Color.GREEN);
		else panel_S12.setBackground(Color.RED);
		
		if(deneme.capControl(13, capacity)) 
			panel_S13.setBackground(Color.GREEN);
		else panel_S13.setBackground(Color.RED);
		
		if(deneme.capControl(14, capacity)) 
			panel_S14.setBackground(Color.GREEN);
		else panel_S14.setBackground(Color.RED);
		
		if(deneme.capControl(15, capacity)) 
			panel_S15.setBackground(Color.GREEN);
		else panel_S15.setBackground(Color.RED);
		
		if(deneme.capControl(16, capacity)) 
			panel_S16.setBackground(Color.GREEN);
		else panel_S16.setBackground(Color.RED);
		
		if(deneme.capControl(17, capacity)) 
			panel_S17.setBackground(Color.GREEN);
		else panel_S17.setBackground(Color.RED);
		
		if(deneme.capControl(18, capacity)) 
			panel_S18.setBackground(Color.GREEN);
		else panel_S18.setBackground(Color.RED);
		if(deneme.capControl(19, capacity)) 
			panel_S19.setBackground(Color.GREEN);
		else panel_S19.setBackground(Color.RED);
		
		if(deneme.capControl(20, capacity)) 
			panel_S20.setBackground(Color.GREEN);
		else panel_S20.setBackground(Color.RED);
		
		if(deneme.capControl(21, capacity)) 
			panel_S21.setBackground(Color.GREEN);
		else panel_S21.setBackground(Color.RED);
		
		if(deneme.capControl(22, capacity)) 
			panel_S22.setBackground(Color.GREEN);
		else panel_S22.setBackground(Color.RED);
		
		if(deneme.capControl(23, capacity)) 
			panel_S23.setBackground(Color.GREEN);
		else panel_S23.setBackground(Color.RED);
		
		if(deneme.capControl(24, capacity)) 
			panel_S24.setBackground(Color.GREEN);
		else panel_S24.setBackground(Color.RED);
		
		if(deneme.capControl(25, capacity)) 
			panel_S25.setBackground(Color.GREEN);
		else panel_S25.setBackground(Color.RED);
		
		if(deneme.capControl(26, capacity)) 
			panel_S26.setBackground(Color.GREEN);
		else panel_S26.setBackground(Color.RED);
		
		if(deneme.capControl(27, capacity)) 
			panel_S27.setBackground(Color.GREEN);
		else panel_S27.setBackground(Color.RED);
		
		if(deneme.capControl(28, capacity)) 
			panel_S28.setBackground(Color.GREEN);
		else panel_S28.setBackground(Color.RED);
		if(deneme.capControl(29, capacity)) 
			panel_S29.setBackground(Color.GREEN);
		else panel_S29.setBackground(Color.RED);
		
		if(deneme.capControl(30, capacity)) 
			panel_S30.setBackground(Color.GREEN);
		else panel_S30.setBackground(Color.RED);
		
		panel_SE.setBackground(Color.GREEN); //Bos panel
		panel_1B.setBackground(Color.GREEN); //En iyi sonuc paneli
	}
	
	//Uygulama ilk calistiginda gerekli grafiksel duzenlemelerin yapildigi fonksiyon blogu
	public void func() {
		this.combineArray = deneme.getCombineArray();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1680, 1024);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(826, 10, 147, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNesnelerabcd = new JTextField();
		txtNesnelerabcd.setBounds(10, 7, 126, 20);
		panel.add(txtNesnelerabcd);
		txtNesnelerabcd.setText("Nesneler: [A,B,C,D,E]");
		txtNesnelerabcd.setColumns(10);
		
		TextField textField_1 = new TextField();
		textField_1.setText("Secilenler: []");
		textField_1.setBounds(10, 33, 126, 20);
		panel.add(textField_1);
		
		TextField textField_2 = new TextField();
		textField_2.setText("V: 0  W:0");
		textField_2.setBounds(10, 59, 126, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("select A");
		lblNewLabel.setBounds(502, 73, 59, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblAyEsGe = new JLabel("skip A");
		lblAyEsGe.setBounds(1227, 73, 64, 28);
		contentPane.add(lblAyEsGe);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(454, 107, 147, 91);
		contentPane.add(panel_1);
		
		txtNesnelerbcd = new JTextField();
		txtNesnelerbcd.setText("Nesneler: [B,C,D,E]");
		txtNesnelerbcd.setColumns(10);
		txtNesnelerbcd.setBounds(10, 7, 126, 20);
		panel_1.add(txtNesnelerbcd);
		
		textField_0_1 = new TextField();
		textField_0_1.setText("Secilenler: "+ deneme.returnCombination(0));
		textField_0_1.setBounds(10, 33, 126, 20);
		panel_1.add(textField_0_1);
		
		textField_0_1A = new TextField();
		textField_0_1A.setText(deneme.returnValues(0));
		textField_0_1A.setBounds(10, 59, 126, 20);
		panel_1.add(textField_0_1A);
		
		Panel panel_2 = new Panel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(1178, 107, 147, 91);
		contentPane.add(panel_2);
		
		txtNesnelerbcde = new JTextField();
		txtNesnelerbcde.setText("Nesneler: [B,C,D,E]");
		txtNesnelerbcde.setColumns(10);
		txtNesnelerbcde.setBounds(10, 7, 126, 20);
		panel_2.add(txtNesnelerbcde);
		
		TextField textField_Empty_0 = new TextField();
		textField_Empty_0.setText("Secilenler: []");
		textField_Empty_0.setBounds(10, 33, 126, 20);
		panel_2.add(textField_Empty_0);
		
		TextField textField_Empty_0A = new TextField();
		textField_Empty_0A.setText("V: 0  W:0");
		textField_Empty_0A.setBounds(10, 59, 126, 20);
		panel_2.add(textField_Empty_0A);
		
		Panel panel_3 = new Panel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(991, 227, 147, 91);
		contentPane.add(panel_3);
		
		txtNesnelercde_2 = new JTextField();
		txtNesnelercde_2.setText("Nesneler:  [C,D,E]");
		txtNesnelercde_2.setColumns(10);
		txtNesnelercde_2.setBounds(10, 7, 126, 20);
		panel_3.add(txtNesnelercde_2);
		
		textField_1_0 = new TextField();
		textField_1_0.setText("Secilenler: " + deneme.returnCombination(1));
		textField_1_0.setBounds(10, 33, 126, 20);
		panel_3.add(textField_1_0);
		
		textField_1_0A = new TextField();
		textField_1_0A.setText(deneme.returnValues(1));
		textField_1_0A.setBounds(10, 59, 126, 20);
		panel_3.add(textField_1_0A);
		
		Panel panel_4 = new Panel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(1358, 227, 147, 91);
		contentPane.add(panel_4);
		
		txtNesnelercde_3 = new JTextField();
		txtNesnelercde_3.setText("Nesneler:  [C,D,E]");
		txtNesnelercde_3.setColumns(10);
		txtNesnelercde_3.setBounds(10, 7, 126, 20);
		panel_4.add(txtNesnelercde_3);
		
		TextField textField_Empty_1 = new TextField();
		textField_Empty_1.setText("Secilenler: []");
		textField_Empty_1.setBounds(10, 33, 126, 20);
		panel_4.add(textField_Empty_1);
		
		TextField textField_Empty_1A = new TextField();
		textField_Empty_1A.setText("V: 0  W:0");
		textField_Empty_1A.setBounds(10, 59, 126, 20);
		panel_4.add(textField_Empty_1A);
		
		Panel panel_5 = new Panel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(255, 227, 147, 91);
		contentPane.add(panel_5);
		
		txtNesnelercde_1 = new JTextField();
		txtNesnelercde_1.setText("Nesneler: [C,D,E]");
		txtNesnelercde_1.setColumns(10);
		txtNesnelercde_1.setBounds(10, 7, 126, 20);
		panel_5.add(txtNesnelercde_1);
		
		textField_5_0 = new TextField();
		textField_5_0.setText("Secilenler:"+ deneme.returnCombination(5));
		textField_5_0.setBounds(10, 33, 126, 20);
		panel_5.add(textField_5_0);
		
		textField_5_0A = new TextField();
		textField_5_0A.setText(deneme.returnValues(5));
		textField_5_0A.setBounds(10, 59, 126, 20);
		panel_5.add(textField_5_0A);
		
		Panel panel_6 = new Panel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(624, 227, 147, 91);
		contentPane.add(panel_6);
		
		txtNesnelercde = new JTextField();
		txtNesnelercde.setText("Nesneler: [C,D,E]");
		txtNesnelercde.setColumns(10);
		txtNesnelercde.setBounds(10, 7, 126, 20);
		panel_6.add(txtNesnelercde);
		
		textField_0_2 = new TextField();
		textField_0_2.setText("Secilenler: " + deneme.returnCombination(0));
		textField_0_2.setBounds(10, 33, 126, 20);
		panel_6.add(textField_0_2);
		
		textField_0_2A = new TextField();
		textField_0_2A.setText(deneme.returnValues(0));
		textField_0_2A.setBounds(10, 59, 126, 20);
		panel_6.add(textField_0_2A);
		
		Panel panel_7 = new Panel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(173, 358, 147, 91);
		contentPane.add(panel_7);
		
		txtNesnelerde = new JTextField();
		txtNesnelerde.setText("Nesneler:  [D,E]");
		txtNesnelerde.setColumns(10);
		txtNesnelerde.setBounds(10, 7, 126, 20);
		panel_7.add(txtNesnelerde);
		
		textField_15_3 = new TextField();
		textField_15_3.setText("Secilenler: " + deneme.returnCombination(15));
		textField_15_3.setBounds(10, 33, 126, 20);
		panel_7.add(textField_15_3);
		
		textField_15_3A = new TextField();
		textField_15_3A.setText(deneme.returnValues(15));
		textField_15_3A.setBounds(10, 59, 126, 20);
		panel_7.add(textField_15_3A);
		
		Panel panel_8 = new Panel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(348, 358, 147, 91);
		contentPane.add(panel_8);
		
		txtNesnelerde_1 = new JTextField();
		txtNesnelerde_1.setText("Nesneler:  [D,E]");
		txtNesnelerde_1.setColumns(10);
		txtNesnelerde_1.setBounds(10, 7, 126, 20);
		panel_8.add(txtNesnelerde_1);
		
		textField_5_1 = new TextField();
		textField_5_1.setText("Secilenler: "+ deneme.returnCombination(5));
		textField_5_1.setBounds(10, 33, 126, 20);
		panel_8.add(textField_5_1);
		
		textField_5_1A = new TextField();
		textField_5_1A.setText(deneme.returnValues(5));
		textField_5_1A.setBounds(10, 59, 126, 20);
		panel_8.add(textField_5_1A);
		
		Panel panel_9 = new Panel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.LIGHT_GRAY);
		panel_9.setBounds(545, 358, 147, 91);
		contentPane.add(panel_9);
		
		txtNesnelerde_2 = new JTextField();
		txtNesnelerde_2.setText("Nesneler:  [D,E]");
		txtNesnelerde_2.setColumns(10);
		txtNesnelerde_2.setBounds(10, 7, 126, 20);
		panel_9.add(txtNesnelerde_2);
		
		textField_6_0 = new TextField();
		textField_6_0.setText("Secilenler: " + deneme.returnCombination(6));
		textField_6_0.setBounds(10, 33, 126, 20);
		panel_9.add(textField_6_0);
		
		textField_6_0A = new TextField();
		textField_6_0A.setText(deneme.returnValues(6));
		textField_6_0A.setBounds(10, 59, 126, 20);
		panel_9.add(textField_6_0A);
		
		Panel panel_10 = new Panel();
		panel_10.setLayout(null);
		panel_10.setBackground(Color.LIGHT_GRAY);
		panel_10.setBounds(715, 358, 147, 91);
		contentPane.add(panel_10);
		
		txtNesnelerde_3 = new JTextField();
		txtNesnelerde_3.setText("Nesneler:  [D,E]");
		txtNesnelerde_3.setColumns(10);
		txtNesnelerde_3.setBounds(10, 7, 126, 20);
		panel_10.add(txtNesnelerde_3);
		
		textField_0_3 = new TextField();
		textField_0_3.setText("Secilenler: " + deneme.returnCombination(0));
		textField_0_3.setBounds(10, 33, 126, 20);
		panel_10.add(textField_0_3);
		
		textField_0_3A = new TextField();
		textField_0_3A.setText(deneme.returnValues(0));
		textField_0_3A.setBounds(10, 59, 126, 20);
		panel_10.add(textField_0_3A);
		
		Panel panel_11 = new Panel();
		panel_11.setLayout(null);
		panel_11.setBackground(Color.LIGHT_GRAY);
		panel_11.setBounds(908, 358, 147, 91);
		contentPane.add(panel_11);
		
		txtNesnelerde_4 = new JTextField();
		txtNesnelerde_4.setText("Nesneler:  [D,E]");
		txtNesnelerde_4.setColumns(10);
		txtNesnelerde_4.setBounds(10, 7, 126, 20);
		panel_11.add(txtNesnelerde_4);
		
		textField_9_0 = new TextField();
		textField_9_0.setText("Secilenler: " + deneme.returnCombination(9));
		textField_9_0.setBounds(10, 33, 126, 20);
		panel_11.add(textField_9_0);
		
		textField_9_0A = new TextField();
		textField_9_0A.setText(deneme.returnValues(9));
		textField_9_0A.setBounds(10, 59, 126, 20);
		panel_11.add(textField_9_0A);
		
		Panel panel_12 = new Panel();
		panel_12.setLayout(null);
		panel_12.setBackground(Color.LIGHT_GRAY);
		panel_12.setBounds(1089, 358, 147, 91);
		contentPane.add(panel_12);
		
		txtNesnelerde_5 = new JTextField();
		txtNesnelerde_5.setText("Nesneler:  [D,E]");
		txtNesnelerde_5.setColumns(10);
		txtNesnelerde_5.setBounds(10, 7, 126, 20);
		panel_12.add(txtNesnelerde_5);
		
		textField_1_1 = new TextField();
		textField_1_1.setText("Secilenler: " + deneme.returnCombination(1));
		textField_1_1.setBounds(10, 33, 126, 20);
		panel_12.add(textField_1_1);
		
		textField_1_1A = new TextField();
		textField_1_1A.setText(deneme.returnValues(1));
		textField_1_1A.setBounds(10, 59, 126, 20);
		panel_12.add(textField_1_1A);
		
		Panel panel_13 = new Panel();
		panel_13.setLayout(null);
		panel_13.setBackground(Color.LIGHT_GRAY);
		panel_13.setBounds(1267, 358, 147, 91);
		contentPane.add(panel_13);
		
		txtNesnelerde_6 = new JTextField();
		txtNesnelerde_6.setText("Nesneler:  [D,E]");
		txtNesnelerde_6.setColumns(10);
		txtNesnelerde_6.setBounds(10, 7, 126, 20);
		panel_13.add(txtNesnelerde_6);
		
		textField_2_0 = new TextField();
		textField_2_0.setText("Secilenler: " + deneme.returnCombination(2));
		textField_2_0.setBounds(10, 33, 126, 20);
		panel_13.add(textField_2_0);
		
		textField_2_0A = new TextField();
		textField_2_0A.setText(deneme.returnValues(2));
		textField_2_0A.setBounds(10, 59, 126, 20);
		panel_13.add(textField_2_0A);
		
		Panel panel_14 = new Panel();
		panel_14.setLayout(null);
		panel_14.setBackground(Color.LIGHT_GRAY);
		panel_14.setBounds(1461, 358, 147, 91);
		contentPane.add(panel_14);
		
		txtNesnelerde_7 = new JTextField();
		txtNesnelerde_7.setText("Nesneler:  [D,E]");
		txtNesnelerde_7.setColumns(10);
		txtNesnelerde_7.setBounds(10, 7, 126, 20);
		panel_14.add(txtNesnelerde_7);
		
		TextField textField_Empty_2 = new TextField();
		textField_Empty_2.setText("Secilenler: []");
		textField_Empty_2.setBounds(10, 33, 126, 20);
		panel_14.add(textField_Empty_2);
		
		TextField textField_Empty_2A = new TextField();
		textField_Empty_2A.setText("V: 0  W:0");
		textField_Empty_2A.setBounds(10, 59, 126, 20);
		panel_14.add(textField_Empty_2A);
		
		Panel panel_7_1 = new Panel();
		panel_7_1.setBackground(Color.LIGHT_GRAY);
		panel_7_1.setBounds(142, 479, 87, 91);
		contentPane.add(panel_7_1);
		panel_7_1.setLayout(null);
		
		txtN = new JTextField();
		txtN.setBounds(4, 11, 80, 20);
		txtN.setText("N:  [E]");
		txtN.setColumns(10);
		panel_7_1.add(txtN);
		
		textField_25_0 = new TextField();
		textField_25_0.setBounds(4, 33, 80, 20);
		textField_25_0.setText("S: " + deneme.returnCombination(25));
		panel_7_1.add(textField_25_0);
		
		textField_25_0A = new TextField();
		textField_25_0A.setBounds(4, 59, 80, 20);
		textField_25_0A.setText(deneme.returnValues(25));
		panel_7_1.add(textField_25_0A);
		
		JLabel lblNewLabel_1 = new JLabel("select B");
		lblNewLabel_1.setBounds(322, 193, 59, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAyEsGe_1 = new JLabel("skip B");
		lblAyEsGe_1.setBounds(690, 193, 64, 28);
		contentPane.add(lblAyEsGe_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("select D(1)");
		lblNewLabel_1_1.setBounds(157, 449, 70, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblAyEsGe_1_1 = new JLabel("skip D (2)");
		lblAyEsGe_1_1.setBounds(245, 449, 64, 28);
		contentPane.add(lblAyEsGe_1_1);
		
		Panel panel_7_1_1 = new Panel();
		panel_7_1_1.setLayout(null);
		panel_7_1_1.setBackground(Color.LIGHT_GRAY);
		panel_7_1_1.setBounds(235, 479, 87, 91);
		contentPane.add(panel_7_1_1);
		
		txtN_1 = new JTextField();
		txtN_1.setText("N: [E]");
		txtN_1.setColumns(10);
		txtN_1.setBounds(4, 11, 80, 20);
		panel_7_1_1.add(txtN_1);
		
		textField_15_0 = new TextField();
		textField_15_0.setText("S: " + deneme.returnCombination(15));
		textField_15_0.setBounds(4, 33, 80, 20);
		panel_7_1_1.add(textField_15_0);
		
		textField_15_0A = new TextField();
		textField_15_0A.setText(deneme.returnValues(15));
		textField_15_0A.setBounds(4, 59, 80, 20);
		panel_7_1_1.add(textField_15_0A);
		
		Panel panel_7_1_2 = new Panel();
		panel_7_1_2.setLayout(null);
		panel_7_1_2.setBackground(Color.LIGHT_GRAY);
		panel_7_1_2.setBounds(328, 479, 87, 91);
		contentPane.add(panel_7_1_2);
		
		txtNe = new JTextField();
		txtNe.setText("N: [E]");
		txtNe.setColumns(10);
		txtNe.setBounds(4, 11, 80, 20);
		panel_7_1_2.add(txtNe);
		
		textField_16_0 = new TextField();
		textField_16_0.setText("S: " + deneme.returnCombination(16));
		textField_16_0.setBounds(4, 33, 80, 20);
		panel_7_1_2.add(textField_16_0);
		
		textField_16_0A = new TextField();
		textField_16_0A.setText(deneme.returnValues(16));
		textField_16_0A.setBounds(4, 59, 80, 20);
		panel_7_1_2.add(textField_16_0A);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("select D (3)");
		lblNewLabel_1_1_1.setBounds(343, 449, 70, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblAyEsGe_1_1_1 = new JLabel("skip D (4)");
		lblAyEsGe_1_1_1.setBounds(431, 449, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1);
		
		Panel panel_7_1_1_1 = new Panel();
		panel_7_1_1_1.setLayout(null);
		panel_7_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_7_1_1_1.setBounds(421, 479, 87, 91);
		contentPane.add(panel_7_1_1_1);
		
		txtNe_1 = new JTextField();
		txtNe_1.setText("N: [E]");
		txtNe_1.setColumns(10);
		txtNe_1.setBounds(4, 11, 80, 20);
		panel_7_1_1_1.add(txtNe_1);
		
		textField_5_2 = new TextField();
		textField_5_2.setText("S: " + deneme.returnCombination(5));
		textField_5_2.setBounds(4, 33, 80, 20);
		panel_7_1_1_1.add(textField_5_2);
		
		textField_5_2A = new TextField();
		textField_5_2A.setText(deneme.returnValues(5));
		textField_5_2A.setBounds(4, 59, 80, 20);
		panel_7_1_1_1.add(textField_5_2A);
		
		Panel panel_7_1_3 = new Panel();
		panel_7_1_3.setLayout(null);
		panel_7_1_3.setBackground(Color.LIGHT_GRAY);
		panel_7_1_3.setBounds(514, 479, 87, 91);
		contentPane.add(panel_7_1_3);
		
		txtNe_2 = new JTextField();
		txtNe_2.setText("N: [E]");
		txtNe_2.setColumns(10);
		txtNe_2.setBounds(4, 11, 80, 20);
		panel_7_1_3.add(txtNe_2);
		
		textField_18_0 = new TextField();
		textField_18_0.setText("S: " + deneme.returnCombination(18));
		textField_18_0.setBounds(4, 33, 80, 20);
		panel_7_1_3.add(textField_18_0);
		
		textField_18_0A = new TextField();
		textField_18_0A.setText(deneme.returnValues(18));
		textField_18_0A.setBounds(4, 59, 80, 20);
		panel_7_1_3.add(textField_18_0A);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("select D (5)");
		lblNewLabel_1_1_2.setBounds(529, 449, 70, 28);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblAyEsGe_1_1_2 = new JLabel("skip D (6)");
		lblAyEsGe_1_1_2.setBounds(617, 449, 64, 28);
		contentPane.add(lblAyEsGe_1_1_2);
		
		Panel panel_7_1_1_2 = new Panel();
		panel_7_1_1_2.setLayout(null);
		panel_7_1_1_2.setBackground(Color.LIGHT_GRAY);
		panel_7_1_1_2.setBounds(607, 479, 87, 91);
		contentPane.add(panel_7_1_1_2);
		
		txtNe_3 = new JTextField();
		txtNe_3.setText("N: [E]");
		txtNe_3.setColumns(10);
		txtNe_3.setBounds(4, 11, 80, 20);
		panel_7_1_1_2.add(txtNe_3);
		
		textField_6_1 = new TextField();
		textField_6_1.setText("S: " + deneme.returnCombination(6));
		textField_6_1.setBounds(4, 33, 80, 20);
		panel_7_1_1_2.add(textField_6_1);
		
		textField_6_1A = new TextField();
		textField_6_1A.setText(deneme.returnValues(6));
		textField_6_1A.setBounds(4, 59, 80, 20);
		panel_7_1_1_2.add(textField_6_1A);
		
		Panel panel_7_1_2_1 = new Panel();
		panel_7_1_2_1.setLayout(null);
		panel_7_1_2_1.setBackground(Color.LIGHT_GRAY);
		panel_7_1_2_1.setBounds(700, 479, 87, 91);
		contentPane.add(panel_7_1_2_1);
		
		txtNe_4 = new JTextField();
		txtNe_4.setText("N: [E]");
		txtNe_4.setColumns(10);
		txtNe_4.setBounds(4, 11, 80, 20);
		panel_7_1_2_1.add(txtNe_4);
		
		textField_7_0 = new TextField();
		textField_7_0.setText("S: " + deneme.returnCombination(7));
		textField_7_0.setBounds(4, 33, 80, 20);
		panel_7_1_2_1.add(textField_7_0);
		
		textField_7_0A = new TextField();
		textField_7_0A.setText(deneme.returnValues(7));
		textField_7_0A.setBounds(4, 59, 80, 20);
		panel_7_1_2_1.add(textField_7_0A);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("select D (7)");
		lblNewLabel_1_1_1_1.setBounds(715, 449, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblAyEsGe_1_1_1_1 = new JLabel("skip D (8)");
		lblAyEsGe_1_1_1_1.setBounds(803, 449, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_1);
		
		Panel panel_7_1_1_1_1 = new Panel();
		panel_7_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_7_1_1_1_1.setBounds(793, 479, 87, 91);
		contentPane.add(panel_7_1_1_1_1);
		
		txtNe_5 = new JTextField();
		txtNe_5.setText("N: [E]");
		txtNe_5.setColumns(10);
		txtNe_5.setBounds(4, 11, 80, 20);
		panel_7_1_1_1_1.add(txtNe_5);
		
		textField_0_4 = new TextField();
		textField_0_4.setText("S: " + deneme.returnCombination(0));
		textField_0_4.setBounds(4, 33, 80, 20);
		panel_7_1_1_1_1.add(textField_0_4);
		
		textField_0_4A = new TextField();
		textField_0_4A.setText(deneme.returnValues(0));
		textField_0_4A.setBounds(4, 59, 80, 20);
		panel_7_1_1_1_1.add(textField_0_4A);
		
		Panel panel_7_1_4 = new Panel();
		panel_7_1_4.setLayout(null);
		panel_7_1_4.setBackground(Color.LIGHT_GRAY);
		panel_7_1_4.setBounds(888, 479, 87, 91);
		contentPane.add(panel_7_1_4);
		
		txtNe_6 = new JTextField();
		txtNe_6.setText("N: [E]");
		txtNe_6.setColumns(10);
		txtNe_6.setBounds(4, 11, 80, 20);
		panel_7_1_4.add(txtNe_6);
		
		textField_21_0 = new TextField();
		textField_21_0.setText("S: " + deneme.returnCombination(21));
		textField_21_0.setBounds(4, 33, 80, 20);
		panel_7_1_4.add(textField_21_0);
		
		textField_21_0A = new TextField();
		textField_21_0A.setText(deneme.returnValues(21));
		textField_21_0A.setBounds(4, 59, 80, 20);
		panel_7_1_4.add(textField_21_0A);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("select D (9)");
		lblNewLabel_1_1_3.setBounds(903, 449, 70, 28);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblAyEsGe_1_1_3 = new JLabel("skip D (10)");
		lblAyEsGe_1_1_3.setBounds(991, 449, 64, 28);
		contentPane.add(lblAyEsGe_1_1_3);
		
		Panel panel_7_1_1_3 = new Panel();
		panel_7_1_1_3.setLayout(null);
		panel_7_1_1_3.setBackground(Color.LIGHT_GRAY);
		panel_7_1_1_3.setBounds(981, 479, 87, 91);
		contentPane.add(panel_7_1_1_3);
		
		txtNe_7 = new JTextField();
		txtNe_7.setText("N: [E]");
		txtNe_7.setColumns(10);
		txtNe_7.setBounds(4, 11, 80, 20);
		panel_7_1_1_3.add(txtNe_7);
		
		textField_9_1 = new TextField();
		textField_9_1.setText("S: " + deneme.returnCombination(9));
		textField_9_1.setBounds(4, 33, 80, 20);
		panel_7_1_1_3.add(textField_9_1);
		
		textField_9_1A = new TextField();
		textField_9_1A.setText(deneme.returnValues(9));
		textField_9_1A.setBounds(4, 59, 80, 20);
		panel_7_1_1_3.add(textField_9_1A);
		
		Panel panel_7_1_2_2 = new Panel();
		panel_7_1_2_2.setLayout(null);
		panel_7_1_2_2.setBackground(Color.LIGHT_GRAY);
		panel_7_1_2_2.setBounds(1074, 479, 87, 91);
		contentPane.add(panel_7_1_2_2);
		
		txtNe_8 = new JTextField();
		txtNe_8.setText("N: [E]");
		txtNe_8.setColumns(10);
		txtNe_8.setBounds(4, 11, 80, 20);
		panel_7_1_2_2.add(txtNe_8);
		
		textField_10_0 = new TextField();
		textField_10_0.setText("S: " + deneme.returnCombination(10));
		textField_10_0.setBounds(4, 33, 80, 20);
		panel_7_1_2_2.add(textField_10_0);
		
		textField_10_0A = new TextField();
		textField_10_0A.setText(deneme.returnValues(10));
		textField_10_0A.setBounds(4, 59, 80, 20);
		panel_7_1_2_2.add(textField_10_0A);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("select D(11)");
		lblNewLabel_1_1_1_2.setBounds(1089, 449, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblAyEsGe_1_1_1_2 = new JLabel("skip D (12)");
		lblAyEsGe_1_1_1_2.setBounds(1177, 449, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_2);
		
		Panel panel_7_1_1_1_2 = new Panel();
		panel_7_1_1_1_2.setLayout(null);
		panel_7_1_1_1_2.setBackground(Color.LIGHT_GRAY);
		panel_7_1_1_1_2.setBounds(1167, 479, 87, 91);
		contentPane.add(panel_7_1_1_1_2);
		
		txtNe_9 = new JTextField();
		txtNe_9.setText("N: [E]");
		txtNe_9.setColumns(10);
		txtNe_9.setBounds(4, 11, 80, 20);
		panel_7_1_1_1_2.add(txtNe_9);
		
		textField_1_2 = new TextField();
		textField_1_2.setText("S: " + deneme.returnCombination(1));
		textField_1_2.setBounds(4, 33, 80, 20);
		panel_7_1_1_1_2.add(textField_1_2);
		
		textField_1_2A = new TextField();
		textField_1_2A.setText(deneme.returnValues(1));
		textField_1_2A.setBounds(4, 59, 80, 20);
		panel_7_1_1_1_2.add(textField_1_2A);
		
		Panel panel_7_1_3_1 = new Panel();
		panel_7_1_3_1.setLayout(null);
		panel_7_1_3_1.setBackground(Color.LIGHT_GRAY);
		panel_7_1_3_1.setBounds(1260, 479, 87, 91);
		contentPane.add(panel_7_1_3_1);
		
		txtNe_10 = new JTextField();
		txtNe_10.setText("N: [E]");
		txtNe_10.setColumns(10);
		txtNe_10.setBounds(4, 11, 80, 20);
		panel_7_1_3_1.add(txtNe_10);
		
		textField_12_0 = new TextField();
		textField_12_0.setText("S: " + deneme.returnCombination(12));
		textField_12_0.setBounds(4, 33, 80, 20);
		panel_7_1_3_1.add(textField_12_0);
		
		textField_12_0A = new TextField();
		textField_12_0A.setText(deneme.returnValues(12));
		textField_12_0A.setBounds(4, 59, 80, 20);
		panel_7_1_3_1.add(textField_12_0A);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("select D(13)");
		lblNewLabel_1_1_2_1.setBounds(1275, 449, 70, 28);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		JLabel lblAyEsGe_1_1_2_1 = new JLabel("skip D (14)");
		lblAyEsGe_1_1_2_1.setBounds(1363, 449, 64, 28);
		contentPane.add(lblAyEsGe_1_1_2_1);
		
		Panel panel_7_1_1_2_1 = new Panel();
		panel_7_1_1_2_1.setLayout(null);
		panel_7_1_1_2_1.setBackground(Color.LIGHT_GRAY);
		panel_7_1_1_2_1.setBounds(1353, 479, 87, 91);
		contentPane.add(panel_7_1_1_2_1);
		
		txtNe_11 = new JTextField();
		txtNe_11.setText("N: [E]");
		txtNe_11.setColumns(10);
		txtNe_11.setBounds(4, 11, 80, 20);
		panel_7_1_1_2_1.add(txtNe_11);
		
		textField_2_1 = new TextField();
		textField_2_1.setText("S: " + deneme.returnCombination(2));
		textField_2_1.setBounds(4, 33, 80, 20);
		panel_7_1_1_2_1.add(textField_2_1);
		
		textField_2_1A = new TextField();
		textField_2_1A.setText(deneme.returnValues(2));
		textField_2_1A.setBounds(4, 59, 80, 20);
		panel_7_1_1_2_1.add(textField_2_1A);

		
		
		Panel panel_7_1_2_1_1 = new Panel();
		panel_7_1_2_1_1.setLayout(null);
		panel_7_1_2_1_1.setBackground(Color.LIGHT_GRAY);
		panel_7_1_2_1_1.setBounds(1446, 479, 87, 91);
		contentPane.add(panel_7_1_2_1_1);
		
		txtNe_12 = new JTextField();
		txtNe_12.setText("N: [E]");
		txtNe_12.setColumns(10);
		txtNe_12.setBounds(4, 11, 80, 20);
		panel_7_1_2_1_1.add(txtNe_12);
		
		textField_3_0 = new TextField();
		textField_3_0.setText("S: " + deneme.returnCombination(3));
		textField_3_0.setBounds(4, 33, 80, 20);
		panel_7_1_2_1_1.add(textField_3_0);
		
		textField_3_0A = new TextField();
		textField_3_0A.setText(deneme.returnValues(3));
		textField_3_0A.setBounds(4, 59, 80, 20);
		panel_7_1_2_1_1.add(textField_3_0A);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("select D(15)");
		lblNewLabel_1_1_1_1_1.setBounds(1461, 449, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblAyEsGe_1_1_1_1_1 = new JLabel("skip D (16)");
		lblAyEsGe_1_1_1_1_1.setBounds(1549, 449, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_1_1);
		
		Panel panel_7_1_1_1_1_1 = new Panel();
		panel_7_1_1_1_1_1.setLayout(null);
		panel_7_1_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_7_1_1_1_1_1.setBounds(1539, 479, 87, 91);
		contentPane.add(panel_7_1_1_1_1_1);
		
		txtNe_13 = new JTextField();
		txtNe_13.setText("N: [E]");
		txtNe_13.setColumns(10);
		txtNe_13.setBounds(4, 11, 80, 20);
		panel_7_1_1_1_1_1.add(txtNe_13);
		
		TextField textField_Empty3 = new TextField();
		textField_Empty3.setText("S:[]");
		textField_Empty3.setBounds(4, 33, 80, 20);
		panel_7_1_1_1_1_1.add(textField_Empty3);
		
		TextField textField_Empty_3A = new TextField();
		textField_Empty_3A.setText("V: 0  W:0");
		textField_Empty_3A.setBounds(4, 59, 80, 20);
		panel_7_1_1_1_1_1.add(textField_Empty_3A);
		
		panel_S30 = new Panel();
		panel_S30.setLayout(null);
		panel_S30.setBackground(Color.LIGHT_GRAY);
		panel_S30.setBounds(142, 625, 87, 96);
		contentPane.add(panel_S30);
		
		txtN_2 = new JTextField();
		txtN_2.setEditable(false);
		txtN_2.setText("N: []");
		txtN_2.setColumns(10);
		txtN_2.setBounds(4, 11, 80, 20);
		panel_S30.add(txtN_2);
		
		textField_30_0 = new TextField();
		textField_30_0.setText("S:" + deneme.returnCombination(30));
		textField_30_0.setBounds(4, 33, 80, 20);
		panel_S30.add(textField_30_0);
		
		textField_30_0A = new TextField();
		textField_30_0A.setEditable(false);
		textField_30_0A.setText(deneme.returnValues(30));
		textField_30_0A.setBounds(4, 59, 80, 20);
		panel_S30.add(textField_30_0A);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("select E (1)");
		lblNewLabel_1_1_4.setBounds(157, 595, 70, 28);
		contentPane.add(lblNewLabel_1_1_4);
		
		JLabel lblAyEsGe_1_1_4 = new JLabel("skip E (1)");
		lblAyEsGe_1_1_4.setBounds(245, 595, 64, 28);
		contentPane.add(lblAyEsGe_1_1_4);
		
		panel_S25 = new Panel();
		panel_S25.setLayout(null);
		panel_S25.setBackground(Color.LIGHT_GRAY);
		panel_S25.setBounds(235, 625, 87, 96);
		contentPane.add(panel_S25);
		
		txtN_18 = new JTextField();
		txtN_18.setEditable(false);
		txtN_18.setText("N: []");
		txtN_18.setColumns(10);
		txtN_18.setBounds(4, 11, 80, 20);
		panel_S25.add(txtN_18);
		
		textField_25_1 = new TextField();
		textField_25_1.setText("S: " + deneme.returnCombination(25));
		textField_25_1.setBounds(4, 33, 80, 20);
		panel_S25.add(textField_25_1);
		
		textField_25_1A = new TextField();
		textField_25_1A.setText(deneme.returnValues(25));
		textField_25_1A.setBounds(4, 59, 80, 20);
		panel_S25.add(textField_25_1A);
		
		panel_S26 = new Panel();
		panel_S26.setLayout(null);
		panel_S26.setBackground(Color.LIGHT_GRAY);
		panel_S26.setBounds(328, 625, 87, 96);
		contentPane.add(panel_S26);
		
		txtN_19 = new JTextField();
		txtN_19.setText("N: []");
		txtN_19.setColumns(10);
		txtN_19.setBounds(4, 11, 80, 20);
		panel_S26.add(txtN_19);
		
		textField_26_0 = new TextField();
		textField_26_0.setText("S: " + deneme.returnCombination(26));
		textField_26_0.setBounds(4, 33, 80, 20);
		panel_S26.add(textField_26_0);
		
		textField_26_0A = new TextField();
		textField_26_0A.setText(deneme.returnValues(26));
		textField_26_0A.setBounds(4, 59, 80, 20);
		panel_S26.add(textField_26_0A);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("select E (2)");
		lblNewLabel_1_1_1_3.setBounds(343, 595, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		JLabel lblAyEsGe_1_1_1_3 = new JLabel("skip E (2)");
		lblAyEsGe_1_1_1_3.setBounds(431, 595, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_3);
		
		panel_S15 = new Panel();
		panel_S15.setLayout(null);
		panel_S15.setBackground(Color.LIGHT_GRAY);
		panel_S15.setBounds(421, 625, 87, 96);
		contentPane.add(panel_S15);
		
		txtN_20 = new JTextField();
		txtN_20.setText("N: []");
		txtN_20.setColumns(10);
		txtN_20.setBounds(4, 11, 80, 20);
		panel_S15.add(txtN_20);
		
		textField_15_1 = new TextField();
		textField_15_1.setText("S: " + deneme.returnCombination(15));
		textField_15_1.setBounds(4, 33, 80, 20);
		panel_S15.add(textField_15_1);
		
		textField_15_1A = new TextField();
		textField_15_1A.setText(deneme.returnValues(15));
		textField_15_1A.setBounds(4, 59, 80, 20);
		panel_S15.add(textField_15_1A);
		
		panel_S27 = new Panel();
		panel_S27.setLayout(null);
		panel_S27.setBackground(Color.LIGHT_GRAY);
		panel_S27.setBounds(514, 625, 87, 96);
		contentPane.add(panel_S27);
		
		txtN_21 = new JTextField();
		txtN_21.setText("N: []");
		txtN_21.setColumns(10);
		txtN_21.setBounds(4, 11, 80, 20);
		panel_S27.add(txtN_21);
		
		textField_27_0 = new TextField();
		textField_27_0.setText("S: " + deneme.returnCombination(27));
		textField_27_0.setBounds(4, 33, 80, 20);
		panel_S27.add(textField_27_0);
		
		textField_27_0A = new TextField();
		textField_27_0A.setText(deneme.returnValues(27));
		textField_27_0A.setBounds(4, 59, 80, 20);
		panel_S27.add(textField_27_0A);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("select E (3)");
		lblNewLabel_1_1_2_2.setBounds(529, 595, 70, 28);
		contentPane.add(lblNewLabel_1_1_2_2);
		
		JLabel lblAyEsGe_1_1_2_2 = new JLabel("skip E (3)");
		lblAyEsGe_1_1_2_2.setBounds(617, 595, 64, 28);
		contentPane.add(lblAyEsGe_1_1_2_2);
		
		panel_S16 = new Panel();
		panel_S16.setLayout(null);
		panel_S16.setBackground(Color.LIGHT_GRAY);
		panel_S16.setBounds(607, 625, 87, 96);
		contentPane.add(panel_S16);
		
		txtN_22 = new JTextField();
		txtN_22.setText("N: []");
		txtN_22.setColumns(10);
		txtN_22.setBounds(4, 11, 80, 20);
		panel_S16.add(txtN_22);
		
		textField_16_1 = new TextField();
		textField_16_1.setText("S: " + deneme.returnCombination(16));
		textField_16_1.setBounds(4, 33, 80, 20);
		panel_S16.add(textField_16_1);
		
		textField_16_1A = new TextField();
		textField_16_1A.setText(deneme.returnValues(16));
		textField_16_1A.setBounds(4, 59, 80, 20);
		panel_S16.add(textField_16_1A);
		
		panel_S17 = new Panel();
		panel_S17.setLayout(null);
		panel_S17.setBackground(Color.LIGHT_GRAY);
		panel_S17.setBounds(700, 625, 87, 96);
		contentPane.add(panel_S17);
		
		txtN_23 = new JTextField();
		txtN_23.setText("N: []");
		txtN_23.setColumns(10);
		txtN_23.setBounds(4, 11, 80, 20);
		panel_S17.add(txtN_23);
		
		textField_17_0 = new TextField();
		textField_17_0.setText("S: " + deneme.returnCombination(17));
		textField_17_0.setBounds(4, 33, 80, 20);
		panel_S17.add(textField_17_0);
		
		textField_17_0A = new TextField();
		textField_17_0A.setText(deneme.returnValues(17));
		textField_17_0A.setBounds(4, 59, 80, 20);
		panel_S17.add(textField_17_0A);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("select E (4)");
		lblNewLabel_1_1_1_1_2.setBounds(715, 595, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblAyEsGe_1_1_1_1_2 = new JLabel("skip E (4)");
		lblAyEsGe_1_1_1_1_2.setBounds(803, 595, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_1_2);
		
		panel_S5 = new Panel();
		panel_S5.setLayout(null);
		panel_S5.setBackground(Color.LIGHT_GRAY);
		panel_S5.setBounds(793, 625, 87, 96);
		contentPane.add(panel_S5);
		
		txtN_24 = new JTextField();
		txtN_24.setText("N: []");
		txtN_24.setColumns(10);
		txtN_24.setBounds(4, 11, 80, 20);
		panel_S5.add(txtN_24);
		
		textField_5_3 = new TextField();
		textField_5_3.setText("S: " + deneme.returnCombination(5));
		textField_5_3.setBounds(4, 33, 80, 20);
		panel_S5.add(textField_5_3);
		
		textField_5_3A = new TextField();
		textField_5_3A.setText(deneme.returnValues(5));
		textField_5_3A.setBounds(4, 59, 80, 20);
		panel_S5.add(textField_5_3A);
		
		panel_S28 = new Panel();
		panel_S28.setLayout(null);
		panel_S28.setBackground(Color.LIGHT_GRAY);
		panel_S28.setBounds(888, 625, 87, 96);
		contentPane.add(panel_S28);
		
		txtN_16 = new JTextField();
		txtN_16.setText("N: []");
		txtN_16.setEditable(false);
		txtN_16.setColumns(10);
		txtN_16.setBounds(4, 11, 80, 20);
		panel_S28.add(txtN_16);
		
		textField_28_0 = new TextField();
		textField_28_0.setText("S: " + deneme.returnCombination(28));
		textField_28_0.setEditable(false);
		textField_28_0.setBounds(4, 33, 80, 20);
		panel_S28.add(textField_28_0);
		
		textField_28_0A = new TextField();
		textField_28_0A.setText(deneme.returnValues(28));
		textField_28_0A.setEditable(false);
		textField_28_0A.setBounds(4, 59, 80, 20);
		panel_S28.add(textField_28_0A);
		
		JLabel lblNewLabel_1_1_4_1 = new JLabel("select E (5)");
		lblNewLabel_1_1_4_1.setBounds(903, 595, 70, 28);
		contentPane.add(lblNewLabel_1_1_4_1);
		
		JLabel lblAyEsGe_1_1_4_1 = new JLabel("skip E (5)");
		lblAyEsGe_1_1_4_1.setBounds(991, 595, 64, 28);
		contentPane.add(lblAyEsGe_1_1_4_1);
		
		panel_S18 = new Panel();
		panel_S18.setLayout(null);
		panel_S18.setBackground(Color.LIGHT_GRAY);
		panel_S18.setBounds(981, 625, 87, 96);
		contentPane.add(panel_S18);
		
		txtN_15 = new JTextField();
		txtN_15.setText("N: []");
		txtN_15.setEditable(false);
		txtN_15.setColumns(10);
		txtN_15.setBounds(4, 11, 80, 20);
		panel_S18.add(txtN_15);
		
		textField_18_1 = new TextField();
		textField_18_1.setText("S: " + deneme.returnCombination(18));
		textField_18_1.setBounds(4, 33, 80, 20);
		panel_S18.add(textField_18_1);
		
		textField_18_1A = new TextField();
		textField_18_1A.setText(deneme.returnValues(18));
		textField_18_1A.setBounds(4, 59, 80, 20);
		panel_S18.add(textField_18_1A);
		
		panel_S19 = new Panel();
		panel_S19.setLayout(null);
		panel_S19.setBackground(Color.LIGHT_GRAY);
		panel_S19.setBounds(1074, 625, 87, 96);
		contentPane.add(panel_S19);
		
		txtN_13 = new JTextField();
		txtN_13.setText("N: []");
		txtN_13.setColumns(10);
		txtN_13.setBounds(4, 11, 80, 20);
		panel_S19.add(txtN_13);
		
		textField_19_0 = new TextField();
		textField_19_0.setText("S: " + deneme.returnCombination(19));
		textField_19_0.setBounds(4, 33, 80, 20);
		panel_S19.add(textField_19_0);
		
		textField_19_0A = new TextField();
		textField_19_0A.setText(deneme.returnValues(19));
		textField_19_0A.setBounds(4, 59, 80, 20);
		panel_S19.add(textField_19_0A);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("select E (6)");
		lblNewLabel_1_1_1_3_1.setBounds(1089, 595, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_3_1);
		
		JLabel lblAyEsGe_1_1_1_3_1 = new JLabel("skip E (6)");
		lblAyEsGe_1_1_1_3_1.setBounds(1177, 595, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_3_1);
		
		panel_S6 = new Panel();
		panel_S6.setLayout(null);
		panel_S6.setBackground(Color.LIGHT_GRAY);
		panel_S6.setBounds(1167, 625, 87, 96);
		contentPane.add(panel_S6);
		
		txtN_7 = new JTextField();
		txtN_7.setText("N: []");
		txtN_7.setColumns(10);
		txtN_7.setBounds(4, 11, 80, 20);
		panel_S6.add(txtN_7);
		
		textField_6_2 = new TextField();
		textField_6_2.setText("S: " + deneme.returnCombination(6));
		textField_6_2.setBounds(4, 33, 80, 20);
		panel_S6.add(textField_6_2);
		
		textField_6_2A = new TextField();
		textField_6_2A.setText(deneme.returnValues(6));
		textField_6_2A.setBounds(4, 59, 80, 20);
		panel_S6.add(textField_6_2A);
		
		panel_S20 = new Panel();
		panel_S20.setLayout(null);
		panel_S20.setBackground(Color.LIGHT_GRAY);
		panel_S20.setBounds(1260, 625, 87, 96);
		contentPane.add(panel_S20);
		
		txtN_6 = new JTextField();
		txtN_6.setText("N: []");
		txtN_6.setColumns(10);
		txtN_6.setBounds(4, 11, 80, 20);
		panel_S20.add(txtN_6);
		
		textField_20_0 = new TextField();
		textField_20_0.setText("S: " + deneme.returnCombination(20));
		textField_20_0.setBounds(4, 33, 80, 20);
		panel_S20.add(textField_20_0);
		
		textField_20_0A = new TextField();
		textField_20_0A.setText(deneme.returnValues(20));
		textField_20_0A.setBounds(4, 59, 80, 20);
		panel_S20.add(textField_20_0A);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("select E (7)");
		lblNewLabel_1_1_2_2_1.setBounds(1275, 595, 70, 28);
		contentPane.add(lblNewLabel_1_1_2_2_1);
		
		JLabel lblAyEsGe_1_1_2_2_1 = new JLabel("skip E (7)");
		lblAyEsGe_1_1_2_2_1.setBounds(1363, 595, 64, 28);
		contentPane.add(lblAyEsGe_1_1_2_2_1);
		
		panel_S7 = new Panel();
		panel_S7.setLayout(null);
		panel_S7.setBackground(Color.LIGHT_GRAY);
		panel_S7.setBounds(1353, 625, 87, 96);
		contentPane.add(panel_S7);
		
		txtN_5 = new JTextField();
		txtN_5.setText("N: []");
		txtN_5.setColumns(10);
		txtN_5.setBounds(4, 11, 80, 20);
		panel_S7.add(txtN_5);
		
		textField_7_1 = new TextField();
		textField_7_1.setText("S: " + deneme.returnCombination(7));
		textField_7_1.setBounds(4, 33, 80, 20);
		panel_S7.add(textField_7_1);
		
		textField_7_1A = new TextField();
		textField_7_1A.setText(deneme.returnValues(7));
		textField_7_1A.setBounds(4, 59, 80, 20);
		panel_S7.add(textField_7_1A);
		
		panel_S8 = new Panel();
		panel_S8.setLayout(null);
		panel_S8.setBackground(Color.LIGHT_GRAY);
		panel_S8.setBounds(1446, 625, 87, 96);
		contentPane.add(panel_S8);
		
		txtN_4 = new JTextField();
		txtN_4.setText("N: []");
		txtN_4.setColumns(10);
		txtN_4.setBounds(4, 11, 80, 20);
		panel_S8.add(txtN_4);
		
		textField_8_0 = new TextField();
		textField_8_0.setText("S:" + deneme.returnCombination(8));
		textField_8_0.setBounds(4, 33, 80, 20);
		panel_S8.add(textField_8_0);
		
		textField_8_0A = new TextField();
		textField_8_0A.setText(deneme.returnValues(8));
		textField_8_0A.setBounds(4, 59, 80, 20);
		panel_S8.add(textField_8_0A);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("select E (8)");
		lblNewLabel_1_1_1_1_2_1.setBounds(1461, 595, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblAyEsGe_1_1_1_1_2_1 = new JLabel("skip E (8)");
		lblAyEsGe_1_1_1_1_2_1.setBounds(1549, 595, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_1_2_1);
		
		panel_S0 = new Panel();
		panel_S0.setLayout(null);
		panel_S0.setBackground(Color.LIGHT_GRAY);
		panel_S0.setBounds(1539, 625, 87, 96);
		contentPane.add(panel_S0);
		
		txtN_3 = new JTextField();
		txtN_3.setText("N: []");
		txtN_3.setColumns(10);
		txtN_3.setBounds(4, 11, 80, 20);
		panel_S0.add(txtN_3);
		
		textField_0_5 = new TextField();
		textField_0_5.setText("S: " + deneme.returnCombination(0));
		textField_0_5.setBounds(4, 33, 80, 20);
		panel_S0.add(textField_0_5);
		
		textField_0_5A = new TextField();
		textField_0_5A.setText(deneme.returnValues(0));
		textField_0_5A.setBounds(4, 59, 80, 20);
		panel_S0.add(textField_0_5A);
		
		panel_S29 = new Panel();
		panel_S29.setLayout(null);
		panel_S29.setBackground(Color.LIGHT_GRAY);
		panel_S29.setBounds(142, 800, 87, 96);
		contentPane.add(panel_S29);
		
		txtN_32 = new JTextField();
		txtN_32.setText("N: []");
		txtN_32.setColumns(10);
		txtN_32.setBounds(4, 11, 80, 20);
		panel_S29.add(txtN_32);
		
		textField_29_0 = new TextField();
		textField_29_0.setText("S:" + deneme.returnCombination(29));
		textField_29_0.setBounds(4, 33, 80, 20);
		panel_S29.add(textField_29_0);
		
		textField_29_0A = new TextField();
		textField_29_0A.setText(deneme.returnValues(29));
		textField_29_0A.setEditable(false);
		textField_29_0A.setBounds(4, 59, 80, 20);
		panel_S29.add(textField_29_0A);
		
		panel_S21 = new Panel();
		panel_S21.setLayout(null);
		panel_S21.setBackground(Color.LIGHT_GRAY);
		panel_S21.setBounds(235, 800, 87, 96);
		contentPane.add(panel_S21);
		
		txtN_31 = new JTextField();
		txtN_31.setText("N: []");
		txtN_31.setEditable(false);
		txtN_31.setColumns(10);
		txtN_31.setBounds(4, 11, 80, 20);
		panel_S21.add(txtN_31);
		
		textField_21_1 = new TextField();
		textField_21_1.setText("S: " + deneme.returnCombination(21));
		textField_21_1.setBounds(4, 33, 80, 20);
		panel_S21.add(textField_21_1);
		
		textField_21_1A = new TextField();
		textField_21_1A.setText(deneme.returnValues(21));
		textField_21_1A.setBounds(4, 59, 80, 20);
		panel_S21.add(textField_21_1A);
		
		panel_S22 = new Panel();
		panel_S22.setLayout(null);
		panel_S22.setBackground(Color.LIGHT_GRAY);
		panel_S22.setBounds(328, 800, 87, 96);
		contentPane.add(panel_S22);
		
		txtN_30 = new JTextField();
		txtN_30.setText("N: []");
		txtN_30.setColumns(10);
		txtN_30.setBounds(4, 11, 80, 20);
		panel_S22.add(txtN_30);
		
		textField_22_0 = new TextField();
		textField_22_0.setText("S: " + deneme.returnCombination(22));
		textField_22_0.setBounds(4, 33, 80, 20);
		panel_S22.add(textField_22_0);
		
		textField_22_0A = new TextField();
		textField_22_0A.setText(deneme.returnValues(22));
		textField_22_0A.setBounds(4, 59, 80, 20);
		panel_S22.add(textField_22_0A);
		
		panel_S9 = new Panel();
		panel_S9.setLayout(null);
		panel_S9.setBackground(Color.LIGHT_GRAY);
		panel_S9.setBounds(421, 800, 87, 96);
		contentPane.add(panel_S9);
		
		txtN_29 = new JTextField();
		txtN_29.setText("N: []");
		txtN_29.setColumns(10);
		txtN_29.setBounds(4, 11, 80, 20);
		panel_S9.add(txtN_29);
		
		textField_9_2 = new TextField();
		textField_9_2.setText("S: " + deneme.returnCombination(9));
		textField_9_2.setBounds(4, 33, 80, 20);
		panel_S9.add(textField_9_2);
		
		textField_9_2A = new TextField();
		textField_9_2A.setText(deneme.returnValues(9));
		textField_9_2A.setBounds(4, 59, 80, 20);
		panel_S9.add(textField_9_2A);
		
		panel_S23 = new Panel();
		panel_S23.setLayout(null);
		panel_S23.setBackground(Color.LIGHT_GRAY);
		panel_S23.setBounds(514, 800, 87, 96);
		contentPane.add(panel_S23);
		
		txtN_28 = new JTextField();
		txtN_28.setText("N: []");
		txtN_28.setColumns(10);
		txtN_28.setBounds(4, 11, 80, 20);
		panel_S23.add(txtN_28);
		
		textField_23_0 = new TextField();
		textField_23_0.setText("S: " + deneme.returnCombination(23));
		textField_23_0.setBounds(4, 33, 80, 20);
		panel_S23.add(textField_23_0);
		
		textField_23_0A = new TextField();
		textField_23_0A.setText(deneme.returnValues(23));
		textField_23_0A.setBounds(4, 59, 80, 20);
		panel_S23.add(textField_23_0A);
		
		panel_S10 = new Panel();
		panel_S10.setLayout(null);
		panel_S10.setBackground(Color.LIGHT_GRAY);
		panel_S10.setBounds(607, 800, 87, 96);
		contentPane.add(panel_S10);
		
		txtN_27 = new JTextField();
		txtN_27.setText("N: []");
		txtN_27.setColumns(10);
		txtN_27.setBounds(4, 11, 80, 20);
		panel_S10.add(txtN_27);
		
		textField_10_1 = new TextField();
		textField_10_1.setText("S: " + deneme.returnCombination(10));
		textField_10_1.setBounds(4, 33, 80, 20);
		panel_S10.add(textField_10_1);
		
		textField_10_1A = new TextField();
		textField_10_1A.setText(deneme.returnValues(10));
		textField_10_1A.setBounds(4, 59, 80, 20);
		panel_S10.add(textField_10_1A);
		
		panel_S11 = new Panel();
		panel_S11.setLayout(null);
		panel_S11.setBackground(Color.LIGHT_GRAY);
		panel_S11.setBounds(700, 800, 87, 96);
		contentPane.add(panel_S11);
		
		txtN_26 = new JTextField();
		txtN_26.setText("N: []");
		txtN_26.setColumns(10);
		txtN_26.setBounds(4, 11, 80, 20);
		panel_S11.add(txtN_26);
		
		textField_11_0 = new TextField();
		textField_11_0.setText("S: " + deneme.returnCombination(11));
		textField_11_0.setBounds(4, 33, 80, 20);
		panel_S11.add(textField_11_0);
		
		textField_11_0A = new TextField();
		textField_11_0A.setText(deneme.returnValues(11));
		textField_11_0A.setBounds(4, 59, 80, 20);
		panel_S11.add(textField_11_0A);
		
		panel_S1 = new Panel();
		panel_S1.setLayout(null);
		panel_S1.setBackground(Color.LIGHT_GRAY);
		panel_S1.setBounds(793, 800, 87, 96);
		contentPane.add(panel_S1);
		
		txtN_25 = new JTextField();
		txtN_25.setText("N: []");
		txtN_25.setColumns(10);
		txtN_25.setBounds(4, 11, 80, 20);
		panel_S1.add(txtN_25);
		
		textField_1_3 = new TextField();
		textField_1_3.setText("S: " + deneme.returnCombination(1));
		textField_1_3.setBounds(4, 33, 80, 20);
		panel_S1.add(textField_1_3);
		
		textField_1_3A = new TextField();
		textField_1_3A.setText(deneme.returnValues(1));
		textField_1_3A.setBounds(4, 59, 80, 20);
		panel_S1.add(textField_1_3A);
		
		panel_S24 = new Panel();
		panel_S24.setLayout(null);
		panel_S24.setBackground(Color.LIGHT_GRAY);
		panel_S24.setBounds(888, 800, 87, 96);
		contentPane.add(panel_S24);
		
		txtN_17 = new JTextField();
		txtN_17.setText("N: []");
		txtN_17.setEditable(false);
		txtN_17.setColumns(10);
		txtN_17.setBounds(4, 11, 80, 20);
		panel_S24.add(txtN_17);
		
		textField_24_0 = new TextField();
		textField_24_0.setText("S: " + deneme.returnCombination(24));
		textField_24_0.setEditable(false);
		textField_24_0.setBounds(4, 33, 80, 20);
		panel_S24.add(textField_24_0);
		
		textField_24_0A = new TextField();
		textField_24_0A.setText(deneme.returnValues(24));
		textField_24_0A.setEditable(false);
		textField_24_0A.setBounds(4, 59, 80, 20);
		panel_S24.add(textField_24_0A);
		
		panel_S12 = new Panel();
		panel_S12.setLayout(null);
		panel_S12.setBackground(Color.LIGHT_GRAY);
		panel_S12.setBounds(981, 800, 87, 96);
		contentPane.add(panel_S12);
		
		txtN_14 = new JTextField();
		txtN_14.setText("N: []");
		txtN_14.setEditable(false);
		txtN_14.setColumns(10);
		txtN_14.setBounds(4, 11, 80, 20);
		panel_S12.add(txtN_14);
		
		textField_12_1 = new TextField();
		textField_12_1.setText("S: " + deneme.returnCombination(12));
		textField_12_1.setBounds(4, 33, 80, 20);
		panel_S12.add(textField_12_1);
		
		textField_12_1A = new TextField();
		textField_12_1A.setText(deneme.returnValues(12));
		textField_12_1A.setBounds(4, 59, 80, 20);
		panel_S12.add(textField_12_1A);
		
		panel_S13 = new Panel();
		panel_S13.setLayout(null);
		panel_S13.setBackground(Color.LIGHT_GRAY);
		panel_S13.setBounds(1074, 800, 87, 96);
		contentPane.add(panel_S13);
		
		txtNabcde = new JTextField();
		txtNabcde.setText("N:[]");
		txtNabcde.setColumns(10);
		txtNabcde.setBounds(4, 11, 80, 20);
		panel_S13.add(txtNabcde);
		
		textField_13_0 = new TextField();
		textField_13_0.setText("S: " + deneme.returnCombination(13));
		textField_13_0.setBounds(4, 33, 80, 20);
		panel_S13.add(textField_13_0);
		
		textField_13_0A = new TextField();
		textField_13_0A.setText(deneme.returnValues(13));
		textField_13_0A.setBounds(4, 59, 80, 20);
		panel_S13.add(textField_13_0A);
		
		panel_S2 = new Panel();
		panel_S2.setLayout(null);
		panel_S2.setBackground(Color.LIGHT_GRAY);
		panel_S2.setBounds(1167, 800, 87, 96);
		contentPane.add(panel_S2);
		
		txtN_12 = new JTextField();
		txtN_12.setText("N: []");
		txtN_12.setColumns(10);
		txtN_12.setBounds(4, 11, 80, 20);
		panel_S2.add(txtN_12);
		
		textField_2_2 = new TextField();
		textField_2_2.setText("S: " + deneme.returnCombination(2));
		textField_2_2.setBounds(4, 33, 80, 20);
		panel_S2.add(textField_2_2);
		
		textField_2_2A = new TextField();
		textField_2_2A.setText(deneme.returnValues(2));
		textField_2_2A.setBounds(4, 59, 80, 20);
		panel_S2.add(textField_2_2A);
		
		panel_S14 = new Panel();
		panel_S14.setLayout(null);
		panel_S14.setBackground(Color.LIGHT_GRAY);
		panel_S14.setBounds(1260, 800, 87, 96);
		contentPane.add(panel_S14);
		
		txtN_11 = new JTextField();
		txtN_11.setText("N: []");
		txtN_11.setColumns(10);
		txtN_11.setBounds(4, 11, 80, 20);
		panel_S14.add(txtN_11);
		
		textField_14_0 = new TextField();
		textField_14_0.setText("S: " + deneme.returnCombination(14));
		textField_14_0.setBounds(4, 33, 80, 20);
		panel_S14.add(textField_14_0);
		
		textField_14_0A = new TextField();
		textField_14_0A.setText(deneme.returnValues(14));
		textField_14_0A.setBounds(4, 59, 80, 20);
		panel_S14.add(textField_14_0A);
		
		JLabel lblNewLabel_1_1_2_2_3 = new JLabel("select E (15)");
		lblNewLabel_1_1_2_2_3.setBounds(1275, 770, 70, 28);
		contentPane.add(lblNewLabel_1_1_2_2_3);
		
		JLabel lblAyEsGe_1_1_2_2_3 = new JLabel("skip E (15)");
		lblAyEsGe_1_1_2_2_3.setBounds(1363, 770, 64, 28);
		contentPane.add(lblAyEsGe_1_1_2_2_3);
		
		panel_S3 = new Panel();
		panel_S3.setLayout(null);
		panel_S3.setBackground(Color.LIGHT_GRAY);
		panel_S3.setBounds(1353, 800, 87, 96);
		contentPane.add(panel_S3);
		
		txtN_10 = new JTextField();
		txtN_10.setText("N: []");
		txtN_10.setColumns(10);
		txtN_10.setBounds(4, 11, 80, 20);
		panel_S3.add(txtN_10);
		
		textField_3_1 = new TextField();
		textField_3_1.setText("S: " + deneme.returnCombination(3));
		textField_3_1.setBounds(4, 33, 80, 20);
		panel_S3.add(textField_3_1);
		
		textField_3_1A = new TextField();
		textField_3_1A.setText(deneme.returnValues(3));
		textField_3_1A.setBounds(4, 59, 80, 20);
		panel_S3.add(textField_3_1A);
		
		panel_S4 = new Panel();
		panel_S4.setLayout(null);
		panel_S4.setBackground(Color.LIGHT_GRAY);
		panel_S4.setBounds(1446, 800, 87, 96);
		contentPane.add(panel_S4);
		
		txtN_9 = new JTextField();
		txtN_9.setText("N: []");
		txtN_9.setColumns(10);
		txtN_9.setBounds(4, 11, 80, 20);
		panel_S4.add(txtN_9);
		
		textField_4_0 = new TextField();
		textField_4_0.setText("S: " + deneme.returnCombination(4));
		textField_4_0.setBounds(4, 33, 80, 20);
		panel_S4.add(textField_4_0);
		
		textField_4_0A = new TextField();
		textField_4_0A.setText(deneme.returnValues(4));
		textField_4_0A.setBounds(4, 59, 80, 20);
		panel_S4.add(textField_4_0A);
		
		JLabel lblNewLabel_1_1_1_1_2_3 = new JLabel("select E (16)");
		lblNewLabel_1_1_1_1_2_3.setBounds(1461, 770, 70, 28);
		contentPane.add(lblNewLabel_1_1_1_1_2_3);
		
		JLabel lblAyEsGe_1_1_1_1_2_3 = new JLabel("skip E (16)");
		lblAyEsGe_1_1_1_1_2_3.setBounds(1549, 770, 64, 28);
		contentPane.add(lblAyEsGe_1_1_1_1_2_3);
		
		panel_SE = new Panel();
		panel_SE.setLayout(null);
		panel_SE.setBackground(Color.LIGHT_GRAY);
		panel_SE.setBounds(1539, 800, 87, 96);
		contentPane.add(panel_SE);
		
		txtN_8 = new JTextField();
		txtN_8.setText("N: []");
		txtN_8.setColumns(10);
		txtN_8.setBounds(4, 11, 80, 20);
		panel_SE.add(txtN_8);
		
		TextField textField_Empty_4 = new TextField();
		textField_Empty_4.setText("S:[]");
		textField_Empty_4.setBounds(4, 33, 80, 20);
		panel_SE.add(textField_Empty_4);
		
		TextField textField_Empty_4A = new TextField();
		textField_Empty_4A.setText("V: 0  W:0");
		textField_Empty_4A.setBounds(4, 59, 80, 20);
		panel_SE.add(textField_Empty_4A);
		
		panel_1B = new Panel();
		panel_1B.setLayout(null);
		panel_1B.setBackground(Color.LIGHT_GRAY);
		panel_1B.setBounds(1461, 35, 147, 91);
		contentPane.add(panel_1B);
		
		txtNesneler = new JTextField();
		txtNesneler.setText("Nesneler: []");
		txtNesneler.setColumns(10);
		txtNesneler.setBounds(10, 7, 126, 20);
		panel_1B.add(txtNesneler);
		
		textField_1_B = new TextField();
		textField_1_B.setText("Secilenler: []");
		textField_1_B.setBounds(10, 33, 126, 20);
		panel_1B.add(textField_1_B);
		
		textField_1_BA = new TextField();
		textField_1_BA.setText("V: 0  W:0");
		textField_1_BA.setBounds(10, 59, 126, 20);
		panel_1B.add(textField_1_BA);
		
	}
}
