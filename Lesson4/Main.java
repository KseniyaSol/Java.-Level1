package Lesson4;

public class Main {
    public static void main(String[] args){
        Employee employee1 = new Employee();
        System.out.println("FIO is: " + employee1.getFio() + " and position is: " + employee1.getPosition());
        System.out.println();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Petrov Petr Petrovich", "Director", 89091234567L, 200000, 60);
        employees[1] = new Employee("Sidorov Sidr Sidorovich", "Driver", 89120987654L, 50000, 40);
        employees[2] = new Employee("Svetlanova Svetlana Svetlanovna", "Accountant", 89505632156L, 120000, 41);
        employees[3] = new Employee("Olegov Oleg Olegovich", "Security guard", 89146789012L, 43000, 35);
        employees[4] = new Employee("Innova Inna Innovna", "Cleaning lady", 89956783214L, 15000, 27);
        System.out.println("Employees over 40 years old is:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40){
                System.out.println("FIO is: " + employees[i].getFio() + " and position is: " + employees[i].getPosition() + " and phone is: " + employees[i].getPhone() + " and salary is: " + employees[i].getSalary() + " and age is: " + employees[i].getAge());
            }
        }
        System.out.println();
        premium(employees);
        System.out.println();

        System.out.println("employee1 ID is: " + employee1.getId());
        for (int i = 0; i < employees.length; i++) {
            System.out.println("FIO is: " + employees[i].getFio() + " and ID is: " + employees[i].getId());
        }
    }

    public static void premium(Employee[] people){
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() > 35){
                System.out.println("FIO is: " + people[i].getFio() + " and salary is: " + people[i].getSalary() + " and age is: " + people[i].getAge());
                people[i].setSalary(people[i].getSalary() + 10000);
                System.out.println("FIO is: " + people[i].getFio() + " and new salary is: " + people[i].getSalary());
            }
        }
    }
}
