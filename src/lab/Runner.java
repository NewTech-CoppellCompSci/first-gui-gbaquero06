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
		// adds the information to the array list
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

		MainPage();
	}

	public static void MainPage() {

		// create overall frame
		JFrame frame = new JFrame("Homes for sale");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// end program when red x is hit
		// give it size
		frame.setSize(700, 700);

		// create pic object
		ImageIcon pic1 = new ImageIcon(houses.get(0).image());
		// scale pic object
		ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		JButton house1 = new JButton(scaledPic1);
		house1.setBounds(20, 30, scaledPic1.getIconWidth(), scaledPic1.getIconHeight());
		frame.add(house1);// add pic of house 1 to frame
		JLabel LabelHouse1 = new JLabel(houses.get(0).address());
		LabelHouse1.setBounds(20, 180, 240, 30);// x,y.with,heigh
		frame.add(LabelHouse1);// add address of house 1 to the frame

		house1.addActionListener(new ActionListener() {
			//waits for user to click the pic
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				//when pic is clicked closes the main page
				houseGUI(houses.get(0));
				// opens the house page
			}
		});

		ImageIcon pic2 = new ImageIcon(houses.get(1).image());
		ImageIcon scaledPic2 = new ImageIcon(pic2.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		JButton house2 = new JButton(scaledPic2);
		house2.setBounds(20, 220, scaledPic2.getIconWidth(), scaledPic2.getIconHeight());
		frame.add(house2);// add pic of house 2 to frame
		JLabel LabelHouse2 = new JLabel(houses.get(1).address());
		LabelHouse2.setBounds(20, 370, 240, 30);// x,y.with,heigh
		frame.add(LabelHouse2);// add address of house 2 to the frame

		house2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				houseGUI(houses.get(1));
			}
		});
		ImageIcon pic3 = new ImageIcon(houses.get(2).image());
		ImageIcon scaledPic3 = new ImageIcon(pic3.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		JButton house3 = new JButton(scaledPic3);
		house3.setBounds(20, 410, scaledPic3.getIconWidth(), scaledPic3.getIconHeight());
		frame.add(house3); // add pic of house 3 to frame
		JLabel LabelHouse3 = new JLabel(houses.get(2).address());
		LabelHouse3.setBounds(20, 560, 300, 30);// x,y.with,heigh
		frame.add(LabelHouse3);// add address of house 3 to the frame

		house3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				houseGUI(houses.get(2));
			}
		});
		ImageIcon pic4 = new ImageIcon(houses.get(3).image());
		ImageIcon scaledPic4 = new ImageIcon(pic4.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		JButton house4 = new JButton(scaledPic4);
		house4.setBounds(350, 30, scaledPic4.getIconWidth(), scaledPic3.getIconHeight());
		frame.add(house4);// add pic of house 4 to frame
		JLabel LabelHouse4 = new JLabel(houses.get(3).address());
		LabelHouse4.setBounds(350, 180, 240, 30);// x,y.with,heigh
		frame.add(LabelHouse4);// add address of house 4 to the frame

		house4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				houseGUI(houses.get(3));
			}
		});
		ImageIcon pic5 = new ImageIcon(houses.get(4).image());
		ImageIcon scaledPic5 = new ImageIcon(pic5.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		JButton house5 = new JButton(scaledPic5);
		house5.setBounds(350, 220, scaledPic5.getIconWidth(), scaledPic5.getIconHeight());
		frame.add(house5);// add pic of house 5 to frame
		JLabel LabelHouse5 = new JLabel(houses.get(4).address());
		LabelHouse5.setBounds(350, 370, 300, 30);// x,y.with,heigh
		frame.add(LabelHouse5); // add address of house 5 to the frame

		house5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				houseGUI(houses.get(4));
			}
		});
		ImageIcon pic6 = new ImageIcon(houses.get(5).image());
		ImageIcon scaledPic6 = new ImageIcon(pic6.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		JButton house6 = new JButton(scaledPic6);
		house6.setBounds(350, 410, scaledPic6.getIconWidth(), scaledPic6.getIconHeight());
		frame.add(house6);// add pic of house 6 to frame
		JLabel LabelHouse6 = new JLabel(houses.get(5).address());
		LabelHouse6.setBounds(350, 560, 300, 30);// x,y.with,heigh
		frame.add(LabelHouse6); // add address of house 6 to the frame

		house6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				houseGUI(houses.get(5));
			}
		});

		// don't use a layout
		frame.setLayout(null);
		// build the frame (make it visible)
		frame.setVisible(true);
	}

	/*
	 * a GUI for a single house listing
	 */
	public static void houseGUI(House house) {

		JFrame frame = new JFrame("House 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(700, 700);
		// builds the house frame
		JButton goback = new JButton("Go back to home page");
		goback.setBounds(10, 10, 200, 30);// x,y.with,heigh
		frame.add(goback);// add a go back button
		goback.addActionListener(new ActionListener() {
			// waits for user to click the button
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MainPage();
				// goes back to the main page
			}
		});
		ImageIcon pic1 = new ImageIcon(house.image());
		// scale pic object
		ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
		//add the information to the frame
		JButton house1 = new JButton(scaledPic1);
		house1.setBounds(20, 50, scaledPic1.getIconWidth(), scaledPic1.getIconHeight());
		frame.add(house1);
		JLabel info = new JLabel("Information about this house:");
		info.setBounds(350, 20, 300, 30);// x,y.with,heigh
		frame.add(info);
		JLabel price = new JLabel("Price:       $" + house.price());
		price.setBounds(300, 40, 300, 30);// x,y.with,heigh
		frame.add(price);

		JLabel address = new JLabel("Address:      " + house.address());
		address.setBounds(300, 60, 550, 30);
		frame.add(address);

		JLabel sqft = new JLabel("sqft:            " + house.sqfoot());
		sqft.setBounds(300, 80, 300, 30);// x,y.with,heigh
		frame.add(sqft);

		JLabel bed = new JLabel("Number of bedrooms:      " + house.bedroom());
		bed.setBounds(300, 100, 300, 30);// x,y.with,heigh
		frame.add(bed);

		JLabel bath = new JLabel("Number of bathrooms:      " + house.bath());
		bath.setBounds(300, 120, 300, 30);// x,y.with,heigh
		frame.add(bath);
		JLabel lot = new JLabel("Lot size:      " + house.lot());
		lot.setBounds(300, 140, 300, 30);// x,y.with,heigh
		frame.add(lot);
		// checks if there is a pool to add the correct information to the frame
		if (house.pool() == true) {
			JLabel pool = new JLabel("Has pool:      Yes");
			pool.setBounds(300, 160, 300, 30);// x,y.with,heigh
			frame.add(pool);
		} else {
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
