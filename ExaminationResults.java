package UniBuddy;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import net.proteanit.sql.DbUtils;

public class ExaminationResults extends JFrame implements ActionListener{

    JTextField searchResult;
    JButton studentSubmit, studentCancel;
    JTable resultTable;
    
    ExaminationResults(){
        setSize(1000,475);
        setLocation(300,100);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        

        JLabel headingStudentAdd = new JLabel("Examination Results");
        headingStudentAdd.setBounds(310, 30, 500, 50);
        headingStudentAdd.setFont(new Font("Sarif", Font.BOLD, 30));
        add(headingStudentAdd);

        JLabel searchResultLabel = new JLabel("Search by RollNumber: ");
        searchResultLabel.setBounds(50,90,200,30);
        add(searchResultLabel);

        searchResult = new JTextField();
        searchResult.setBounds(200,90,200,30);
        add(searchResult);

        resultTable = new JTable();
        resultTable.setFont(new Font("Serif", Font.BOLD, 17));

        JScrollPane resultScroll = new JScrollPane(resultTable);
        resultScroll.setBounds(0,150,1000,300);
        
        try {
            Conn c = new Conn();

            ResultSet rs = c.s.executeQuery("select * from studentdetails");
            resultTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        studentSubmit = new JButton("Submit");
        studentSubmit.setBounds(450, 90, 150, 30);
        studentSubmit.setBackground(Color.black);
        studentSubmit.setForeground(Color.black);
        studentSubmit.setFont(new Font("Serif", Font.BOLD, 17));
        studentSubmit.addActionListener(this);
        add(studentSubmit);

        studentCancel = new JButton("Back");
        studentCancel.setBounds(600, 90, 150, 30);
        studentCancel.setBackground(Color.black);
        studentCancel.setForeground(Color.black);
        studentCancel.setFont(new Font("Serif", Font.BOLD, 17));
        studentCancel.addActionListener(this);
        add(studentCancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent a){
        if(a.getSource()==studentSubmit){
            try{
                Conn c = new Conn();

                String query = "";

                c.s.executeQuery(query);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Wrong Roll Number try again later");
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new ExaminationResults();
    }
}
