package UniBuddy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class EnterMarks extends JFrame implements ActionListener{

    Choice studentRollNumberC;
    JComboBox studentSemesterBox;
    JTextField subject1TextField, subject2TextField, subject3TextField, subject4TextField, subject5TextField;
    JTextField marks1TextField, marks2TextField, marks3TextField, marks4TextField, marks5TextField;
    JButton studentSubmit, studentCancel; 
    
    EnterMarks(){


        setSize(1000,500);
        setLocation(300,150);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        ImageIcon image1a = new ImageIcon(ClassLoader.getSystemResource("Pictures/mainLogin.jpeg"));
        Image image1b = image1a.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon image1c = new ImageIcon(image1b);
        JLabel image1 = new JLabel(image1c);
        add(image1);
        image1.setBounds(550,100,400,300);

        JLabel headingStudentAdd = new JLabel("Enter Marks of Student");
        headingStudentAdd.setBounds(310, 30, 500, 50);
        headingStudentAdd.setFont(new Font("Sarif", Font.BOLD, 30));
        add(headingStudentAdd);

        JLabel sRollNumber = new JLabel("Select Student Roll Number");
        sRollNumber.setFont(new Font("Sarif", Font.BOLD, 15)); 
        sRollNumber.setBounds(50,100,250,20);
        add(sRollNumber);

        studentRollNumberC = new Choice();
        studentRollNumberC.setBounds(300,100,200,20);
        add(studentRollNumberC);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from studentdetails");
            while(rs.next()){
                studentRollNumberC.add(rs.getString("rollnumber"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel studentSemesterLabel = new JLabel("Semester : ");
        studentSemesterLabel.setFont(new Font("Sarif", Font.BOLD, 15));
        studentSemesterLabel.setBounds(50,140,150,20);
        add(studentSemesterLabel);

        String semester[]={"1st Semester","2nd Semester","3rd  Semester","4th Semester","5th Semester","6 Semester","7 Semester","8 Semester"};
        studentSemesterBox = new JComboBox(semester); 
        studentSemesterBox.setBounds(200,140,150,20);
        studentSemesterBox.setBackground(Color.WHITE);
        add(studentSemesterBox);

        JLabel enterSubjectLabel = new JLabel("Enter Subject");
        enterSubjectLabel.setBounds(100,180,150,40);
        enterSubjectLabel.setFont(new Font("Sarif", Font.BOLD, 15));
        add(enterSubjectLabel);

        JLabel enterMarksLabel = new JLabel("Enter Marks");
        enterMarksLabel.setBounds(320,180,150,40);
        enterMarksLabel.setFont(new Font("Sarif", Font.BOLD, 15));
        add(enterMarksLabel);

        subject1TextField = new JTextField();
        subject1TextField.setBounds(50,220,200,20);
        add(subject1TextField);

        marks1TextField = new JTextField();
        marks1TextField.setBounds(270,220,200,20);
        add(marks1TextField);

        subject2TextField = new JTextField();
        subject2TextField.setBounds(50,250,200,20);
        add(subject2TextField);

        marks2TextField = new JTextField();
        marks2TextField.setBounds(270,250,200,20);
        add(marks2TextField);

        subject3TextField = new JTextField();
        subject3TextField.setBounds(50,280,200,20);
        add(subject3TextField);

        marks3TextField = new JTextField();
        marks3TextField.setBounds(270,280,200,20);
        add(marks3TextField);

        subject4TextField = new JTextField();
        subject4TextField.setBounds(50,310,200,20);
        add(subject4TextField);

        marks4TextField = new JTextField();
        marks4TextField.setBounds(270,310,200,20);
        add(marks4TextField);

        subject5TextField = new JTextField();
        subject5TextField.setBounds(50,340,200,20);
        add(subject5TextField);

        marks5TextField = new JTextField();
        marks5TextField.setBounds(270,340,200,20);
        add(marks5TextField);

        studentSubmit = new JButton("Submit");
        studentSubmit.setBounds(100, 380, 150, 40);
        studentSubmit.setBackground(Color.black);
        studentSubmit.setForeground(Color.black);
        studentSubmit.setFont(new Font("Serif", Font.BOLD, 17));
        studentSubmit.addActionListener(this);
        add(studentSubmit);

        studentCancel = new JButton("Back");
        studentCancel.setBounds(270, 380, 150, 40);
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

                String query1 = "insert into subjectName values('"+studentRollNumberC.getSelectedItem()+"', '"+studentSemesterBox.getSelectedItem()+"', '"+subject1TextField.getText()+"', '"+subject2TextField.getText()+"', '"+subject3TextField.getText()+"', '"+subject4TextField.getText()+"', '"+subject5TextField.getText()+"')";
                
                String query2 = "insert into marks values('"+studentRollNumberC.getSelectedItem()+"', '"+studentSemesterBox.getSelectedItem()+"', '"+marks1TextField.getText()+"', '"+marks2TextField.getText()+"', '"+marks3TextField.getText()+"', '"+marks4TextField.getText()+"', '"+marks5TextField.getText()+"')";

                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);

                JOptionPane.showMessageDialog(null, "Marks INSERTED successfully!");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Student MARKS were NOT INSERTED");
            setVisible(false);
        }
    }

    public static void main(String args[]){
        new EnterMarks();
    }
}
