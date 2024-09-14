public class Student {
    private String studentName;
    private double studentMarks;
    private String studentId;
    
    // constructor
    public Student (String studentId, String studentName, double studentMarks ){
        this.studentName = studentName;
        this.studentMarks = studentMarks;
        this.studentId = studentId;
    } 
    
    //getter and setter
    public String getName() {
        return this.studentName;
    }
    public void setName(String name){
        this.studentName = studentName;
    }
    public double getMarks(){
        return this.studentMarks;
    }
    public void setMarks(double studentMarks){
        this.studentMarks = studentMarks;
    }
    public String getStudentid(){
        return this.studentId;
    }
    public void setStudentid(String studentId){
        this.studentId = studentId;
    }


    // public String studentRank(double studentMarks){
    //     if (studentMarks >= 0 && studentMarks < 5.0) {
    //         return "Fail";
    //     } else if (studentMarks >= 5.0 && studentMarks < 6.5) {
    //         return "Medium";
    //     } else if (studentMarks >= 6.5 && studentMarks < 7.5) {
    //         return "Good";
    //     } else if (studentMarks >= 7.5 && studentMarks < 9.0) {
    //         return "Very Good";
    //     } else if (studentMarks >= 9.0 && studentMarks <= 10.0) {
    //         return "Excellent";
    //     } else {
    //         return "Invalid marks";
    // }   
    // }
}
