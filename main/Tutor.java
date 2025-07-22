public class Tutor extends Teacher//Creating inheritance from Teacher class
{
    //Declaring instance variables
    private double salary; 
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    //Creating constructor for the Tutor class and passing required parameters to it
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
    int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex)
    {
        
        /* Calling attributes from parent class (Teacher) 
          using the super keyword */
        
        super(teacherId, teacherName, address, workingType, employmentStatus);
        
        /* Initializing the values using 'this' keyword to distinguish between the attributes of class 
          and parameters which have same name */
        
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
        setWorkingHours(workingHours);
    }
    
    //Getter methods for each declared variables
    public double getSalary()
    {
        return salary;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public String getAcademicQualifications()
    {
        return academicQualifications;
    }

    public int getPerformanceIndex()
    {
        return performanceIndex;
    }

    public boolean getIsCertified()
    {
        return  isCertified;
    }
    
    //Setter method for calculating new salary for the tutor
    public void setSalary(double newSalary, int newPerformanceIndex)
    {
        if(newPerformanceIndex > 5 && getWorkingHours() > 20)
        {
            double appraisal = 0.0;
            if(newPerformanceIndex >= 5 && newPerformanceIndex <= 7)
            {
                appraisal = 0.05;
            }
            else if(newPerformanceIndex >= 8 && newPerformanceIndex <= 9)
            {
                appraisal = 0.1;
            }
            else if(newPerformanceIndex == 10)
            {
                appraisal = 0.2;
            }

            salary = newSalary + (appraisal * newSalary);
            isCertified = true;
            System.out.println("New salary for the tutor is " + salary +".");
        }

        else
        {
            System.out.println("Salary cannot be approved since the tutor has not been certified yet.");
        }
    }
    
    //Method to remove the uncertified tutor
    public void removeTutor()
    {
        if(isCertified==true)
        {
            System.out.println("Unable to remove the Tutor because Tutor has already been certified.");
        }
        else
        {
            //Setting all attributes to zero
            salary = 0;
            specialization = "";
            academicQualifications = "";
            performanceIndex = 0;
            System.out.println("Tutor has been removed successfully.");
        }
    }

    //Method for displaying the details of the tutor
    @Override
    public void display()
    {
        super.display(); //Calling a display method of parent class Teacher
        if(this.isCertified == true)
        {   
            System.out.println("Salary of the tutor is " + salary); 
            System.out.println("Specialization of the tutor is " + specialization);
            System.out.println("Academic Qualifications of the tutor is " + academicQualifications);
            System.out.println("Performance Index of the tutor is " + performanceIndex);
        }
    }
}
