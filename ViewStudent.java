package UniBuddy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewStudent extends JFrame implements ActionListener{
    
    Choice studentRollNumber;
    JTable studentTable;
    JButton searchButton,printButton,updateButton,addButton,cancelButton;

    ViewStudent(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel headingViewStudent = new JLabel("Student Details");
        headingViewStudent.setBounds(310, 30, 500, 50);
        headingViewStudent.setFont(new Font("Sarif", Font.BOLD, 35)); /*awt*/
        add(headingViewStudent);

        JLabel heading = new JLabel("Search Student : ");
        heading.setBounds(50, 100, 150, 20);
        heading.setFont(new Font("Sarif", Font.PLAIN, 15));
        add(heading);

        studentRollNumber = new Choice();
        studentRollNumber.setBounds(200, 100, 250, 20);
        add(studentRollNumber);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from studentdetails");
            while(rs.next()){
                studentRollNumber.add(rs.getString("rollnumber"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        studentTable = new JTable();

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from studentdetails");
            studentTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }

        JScrollPane jScroll = new JScrollPane(studentTable);
        jScroll.setBounds(10, 200, 1400, 600);
        add(jScroll);

        searchButton = new JButton("Search");
        searchButton.setBounds(50, 150, 70, 20);
        searchButton.addActionListener(this);
        add(searchButton);

        printButton = new JButton("Print");
        printButton.setBounds(150, 150, 70, 20);
        printButton.addActionListener(this);
        add(printButton);

        addButton = new JButton("Cancel");
        addButton.setBounds(250, 150, 70, 20);
        addButton.addActionListener(this);
        add(addButton);

        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==searchButton){
            String query = "select * from studentdetails where rollnumber = '"+studentRollNumber.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                studentTable.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        else if(e.getSource()==printButton){
            try {
                studentTable.print();
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new ViewStudent();
    }
}
