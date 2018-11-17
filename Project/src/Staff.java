public class Staff extends Person{
    private int empNum;
    private String jobTitle;

    public Staff(String name,String dob ,String address, String email, String phoneNum, String PPS, int empNum, String jobTitle) {
        super(name,dob ,address, email, phoneNum, PPS);
        this.empNum = empNum;
        this.jobTitle = jobTitle;
    }

    public double getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee Number: " + this.getEmpNum() + "\nJob Title: " + getJobTitle();
    }
}
