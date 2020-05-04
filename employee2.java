package testasd;

import java.time.LocalDate;

public class employee2 extends Person {
    private String kindOfWork;
    private double Salary;
    private int year;
    private int month;
    private int day;
    LocalDate Hireday;
    public employee2(String name,String KindOfWork,double salary,int year,int month,int day)
    {
        super(name);
        this.kindOfWork=KindOfWork;
        this.year=year;
        this.month=month;
        this.day=day;
        this.Salary=salary;
        Hireday=LocalDate.of(this.year,this.month,this.day);
    }

    public LocalDate getHireday()
    {
        return Hireday;
    }
    public double getSalary()
    {
        return Salary;
    }

    public String getDescription(){
        return("Salary of this worker is "+this.getSalary()+" and his date is "+this.getHireday()+". What is more,his name is "+this.getname());
    }
}
