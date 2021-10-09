package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;

        //2021-125= 1896 why 125 ? because max human's age is 125

        if (hireYear >= 1896 && hireYear <= 2021) {
            this.hireYear = hireYear;
        } else {
            this.hireYear = 0;
        }
    }

    public void toMyString() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Start to job year : " + this.hireYear);
        System.out.println("Tax : " + tax(this.salary));
        System.out.println("Bonus : " + bonus(this.workHours));
        System.out.println("Salary Increases : " + raiseSalary(this.hireYear));
        System.out.println("when tax and bonuses added total salary is  : " + (this.salary - tax(this.salary) +
                bonus(this.workHours)));
        this.salary += raiseSalary(this.hireYear);
        System.out.println("Total Salary : " + this.salary);

    }

    private double tax(double salary) {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    private int bonus(int workHours) {
        if (40 < workHours) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    private double raiseSalary(int hireYear) {
        int totalWorkYear = 2021 - hireYear;

        if (totalWorkYear < 10) {
            return this.salary * 5 / 100;
        } else if ((9 < totalWorkYear) && (totalWorkYear < 20)) {
            return this.salary * 10 / 100;
        } else {
            return this.salary * 15 / 100;
        }

    }


}
