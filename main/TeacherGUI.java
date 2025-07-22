import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class TeacherGUI implements ActionListener
{
    //to display a short text

    private JFrame mainFrame;
    
    private JLabel teacherRegistration,lecturerHeading,tutorHeading,teacherId,teacherName,address,workingType,employmentStatus,workingHours,department,yearsOfExperience,
        gradedScore,salary,specialization,academicQualification,performanceIndex,instruction;   
        
    private JTextField textTeacherId, textTeacherName, textAddress, textWorkingType,textEmploymentStatus, textWorkingHours, textDepartment, textYearsOfExperience,
    textGradedScore, textSalary, textSpecialization, textAcademicQualification;
    
    private JComboBox <String> performanceComboBox;
    
    private JButton lecturerAddButton, tutorAddButton, gradeAssignmentButton, setsalaryOfTutorButton, clearButton, lecturerDisplayButton,tutorDisplayButton, removeTutorButton;
    
    ArrayList<Teacher> TeacherList = new ArrayList<Teacher>();
    
    
    
    //to keep GUI components
    public TeacherGUI(){
        mainFrame = new JFrame("Teacher Registration");
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);
        Font f1 = new Font("Arial",Font.BOLD,20);
        Font f2 = new Font("Arial",Font.PLAIN,15);
        
        JLabel background;
        ImageIcon img = new ImageIcon("C:\\Users\\N I T R O 5\\Pictures\\23049172_SabinDevkota\\Development\\Background.jpg");
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,1100,1080);
        
            
        //headings
        teacherRegistration = new JLabel("Teacher Registration");
        //positioning and sizing of label
        teacherRegistration.setBounds(455,30,243,36);
        teacherRegistration.setFont(f1);
        
        lecturerHeading = new JLabel("Lecturer");
        lecturerHeading.setBounds(150,355,80,30);   
        lecturerHeading.setFont(f1);
        
        tutorHeading = new JLabel("Tutor");
        tutorHeading.setBounds(780,355,85,30);
        tutorHeading.setFont(f1);
        
        teacherName = new JLabel("Teacher Name:");
        teacherName.setBounds(110,110,110,25);
        teacherName.setFont(f2);
        textTeacherName = new JTextField();
        textTeacherName.setBounds(250,110,236,27); 
        
        teacherId = new JLabel("Teacher ID:");
        teacherId.setBounds(600,110,110,25);
        teacherId.setFont(f2);
        textTeacherId = new JTextField();
        textTeacherId.setBounds(750,110,236,27);
        
        address = new JLabel("Address:");
        address.setBounds(110,160,110,25);
        address.setFont(f2);
        //text field where user can write
        textAddress = new JTextField();
        textAddress.setBounds(250,160,236,27);
        
        workingType = new JLabel("Working Type:");
        workingType.setBounds(110,210,110,25);
        workingType.setFont(f2);
        textWorkingType = new JTextField();
        textWorkingType.setBounds(250,210,236,27);
        
        workingHours = new JLabel("Working Hours:");
        workingHours.setBounds(600,210,110,25);
        workingHours.setFont(f2);
        textWorkingHours = new JTextField();
        textWorkingHours.setBounds(750,210,236,27);
        
        // to display instruction
        instruction = new JLabel("*Fields in the above section must be filled to add a lecturer or a tutor.*");
        instruction.setBounds(350,280,500,27);
        instruction.setFont(f2);
        
        employmentStatus = new JLabel("Employment Status:");
        employmentStatus.setBounds(600,160,150,25);
        employmentStatus.setFont(f2);
        textEmploymentStatus = new JTextField();
        textEmploymentStatus.setBounds(750,160,236,27);
        
        department = new JLabel("Department:");
        department.setBounds(60,411,117,25);
        department.setFont(f2);
        textDepartment = new JTextField();
        textDepartment.setBounds(230,410,150,27);
        
        yearsOfExperience = new JLabel("Years of Experience:");
        yearsOfExperience.setBounds(60,461,146,25);
        yearsOfExperience.setFont(f2);
        textYearsOfExperience = new JTextField();
        textYearsOfExperience.setBounds(230,460,150,27);
        
        gradedScore = new JLabel("Graded Score:");
        gradedScore.setBounds(60,511,120,25);
        gradedScore.setFont(f2);
        textGradedScore = new JTextField();
        textGradedScore.setBounds(230,509,150,27); 
        
        lecturerAddButton = new JButton("Add");
        lecturerAddButton.setBounds(30,596,120,32);
        lecturerAddButton.setBackground(new Color(85, 119, 173));
        lecturerAddButton.setForeground(Color.WHITE);
        //to add functionality to the buttons
        lecturerAddButton.addActionListener(this);
        
        lecturerDisplayButton = new JButton("Display");
        lecturerDisplayButton.setBounds(170,596,120,32);
        lecturerDisplayButton.addActionListener(this);
        
        gradeAssignmentButton = new JButton("Assign Grade");
        gradeAssignmentButton.setBounds(310,596,120,32);
        gradeAssignmentButton.addActionListener(this);
                
        salary = new JLabel("Salary :");
        salary.setBounds(670,410,190,25);
        salary.setFont(f2);
        textSalary = new JTextField();
        textSalary.setBounds(847,409,150,27);
        
        academicQualification = new JLabel("Academic Qualification :");
        academicQualification.setBounds(670,450,190,25);
        academicQualification.setFont(f2);
        textAcademicQualification = new JTextField();
        textAcademicQualification.setBounds(847,449,150,27);
        
        specialization = new JLabel("Specialization :");
        specialization.setBounds(670,490,190,25);
        specialization.setFont(f2);
        textSpecialization = new JTextField();
        textSpecialization.setBounds(847,489,150,27);
        
        performanceIndex = new JLabel("Performance Index :");
        performanceIndex.setBounds(670,545,190,25);
        performanceIndex.setFont(f2);
        String performance [] = {null,"0","1","2","3","4","5","6","7","8","9","10"};
        performanceComboBox = new JComboBox<String>(performance);
        performanceComboBox.setSelectedItem(null);
        performanceComboBox.setBounds(830,544,50,32);
        
        tutorAddButton = new JButton("Add");
        tutorAddButton.setBounds(905,544,120,32);
        tutorAddButton.addActionListener(this);
        tutorAddButton.setBackground(new Color(85, 119, 173));
        tutorAddButton.setForeground(Color.WHITE);
        
        tutorDisplayButton = new JButton("Display");
        tutorDisplayButton.setBounds(650,596,120,32);
        tutorDisplayButton.addActionListener(this);
        
        setsalaryOfTutorButton = new JButton("Set Salary");
        setsalaryOfTutorButton.setBounds(790,596,120,32);
        setsalaryOfTutorButton.addActionListener(this);
        
        removeTutorButton =new JButton("Remove");
        removeTutorButton.setBounds(930,596,120,32);
        removeTutorButton.setBackground(new Color(245, 105, 105));
        removeTutorButton.setForeground(Color.WHITE);
        removeTutorButton.addActionListener(this);
        
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(481,698,120,60);
        clearButton.addActionListener(this);
        
        //adding elements to the background
        background.add(teacherRegistration);
        background.add(lecturerHeading);
        background.add(tutorHeading);
        
        background.add(teacherName);
        background.add(textTeacherName);
        background.add(teacherId);
        background.add(textTeacherId);
        background.add(address);
        background.add(textAddress);
        background.add(workingType);
        background.add(textWorkingType);
        background.add(employmentStatus);
        background.add(textEmploymentStatus);
        background.add(workingHours);
        background.add(textWorkingHours);
        background.add(instruction);
        background.add(department);
        background.add(textDepartment);
        background.add(yearsOfExperience);
        background.add(textYearsOfExperience);
        background.add(gradedScore);
        background.add(textGradedScore);
        background.add(lecturerAddButton);
        background.add(lecturerDisplayButton);
        background.add(setsalaryOfTutorButton);
        background.add(salary);
        background.add(textSalary);
        background.add(specialization);
        background.add(textSpecialization);
        background.add(academicQualification);
        background.add(textAcademicQualification);
        background.add(performanceIndex);
        background.add(performanceComboBox);
        background.add(tutorAddButton);
        background.add(tutorDisplayButton);
        background.add(removeTutorButton);
        background.add(clearButton);
        background.add(gradeAssignmentButton);
        
        
        
        mainFrame.add(background);
        mainFrame.setSize(1100,1080);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    
    
    //create new object for the TeacherGUI
    @Override
    public void actionPerformed(ActionEvent e){
        //to clear text fields
        if(e.getSource() == clearButton) {
            
            textTeacherId.setText("");
            textTeacherName.setText("");
            textAddress.setText("");
            textEmploymentStatus.setText("");
            textWorkingType.setText("");
            textWorkingHours.setText("");
            textDepartment.setText("");
            textYearsOfExperience.setText("");
            textGradedScore.setText("");
            textSalary.setText("");
            textAcademicQualification.setText("");
            textSpecialization.setText("");
            performanceComboBox.setSelectedItem(null);
            
        }
    
        //to add Teacher to Lecturer
        if(e.getSource() == lecturerAddButton){
            //checking if the text fields are empty
            boolean empty = textTeacherId.getText().isEmpty() || textTeacherName.getText().isEmpty() || textAddress.getText().isEmpty() || textWorkingType.getText().isEmpty() || textEmploymentStatus.getText().isEmpty() ||  textWorkingHours.getText().isEmpty() || textDepartment.getText().isEmpty() || textYearsOfExperience.getText().isEmpty();
            
            if (empty == true){
                JOptionPane.showMessageDialog(mainFrame, "Please check for any empty fields !!", "Empty",JOptionPane.WARNING_MESSAGE);    
            }else{
                
                try{
                    //changing string value to integer
                    int LteacherId = Integer.parseInt(textTeacherId.getText());
                    if(LteacherId <= 0){
                        JOptionPane.showMessageDialog(new JFrame(), "Invalid Teacher ID", "Error",JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        String LteacherName = textTeacherName.getText();
                        String Laddress = textAddress.getText();
                        String LworkingType = textWorkingType.getText();
                        String LemploymentStatus = textEmploymentStatus.getText();
                        int LyearsOfExperience = Integer.parseInt(textYearsOfExperience.getText());
                        String Ldepartment = textDepartment.getText();
                        int LworkingHours = Integer.parseInt(textWorkingHours.getText());
                        
                        //creating object
                        Teacher Lecturerobj = new Lecturer(LteacherId,LteacherName,Laddress,LworkingType,LemploymentStatus,LworkingHours,Ldepartment,LyearsOfExperience);

                        if (TeacherList.isEmpty()){
    
                            TeacherList.add(Lecturerobj);
                            
                            JOptionPane.showMessageDialog(new JFrame(),"Lecturer Teacher has been added successfully.","Successful",JOptionPane.INFORMATION_MESSAGE);  
                        }
                        else{
                            boolean doesExist = false;
                            //each reg of Teacher in TeacherList
                            for (Teacher lec : TeacherList){
                                //to check if it is instance of Lecturer
                                if(lec instanceof Lecturer){
                                    //if the enrollment id is duplicate
                                    if(lec.getTeacherId() == LteacherId){
                                        doesExist = true;
                                        break;
                                    }
                                }
                            }
                            
                            //if unique teacherId is entered
                            if(doesExist == false){
                                TeacherList.add(Lecturerobj);
                                JOptionPane.showMessageDialog(new JFrame(),"Lecturer Teacher has been added successfully.","Successful",JOptionPane.INFORMATION_MESSAGE);  
                               
                            }
                            else{
                                JOptionPane.showMessageDialog(new JFrame(),"Lecturer of the Teacher Id that you entered exists. Please enter a new one.","Duplicate",JOptionPane.ERROR_MESSAGE);    
                            }
                        }
                    }
                }
                catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(new JFrame(),"Please enter a valid input.","Error",JOptionPane.WARNING_MESSAGE);  
                }
            }
        }
        
        //to add Tutor Teacher
        if(e.getSource() == tutorAddButton) {
            //to check for empty text fields
            boolean empty = textTeacherId.getText().isEmpty() || textTeacherName.getText().isEmpty() || textAddress.getText().isEmpty() ||textWorkingType.getText().isEmpty() || textEmploymentStatus.getText().isEmpty() || textWorkingHours.getText().isEmpty() || textSalary.getText().isEmpty() || textSpecialization.getText().isEmpty() || textAcademicQualification.getText().isEmpty();
            
            //to check if performaceIndex is empty
            boolean performanceIndexEmpty = performanceComboBox.getSelectedItem() == null;
            if (empty == true || performanceIndexEmpty== true ){
                JOptionPane.showMessageDialog(mainFrame, "Please check for any empty fields !!", "Empty",JOptionPane.WARNING_MESSAGE);    
            }else{
                try{
                    int TteacherId = Integer.parseInt(textTeacherId.getText());    
                    
                    if (TteacherId <= 0){
                        JOptionPane.showMessageDialog(new JFrame(), "Invalid Teacher ID", "Error",JOptionPane.WARNING_MESSAGE);    
                    }
                    else{
                        String TteacherName = textTeacherName.getText();
                        String Taddress = textAddress.getText();
                        String TworkingType = textWorkingType.getText();
                        String TemploymentStatus = textEmploymentStatus.getText();
                        int TworkingHours = Integer.parseInt(textWorkingHours.getText());
                        double Tsalary = Double.valueOf(textSalary.getText());
                        String Tspecialization =textSpecialization.getText();
                        String TacademicQualification = textAcademicQualification.getText();
                        String TperformanceIndex = String.valueOf(performanceComboBox.getSelectedItem());
                        //converting the string value of TperformanceIndex to int
                        int performanceIndex = Integer.parseInt(TperformanceIndex);
                        //creating object
                        Teacher Tutorobj = new Tutor(TteacherId,TteacherName,Taddress,TworkingType,TemploymentStatus,TworkingHours,Tsalary,Tspecialization,TacademicQualification, performanceIndex);
                        
                        if (TeacherList.isEmpty()){
                            TeacherList.add(Tutorobj);
                            
                            JOptionPane.showMessageDialog(new JFrame(),"Tutor Teacher has been added successfully.","Successful",JOptionPane.INFORMATION_MESSAGE);  
                        }
                        else{
                            boolean doesExist = false;
                            //each drop of Teacher in TeacherList
                            for (Teacher Tut : TeacherList){
                                //to check if it is instance of Lecturer
                                if(Tut instanceof Tutor){
                                    //if the enrollment id is duplicate
                                    if(Tut.getTeacherId() == TteacherId){
                                        doesExist = true;
                                        break;
                                    
                                    }
                                }
                            }
                            
                            //if unique teacherId is entered
                            if(doesExist == false){
                                TeacherList.add(Tutorobj);
                                
                                JOptionPane.showMessageDialog(new JFrame(),"Tutor Teacher has been added successfully.","Successful",JOptionPane.INFORMATION_MESSAGE);  
                               
                            }
                            else{
                                JOptionPane.showMessageDialog(new JFrame(),"Tutor of the Teacher Id that you entered exists. Please enter a new one.","Duplicate",JOptionPane.ERROR_MESSAGE);    
                            }
                        }
                    
                }
                
                }catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(new JFrame(),"Please enter a valid input.","Error",JOptionPane.WARNING_MESSAGE);  
                }
            }
        }
    
        
            
        //to calculate Assign grade
         if(e.getSource() == gradeAssignmentButton){
            boolean empty = textTeacherId.getText().isEmpty() || textGradedScore.getText().isEmpty() || textDepartment.getText().isEmpty() || textYearsOfExperience.getText().isEmpty() ;
            
            if (empty == true){
                JOptionPane.showMessageDialog(mainFrame, "Please check for any empty fields !!", "Empty",JOptionPane.WARNING_MESSAGE);  
                
            }else{
                try{ 
        
                    int GAteacherId = Integer.parseInt(textTeacherId.getText());    
                    int GAyearsOfExperience = Integer.parseInt(textYearsOfExperience.getText());
                    String GAdepartment = textDepartment.getText();
                    int GAgradedScore = Integer.parseInt(textGradedScore.getText());
                
                    if (GAteacherId<= 0){
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid Teacher ID", "Error",JOptionPane.WARNING_MESSAGE);    
        
                }
                else{
                    boolean found = false;
                    for(Teacher Lec : TeacherList){
                        
                        if(Lec instanceof Lecturer){
                            
                        Lecturer assignGrade = (Lecturer) Lec;

                            if (Lec.getTeacherId()== GAteacherId){
                            
                            assignGrade.gradeAssignment(GAyearsOfExperience,GAdepartment,GAgradedScore);
                            found = true;
                            
                            if (assignGrade.getHasGraded()==true){
                                 JOptionPane.showMessageDialog(new JFrame(),"Grade assigned successfully. Please check the display terminal.","Successful",JOptionPane.INFORMATION_MESSAGE); 
                                  break;
                            }
                            else{JOptionPane.showMessageDialog(new JFrame(),"Unable to Grade the assignments.","Error",JOptionPane.ERROR_MESSAGE); 
                                     }
    
        
                        }
                                }
                    } 
                    if (found==false){
                             JOptionPane.showMessageDialog(new JFrame(),"Lecturer could not be found.", "Teacher Not found", JOptionPane.ERROR_MESSAGE);
                            
                        }
        
                }

                        } catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(new JFrame(),"Please enter a valid input.","Invalid Input",JOptionPane.WARNING_MESSAGE);       
                }
                    }
                }
    
        
        //to set Salary of Tutor
        if(e.getSource() == setsalaryOfTutorButton){
            boolean empty =  textTeacherId.getText().isEmpty() ||textSalary.getText().isEmpty();
            //to check if performaceIndex is empty
            boolean performanceIndexEmpty = performanceComboBox.getSelectedItem() == null;
            if (empty == true || performanceIndexEmpty== true){
                JOptionPane.showMessageDialog(mainFrame, "Please check for any empty fields !!", "Empty",JOptionPane.WARNING_MESSAGE);    
            }
            else{

            try{
                int SBteacherId = Integer.parseInt(textTeacherId.getText());    
                double SBsalary = Double.valueOf(textSalary.getText());
                String SBperformanceIndex = String.valueOf(performanceComboBox.getSelectedItem());
                //converting the string value of TperformanceIndex to int
                int performanceIndex = Integer.parseInt(SBperformanceIndex);
                
                if (SBteacherId <= 0){
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid Teacher ID", "Error",JOptionPane.WARNING_MESSAGE);    
                }
                else{ 
                    boolean found = false;
                    for(Teacher Tut : TeacherList){
                    if(Tut instanceof Tutor){
                            Tutor mySalary = (Tutor) Tut;
                            
                            if(Tut.getTeacherId()==SBteacherId){
                                
                            mySalary.setSalary(SBsalary,performanceIndex);
                            found = true;
                            if(mySalary.getIsCertified()==true){
                            JOptionPane.showMessageDialog(new JFrame(),"Salary has been set. Check the display terminal for the new Salary.","Successful",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{JOptionPane.showMessageDialog(new JFrame(),"Unable to set the Salary since the tutor has not been certified yet.","Error",JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        }
                        
                    }
                    }
                    if (found==false){
                            JOptionPane.showMessageDialog(new JFrame(),"Teacher could not be found.", "Teacher Not found", JOptionPane.ERROR_MESSAGE);
                            
                        }
                       
                }
            }catch(NumberFormatException a){
                JOptionPane.showMessageDialog(new JFrame(),"Please enter a valid input and look for any empty fields.","Error",JOptionPane.WARNING_MESSAGE);       
            
            }
            }
        }

        

        
        //to remove Tutor Teacher
        if(e.getSource() == removeTutorButton){
            boolean empty = textTeacherId.getText().isEmpty();
            if (empty == true){
                JOptionPane.showMessageDialog(mainFrame, "Please enter the TeacherID !!", "Empty",JOptionPane.WARNING_MESSAGE);    
            }
            else{
                try{
                int RBteacherId = Integer.parseInt(textTeacherId.getText());
                    
                boolean found = false;
                for (Teacher teach : TeacherList){
                    if(teach instanceof Tutor){
                        Tutor removeteach = (Tutor) teach;
                        if(teach.getTeacherId() == RBteacherId){
                            //calling removeTeacher method
                            removeteach.removeTutor();
                            found = true;
                            if(removeteach.getIsCertified()==false){
                            JOptionPane.showMessageDialog(new JFrame(),"Tutor has been removed successfully.","Successful",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{JOptionPane.showMessageDialog(new JFrame(),"Unable to remove the tutor since the tutor has already been certified.","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        
                        break;
                    }
                            }  
                        }
    
                            
                if (found == false){
                                JOptionPane.showMessageDialog(new JFrame(),"Tutor with that teacherId could not be found.","Not Found", JOptionPane.ERROR_MESSAGE);  
                            }
                    }
                catch(NumberFormatException a){
                JOptionPane.showMessageDialog(new JFrame(),"Please enter a valid input and look for any empty fields.","Error",JOptionPane.WARNING_MESSAGE);       
            
            }
            }
            }

            
        
        

        
        //to display all the information of Lecturer
        if(e.getSource() == lecturerDisplayButton) {
            if(TeacherList.isEmpty()){
                JOptionPane.showMessageDialog(new JFrame(), "No Lecturer Teacher has been registered.","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                boolean found = false;
                for(Teacher Lec : TeacherList){
                    if(Lec instanceof Lecturer){
                        Lecturer show = (Lecturer) Lec;
                        show.display();
                        found = true;
                              
                    }
                }
                if (found == true){
                JOptionPane.showMessageDialog(new JFrame(),"Details of Lecturer has been displayed in the display terminal.","Successful",JOptionPane.INFORMATION_MESSAGE);  
            }
            else{
            JOptionPane.showMessageDialog(new JFrame(), "No Lecturer Teacher has been registered.","Error",JOptionPane.ERROR_MESSAGE);    
        }
            }
        }
    
        //to display all information of Tutor
        if(e.getSource() == tutorDisplayButton){
            if(TeacherList.isEmpty()){
                JOptionPane.showMessageDialog(new JFrame(), "No Tutor Teacher has been registered.","Error",JOptionPane.ERROR_MESSAGE);    
            }else{
                boolean found = false;
                for(Teacher Tut : TeacherList){
                    if(Tut instanceof Tutor){
                        Tutor output = (Tutor) Tut;
                        output.display(); 
                        found = true;
                    }
                }
                if (found == true){
                JOptionPane.showMessageDialog(new JFrame(),"Details of Tutor has been displayed in the display terminal.","Successful",JOptionPane.INFORMATION_MESSAGE); 
            }
            else{
            JOptionPane.showMessageDialog(new JFrame(), "No Tutor Teacher has been registered.","Error",JOptionPane.ERROR_MESSAGE);    
        }
                }
            }
    } 
    public static void main(String[] args){
        TeacherGUI obj = new TeacherGUI(); 
    }
}



