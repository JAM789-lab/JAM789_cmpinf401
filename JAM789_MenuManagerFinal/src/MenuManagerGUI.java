import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MenuManagerGUI {

	private JFrame frmMenuManager;
	private JFrame frmMenu;
	private JPanel byom;
	private JLabel lblEntreesLabel;
	private JComboBox cboEntreeList;
	private JLabel lblSidesLabel;
	private JComboBox cboSideList;
	private JLabel lblSaladsLabel;
	private JComboBox cboSaladList;
	private JLabel lblDessertsLabel;
	private JComboBox cboDessertList;
	private JLabel lblCM;
	private JPanel ogam;
	private JPanel CM;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblEntree;
	private JLabel lblSide;
	private JLabel lblSalad;
	private JLabel lblDessert;
	private JLabel lblTotalCal;
	private JLabel lblTotal$;
	private JTextArea txtEntree;
	private JTextArea txtSide;
	private JTextArea txtSalad;
	private JTextArea txtDessert;
	private JTextArea txtTotalCal;
	private JTextArea txtTotal$;
	private JList lstCreatedMenu;
	private JButton btnCreateMenu;
	private JButton btnGenRandom;
	private JButton btnGenMin;
	private JButton btnGenMax;
	private JButton btnDetails;
	private JButton btnDeleteAll;
	private JButton btnSaveToFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuManagerGUI window = new MenuManagerGUI();
					window.frmMenuManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuManagerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MenuManager manag = new MenuManager("data\\dishes.txt");

		//MenuManager Frame being set up
		frmMenuManager = new JFrame();
		frmMenuManager.setTitle("Menu Manager");
		frmMenuManager.setBounds(0,0,573,359);
		frmMenuManager.getContentPane().setLayout(null);

		byom = new JPanel();
		byom.setBounds(10, 10, 250, 175);
		byom.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Build your own Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frmMenuManager.getContentPane().add(byom);
		byom.setLayout(null);


		lblEntreesLabel = new JLabel("Entrees");
		lblEntreesLabel.setFont(UIManager.getFont("Label.font"));
		lblEntreesLabel.setBounds(10, 20, 46, 13);
		lblEntreesLabel.setVerticalAlignment(SwingConstants.TOP);
		lblEntreesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		byom.add(lblEntreesLabel);

		cboEntreeList = new JComboBox();
		cboEntreeList.setBounds(66, 16, 174, 21);
		byom.add(cboEntreeList);
		cboEntreeList.setMaximumRowCount(manag.getEntrees().size());

		lblSidesLabel = new JLabel("Sides");
		lblSidesLabel.setFont(UIManager.getFont("Label.font"));
		lblSidesLabel.setBounds(10, 51, 34, 13);
		lblSidesLabel.setVerticalAlignment(SwingConstants.TOP);
		lblSidesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		byom.add(lblSidesLabel);

		cboSideList = new JComboBox();
		cboSideList.setBounds(66, 47, 174, 21);
		byom.add(cboSideList);
		cboSideList.setMaximumRowCount(manag.getSides().size());

		lblSaladsLabel = new JLabel("Salad");
		lblSaladsLabel.setBounds(10, 82, 34, 13);
		lblSaladsLabel.setVerticalAlignment(SwingConstants.TOP);
		lblSaladsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		byom.add(lblSaladsLabel);

		cboSaladList = new JComboBox();
		cboSaladList.setBounds(66, 78, 174, 21);
		byom.add(cboSaladList);
		cboSaladList.setMaximumRowCount(manag.getSalads().size());

		lblDessertsLabel = new JLabel("Dessert");
		lblDessertsLabel.setBounds(10, 113, 46, 13);
		lblDessertsLabel.setVerticalAlignment(SwingConstants.TOP);
		lblDessertsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		byom.add(lblDessertsLabel);

		cboDessertList = new JComboBox();
		cboDessertList.setBounds(66, 109, 174, 21);
		byom.add(cboDessertList);
		cboDessertList.setMaximumRowCount(manag.getDesserts().size());

		//Loops that populate combo boxes
		for(int i = 0; i < manag.getEntrees().size(); i++) {
			cboEntreeList.addItem(manag.getEntrees().get(i));
		}
		for(int i = 0; i < manag.getSides().size(); i++) {
			cboSideList.addItem(manag.getSides().get(i));
		}
		for(int i = 0; i < manag.getSalads().size(); i++) {
			cboSaladList.addItem(manag.getSalads().get(i));
		}
		for(int i = 0; i < manag.getDesserts().size(); i++) {
			cboDessertList.addItem(manag.getDesserts().get(i));
		}

		lblCM = new JLabel("Created Menus:");
		lblCM.setBounds(270, 10, 218, 13);
		lblCM.setVerticalAlignment(SwingConstants.TOP);
		lblCM.setHorizontalAlignment(SwingConstants.LEFT);
		frmMenuManager.getContentPane().add(lblCM);

		ogam = new JPanel();
		ogam.setBounds(10, 190, 250, 113);
		ogam.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Or generate a Menu", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frmMenuManager.getContentPane().add(ogam);
		ogam.setLayout(null);

		CM = new JPanel();
		CM.setBounds(270, 27, 275, 245);
		CM.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmMenuManager.getContentPane().add(CM);
		CM.setLayout(null);


		//Menu Frame being set up
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu: ");
		frmMenu.setBounds(100, 100, 725, 374);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frmMenu.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		lblEntree = new JLabel("Entree");
		lblEntree.setBounds(10, 10, 45, 13);
		panel.add(lblEntree);

		lblSide = new JLabel("Side");
		lblSide.setBounds(10, 74, 45, 13);
		panel.add(lblSide);

		lblSalad = new JLabel("Salad");
		lblSalad.setBounds(10, 138, 45, 13);
		panel.add(lblSalad);

		lblDessert = new JLabel("Dessert");
		lblDessert.setBounds(10, 202, 45, 13);
		panel.add(lblDessert);

		lblTotalCal = new JLabel("Total calories:");
		lblTotalCal.setBounds(10, 266, 169, 13);
		panel.add(lblTotalCal);

		lblTotal$ = new JLabel("Total price: $");
		lblTotal$.setBounds(10, 294, 75, 13);
		panel.add(lblTotal$);

		txtEntree = new JTextArea();
		txtEntree.setLineWrap(true);
		txtEntree.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtEntree.setEditable(false);
		txtEntree.setBounds(85, 10, frmMenu.getWidth()-119, 54);

		panel.add(txtEntree);

		txtSide = new JTextArea();
		txtSide.setLineWrap(true);
		txtSide.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtSide.setEditable(false);
		txtSide.setBounds(85, 74, frmMenu.getWidth()-119, 54);
		panel.add(txtSide);

		txtSalad = new JTextArea();
		txtSalad.setLineWrap(true);
		txtSalad.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtSalad.setEditable(false);
		txtSalad.setBounds(85, 138, frmMenu.getWidth()-119, 54);
		panel.add(txtSalad);

		txtDessert = new JTextArea();
		txtDessert.setLineWrap(true);
		txtDessert.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtDessert.setEditable(false);
		txtDessert.setBounds(85, 202, frmMenu.getWidth()-119, 54);
		panel.add(txtDessert);

		txtTotalCal = new JTextArea();
		txtTotalCal.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtTotalCal.setLineWrap(true);
		txtTotalCal.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtTotalCal.setEditable(false);
		txtTotalCal.setBounds(95, 266, 75, 18);
		panel.add(txtTotalCal);

		txtTotal$ = new JTextArea();
		txtTotal$.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtTotal$.setLineWrap(true);
		txtTotal$.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtTotal$.setEditable(false);
		txtTotal$.setBounds(95, 294, 75, 18);
		panel.add(txtTotal$);





		DefaultListModel model = new DefaultListModel();

		lstCreatedMenu = new JList(model);
		lstCreatedMenu.setBounds(0, 0, 275, 245);
		CM.add(lstCreatedMenu);


		//Functions involving Buttons
		btnCreateMenu = new JButton("Create Menu with these dishes");
		btnCreateMenu.addActionListener(new ActionListener() {
			//When Button Pressed
			public void actionPerformed(ActionEvent arg0) {
				String name = JOptionPane.showInputDialog("Please provide a name for your menu");
				Menu menu = new Menu(name, (Entree)cboEntreeList.getSelectedItem(), (Side)cboSideList.getSelectedItem(), (Salad)cboSaladList.getSelectedItem(), (Dessert)cboDessertList.getSelectedItem());
				model.addElement(menu);
			}
		});
		btnCreateMenu.setBounds(10, 144, 230, 21);
		byom.add(btnCreateMenu);

		btnGenRandom = new JButton("Generate a Random Menu");
		btnGenRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = JOptionPane.showInputDialog("Please provide a name for your random menu");
				Menu menu = manag.randomMenu(name);
				model.addElement(menu);
			}
		});
		btnGenRandom.setBounds(10, 20, 230, 21);
		ogam.add(btnGenRandom);

		btnGenMin = new JButton("Generate a Minimum Calories Menu");
		btnGenMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please provide a name for your minimum calories menu");
				Menu menu = manag.minCaloriesMenu(name);
				model.addElement(menu);
			}
		});
		btnGenMin.setBounds(10, 51, 230, 21);
		ogam.add(btnGenMin);

		btnGenMax = new JButton("Generate a Maximum Calories Menu");
		btnGenMax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Please provide a name for your maximum calories menu");
				Menu menu = manag.maxCaloriesMenu(name);
				model.addElement(menu);
			}
		});
		btnGenMax.setBounds(10, 82, 230, 21);
		ogam.add(btnGenMax);

		btnDetails = new JButton("Details");
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = (Menu) lstCreatedMenu.getSelectedValue();
				if(menu != null) {
					frmMenu.setTitle("Menu: " + menu.toString());

					txtEntree.setText(menu.getEntree().getName() + "\n" + menu.getEntree().getDescription() + ". Calories: " + menu.getEntree().getCalories() + ". Price: $" + String.format("%.2f",menu.getEntree().getPrice()));
					txtSide.setText(menu.getSide().getName() + "\n" + menu.getSide().getDescription() + ". Calories: " + menu.getSide().getCalories() + ". Price: $" + String.format("%.2f",menu.getSide().getPrice()));
					txtSalad.setText(menu.getSalad().getName() + "\n" + menu.getSalad().getDescription() + ". Calories: " + menu.getSalad().getCalories() + ". Price: $" + String.format("%.2f",menu.getSalad().getPrice()));
					txtDessert.setText(menu.getDessert().getName() + "\n" + menu.getDessert().getDescription() + ". Calories: " + menu.getDessert().getCalories() + ". Price: $" + String.format("%.2f",menu.getDessert().getPrice()));

					txtTotalCal.setText("" + (menu.getEntree().getCalories() + menu.getSide().getCalories() + menu.getSalad().getCalories() + menu.getDessert().getCalories()));
					txtTotal$.setText("" + String.format("%.2f",(menu.getEntree().getPrice() + menu.getSide().getPrice() + menu.getSalad().getPrice() + menu.getDessert().getPrice())));

					frmMenu.setVisible(true);
				}
			}
		});
		btnDetails.setBounds(270, 282, 73, 21);
		frmMenuManager.getContentPane().add(btnDetails);

		btnDeleteAll = new JButton("Delete All");
		btnDeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeAllElements();
			}
		});
		btnDeleteAll.setBounds(351, 282, 87, 21);
		frmMenuManager.getContentPane().add(btnDeleteAll);

		btnSaveToFile = new JButton("Save to File");
		btnSaveToFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Menu> menus = new ArrayList<Menu>();
				for(int i = 0; i < model.size(); i++) {
					menus.add((Menu)model.elementAt(i));
				}
				FileManager.writeMenu("data/menus.txt", menus);
			}
		});
		btnSaveToFile.setBounds(447, 282, 98, 21);
		frmMenuManager.getContentPane().add(btnSaveToFile);

	}
}
