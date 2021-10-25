import com.sun.source.tree.NewArrayTree;

//Задача 1: Създайте клас Computer, който представя компютър.
//        Класът да има следните полета:
//        year – числова стойност, показваща година на производство на компютъра
//        price – числова стойност (не е задължително да е цяло число), показваща
//        цената на компютъра
//        isNotebook – булева стойност – дали компютърът е преносим или не
//        hardDiskMemory – числова стойност за размера на хард диска
//        freeMemory – числова стойност, показваща размера на свободната памет
//        operationSystem – текстово поле за операционната система на компютъра
//        Класът да дефинира следните методи:
//        -метод void changeOperationSystem(String newOperationSystem), който сменя
//        стойността на полето operationSystem със стойността, подадена като
//        параметър.
//        -метод void useMemory(double memory), който намалява свободната памет
//        (freeMemory) със стойността, подадена като аргумент.
//        Ако стойността на аргумента е по-голяма от свободната памет, извеждa
//        съобщение "Not enough free memory!”
//        - конструктор по подразбиране Computer() който инициализира полето
//        isNotebook със стойност false и полето operationSystem с „Win10“.
//        - констуктор с параметри Computer(int year, double price, double
//        hardDiskMemory, double freeMemory), който първо извиква конструктора по
//        подразбиране и после инициализира останалите полета със стойностите
//        подадени като аргументи.
//        - конструктор с параметри Computer(int year, double price, boolean isNotebook,
//        double hardDiskMemory, double freeMemory, String operationSystem), който
//        инициализира всички полета със стойностите подадени като аргументи на
//        конструктора.
//        - метод int comparePrice(Computer otherComp), който сравнява цените на 2
//        компютъра.
//        Ако цената на първия компютър (този, за който се вика методът) е по-висока от
//        тази на компютъра, подаден като аргумент, методът връща -1. Ако цената на
//        компютъра, подаден като аргумент, е по-високата, се връща 1, а ако са равни,
//        методът връща стойност 0.
public class Computer {

    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;


    Computer() {
        isNotebook = false;
        operationSystem = "Win10";
    }

    Computer(int newYear, double newPrice, double newHardDiskMemory, double newFreeMemory) {
        this();
        year = newYear;
        price = newPrice;
        hardDiskMemory = newHardDiskMemory;
        freeMemory = newFreeMemory;
    }

    Computer(int newYear, double newPrice, boolean newIsNotebook, double newHardDiskMemory, double newFreeMemory, String newOperationSystem) {
        year = newYear;
        price = newPrice;
        isNotebook = newIsNotebook;
        hardDiskMemory = newHardDiskMemory;
        freeMemory = newFreeMemory;
        operationSystem = newOperationSystem;
    }


    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
    }


    void useMemory(double memory) {
        if (memory > freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            freeMemory = (freeMemory - memory);
            System.out.println("Free memory is: " + p);
        }
    }


    int comparePrice(Computer otherComp) {
        if (price > otherComp.price) {
            return -1;
        } else if (price < otherComp.price) {
            return 1;
        } else {
            return 0;
        }
    }
}




