public class Lecturer extends Teacher // Creating inheritance from Teacher class
{
    //Declaring instance variables
    private String department; 
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    private String grade;
    
    // Initializing the constructor and passing the required parameters to it
    public Lecturer(int teacherId, String teacherName, String address,
    String workingType, String employmentStatus, int workingHours, String department, int yearsOfExperience)
    {
        /* Calling attributes from parent class (Teacher) 
          using the super keyword */
        super(teacherId, teacherName, address, workingType, employmentStatus);
        
        /* Initializing the values using 'this' keyword to distinguish between the attributes of class 
          and parameters which have same name */
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
        this.setWorkingHours(workingHours);
    }
    
    // Getter method for each declared variables
    public String getDepartment()
    {
        return department;
    }
    
    public int getYearsOfExperience()
    {
        return yearsOfExperience;
    }
    
    public int getGradedScore()
    {
        return gradedScore;
    }
    
    public boolean getHasGraded()
    {
        return hasGraded;
    }
    
    //Setter Method for setting the gradedScore
      public void setGradedScore(int gradedScore)
    {
        this.gradedScore=gradedScore;
    }
    
    //Creating method for Grade Assignment
    public void gradeAssignment(int yearsOfExperience, String department, int gradedScore)
        {
        this.gradedScore=gradedScore;
        if(this.yearsOfExperience == yearsOfExperience && this.yearsOfExperience>=5 && this.department.equals(department))
         {
                if(this.gradedScore>=70 && this.gradedScore<=100)
                {
                    System.out.println(" Graded as A");
                    setGradedScore(gradedScore);
                 }   
                
                else if(this.gradedScore>=60 && this.gradedScore<=100)
                {
                    System.out.println( "Graded as B");
                    setGradedScore(gradedScore);
                }
                
                else if(this.gradedScore>=50 && this.gradedScore<=100)
                {
                    System.out.println("Graded as C"); 
                    setGradedScore(gradedScore);
                }
                
                else if(this.gradedScore>=40 && this.gradedScore<=100)
                {
                    System.out.println("Graded as D");
                    setGradedScore(gradedScore);
                }
                
                else if(this.gradedScore<40)
                {
                    System.out.println("Graded as E ");
                    setGradedScore(gradedScore);
                }
                hasGraded = true;
         }
            
        else
            {
                 System.out.println("Invalid department or years of experience<5");  
            }
    }
    
    //display method for printing details
    @Override
    public void display()
    {
        super.display();//Calling a  display method of parent class Teacher
        System.out.println("Department is " + department);
        System.out.println("Years of experience is " + yearsOfExperience);
        if(hasGraded == true)
        {
            System.out.println("Graded score is "+ gradedScore);
        }
        
        else
        {
            System.out.println("Assignment has not been graded");
        }
    }
}