package UniBuddy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewTeacher extends JFrame implements ActionListener{

    Choice teacherEmployeeID;
    JTable teacherTable;
    JButton searchButton,printButton,updateButton,addButton,cancelButton;

    ViewTeacher(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel headingViewTeacher = new JLabel("Teacher Details");
        headingViewTeacher.setBounds(310, 30, 500, 50);
        headingViewTeacher.setFont(new Font("Sarif", Font.BOLD, 35)); /*awt*/
        add(headingViewTeacher);

        JLabel heading = new JLabel("Search Teacher : ");
        heading.setBounds(50, 100, 150, 20);
        heading.setFont(new Font("Sarif", Font.PLAIN, 15));
        add(heading);

        teacherEmployeeID = new Choice();
        teacherEmployeeID.setBounds(200, 100, 250, 20);
        add(teacherEmployeeID);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacherdetails");
            while(rs.next()){
                teacherEmployeeID.add(rs.getString("facultyid"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        teacherTable = new JTable();

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacherdetails");
            teacherTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }

        JScrollPane jScroll = new JScrollPane(teacherTable);
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
            String query = "select * from teacherdetails where facultyid = '"+teacherEmployeeID.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                teacherTable.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        else if(e.getSource()==printButton){
            try {
                teacherTable.print();
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new ViewTeacher();
    }
}
