package Exercise1;

/*
Класът Student, наследяващ Person, репрезентиращ ученик, да има:
Полета:
– score - показва оценката на ученика (число между 2 и 6, не е
задължително да е цяло)
Единствен конструктор:
– Student(String name, int age, boolean isFemale, double score), 
задаващ стойности и на наследените полета
Метод showInfo(), който показва информация за студента и
информация за оценката му
*/


public class Student extends Person {

    private double score;

    Student (String name, int age, boolean isFemale, double score) {
        super (name, age, isFemale);
        this.score = score;
    }

    public double getScore() {
        if (score >= 2 && score <= 6) {
            return score;
        }
        return 0.0;
    }

    public void setScore(double score) {
        if (score >= 2 && score <= 6) {
            this.score = score;
        }
    }

    @Override
    public void showInfo () {
        super.showInfo();
        System.out.print(" Score: " + getScore() + ".");
        System.out.println();
    }
    }





