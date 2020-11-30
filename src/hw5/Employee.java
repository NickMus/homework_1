package hw5;

public class Employee {
   private  String name;
   private  String surname;
   private  String position;
   private  String email;
   private  int phone_number;
   private  int salary;
   private  int age;




    public Employee(String name, String surname, String position, String email, int phone_number, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public  void employeeInfo() {
        System.out.printf("%s %s %s %s %s %s %s %s",'\n', name, surname, position, email, phone_number, salary, age);
    }

}
