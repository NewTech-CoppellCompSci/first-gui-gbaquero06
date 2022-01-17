package lab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import lab.House;

public class Runner {

	private static ArrayList<House> houses;

	public static void main(String[] args) throws Exception {
		houses = new ArrayList<House>();
		
		Scanner inFile = new Scanner(new File("src/lab/info.txt"));
		while (inFile.hasNext()) {
			int sqfoot = inFile.nextInt();
			double bath = inFile.nextDouble();
			int bedroom = inFile.nextInt();
			int price = inFile.nextInt();
			inFile.nextLine();
			String address = inFile.nextLine();
			double lot = inFile.nextDouble();
			boolean pool = inFile.nextBoolean();
			String image = inFile.next();
			houses.add(new House(sqfoot, bath, bedroom, price, address, lot, pool, image));

		}
		for (int i = 0; i < houses.size(); i++) {// for loop to use the array list
			System.out.println(houses.get(i));// print the pet at the designated spot (i)
		}
		MainPage();
	}

	public static void MainPage() {
		
		// create overall frame
		JFrame frame = new JFrame("Homes for sale");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// end program when red x is hit
		// give it size
		frame.setSize(600, 600);
		// everythig else goes here

		/*
		 * // add a label(text) JLabel label1 = new JLabel("First Label Ever!!!");
		 * label1.setBounds(20, 40, 200, 30);// x,y.with,heigh frame.add(label1);
		 * 
		 * // add text field(only 1 line long) JTextField field1 = new
		 * JTextField("Enter text Here..."); field1.setBounds(20, 100, 200, 30);
		 * frame.add(field1);
		 * 
		 * // Text areas can be multiple lines long final JTextArea field2 = new
		 * JTextArea("Enter text Here..."); field2.setBounds(260, 100, 300, 100);
		 * field2.setLineWrap(true); frame.add(field2);
		 * 
		 * // Label for the output final JLabel labelOutput = new
		 * JLabel(field1.getText()); labelOutput.setBounds(20, 230, 560, 100);
		 * frame.add(labelOutput);
		 * 
		 * // create button JButton button1 = new JButton("Press Me!");
		 * button1.setBounds(260, 40, 140, 30);
		 * 
		 * // create action listener button1.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * labelOutput.setText(field2.getText()); } });
		 * 
		 * frame.add(button1);
		 */

		// create pic object
		ImageIcon pic1 = new ImageIcon("src/lab/house1.png");
		// scale pic object
		ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		// label with original pic
		// JButton house = new JButton(pic1);
		// house.setBounds(20, 350, pic1.getIconWidth(),pic1.getIconHeight());
		// frame.add(house);
		// label with scaled pic
		JButton house1 = new JButton(scaledPic1);
		house1.setBounds(20, 30, scaledPic1.getIconWidth(), scaledPic1.getIconHeight());
		frame.add(house1);
		JLabel LabelHouse1 = new JLabel(houses.get(0).address());
		LabelHouse1.setBounds(20, 180, 240, 30);// x,y.with,heigh
		frame.add(LabelHouse1);

		house1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				house1();
			}
		});

		// don't use a layout
		frame.setLayout(null);
		// build the frame (make it visible)
		frame.setVisible(true);
	}

	public static void house1() {
		
		JFrame frame = new JFrame("House 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(600, 600);
		JButton goback = new JButton("Go back to home page");
		goback.setBounds(10, 10, 200, 30);// x,y.with,heigh
		frame.add(goback);
		goback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MainPage();
			}
		});
		ImageIcon pic1 = new ImageIcon("src/lab/house1.png");
		// scale pic object
		ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		// label with original pic
		// JButton house = new JButton(pic1);
		// house.setBounds(20, 350, pic1.getIconWidth(),pic1.getIconHeight());
		// frame.add(house);
		// label with scaled pic
		JButton house1 = new JButton(scaledPic1);
		house1.setBounds(20, 50, scaledPic1.getIconWidth(), scaledPic1.getIconHeight());
		frame.add(house1);
		JLabel info = new JLabel("Information about this house:");
		info.setBounds(350, 20, 300, 30);// x,y.with,heigh
		frame.add(info);
		JLabel price = new JLabel("Price:       $" + houses.get(0).price());
		price.setBounds(300, 40, 300, 30);// x,y.with,heigh
		frame.add(price);
		
		JLabel address = new JLabel("Address:      " + houses.get(0).address());
		address.setBounds(300, 60, 300, 30);// x,y.with,heigh
		frame.add(address);
		
		JLabel sqft = new JLabel("sqft:            " + houses.get(0).sqfoot());
		sqft.setBounds(300, 80, 300, 30);// x,y.with,heigh
		frame.add(sqft);
		
		JLabel bed = new JLabel("Number of bedrooms:      " + houses.get(0).bedroom());
		bed.setBounds(300, 100, 300, 30);// x,y.with,heigh
		frame.add(bed);
		
		JLabel bath = new JLabel("Number of bathrooms:      " + houses.get(0).bath());
		bath.setBounds(300, 120, 300, 30);// x,y.with,heigh
		frame.add(bath);
		JLabel lot = new JLabel("Lot size:      " + houses.get(0).lot());
		lot.setBounds(300, 140, 300, 30);// x,y.with,heigh
		frame.add(lot);
		if(houses.get(0).pool()==true) {
			JLabel pool = new JLabel("Has pool:      Yes");
			pool.setBounds(300, 160, 300, 30);// x,y.with,heigh
			frame.add(pool);
		}
		else {
			JLabel pool = new JLabel("Has pool:      No");
			pool.setBounds(300, 160, 300, 30);// x,y.with,heigh
			frame.add(pool);
		}
		// don't use a layout
		frame.setLayout(null);
		// build the frame (make it visible)
		frame.setVisible(true);
	}
}
