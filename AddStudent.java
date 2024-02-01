package UniBuddy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
//import java.util.*;

public class AddStudent extends JFrame implements ActionListener{

    /*Random rand = new Random();
    long first6 = Math.abs((rand.nextLong()%900000L) + 100000L);
    JLabel studentRollNumberLabel;*/

    JTextField studentNameTextField, studentFatherNameTextField, studentMotherNameTextField, studentRollNumberTextField;
    JTextField studentAddressTextField, studentPhoneTextField, studentTenthPercentageTextField, studentTwelthPercentageTextField;
    JTextField studentEmaTextField, studentGenderTextField, studentAadharNumberTextField;
    JDateChooser JDate;
    JComboBox studentCourseBox, studentBranchBox, studentGenderBox;
    JButton studentAdd, studentCancel;
    
    AddStudent(){

        setSize(900, 700);
        setLocation(350, 50);

        setLayout(null);

        //Add new student details heading
        JLabel headingStudentAdd = new JLabel("New Student Details");
        headingStudentAdd.setBounds(310, 30, 500, 50);
        headingStudentAdd.setFont(new Font("Sarif", Font.BOLD, 30)); /*awt*/
        add(headingStudentAdd);

        //New Student
        JLabel studentNameLabel = new JLabel("Name : ");
        studentNameLabel.setBounds(50, 150, 100, 30);
        studentNameLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentNameLabel);

        studentNameTextField = new JTextField();
        studentNameTextField.setBounds(200, 150, 150, 30);
        add(studentNameTextField);

        //Father Name
        JLabel studentFatherNameLabel = new JLabel("Father's Name : ");
        studentFatherNameLabel.setBounds(400, 150, 200, 30);
        studentFatherNameLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentFatherNameLabel);

        studentFatherNameTextField = new JTextField();
        studentFatherNameTextField.setBounds(600, 150, 150, 30);
        add(studentFatherNameTextField);
        
        //Mother Name
        JLabel studentMotherNameLabel = new JLabel("Mother's Name : ");
        studentMotherNameLabel.setBounds(400, 200, 200, 30);
        studentMotherNameLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentMotherNameLabel);

        studentMotherNameTextField = new JTextField();
        studentMotherNameTextField.setBounds(600, 200, 150, 30);
        add(studentMotherNameTextField);

        //Student Roll Number
        JLabel studentRollNumber = new JLabel("Roll Number : ");
        studentRollNumber.setBounds(50, 200, 200, 30);
        studentRollNumber.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentRollNumber);

        studentRollNumberTextField = new JTextField();
        studentRollNumberTextField = new JTextField();
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
        
        JDate = new JDateChooser();
        JDate.setBounds(200, 250, 150, 30);
        add(JDate);

        //Student Gender
        JLabel studentGender = new JLabel("Gender : ");
        studentGender.setBounds(50, 300, 200, 30);
        studentGender.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentGender);

        String gender[]={"--","Female","Male","Other"};
        studentGenderBox = new JComboBox(gender);
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
        studentAddressTextField = new JTextField();
        studentAddressTextField.setBounds(600, 300, 150, 30);
        add(studentAddressTextField);

        //Student Phone
        JLabel studentPhone = new JLabel("Phone Number : ");
        studentPhone.setBounds(400, 250, 200, 30);
        studentPhone.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentPhone);

        studentPhoneTextField = new JTextField();
        studentPhoneTextField= new JTextField();
        studentPhoneTextField.setBounds(600, 250, 150, 30);
        add(studentPhoneTextField);

        //Student Aadhar Number
        JLabel studentAadharNumber = new JLabel("Aadhar Number : ");
        studentAadharNumber.setBounds(50, 350, 200, 30);
        studentAadharNumber.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentAadharNumber);

        studentAadharNumberTextField = new JTextField();
        studentAadharNumberTextField= new JTextField();
        studentAadharNumberTextField.setBounds(230, 350, 120, 30);
        add(studentAadharNumberTextField);


        //Student Tenth Percentage
        JLabel studentTenthPercentage = new JLabel("10th Marks(%) : ");
        studentTenthPercentage.setBounds(50, 400, 200, 30);
        studentTenthPercentage.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentTenthPercentage);

        studentTenthPercentageTextField = new JTextField();
        studentTenthPercentageTextField = new JTextField();
        studentTenthPercentageTextField.setBounds(220, 400, 130, 30);
        add(studentTenthPercentageTextField);

        //Student Twelth Percentage
        JLabel studentTwelthPercentage = new JLabel("12th Marks(%) : ");
        studentTwelthPercentage.setBounds(400, 400, 200, 30);
        studentTwelthPercentage.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentTwelthPercentage);

        studentTwelthPercentageTextField = new JTextField();
        studentTwelthPercentageTextField = new JTextField();
        studentTwelthPercentageTextField.setBounds(600, 400, 150, 30);
        add(studentTwelthPercentageTextField);

        //Student EMail Address
        JLabel studentEmail = new JLabel("E-Mail Address : ");
        studentEmail.setBounds(400, 350, 200, 30);
        studentEmail.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentEmail);

        studentEmaTextField = new JTextField();
        studentEmaTextField = new JTextField();
        studentEmaTextField.setBounds(600, 350, 150, 30);
        add(studentEmaTextField);

        //Student Course
        JLabel studentCourse = new JLabel("Course : ");
        studentCourse.setBounds(50, 450, 200, 30);
        studentCourse.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentCourse);

        String courses[]={"--","B.Tech","M.Tech","B.Sc","M.Sc","MBBS"};
        studentCourseBox = new JComboBox(courses);
        studentCourseBox.setBounds(200, 450, 150, 30);
        add(studentCourseBox);

        //Student Branch
        JLabel studentBranch = new JLabel("Branch : ");
        studentBranch.setBounds(400, 450, 200, 30);
        studentBranch.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(studentBranch);

        String branches[]={"--","Computer Science","Mechanical","Electrical","Civil","Information Technology","Maths","Physics","Chemistry","Biotechnology","Cardiologist","Neurologist"};
        studentBranchBox = new JComboBox(branches);
        studentBranchBox.setBounds(600, 450, 150, 30);
        add(studentBranchBox);

        studentAdd = new JButton("Submit");
        studentAdd.setBounds(200, 550, 150, 40);
        studentAdd.setBackground(Color.black);
        studentAdd.setForeground(Color.black);
        studentAdd.setFont(new Font("Serif", Font.BOLD, 17));
        studentAdd.addActionListener(this);
        add(studentAdd);

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
        if(e.getSource()==studentAdd){
            String sName = studentNameTextField.getText();
            String sRollNo = studentRollNumberTextField.getText();
            String sdob = ((JTextField)JDate.getDateEditor().getUiComponent()).getText();
            String sGender = (String) studentGenderBox.getSelectedItem() ;
            String sAadhar = studentAadharNumberTextField.getText();
            String sPhone = studentPhoneTextField.getText();
            String sEmail = studentEmaTextField.getText();
            String sfName = studentFatherNameTextField.getText();
            String smName = studentMotherNameTextField.getText();
            String sAddress = studentAddressTextField.getText();
            String sTenthMarks = studentTenthPercentageTextField.getText();
            String sTwelthMarks = studentTwelthPercentageTextField.getText();
            String sCourse = (String) studentCourseBox.getSelectedItem();
            String sBranch = (String) studentBranchBox.getSelectedItem();

            try {
                
               String query = "insert into studentdetails values('"+sRollNo+"', '"+sName+"', '"+sdob+"', '"+sGender+"', '"+sAadhar+"', '"+sfName+"', '"+smName+"', '"+sAddress+"', '"+sPhone+"', '"+sEmail+"', '"+sTenthMarks+"', '"+sTwelthMarks+"', '"+sCourse+"', '"+sBranch+"')";

               Conn c = new Conn();
               c.s.executeUpdate(query);

               JOptionPane.showMessageDialog(null, "Student details INSERTED successfully");
               setVisible(false);
            } catch (Exception a) {
                a.printStackTrace();
            }  
        }
        else{
            JOptionPane.showMessageDialog(null, "Student details were NOT INSERTED");
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddStudent();
    }
}