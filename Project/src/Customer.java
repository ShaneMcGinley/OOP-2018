public class Customer extends Person{
    private int customerNum;

    public Customer(String name, String dob, String address, String email, String phoneNum, String PPS, int customerNum) {
        super(name,dob ,address, email, phoneNum, PPS);
        this.customerNum = customerNum;
    }

    public double getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCustomer Number: " + this.getCustomerNum();
    }
}

