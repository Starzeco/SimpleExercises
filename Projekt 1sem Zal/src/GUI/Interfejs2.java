package GUI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


import Ogrodnik.Ogrodnik;

import Rosliny.Roslina;
import Sposoby.Sposob_na_pielegnacje1;
import Sposoby.Sposob_na_pielegnacje2;
public class Interfejs2 {

	JFrame ramka=new JFrame("Projekt");
	JFrame ramka3=new JFrame("Zmiana Sposobu");
	//Panele
	JPanel paneld=new JPanel();
	JPanel panel3a=new JPanel();
	
	JPanel panelc=new JPanel();
	JPanel panelœrod=new JPanel();
	JPanel panelœrod2=new JPanel();
	JPanel panelœrod3=new JPanel();
	
	JPanel panelœrod4=new JPanel();
	JPanel panelœrod5=new JPanel();
	JPanel panelœrod6=new JPanel();
	JPanel panelœrod7=new JPanel();
	JPanel panelœrod8=new JPanel();
	JPanel panelœrod9=new JPanel();
	//DOKOÑczyc update chyba dokoñczone xD
	
	JPanel panel=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	JPanel panel4=new JPanel();
	JPanel panel5=new JPanel();
	JPanel panel6=new JPanel();
	JPanel panel7=new JPanel();
	JPanel panel8=new JPanel();
	JPanel panel9=new JPanel();
	JPanel panel10=new JPanel();
	JPanel panel11=new JPanel();
	
	
	JPanel panel12=new JPanel();
	JPanel panel13=new JPanel();
	JPanel panel14=new JPanel();
	JPanel panel15=new JPanel();
	JPanel panel16=new JPanel();
	JPanel panel17=new JPanel();
	
	JPanel panel18=new JPanel();
	JPanel panel19=new JPanel();
	JPanel panel20=new JPanel();
	
	//panel do zmiany sposobu
	JPanel panel21=new JPanel();
	JPanel panel22=new JPanel();
	JLabel label20=new JLabel("Nazwa");
	JTextField field16=new JTextField(10);
	JButton przycisk=new JButton("Wybierz");
	JButton przycisk2=new JButton("Anuluj");
	
	//Arey
	JTextArea area;
	JTextArea area2;
	//Fieldy
	
	JTextField field=new JTextField(10);
	JTextField field2=new JTextField(10);
	JTextField field3=new JTextField(10);
	JTextField field4=new JTextField(10);
	JTextField field5=new JTextField(10);
	JTextField field6=new JTextField(10);
	
	JTextField field7=new JTextField(10);
	JTextField field8=new JTextField(10);
	JTextField field9=new JTextField(10);
	JTextField field10=new JTextField(10);
	JTextField field11=new JTextField(10);
	JTextField field12=new JTextField(10);
	
	JTextField field13=new JTextField(7);
	JTextField field14=new JTextField(7);
	JTextField field15=new JTextField(7);
	
	//Przyciski
	JButton dodaj=new JButton("Dodaj");
	JButton dodaj2=new JButton("Dodaj");
	
	JButton usun=new JButton("Usuñ");
	JButton sprawdz=new JButton("Sprawdz");
	JButton szukaj=new JButton("Szukaj");
	//Menu
	JMenuBar menu=new JMenuBar();
	JMenu menu2=new JMenu("Wyœwietlanie");
	JMenuItem wyœwietlanieP=new JMenuItem("Wyœwietl Roœliny");
	JMenuItem wyœwietlanieK=new JMenuItem("Wyœwietl Kaktusy");
	JMenu menu3=new JMenu("Pielêgnacja");
	JMenuItem zmiana=new JMenuItem("Zmiana Sposobu");
	JMenuItem wyœwietlanieS=new JMenuItem("Wyœwietlanie Sposobów");
	JMenu menu4=new JMenu("Zapisz");
	JMenuItem zapisz=new JMenuItem("Zapisz");
	
	//Zmienianie sposobu
		JCheckBox sposob1=new JCheckBox("Sposób1");
		JCheckBox sposob2=new JCheckBox("Sposób2");
	
	public void doDziela2() {
		ramka.setJMenuBar(menu);
		menu.add(menu2);
		menu2.add(wyœwietlanieP);
		wyœwietlanieP.addActionListener(new Odp1());
		
		menu.add(menu3);
		menu3.add(zmiana);
		zmiana.addActionListener(new Odp8());
		// JESZCZE TUTAJ @@@@@@@ ODpowiedz Update chyba ju¿ zrobione 
		/*menu3.add(wyœwietlanieS);
		wyœwietlanieS.addActionListener(new Odp8());
		menu.add(menu4);
		menu4.add(zapisz);*/
		
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setVisible(true);
		ramka.setSize(1000, 450);
		ramka.setLocation(450,275);
		ramka.getContentPane().add(BorderLayout.EAST,panel);
		ramka.getContentPane().add(BorderLayout.WEST,panel2);
		ramka.getContentPane().add(BorderLayout.SOUTH,paneld);
		ramka.getContentPane().add(BorderLayout.CENTER,panelc);
		
		panelc.setLayout(new BoxLayout(panelc, BoxLayout.Y_AXIS));
		paneld.setLayout(new BoxLayout(paneld, BoxLayout.Y_AXIS));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
		panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
		panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));
		panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));
		panel9.setLayout(new BoxLayout(panel9, BoxLayout.Y_AXIS));
		panel10.setLayout(new BoxLayout(panel10, BoxLayout.Y_AXIS));
		
		panel12.setLayout(new BoxLayout(panel12, BoxLayout.Y_AXIS));
		panel13.setLayout(new BoxLayout(panel13, BoxLayout.Y_AXIS));
		panel14.setLayout(new BoxLayout(panel14, BoxLayout.Y_AXIS));
		panel15.setLayout(new BoxLayout(panel15, BoxLayout.Y_AXIS));
		panel16.setLayout(new BoxLayout(panel16, BoxLayout.Y_AXIS));
		panel17.setLayout(new BoxLayout(panel17, BoxLayout.Y_AXIS));
		
		panel18.setLayout(new BoxLayout(panel18, BoxLayout.Y_AXIS));
		panel19.setLayout(new BoxLayout(panel19, BoxLayout.Y_AXIS));
		panel20.setLayout(new BoxLayout(panel20, BoxLayout.Y_AXIS));
		//Labele
		JLabel label=new JLabel("Kaktusy:");
		JLabel label2=new JLabel("Roœliny:");
		JLabel label3=new JLabel("Dodawanie Roœliny");
		JLabel label4=new JLabel("Rodzaj");
		JLabel label5=new JLabel("Nazwa");
		JLabel label6=new JLabel("Jadalna?");
		JLabel label7=new JLabel("Rozmiar");
		JLabel label8=new JLabel("Czy ma liœcie");
		JLabel label9=new JLabel("Wiek");
		JLabel label10=new JLabel("Dodawanie Kaktusa");
		
		JLabel label11=new JLabel("Nazwa");
		JLabel label12=new JLabel("Rozmiar");
		JLabel label13=new JLabel("Jadalna?");
		JLabel label14=new JLabel("Czy ma Ig³y?");
		JLabel label15=new JLabel("Wiek");
		JLabel label16=new JLabel("Zapach");
		
		JLabel label17=new JLabel("Usuwanie");
		JLabel label18=new JLabel("Czy trzeba zbieraæ liœcie?");
		JLabel label19=new JLabel("Znajdz roœlinkê");
		
		
		
		/*area=new JTextArea(40,35);
		area.setLineWrap(true);
		JScrollPane przewijanie=new JScrollPane(area);
		przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(label);
		panel.add(przewijanie);*/
		panel.add(panel18);
		panel.add(panel19);
		panel.add(panel20);
		
		area2=new JTextArea(20,71);
		area2.setLineWrap(true);
		JScrollPane przewijanie2=new JScrollPane(area2);
		przewijanie2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		przewijanie2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel2.add(label2);
		panel2.add(przewijanie2);
		
		panel4.add(label3);
		panel3.add(panel4);
		
		panel5.add(label4);
		panel5.add(field);
		panel3.add(panel5);
		
		panel6.add(label5);
		panel6.add(field2);
		panel3.add(panel6);
		
		panel7.add(label6);
		panel7.add(field3);
		panel3.add(panel7);
		
		panel8.add(label7);
		panel8.add(field4);
		panel3.add(panel8);
		
		panel9.add(label8);
		panel9.add(field5);
		panel3.add(panel9);
		
		panel10.add(label9);
		panel10.add(field6);
		panel3.add(panel10);
		//Koniec dodawania pierwszego
		paneld.add(panel3);
		
		/*panel11.add(label10);
		panel3a.add(panel11);
		
		panel13.add(label16);
		panel13.add(field12);
		panel3a.add(panel13);
		
		panel12.add(label11);
		panel12.add(field7);
		panel3a.add(panel12);
		
		panel14.add(label12);
		panel14.add(field8);
		panel3a.add(panel14);
		
		panel15.add(label13);
		panel15.add(field9);
		panel3a.add(panel15);
		
		panel16.add(label14);
		panel16.add(field10);
		panel3a.add(panel16);
		
		panel17.add(label15);
		panel17.add(field11);
		panel3a.add(panel17);*/
		
		panel3.add(dodaj);
		dodaj.addActionListener(new Odp6());
		/*panel3a.add(dodaj2);
		dodaj2.addActionListener(new Odp7());
		
		paneld.add(panel3a); */
		
		panelœrod.add(label17);
		panelœrod2.add(field13);
		panelœrod3.add(usun);
		usun.addActionListener(new Odp3());
		panel18.add(panelœrod);
		panel18.add(panelœrod2);
		panel18.add(panelœrod3);
		//panelc.add(panel18);

		panelœrod4.add(label18);
		panelœrod5.add(field14);
		panelœrod6.add(sprawdz);
		sprawdz.addActionListener(new Odp4());
		panel19.add(panelœrod4);
		panel19.add(panelœrod5);
		panel19.add(panelœrod6);
		//panelc.add(panel19);
		
		panelœrod7.add(label19);
		panelœrod8.add(field15);
		panelœrod9.add(szukaj);
		szukaj.addActionListener(new Odp5());
		panel20.add(panelœrod7);
		panel20.add(panelœrod8);
		panel20.add(panelœrod9);
		//panelc.add(panel20);
		
		ramka.setSize(1000, 451);
		
	}
	public class Odp1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			og.wyczysc();
			og.Odczytx2();
			area2.append(og.wyswietlRoslinkireturn());
		}
	}
	
	public class Odp3 implements ActionListener{
		public void actionPerformed(ActionEvent e){
		String k=field13.getText();
		og.usunRoslinke(k);
		og.zapiszx2();
		og.wyczysc();
		og.wczytajx2();
		field13.setText("");
		}
		}
	public class Odp4 implements ActionListener{
		public void actionPerformed(ActionEvent e){
	String k=field14.getText();
		if(og.czyIstnieje(k)) {
			area2.append(og.czyZebracLiscie2(k));
		}
		
		field14.setText("");
		}
		}
	Ogrodnik og=new Ogrodnik(50);
	public Interfejs2(){
		}
	public class Odp5 implements ActionListener{
		public void actionPerformed(ActionEvent e){
		String k=field15.getText();
		if(og.czyIstnieje(k)) {
		area2.append(og.czyJestRoslina(k).toString());	
		}
		
		field15.setText("");
		}
		}
	public class Odp6 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				String rodzaj=field.getText();
				int rozmiar=Integer.parseInt(field4.getText());
				boolean jadalna=Boolean.valueOf(field3.getText());
				String nazwa=field2.getText();
				boolean liœcie=Boolean.valueOf(field5.getText());
				int wiek=Integer.parseInt(field6.getText());
				Roslina l=new Roslina(rodzaj, nazwa,jadalna,rozmiar,liœcie,wiek);
				og.dodajRosline(l);
				area2.append("Roœlina zosta³a dodana");
				og.zapiszP();
				field.setText("");
				field2.setText("");
				field3.setText("");
				field4.setText("");
				field5.setText("");
				field6.setText("");
			}catch(NumberFormatException ex) {
				area2.append("Z³e dane");
			}
		}
	}

	public class Odp8 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ramka3.setVisible(true);
			ramka3.setSize(230, 125);
			ramka3.setLocation(450,275);
			ramka3.getContentPane().add(BorderLayout.CENTER,panel21);
			ramka3.getContentPane().add(BorderLayout.SOUTH,panel22);
			panel21.removeAll();
			panel21.setLayout(new BoxLayout(panel21, BoxLayout.Y_AXIS));
			panel22.removeAll();
			panel22.add(przycisk);
			panel22.add(przycisk2);
			przycisk.addActionListener(new OdpowiedzPrzycisk());
			przycisk2.addActionListener(new OdpowiedzPrzycisk2());
			panel21.add(label20);
			panel21.add(field16);
			field16.setText("");
			
		}
	}
	public class OdpowiedzPrzycisk implements ActionListener{
		private String q;
		public String getQ(){return q;}
		public void setQ(String q) {
			this.q=q;
		}
		public void actionPerformed(ActionEvent zdarzenie) {
			setQ(field16.getText());
				if(og.czyIstnieje(q)) {
			panel21.removeAll();
			ramka3.setSize(270,125);
			
			
			panel21.add(sposob1);
			panel21.add(sposob2);
			sposob1.setSelected(false);
			sposob2.setSelected(false);
			sposob1.addItemListener(new OdpowiedzPrzycisk6a());
			sposob2.addItemListener(new OdpowiedzPrzycisk6b());
			}
	}
		public class OdpowiedzPrzycisk6a implements ItemListener{
			
			public void itemStateChanged(ItemEvent zdarzenie) {
				if(og.czyJestRoslina(getQ())!=null) {     
					og.czyJestRoslina(getQ()).zmienSposob(new Sposob_na_pielegnacje1());}
				
				}
		}
		public class OdpowiedzPrzycisk6b implements ItemListener{
			
			public void itemStateChanged(ItemEvent zdarzenie) {
					if(og.czyJestRoslina(getQ())!=null) {
				og.czyJestRoslina(getQ()).zmienSposob(new Sposob_na_pielegnacje2());}
					
			}
		}
	}
	public class OdpowiedzPrzycisk2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ramka3.removeNotify();
		}
	}
	
	
	public static void main(String[] args) {
		Interfejs2 k=new Interfejs2();
		k.doDziela2();
	}
	
	}
