public abstract class Person {
    private String name;
    private String address;
    private String email;
    private String phoneNum;
    private String PPS;
    private String dob;


    public Person(){
        this("Unknown","Unknown","Unknown","Unknown","Unknown","Unknown");
    }

    public Person(String name,String dob,String address, String email, String phoneNum, String PPS){
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.phoneNum = phoneNum;
        this.PPS = PPS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPPS() {
        return PPS;
    }

    public void setPps(String PPS) {
        this.PPS = PPS;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String toString(){
        return "Name: " + this.getName() + "\nDOB: " + this.getDob() + "\nAddress: " + this.getAddress() + "\nEmail: " + this.getEmail()
                + "\nPhone Number: " + this.getPhoneNum() + "\nPPS: " + this.getPPS();
    }
}
