package Exercise1;

/*
Класът Employee да наследява Person и да дефинира:
Полета:
– hourSalary показва заплата на работника за час
Конструктор, който инициализира всичките му полета (собствени и
наследени)
Методи:
В случай че на работник се наложи да работи извън работно време,
на него му се дължи допълнителна сума пари (overtime) за часовете, които
е работил. Сумата се пресмята по следния начин: ако работникът няма
навършени 18 години, дължимата сума е 0. В противен случай за всеки
отработен час на работника се заплаща сумата, която получава на час, умножена
по 1,5.
– метод calculateOvertime(double hours), който пресмята и връща
стойността на сумата която му се дължи при работа извън работно
време
– метод showInfo(), който показва информация за човека,
както и информация за дневната му заплата
*/


public class Employee extends Person {

    private double hourSalary;
    static final double  OVERTIME = 1.5;

    Employee (String name, int age, boolean isFemale, double hourSalary ){
        super (name,age, isFemale);
        this.hourSalary = hourSalary;
    }

    private double getHourSalary() {
        return hourSalary;
    }

    private void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    double calculateOvertime (double hours) {
        double overtimeSum;
        if (getAge() < 18) {
            overtimeSum = 0;
        } else {
            overtimeSum = hours * (getHourSalary()* OVERTIME);
        }
        return overtimeSum;
    }



    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Salary: " + getHourSalary());
    }
}
