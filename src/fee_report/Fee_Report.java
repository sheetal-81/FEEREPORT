package fee_report;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;    
import java.awt.print.*;
import javafx.print.Printer;
import java.io.*;
import java.io.IOException;


// Creating the fee class
public class Fee_Report extends Frame {


JLabel  l1, l2, l3, l4,l5, l6, l7, l8,l9,l10,l11,l12,l13,l14,l15;

JTextField tf1, tf2, tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;

JTextArea area2, area1;

JRadioButton rb1, rb2, rb3,rb4,rb5,rb6,rb7;

JFileChooser f1;
// Default constructor to
// initialize the parameters
Fee_Report()
{
    l1 = new JLabel("Fee Report");
    l1.setBounds(650, 50, 350, 50);
    l1.setFont(new Font("System",Font.BOLD,40));
    
   
    l2 = new JLabel("Student Name:");
    l2.setBounds(50, 150, 250, 25);
    l2.setFont(new Font("System",Font.BOLD,25));

    tf1 = new JTextField();
    tf1.setBounds(300, 150, 250, 30);

    l3 = new JLabel("Father Name:");
    l3.setBounds(50, 200, 250, 25);
    l3.setFont(new Font("System",Font.BOLD,25));

    tf2 = new JTextField();
    tf2.setBounds(300, 200, 250, 30);

    l4 = new JLabel("Roll Number:");
    l4.setBounds(50, 250, 250, 25);
    l4.setFont(new Font("System",Font.BOLD,25));

    tf3 = new JTextField();
    tf3.setBounds(300, 250, 250, 30);

    l5 = new JLabel("Email ID:");
    l5.setBounds(50, 300, 250, 25);
    l5.setFont(new Font("System",Font.BOLD,25));

    tf4 = new JTextField();
    tf4.setBounds(300, 300, 250, 30);

    l6 = new JLabel("Contact Number:");
    l6.setBounds(50, 350, 250, 25);
    l6.setFont(new Font("System",Font.BOLD,25));
    
    tf5 = new JTextField();
    tf5.setBounds(300, 350, 250, 30);

    l7 = new JLabel("Address:");
    l7.setBounds(50, 400, 250, 20);
    l7.setFont(new Font("System",Font.BOLD,25));

    area1 = new JTextArea();
    area1.setBounds(300, 400, 250, 80);

    l9 = new JLabel("Gender:");
    l9.setBounds(50, 500, 250, 20);
    l9.setFont(new Font("System",Font.BOLD,25));

    JRadioButton r5= new JRadioButton(" Male");
    JRadioButton r6= new JRadioButton(" Female");

    r5.setBounds(300, 500, 100, 30);
    r6.setBounds(450, 500, 100, 30);


    ButtonGroup bg = new ButtonGroup();
    bg.add(r5);
    bg.add(r6);

    l10 = new JLabel("Nationality:");
    l10.setBounds(50, 550, 250, 25);
    l10.setFont(new Font("System",Font.BOLD,25));

    tf6 = new JTextField();
    tf6.setBounds(300, 550, 250, 30);

    l11 = new JLabel("SSC passing year");
    l11.setBounds(50, 600, 250, 35);
    l11.setFont(new Font("System",Font.BOLD,25));

    String language[]= { "2016", "2015", "2014" };
    final JComboBox cb1= new JComboBox(language);
    cb1.setBounds(300, 600, 100, 30);

    l12 = new JLabel("HSC passing year");
    l12.setBounds(50, 650, 250, 35);
    l12.setFont(new Font("System",Font.BOLD,25));

    String languagess[]= { "2019", "2018", "2017" };
    final JComboBox cb2= new JComboBox(languagess);
    cb2.setBounds(300, 650, 100, 30);
    
    l13 = new JLabel("SSC percentage:");
    l13.setBounds(50, 700, 250, 35);
    l13.setFont(new Font("System",Font.BOLD,25));

    tf7 = new JTextField();
    tf7.setBounds(300, 700, 250, 30);

    l14 = new JLabel(" HSC Percentage:");
    l14.setBounds(50, 750, 250, 35);
    l14.setFont(new Font("System",Font.BOLD,25));

    tf8 = new JTextField();
    tf8.setBounds(300, 750, 250, 30);

    ImageIcon i2 = new ImageIcon("2.png");
    JLabel l15= new JLabel("", i2, JLabel.CENTER);
    l15.setBounds(900, 50, 600, 200);
    l15.setFont(new Font("System",Font.BOLD,25));


  /*  final JComboBox cb2= new JComboBox(languagess);
    
    cb2.setBounds(250, 650, 90, 20);*/
    l8 = new JLabel("SELECT :");
    l8.setBounds(600, 150, 250,35);
    l8.setFont(new Font("System",Font.BOLD,25));

    rb1 = new JRadioButton("DIV(A)");
    rb1.setBounds(600, 200, 90, 30);

    rb2 = new JRadioButton("DIV(B)");
    rb2.setBounds(750, 200, 90, 30);

    ButtonGroup bg1 = new ButtonGroup();

    bg1.add(rb1);
    bg1.add(rb2);

    rb3 = new JRadioButton("HOSTELLER");
    rb3.setBounds(600, 250, 120, 30);

    rb4 = new JRadioButton("DAY SCHOLAR");
    rb4.setBounds(750, 250, 120, 30);

    ButtonGroup bg2 = new ButtonGroup();
    bg2.add(rb3);
    bg2.add(rb4);

    String languages[]= { "CS", "COMP", "IT","CIVIL", "MECH" };
    
    final JComboBox cb= new JComboBox(languages);
    cb.setBounds(600, 300, 90, 20);

    final JLabel label= new JLabel();
    label.setBounds(600, 430, 500, 30);
    JButton b = new JButton("Show");
    b.setBounds(600, 500, 350, 40);


    final DefaultListModel<String> li1= new DefaultListModel<>();
    
    li1.addElement("CS(2, 50, 000)");
    li1.addElement("COMP(2, 50, 000)");
    li1.addElement("IT(2, 50, 000)");
    li1.addElement("CIVIL(2, 50, 000)");
    li1.addElement("MECH(2, 50, 000)");


    final JList<String> list1 = new JList<>(li1);
    
    list1.setBounds(600, 350, 125, 125);

    DefaultListModel<String> li2= new DefaultListModel<>();

    li2.addElement("2 SHARE(1, 50, 000)");
    li2.addElement("3 SHARE(1, 40, 000)");
    li2.addElement("5 SHARE(1, 20, 000)");
    li2.addElement("8 SHARE(1, 10, 000)");
    li2.addElement("bus(40, 000)");

    final JList<String> list2= new JList<>(li2);
    list2.setBounds(800, 350, 125, 125);


    JButton Receipt= new JButton("Receipt");
    Receipt.setBounds(600, 590, 100, 50);
    JButton b2 = new JButton("Reset");
    b2.setBounds(700, 590, 100, 50);
    JButton Print = new JButton("Print");
    Print.setBounds(800, 590, 100, 50);

    area2 = new JTextArea();
    area2.setBounds(1000, 120, 450, 650);
    
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(l5);
    add(l6);
    add(l7);
    add(l8);
    add(l9);
    add(l10);
    add(l11);
    add(l12);
    add(l13);
    add(l14);
    add(tf1);
    add(tf2);
    add(tf3);
    add(tf4);
    add(tf5);
    add(tf6);
    add(tf7);
    add(tf8);
    add(area1);
    add(area2);
    add(l15);
    add(rb1);
    add(rb2);
    add(rb3);
    add(rb4);
    add(r5);
    add(r6);
    add(cb);
    add(cb1);
    add(cb2);
    add(list1);
    add(list2);
    add(b);
    add(label);
    add(Receipt);
    add(b2);
    add(Print);

    b.addActionListener(new ActionListener() {


    // Method to display the data
    // entered in the text fields
    public void actionPerformed(ActionEvent e)
    {
        String data = "";
        if (list1.getSelectedIndex() != -1) 
        {
            data = "You had selected the Group:"+ list1.getSelectedValue();
            label.setText(data);
        }
        if (list2.getSelectedIndex() != -1) 
        {
            data += " and Hostel with the "+ "facility of: ";
            for (Object frame :
            list2.getSelectedValues()) 
            {
                data += frame + " ";
            }
        }
        label.setText(data);
    }
    });


    // Reset the text fields
    b2.addActionListener(
    new ActionListener() 
    {
        public void actionPerformed(
        ActionEvent e)
        {
            area2.setText("");
            area1.setText(" ");
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText(" ");
        }
    });


    // Implementing the Print action
    Print.addActionListener(
    new ActionListener() 
    {
        public void actionPerformed(ActionEvent e)
        {
            try 
            {
                area2.print();
            }
            catch (java.awt.print.PrinterException a)
            {
                System.err.format("NoPrinter Found",a.getMessage());
            }
        }
    });


    // Generating the receipt
    Receipt.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent e)
        {


    area2.setText(
    "--------------------------------"+ "-----------FEE RECEIPT----"+ "--------------------------" + "--------------------------"+ "-------------------\n");


    area2.setText(area2.getText()+ "Student Name: "+ tf1.getText()+ "\n");
    area2.setText(area2.getText()+ "Father's Name: "+ tf2.getText()+ "\n");
    area2.setText(area2.getText()+ "RollNumber: "+ tf3.getText()+ "\n");
    area2.setText(area2.getText()+ "Email ID: "+ tf4.getText()+ "\n");
    area2.setText(area2.getText()+ "Contact Number: "+ tf5.getText()+ "\n");
    area2.setText(area2.getText()+ "Wants to take: "+ cb.getSelectedItem().toString()+ "\n");


    if (rb1.isSelected()) 
    {
        area2.setText(area2.getText()+ "Wants to Join in "+ "School of Engineering "+ "and Applied Sciences\n");
    }
    if (rb2.isSelected()) 
    {
        area2.setText(area2.getText()+ "Wants to Join in "+ "School of Liberal "+ "Arts and Sciences\n");
    }
    if (rb3.isSelected()) 
    {
        area2.setText(area2.getText()+ "Wants to be a "+ "Hosteller \n");
    }
    if (rb4.isSelected()) 
    {
        area2.setText(area2.getText()+ "Wants to be a "+ "Day Scholar \n");
    }
    area2.setText(area2.getText()+ "Had chosen: "+ list1.getSelectedValue().toString()+ "\n");
    area2.setText(area2.getText()+ "Had chosen: "+ list2.getSelectedValue().toString()+ "\n");

    int index2 = list2.getSelectedIndex();
    if (index2 == 0)
    {
        area2.setText(area2.getText()+ " "+ "Total amount to be "+ "paid is 4 Lakhs \n");
    }

    if (index2 == 1) 
    {
        area2.setText(area2.getText()+ " " + "Total amount to be paid "+ "is 3.9 Lakhs \n");
    }

    if (index2 == 2) 
    {
        area2.setText(area2.getText()+ " "+ "Total amount to be paid "+ "is 3.8 Lakhs \n");
    }

    if (index2 == 3) 
    {
        area2.setText(area2.getText()+ " "+ "Total amount to be paid "+ "is 3.7 Lakhs \n");
    }

    if (index2 == 4) 
    {
        area2.setText(area2.getText()+ " "+ "Total amount to be paid "+ "is 2.9 Lakhs \n");
    }

    if (e.getSource() == Receipt) 
    {
        try 
        {
            FileWriter fw= new FileWriter("java.txt", true);
            fw.write(area2.getText());
            fw.close();
        }
        catch (Exception ae) 
        {
            System.out.println(ae);
        }
    }

    JOptionPane.showMessageDialog(area2, "DATA SAVED SUCCESSFULLY");
    };
    });
    addWindowListener(new WindowAdapter() {
        public void windowClosing(
        WindowEvent we)
        {
            System.exit(0);
        }
    });
    
    setSize(1000, 1000);
    setLayout(null);
    setVisible(true);
    setBackground(Color.LIGHT_GRAY);
    
    }
    public static void main(String[] args)
    {
        new Fee_Report();
    }
    }

