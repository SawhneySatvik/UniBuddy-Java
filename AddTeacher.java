package UniBuddy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
//import java.util.*;

public class AddTeacher extends JFrame implements ActionListener{
    
    /*Random rand = new Random();
    long first6 = Math.abs((rand.nextLong()%900000L) + 100000L);
    JLabel teacherFacultyIDLabel;*/

    JTextField teacherNameTextField, teacherSpouseNameTextField, teacherParentNameTextField,teacherFacultyIDTextField;
    JTextField teacherAddressTextField, teacherPhoneTextField, teacherSubjectTextField;
    JTextField teacherEmaTextField, teacherGenderTextField, teacherAadharNumberTextField;
    JDateChooser JDate;
    JComboBox teacherExperienceBox, teacherDesignationBox, teacherGenderBox, teacherQualificationBox;
    JButton teacherAdd, teacherCancel;
    
    AddTeacher(){

        setSize(900, 700);
        setLocation(350, 50);

        setLayout(null);

        //Add new teacher details heading
        JLabel headingTeacherAdd = new JLabel("New Faculty Details");
        headingTeacherAdd.setBounds(310, 30, 500, 50);
        headingTeacherAdd.setFont(new Font("Sarif", Font.BOLD, 30)); /*awt*/
        add(headingTeacherAdd);

        //New Teacher
        JLabel teacherNameLabel = new JLabel("Name : ");
        teacherNameLabel.setBounds(50, 150, 100, 30);
        teacherNameLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherNameLabel);

        teacherNameTextField = new JTextField();
        teacherNameTextField.setBounds(200, 150, 150, 30);
        add(teacherNameTextField);

        //Father Name
        JLabel teacherSpouseNameLabel = new JLabel("Spouse Name : ");
        teacherSpouseNameLabel.setBounds(400, 150, 200, 30);
        teacherSpouseNameLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherSpouseNameLabel);

        teacherSpouseNameTextField = new JTextField();
        teacherSpouseNameTextField.setBounds(600, 150, 150, 30);
        add(teacherSpouseNameTextField);
        
        //Mother Name
        JLabel teacherParentNameLabel = new JLabel("Parent Name : ");
        teacherParentNameLabel.setBounds(400, 200, 200, 30);
        teacherParentNameLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherParentNameLabel);

        teacherParentNameTextField = new JTextField();
        teacherParentNameTextField.setBounds(600, 200, 150, 30);
        add(teacherParentNameTextField);

        //Teacher Roll Number
        JLabel teacherFacultyID = new JLabel("Faculty ID : ");
        teacherFacultyID.setBounds(50, 200, 200, 30);
        teacherFacultyID.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherFacultyID);

        teacherFacultyIDTextField = new JTextField();
        teacherFacultyIDTextField.setBounds(200, 200, 150, 30);
        add(teacherFacultyIDTextField);

        /*
        teacherFacultyIDLabel = new JLabel("RA2211"+first6);
        teacherFacultyIDLabel.setBounds(200, 200, 200, 30);
        teacherFacultyIDLabel.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherFacultyIDLabel);
        */

        //Date of Birth
        JLabel teacherDOB = new JLabel("Date of Birth : ");
        teacherDOB.setBounds(50, 250, 200, 30);
        teacherDOB.setFont(new Font("Sarif", Font.BOLD, 20));
        add(teacherDOB);
        
        JDate = new JDateChooser();
        JDate.setBounds(200, 250, 150, 30);
        add(JDate);

        //Teacher Gender
        JLabel teacherGender = new JLabel("Gender : ");
        teacherGender.setBounds(50, 300, 200, 30);
        teacherGender.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherGender);

        String gender[]={"--","Female","Male","Other"};
        teacherGenderBox = new JComboBox(gender);
        teacherGenderBox.setBounds(200, 300, 150, 30);
        add(teacherGenderBox);

        /*
        teacherGenderTextField = new JTextField();
        teacherGenderTextField= new JTextField();
        teacherGenderTextField.setBounds(200, 300, 150, 30);
        add(teacherGenderTextField);
        */

        //Teacher Address
        JLabel teacherAddress = new JLabel("Current Address : ");
        teacherAddress.setBounds(400, 300, 200, 30);
        teacherAddress.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherAddress);

        teacherAddressTextField = new JTextField();
        teacherAddressTextField.setBounds(600, 300, 150, 30);
        add(teacherAddressTextField);

        //Teacher Phone
        JLabel teacherPhone = new JLabel("Phone Number : ");
        teacherPhone.setBounds(400, 250, 200, 30);
        teacherPhone.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherPhone);

        teacherPhoneTextField = new JTextField();
        teacherPhoneTextField.setBounds(600, 250, 150, 30);
        add(teacherPhoneTextField);

        //Teacher Aadhar Number
        JLabel teacherAadharNumber = new JLabel("Aadhar Number : ");
        teacherAadharNumber.setBounds(50, 350, 200, 30);
        teacherAadharNumber.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherAadharNumber);

        teacherAadharNumberTextField = new JTextField();
        teacherAadharNumberTextField.setBounds(230, 350, 120, 30);
        add(teacherAadharNumberTextField);


        //Teacher Qualification
        JLabel teacherQualification = new JLabel("Qualification : ");
        teacherQualification.setBounds(50, 400, 200, 30);
        teacherQualification.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherQualification);

        String qualification[]={"--","Bachelors","Masters","PostGraduate","Doctoral","Associate","Professional"};
        teacherQualificationBox = new JComboBox(qualification);
        teacherQualificationBox.setBounds(200, 400, 150, 30);
        add(teacherQualificationBox);

        //Teacher Subject
        JLabel teacherSubject = new JLabel("Subject : ");
        teacherSubject.setBounds(400, 400, 200, 30);
        teacherSubject.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherSubject);

        teacherSubjectTextField = new JTextField();
        teacherSubjectTextField.setBounds(600, 400, 150, 30);
        add(teacherSubjectTextField);

        //Teacher EMail Address
        JLabel teacherEmail = new JLabel("E-Mail Address : ");
        teacherEmail.setBounds(400, 350, 200, 30);
        teacherEmail.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherEmail);

        teacherEmaTextField = new JTextField();
        teacherEmaTextField.setBounds(600, 350, 150, 30);
        add(teacherEmaTextField);

        //Teacher Experience
        JLabel teacherExperience = new JLabel("Experience : ");
        teacherExperience.setBounds(50, 450, 200, 30);
        teacherExperience.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherExperience);

        String courses[]={"--","0-5 Years","6-10 Years","11-15 Years","16-20 Years","More than 20 Years"};
        teacherExperienceBox = new JComboBox(courses);
        teacherExperienceBox.setBounds(200, 450, 150, 30);
        add(teacherExperienceBox);

        //Teacher Designation
        JLabel teacherDesignation = new JLabel("Designation : ");
        teacherDesignation.setBounds(400, 450, 200, 30);
        teacherDesignation.setFont(new Font("Sarif", Font.BOLD, 20)); 
        add(teacherDesignation);

        String designation[]={"--","Head of Department","Professor","Associate Professor","Assistant Professor","Lecturer","Reader"};
        teacherDesignationBox = new JComboBox(designation);
        teacherDesignationBox.setBounds(600, 450, 150, 30);
        add(teacherDesignationBox);

        teacherAdd = new JButton("Submit");
        teacherAdd.setBounds(200, 550, 150, 40);
        teacherAdd.setBackground(Color.black);
        teacherAdd.setForeground(Color.black);
        teacherAdd.setFont(new Font("Serif", Font.BOLD, 17));
        teacherAdd.addActionListener(this);
        add(teacherAdd);

        teacherCancel = new JButton("Cancel");
        teacherCancel.setBounds(500, 550, 150, 40);
        teacherCancel.setBackground(Color.black);
        teacherCancel.setForeground(Color.black);
        teacherCancel.setFont(new Font("Serif", Font.BOLD, 17));
        teacherCancel.addActionListener(this);
        add(teacherCancel);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==teacherAdd){
            String tName = teacherNameTextField.getText();
            String tFacultyID = teacherFacultyIDTextField.getText();
            String tdob = ((JTextField)JDate.getDateEditor().getUiComponent()).getText();
            String tGender = (String) teacherGenderBox.getSelectedItem() ;
            String tAadhar = teacherAadharNumberTextField.getText();
            String tPhone = teacherPhoneTextField.getText();
            String tEmail = teacherEmaTextField.getText();
            String tsName = teacherSpouseNameTextField.getText();
            String tpName = teacherParentNameTextField.getText();
            String tAddress = teacherAddressTextField.getText();
            String tQualification = (String) teacherQualificationBox.getSelectedItem();
            String tSubject = teacherSubjectTextField.getText();
            String tExperience = (String) teacherExperienceBox.getSelectedItem();
            String tDesignation = (String) teacherDesignationBox.getSelectedItem();

            try {

               String query = "insert into teacherdetails values('"+tFacultyID+"', '"+tName+"', '"+tdob+"', '"+tGender+"', '"+tAadhar+"', '"+tsName+"', '"+tpName+"', '"+tAddress+"', '"+tPhone+"', '"+tEmail+"', '"+tQualification+"', '"+tSubject+"', '"+tExperience+"', '"+tDesignation+"')";

               Conn c = new Conn();
               c.s.executeUpdate(query);

               JOptionPane.showMessageDialog(null, "Teacher details INSERTED successfully");
               setVisible(false);
            } catch (Exception a) {
                a.printStackTrace();
            }  
        }
        else{
            JOptionPane.showMessageDialog(null, "Teacher details were NOT INSERTED");
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddTeacher();
    }
}
