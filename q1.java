import java.io.*;
import javax.swing.* ;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class q1{
    public static void main(String[]args){
        JFrame f= new JFrame("EMPLOYEE FORM");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        

        JPanel p= new JPanel();
        f.add(p);
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        


        JLabel emp = new JLabel("Employee ID:");
        p.add(emp);

        JTextField emp1 = new JTextField(30);
        p.add(emp1);
        

        JLabel name = new JLabel("Name:");
        p.add(name);
    

        JTextField name1 = new JTextField(30);
        p.add(name1);

        JLabel pay = new JLabel("Basic Pay:");
        p.add(pay);
    

        JTextField pay1 = new JTextField(30);
        p.add(pay1);

        JLabel da = new JLabel("DA:");
        p.add(da);
    

        JTextField da1 = new JTextField(30);
        p.add(da1);

        JLabel hra = new JLabel("HRA:");
        p.add(hra);
    

        JTextField hra1 = new JTextField(30);
        p.add(hra1);




        JButton save= new JButton("SAVE");
        f.add(save);
        JButton total= new JButton("TOTAL");
        p.add(total);
        JTextField totaldisplay = new JTextField(30);
        p.add(totaldisplay);



        save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                String empid = emp1.getText();
                String nameemp  = name1.getText();
                double basicpay = Double.parseDouble(pay1.getText());
                double daa = Double.parseDouble(da1.getText());
                double hraa = Double.parseDouble(hra1.getText());

                writetofile(empid,nameemp,basicpay,daa,hraa);
                System.out.println("SAVED TO FILE");
            }

        });

        
        total.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double basicpay = Double.parseDouble(pay1.getText());
                double daa = Double.parseDouble(da1.getText());
                double hraa = Double.parseDouble(hra1.getText());
                double totalSalary= basicpay+daa+hraa;

                totaldisplay.setText("Total Salary: " + totalSalary); 

            }



        });
    }

    public static void writetofile(String empid,String nameemp,double basicpay,double daa,double hraa){
        try(BufferedWriter w = new BufferedWriter(new FileWriter("file.txt"))){
            w.write("=========================================================================================\n");
            w.write("EmpID \t Name \t BasicPay \t DA \t HRA \n");
            w.write("=========================================================================================\n");
            w.write(empid + "\t" + nameemp + "\t" + basicpay + "\t" + daa + "\t" + hraa + "\n");

        }catch(IOException e){
            System.out.println("ERROR WRITIBG TO FILE "+ e.getMessage());

        }

    }
}