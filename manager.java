package testasd;

public class manager extends employee {
    private double bonus ;
    public manager(String name,double salary,int year,int month,int day){
        super(name, salary, year, month, day);
        bonus=0;
    }


    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getSalary(){
        double salary=super.getSalary();
        return salary+ this.bonus;
    }
}
