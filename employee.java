package testasd;

import java.time.LocalDate;
import java.util.Objects;


public class employee {
        private String name;
        private double salary;
        private int year;
        private int month;
        private int day;
        LocalDate hireDay;
        public employee(String name, double salary, int year, int month, int day)
        {
            this.name= name;
            this.salary= salary;
            this.year= year;
            this.month= month;
            this.day= day;
            hireDay=LocalDate.of(this.year, this.month, this.day);
        }
        public String getName(){

            return name;
        }
        public double getSalary()
        {
            return salary;

        }
        public LocalDate getHireDay()
        {
            return hireDay;

        }
        public void raiseSalary(double byPercent){
            double raise=salary*byPercent/100;
            salary+=raise;
        }
        public boolean equals1(Object otherEmlpoyee)
        {
            if (this==otherEmlpoyee) return true;
            if(otherEmlpoyee == null) return  false;
            if(getClass() != otherEmlpoyee.getClass())
             return false;//equals 比较字符串
            employee other=(employee)otherEmlpoyee;
            return name.equals(other.name)
                    && salary==other.salary
                    && hireDay.equals(other.hireDay);
        }
        public int hashCode()
        {
            return Objects.hash(name,salary,hireDay);
        }
        public String toString()
        {
            return "[name="+name
                    +",salary="+salary
                    +",hireDay="+hireDay
                    +"]";
        }

    }

