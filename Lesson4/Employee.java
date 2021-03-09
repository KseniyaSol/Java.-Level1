package Lesson4;

public class Employee {
    private static int count = 1;
    private int id = 1;
    private String fio;
    private String position;
    private long phone;
    private int salary;
    private int age;

    Employee(String fio, String position, long phone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        id = count++;
    }

    public Employee(){
        fio = "Ivanov Ivan Ivanovich";
        position = "Employee";
        phone = 89000000000L;
        salary = 30000;
        age = 20;
        id = count++;
    }

    public int getId(){
        return id;
    }

    public String getFio(){
        return fio;
    }

    public String getPosition(){
        return position;
    }

    public long getPhone(){
        return phone;
    }

    public int getSalary(){
        return salary;
    }

    public int getAge(){
        return age;
    }

    public void setFio(String fio){
        this.fio = fio;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setPhone(long phone){
        this.phone = phone;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setAge(int age){
        this.age = age;
    }
}


