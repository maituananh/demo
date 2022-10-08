package studens;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // tính chất kế thừa Employee(NAME, AGE, ADDRESS, COMPANY)        
        Employee employee = new Employee();
        employee.setName("Employee A");
        employee.setAge(20);
        employee.setAddress("ABC");
        employee.setCompany("VIPPRO");

        Employee employee1 = new Employee();
        employee.setName("Employee A");
        employee.setAge(20);
        employee.setAddress("ABC");
        employee.setCompany("VIPPRO");

        Student student1 = new Student();
        student1.setName("A");
        student1.setAge(20);
        student1.setAddress("ABC");
        student1.setClasss("A1");

        Student student2 = new Student();
        student2.setName("B");
        student2.setAge(21);
        student2.setAddress("ABCD");
        student2.setClasss("A2");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(employee);
        persons.add(employee1);

        getAllStudent(persons);
//        sortAge(students);
//        searchName(students);
    }

    public static void getAllStudent(ArrayList<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i) instanceof Student) {
                Student student = (Student) persons.get(i);
                System.out.println(
                        student.getName() + " "
                        + student.getAge() + " "
                        + student.getClasss() + " "
                        + student.getAddress());
            } else if (persons.get(i) instanceof Employee) {
                Employee student = (Employee) persons.get(i);
                System.out.println(
                        student.getName() + " "
                        + student.getAge() + " "
                        + student.getCompany() + " "
                        + student.getAddress());
            }
        }
    }

//    public static void sortAge(ArrayList<Student> students) {
//        for (int i = 0; i < students.size(); i++) {
//            for (int j = i + 1; j < students.size(); j++) {
//                if (students.get(i).getAge() < students.get(j).getAge()) {
//                    Student temp = students.get(i);
//                    students.set(i, students.get(j));
//                    students.set(j, temp);
//                }
//            }
//        }
//        System.out.println("SORT");
//        getAllStudent(students);
//    }
//
//    public static void searchName(ArrayList<Student> students) {
//        String scaner = "b";
//        ArrayList<Student> searchStudent = new ArrayList<>();
//
//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getName().equalsIgnoreCase(scaner)) {
//                searchStudent.add(students.get(i));
//            }
//        }
//        System.out.println("SEARCH");
//        getAllStudent(searchStudent);
//    }
}
