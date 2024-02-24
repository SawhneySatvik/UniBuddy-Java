package UniBuddy;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
//import java.util.*;

public class UpdateStudent extends JFrame implements ActionListener{

    /*Random rand = new Random();
    long first6 = Math.abs((rand.nextLong()%900000L) + 100000L);
    JLabel studentRollNumberLabel;*/
    JTextField studentAddressTextField, studentPhoneTextField, studentTenthPercentageTextField, studentTwelthPercentageTextField;
    JTextField studentEmaTextField, studentGenderTextField, studentAadharNumberTextField;
    JTextField studentCourseBox, studentBranchBox;
    JLabel studentRollNumber;
    JButton studentUpdate, studentCancel;
    Choice studentRollNumberC;
    
    UpdateStudent(){

        setSize(900, 700);
        setLocation(350, 50);

        setLayout(null);

        //Update student details heading
        JLabel headingStudentAdd = new JLabel("Update Student Details");
        headingStudentAdd.setBounds(310, 30, 500, 50);
        headingStudentAdd.setFont(new Font("Sarif", Font.BOLD, 30)); /*awt*/
        add(headingStudentAdd);

        JLabel sRollNumber = new JLabel("Select Student Roll Number");
        sRollNumber.setFont(new Font("Sarif", Font.BOLD, 20)); 
        sRollNumber.setBounds(50,100,300,20);
        add(sRollNumber);

        studentRollNumberC = new Choice();
        studentRollNumberC.setFont(new Font("Sarif", Font.BOLD, 15)); 
        studentRollNumberC.setBounds(350,100,200,20);
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

        //New Student
        JLabel studentNameLabel = new JLabel("Name : ");
        studentNameLabel.setBounds(50, 150, 100, 30);
        studentNameLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentNameLabel);

        JLabel studentNameTextField = new JLabel();
        studentNameTextField.setFont(new Font("Sarif", Font.BOLD, 15)); 
        studentNameTextField.setBounds(200, 150, 150, 30);
        add(studentNameTextField);

        //Father Name
        JLabel studentFatherNameLabel = new JLabel("Father's Name : ");
        studentFatherNameLabel.setBounds(400, 150, 200, 30);
        studentFatherNameLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentFatherNameLabel);

        JLabel studentFatherNameTextField = new JLabel();
        studentFatherNameTextField.setFont(new Font("Sarif", Font.BOLD, 15)); 
        studentFatherNameTextField.setBounds(600, 150, 150, 30);
        add(studentFatherNameTextField);
        
        //Mother Name
        JLabel studentMotherNameLabel = new JLabel("Mother's Name : ");
        studentMotherNameLabel.setBounds(400, 200, 200, 30);
        studentMotherNameLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentMotherNameLabel);

        JLabel studentMotherNameTextField = new JLabel();
        studentMotherNameTextField.setFont(new Font("Sarif", Font.BOLD, 15)); 
        studentMotherNameTextField.setBounds(600, 200, 150, 30);
        add(studentMotherNameTextField);

        //Student Roll Number
        studentRollNumber = new JLabel("Roll Number : ");
        studentRollNumber.setBounds(50, 200, 200, 30);
        studentRollNumber.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentRollNumber);

        JLabel studentRollNumberTextField = new JLabel();
        studentRollNumberTextField.setFont(new Font("Sarif", Font.BOLD, 15)); 
        studentRollNumberTextField.setBounds(200, 200, 150, 30);
        add(studentRollNumberTextField);

        /*
        studentRollNumberLabel = new JLabel("RA2211"+first6);
        studentRollNumberLabel.setBounds(200, 200, 200, 30);
        studentRollNumberLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentRollNumberLabel);
        */

        //Date of Birth
        JLabel studentDOB = new JLabel("Date of Birth : ");
        studentDOB.setBounds(50, 250, 200, 30);
        studentDOB.setFont(new Font("Sarif", Font.BOLD, 20));
        add(studentDOB);
        
        JLabel JDate = new JLabel();
        JDate.setFont(new Font("Sarif", Font.BOLD, 15)); 
        JDate.setBounds(200, 250, 150, 30);
        add(JDate);

        //Student Gender
        JLabel studentGender = new JLabel("Gender : ");
        studentGender.setBounds(50, 300, 200, 30);
        studentGender.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentGender);

        JLabel studentGenderBox = new JLabel();
        studentGenderBox.setFont(new Font("Sarif", Font.BOLD, 15)); 
        studentGenderBox.setBounds(200, 300, 150, 30);
        add(studentGenderBox);

        /*
        studentGenderTextField = new JTextField();
        studentGenderTextField= new JTextField();
        studentGenderTextField.setBounds(200, 300, 150, 30);
        add(studentGenderTextField);
        */

        //Student Address
        JLabel studentAddress = new JLabel("Current Address : ");
        studentAddress.setBounds(400, 300, 200, 30);
        studentAddress.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentAddress);

        studentAddressTextField = new JTextField();
        studentAddressTextField.setBounds(600, 300, 150, 30);
        add(studentAddressTextField);

        //Student Phone
        JLabel studentPhone = new JLabel("Phone Number : ");
        studentPhone.setBounds(400, 250, 200, 30);
        studentPhone.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentPhone);

        studentPhoneTextField= new JTextField();
        studentPhoneTextField.setBounds(600, 250, 150, 30);
        add(studentPhoneTextField);

        //Student Aadhar Number
        JLabel studentAadharNumber = new JLabel("Aadhar Number : ");
        studentAadharNumber.setBounds(50, 350, 200, 30);
        studentAadharNumber.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentAadharNumber);

        JLabel studentAadharNumberTextField= new JLabel();
        studentAadharNumberTextField.setFont(new Font("Sarif", Font.BOLD, 15)); 
        studentAadharNumberTextField.setBounds(230, 350, 120, 30);
        add(studentAadharNumberTextField);


        //Student Tenth Percentage
        JLabel studentTenthPercentage = new JLabel("10th Marks(%) : ");
        studentTenthPercentage.setBounds(50, 400, 200, 30);
        studentTenthPercentage.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentTenthPercentage);

        JLabel studentTenthPercentageTextField = new JLabel();
        studentTenthPercentageTextField.setFont(new Font("Sarif", Font.BOLD, 15)); 
        studentTenthPercentageTextField.setBounds(220, 400, 130, 30);
        add(studentTenthPercentageTextField);

        //Student Twelth Percentage
        JLabel studentTwelthPercentage = new JLabel("12th Marks(%) : ");
        studentTwelthPercentage.setBounds(400, 400, 200, 30);
        studentTwelthPercentage.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentTwelthPercentage);

        JLabel studentTwelthPercentageTextField = new JLabel();
        studentTwelthPercentageTextField.setFont(new Font("Sarif", Font.BOLD, 15)); 
        studentTwelthPercentageTextField.setBounds(600, 400, 150, 30);
        add(studentTwelthPercentageTextField);

        //Student EMail Address
        JLabel studentEmail = new JLabel("E-Mail Address : ");
        studentEmail.setBounds(400, 350, 200, 30);
        studentEmail.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentEmail);

        studentEmaTextField = new JTextField();
        studentEmaTextField.setBounds(600, 350, 150, 30);
        add(studentEmaTextField);

        //Student Course
        JLabel studentCourse = new JLabel("Course : ");
        studentCourse.setBounds(50, 450, 200, 30);
        studentCourse.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentCourse);

        JTextField studentCourseBox = new JTextField();
        studentCourseBox.setBounds(200, 450, 150, 30);
        add(studentCourseBox);

        //Student Branch
        JLabel studentBranch = new JLabel("Branch : ");
        studentBranch.setBounds(400, 450, 200, 30);
        studentBranch.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentBranch);

        JTextField studentBranchBox = new JTextField();
        studentBranchBox.setBounds(600, 450, 150, 30);
        add(studentBranchBox);

        /*try{
            Conn c = new Conn();
            String query = "select * from studentdetails where rollnumber='"+studentRollNumberC.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                studentNameTextField.setText(rs.getString("studentname"));
                studentFatherNameTextField.setText(rs.getString("fathername"));
                studentMotherNameTextField.setText(rs.getString("mothername"));
                studentAadharNumberTextField.setText(rs.getString("aadhar"));
                studentGenderBox.setText(rs.getString("gender"));
                JDate.setText(rs.getString("dateofbirth"));
                studentRollNumberTextField.setText(rs.getString("rollnumber"));
                studentTenthPercentageTextField.setText(rs.getString("tenthmarks"));
                studentTwelthPercentageTextField.setText(rs.getString("twelfthmarks"));
                studentPhoneTextField.setText(rs.getString("phonenumber"));
                studentEmaTextField.setText(rs.getString("email"));
                studentAddressTextField.setText(rs.getString("address"));
                studentCourseBox.setText(rs.getString("course"));
                studentBranchBox.setText(rs.getString("branch"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }*/

        studentRollNumberC.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie){
                try{
                    Conn c = new Conn();
                    String query = "select * from studentdetails where rollnumber='"+studentRollNumberC.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()){
                        studentNameTextField.setText(rs.getString("studentname"));
                        studentFatherNameTextField.setText(rs.getString("fathername"));
                        studentMotherNameTextField.setText(rs.getString("mothername"));
                        studentAadharNumberTextField.setText(rs.getString("aadhar"));
                        studentGenderBox.setText(rs.getString("gender"));
                        JDate.setText(rs.getString("dateofbirth"));
                        studentRollNumberTextField.setText(rs.getString("rollnumber"));
                        studentTenthPercentageTextField.setText(rs.getString("tenthmarks"));
                        studentTwelthPercentageTextField.setText(rs.getString("twelfthmarks"));
                        studentPhoneTextField.setText(rs.getString("phonenumber"));
                        studentEmaTextField.setText(rs.getString("email"));
                        studentAddressTextField.setText(rs.getString("address"));
                        studentCourseBox.setText(rs.getString("course"));
                        studentBranchBox.setText(rs.getString("branch"));
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        studentUpdate = new JButton("Update");
        studentUpdate.setBounds(200, 550, 150, 40);
        studentUpdate.setBackground(Color.black);
        studentUpdate.setForeground(Color.black);
        studentUpdate.setFont(new Font("Serif", Font.BOLD, 17));
        studentUpdate.addActionListener(this);
        add(studentUpdate);

        studentCancel = new JButton("Cancel");
        studentCancel.setBounds(500, 550, 150, 40);
        studentCancel.setBackground(Color.black);
        studentCancel.setForeground(Color.black);
        studentCancel.setFont(new Font("Serif", Font.BOLD, 17));
        studentCancel.addActionListener(this);
        add(studentCancel);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==studentUpdate){
            String sRollNumber = studentRollNumber.getText();
            String sPhone = studentPhoneTextField.getText();
            String sEmail = studentEmaTextField.getText();
            String sAddress = studentAddressTextField.getText();
            String sCourse = studentCourseBox.getText();
            String sBranch = studentBranchBox.getText();
           
            try {
                
               String query = "update studentdetails set address='"+sAddress+"' ,phonenumber='"+sPhone+"', email='"+sEmail+"', course='"+sCourse+"', branch='"+sBranch+"' where rollnumber='"+sRollNumber+"'";

               Conn c = new Conn();
               c.s.executeUpdate(query);

               JOptionPane.showMessageDialog(null, "Student details UPDATED successfully");
               setVisible(false);
            } catch (Exception a) {
                a.printStackTrace();
            }  
        }
        else{
            JOptionPane.showMessageDialog(null, "Student details were NOT UPDATED");
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new UpdateStudent();
    }
}