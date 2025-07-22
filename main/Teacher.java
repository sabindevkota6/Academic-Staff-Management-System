public class  Teacher
{
    //Declaring instance variables
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    // Initializing the constructor and passing the required parameters to it
    public Teacher( int teacherId, String teacherName, String address, String workingType,
    String employmentStatus) 
    {
        /* Initializing the values using 'this' keyword to distinguish between the attributes of class 
          and parameters which have same name */
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    //Getter method for each declared variable
    public int getTeacherId()
    {
        return teacherId;
    }
    
    public String getTeacherName()
    {
        return teacherName;
    }
    
    public String getAddress()
    {
       return address; 
    }
    
    public String getWorkingType()
    {
        return workingType;
    }
    
    public String getEmploymentStatus()
    {
        return employmentStatus;
    }
    
    public int getWorkingHours()
    {
        return workingHours;
    }
    
    // Setter method for setting the workingHours
    public void setWorkingHours( int workingHours ) 
    {
        this.workingHours = workingHours;
    }
    
    
    //Method for printing details
    public void display()
    {
        System.out.println("TeacherID is " + teacherId);
        System.out.println("Teacher's Name is " + teacherName);
        System.out.println("Address is " + address);
        System.out.println("Employment Status is " + employmentStatus);
        System.out.println("Working Type is " + workingType);
        
        //logical checking and output display
        if(workingHours>0)
        {
            System.out.println( "Working Hour is " + workingHours);
        }
        else
        {
            System.out.println("This person has no Working Hour");
        }
    }
}
