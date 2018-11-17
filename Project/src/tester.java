import javax.swing.*;
import java.text.SimpleDateFormat;

public class tester {
    public static void main(String[] args) {
        //Staff s1 = new Staff();
        Person[] staffs = new Person[3];
        Staff staff [] = new Staff[3];
        //JOptionPane.showMessageDialog(null,s1.toString());

        for(int i=1;i<=staff.length;i++){

            staff[i].setName(JOptionPane.showInputDialog("Enter Name: "));
            staff[i].setAddress(JOptionPane.showInputDialog("Enter Address: "));
            staff[i].setEmail(JOptionPane.showInputDialog("Enter Email: "));
            staff[i].setPhoneNum(JOptionPane.showInputDialog("Enter Phone Number: "));
            staff[i].setPps(JOptionPane.showInputDialog("Enter PPS: "));
            staff[i].setEmpNum(Integer.parseInt(JOptionPane.showInputDialog("Enter Employee Number: ")));
            staff[i].setJobTitle(JOptionPane.showInputDialog("Enter Job Title: "));
            i++;

            JTextArea area = new JTextArea("The full list of friends\n");
            for (i = 0; i< staffs.length; i++) // reuse the same 'i'
                area.append(staffs[i] + "\n");  
        }
    }
}
