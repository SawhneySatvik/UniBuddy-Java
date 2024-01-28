package UniBuddy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{

    Dashboard(){
        setSize(1560, 850);
        
        ImageIcon image3a = new ImageIcon(ClassLoader.getSystemResource("Pictures/mainLogin.jpeg"));
        Image image3b = image3a.getImage().getScaledInstance(1460, 780, Image.SCALE_DEFAULT);
        ImageIcon image3c = new ImageIcon(image3b);
        JLabel image3 = new JLabel(image3c);
        add(image3);

        JMenuBar menuBar = new JMenuBar();

        //ABOUT
        JMenu SRM = new JMenu("S R M");
        menuBar.add(SRM);

        JMenuItem about = new JMenuItem("About");
        SRM.add(about);

        JMenuItem notices = new JMenuItem("Notices");
        SRM.add(notices);

        JMenu maps = new JMenu("Map");
        SRM.add(maps);
        JMenuItem mainMap = new JMenuItem("Main Campus");
        mainMap.addActionListener(this);
        maps.add(mainMap);
        JMenuItem annexureMap = new JMenuItem("Annexure Campus");
        annexureMap.addActionListener(this);
        maps.add(annexureMap);

        //INFORMATION
        JMenu newInfromation = new JMenu("Add Details");
        menuBar.add(newInfromation);

        JMenuItem facultyInformation = new JMenuItem("Add Faculty Details");
        facultyInformation.addActionListener(this);
        newInfromation.add(facultyInformation);

        JMenuItem studentInformation = new JMenuItem("Add Student Details");
        studentInformation.addActionListener(this);
        newInfromation.add(studentInformation);

        //DETAILS
        JMenu newDetails = new JMenu("View Details");
        menuBar.add(newDetails);

        JMenuItem facultyDetail = new JMenuItem("View Faculty Details");
        facultyDetail.addActionListener(this);
        newDetails.add(facultyDetail);

        JMenuItem studentDetail = new JMenuItem("View Student Details");
        studentDetail.addActionListener(this);
        newDetails.add(studentDetail);
        
        //UPDATE_INFORMATION
        JMenu updateInformation = new JMenu("Update Details");
        menuBar.add(updateInformation);

        JMenuItem updateFacultyDetails = new JMenuItem("Update Faculty Details");
        updateFacultyDetails.addActionListener(this);
        updateInformation.add(updateFacultyDetails);

        JMenuItem updateStudentDetails = new JMenuItem("Update Student Details");
        updateStudentDetails.addActionListener(this);
        updateInformation.add(updateStudentDetails);

        //EXAMS
        JMenu Exams = new JMenu("Examinations");
        menuBar.add(Exams);

        JMenuItem examinationDetails = new JMenuItem("Examination Result");
        examinationDetails.addActionListener(this);
        Exams.add(examinationDetails);

        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        enterMarks.addActionListener(this);
        Exams.add(enterMarks);
        /* 
        //FEES  
        JMenu fees = new JMenu("Fees");
        menuBar.add(fees);

        JMenuItem FeeStructure = new JMenuItem("Fee Details");
        fees.add(FeeStructure);

        JMenuItem payFee = new JMenuItem("Pay Fees");
        fees.add(payFee);
        */

        //UTILITY
        JMenu utility = new JMenu("Utility");
        menuBar.add(utility);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.addActionListener(this);
        utility.add(calculator);

        JMenuItem NotePad = new JMenuItem("Note Pad");
        NotePad.addActionListener(this);
        utility.add(NotePad);

        JMenuItem CGPAcalculator = new JMenuItem("CGPA Calculator");
        CGPAcalculator.addActionListener(this);
        utility.add(CGPAcalculator);

        //EXIT
        JMenu exit = new JMenu("Exit");
        menuBar.add(exit);

        JMenuItem Back = new JMenuItem("BACK");
        Back.addActionListener(this);
        exit.add(Back);

        JMenuItem Exit = new JMenuItem("EXIT");
        Exit.addActionListener(this);
        exit.add(Exit);

        setJMenuBar(menuBar);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String message = e.getActionCommand();
        if(message.equals("EXIT")){
            setVisible(false);
        }
        else if(message.equals("BACK")){
            setVisible(false);
            new Login();
        }
        else if(message.equals("Annexure Campus")){
            new map1();
        }
        else if(message.equals("Main Campus")){
            new map2();
        }
        else if(message.equals("Add Faculty Details")){
            new AddTeacher();
        }
        else if(message.equals("Add Student Details")){
            new AddStudent();
        }
        else if(message.equals("View Faculty Details")){
            new ViewTeacher();
        }
        else if(message.equals("View Student Details")){
            new ViewStudent();
        }
        else if(message.equals("Update Faculty Details")){
            new UpdateStudent();
        }
        else if(message.equals("Update Student Details")){
            new UpdateStudent();
        }
        else if(message.equals("Enter Marks")){
            new EnterMarks();
        }
        else if(message.equals("Examination Result")){
            new ExaminationResults();
        }
        else if(message.equals("Calculator")){
            new Calculator();
        }
        else if(message.equals("Note Pad")){
            new editor();
        }
        else if(message.equals("CGPA Calculator")){
            new CGPACalculator();
        }
    }
   
    public static void main(String[] args) {
        new Dashboard();
    }
}

