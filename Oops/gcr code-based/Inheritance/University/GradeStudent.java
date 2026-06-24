package University;

public class GradeStudent  extends Student{
    protected String thesis;
    public GradeStudent(int id, String name, int studentId, double studentGpa, String thesis){
        super(id,name,studentId,studentGpa);
        this.thesis = thesis;
    }
    
}
