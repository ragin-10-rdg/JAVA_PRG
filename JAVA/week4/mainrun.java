package week4;

public class mainrun {
        public static void main(String[] args){
            empMS emp = new empMS();
            emp.setName("Simu");

            // Display employee name and initial salary
            System.out.println("Employee Name = " + emp.getName());
            System.out.println("Initial Salary = " + emp.getSalary());

            // HR updates salary
            HR hr = new HR();
            hr.setSalary(emp, 50000);

            // Display updated salary
            System.out.println("Updated Salary (by HR) = " + emp.getSalary());


            collegestudent cs=new collegestudent();
            cs.setName("simona");
            cs.setAge(20);
            cs.setRollNo(29);

            System.out.println("name="+cs.getName());

            BankAccountExample b=new BankAccountExample();
            b.setAccHolderName("john");
            b.setAccNumber("5363829");
            b.setBalance(100);
            b.deposit(50);
            b.withdraw(200);

            System.out.println("Final balance="+b.getBalance());


        }
    }
