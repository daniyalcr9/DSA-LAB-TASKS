public class Employee {
    int salary;
    int no_of_hours;

    // getInfo Method
    public void getInfo(int salary,int no_of_hours) {

        this.salary = salary;
        this.no_of_hours = no_of_hours;
    }

    // AddSalary Method
    public void AddSalary() {
        if(salary<500) {
            salary = salary + 10;
        }
    }

    // AddWork Method
    public void AddWork() {
        if(no_of_hours>6) {
            salary = salary + 5;
        }
    }

    // printSalary Method
    public void printSalary() {

        System.out.println("The Salary of the Employee is: $" + salary + "  and the Working hours are: " + no_of_hours);
    }

    // Main Method
    public static void main(String[] args) {

        // Object "Daniyal" Created!
        Employee Daniyal = new Employee();

        // Using the Methods to Calculate and Print the Salary and Working Hours.
        Daniyal.getInfo(450,7);
        Daniyal.AddSalary();
        Daniyal.AddWork();
        Daniyal.printSalary();

    }

}
