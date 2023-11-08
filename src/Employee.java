public class Employee {

    int id;
    String surname;
    int age;
    int salary;
    String department;

    Employee( int id2, String surname2, int age2, int salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double uvelichenieSalary(){
        salary *= 2;
        return salary;

    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee em1 = new Employee(1, "Попов", 30, 30000, "Строитель");
        Employee em2 = new Employee(2, "Парыгин", 20, 60000, "Врач");

        em1.uvelichenieSalary();
        System.out.println("Новая зарплата работника" +  " " + em1.surname  + "="  + em1.salary);

        em2.uvelichenieSalary();
        System.out.println("Новая зарплата работника" + " " + em2.surname  + "=" + em2.salary);
    }
}

