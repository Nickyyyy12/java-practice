package oop.employee;

public class Manager extends Employee {
        private double bonus;

        public Manager(String name, int age, double baseSalary,double bonus){
            super(name,age,baseSalary);
            this.bonus = bonus;
        }

        public Manager() {
        }

        @Override
        public void work(){
            System.out.println(getName()+"正在管理团队");
        }

        public void setBonus(double bonus){
            this.bonus = bonus;
        }

        public double getBonus() {
            return bonus;
        }

        public double getTotalSalary(){
            return getBaseSalary() + this.bonus;
        }
}
