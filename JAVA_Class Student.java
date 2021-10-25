/*
Създайте клас Student, описващ студент
Класът да има следните полета:
name – име на студента
subject - специалност
grade - успех
yearInCollege – курс
age – години на студента
isDegree – дали е завършил или не
money – пари от стипендии
Класът да дефинира следните конструктори:
-конструктор по подразбиране който задава следните стойностите на
полетата: grade = 4.0, yearInCollege = 1, isDegree = false, money = 0
-констуктор с параметри, които извиква конструктора по подразбиране и
инициализира(задава първоначални стойности) на останалите полета на
класа
Класът да дефинира следните методи:
-метод void upYear() който увеличава годината в колежа с единица, ако
студента не е завършил, в противен случай извежда подходящо
съобщение. Ако след увеличаването годината стане 4, задава true на
полето isDegree
-метод double receiveScholarship(double min, double amount) – добавя сумата
amount към парите на студента, само ако успехът му е по-висок или равен
на минималния успех, подаден като параметър (min), и ако възрастта му е
под 30 години.
Методът връща текущите пари на студента (след евентуалното им
увеличение)
*/






public class Student {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    Student (){
        grade = 4;
        yearInCollege = 1;
        isDegree = false;
        money = 0.0;
    }

    Student (String newName, String newSubject, int newAge) {
        this();
        name = newName;
        subject = newSubject;
        age = newAge;

    }

    void upYear() {
        if (!isDegree) {
            yearInCollege++;
            if (yearInCollege >= 1 && yearInCollege <=3) {
                System.out.println("You are now in " + yearInCollege +"th grade!");
            } else if (yearInCollege == 4){
                isDegree = true;
                System.out.println("Congratulations! You are now graduated!");
            } else {
                System.out.println("You have already finish the college!");
            }
        }




    }

    double receiveSchoolarship(double min, double amount) {
        if(grade >= min &&  age < 30) {
           money = money + amount;
            System.out.println(name + ", you money are: " + money);
        } else {
            System.out.println("I'm sorry! You don't have any money!");
        }
        return money;
    }



}
