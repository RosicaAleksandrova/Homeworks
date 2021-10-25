package Exercise1;

/*
Да се напише и демонстративен клас с main метод, в който:
1. Да се състави масив от 6 елемента от тип Person.
2. Да се създадът по два обекта от тип Person, Student и Employee и да се вкарат в
масива от хора.
3. Да се обходим масивът и за всеки обект да се извика showInfo()
4. Да се обходи още веднъж масивът с хора и за всеки човек, който е работник, 
да се изведе на екрана сумата, която му се дължи при 2 часа работа извън
работно време.
*/

public class DemoPerson {

    public static void main(String[] args) {


        Person p1 = new Person("Mimi", 35, true);
        Person p2 = new Person("Pesho", 38, false);

        Student s1 = new Student("Niki", 20, false, 4.60);
        Student s2 = new Student("Lili", 19, true, 5.58);

        Employee e1 = new Employee("Mitko", 33, false, 12.20);
        Employee e2 = new Employee("Eli", 32, true, 10.20);




        Person[] person = new Person[6];

// Не можах да се сетя за друг начин да добавя обектите в масива, освен като пренасоча референцията на масива
// към референцията на всеки обект. Не знам обаче, ако имаме 100 или 1000 обекта, как ще стане така?
// Явно има и друг начин?
        person[0] = p1;
        person[1] = p2;
        person[2] = s1;
        person[3] = s2;
        person[4] = e1;
        person[5] = e2;


        for (int i = 0; i < person.length; i++) {
            if (person[i] != null) {
                person[i].showInfo();
            } else {
                System.out.println("No info to show! ");
            }
        }


        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Employee) {
                System.out.println(person[i].getName() + ", your overtime pay is: " + ((Employee) person[i]).calculateOvertime(2));
            } else
                System.out.println(person[i].getName() + " " + "is no an employee! ");
        }
    }


}




