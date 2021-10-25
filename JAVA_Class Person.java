package Exercise1;

/*
Класът Person, репрезентиращ човек, да има:
Полета:
– name - име
– age - години
– isFemale - поле, показващо пола
Коструктори:
– Единствен конструктор, с параметри за всичките полета на класа
Метод:
– Метод showInfo(), който показва информация за човека
(изписва на конзолата стойността на всичките му полета по
подходящ начин
*/


public class Person {
    private String name;
    private int age;
    protected boolean isFemale;

    Person (String name, int age, boolean isFemale) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public void showInfo () {
        System.out.print("Name: " + getName()+"," + " " + " Age: " + getAge()+ ",");
        if(isFemale) {
            System.out.print(" Sex: female" + "." );
        } else{
            System.out.print(" Sex: male" + ".");
            System.out.println();
        }
    }





}
