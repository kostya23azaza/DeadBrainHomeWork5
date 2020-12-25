public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;
    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void printEmployee() {
        System.out.println(name + " " + position + " " + email + " " + phone_number + " " + salary + " " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Employee[] workers = new Employee[5];
        workers[0] = new Employee("Сталин Иосиф Виссарионович", "Генниралисимус", "iosiph.stalin.com", "8-800-555-35-35", 10000, 78);
        workers[1] = new Employee("Маргарет Тэчер", "Премьер министр", "marger.com", "8-241-122-21-87", 1241245, 90);
        workers[2] = new Employee("Путин Владимир Владимирович", "Диктатор", "Dictator.com", "8-222-111-23-19", 9999999, 69);
        workers[3] = new Employee("Дарт Вейдер", "Ситх", "DarkSide.com", "+7-911-812-09-23", 123456, 42);
        workers[4] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40) workers[i].printEmployee();
        }
    }
}




